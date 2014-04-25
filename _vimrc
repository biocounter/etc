" ------------------------------------------------------------------------
" Startup
" ------------------------------------------------------------------------
let s:running_windows = has("win16") || has("win32") || has("win74")
let s:colorful_term = (&term =~ "xterm") || (&term =~ "screen")

" ------------------------------------------------------------------------
" General
" ------------------------------------------------------------------------
set nocompatible                                              " explicitly get out of vi-compatible mode
set noexrc                                                    " don't use local version of .(g)vimrc, .exrc
set fenc=utf-8                                                " UTF-8
let g:skip_loading_mswin=1                                    " Just in case :)
set fileformat=unix                                           " use UNIX file formats
set timeoutlen=300                                            " super low delay (works for me)
set formatoptions+=n                                          " Recognize numbered lists
set formatlistpat=^\\s*\\(\\d\\\|[-*]\\)\\+[\\]:.)}\\t\ ]\\s* " and bullets, too
set viminfo+=!                                                " Store upper-case registers in viminfo
set cpoptions=aABceFsmq
"             |||||||||
"             ||||||||+-- When joining lines, leave the cursor between joined lines
"             |||||||+-- When a new match is created (showmatch) pause for .5
"             ||||||+-- Set buffer options when entering the buffer
"             |||||+-- :write command updates current file name automatically add <CR> to the last line when using :@r
"             |||+-- Searching continues at the end of the match at the cursor position
"             ||+-- A backslash has no special meaning in mappings
"             |+-- :write updates alternative file name
"             +-- :read updates alternative file name
filetype plugin indent on      " load filetype plugins/indent settings
set autochdir                                                      " always switch to the current file directory
set backspace=indent,eol,start                                     " make backspace a more flexible
set nowb nobackup noswapfile                                       " turn off backups
set clipboard+=unnamed                                             " share windows clipboard
set fileformats=unix,dos,mac                                       " support all three, in this order
set hidden                                                         " you can change buffers without saving
set iskeyword+=_,$,@,%,#                                           " none of these are word dividers
set mouse=a                                                        " use mouse everywhere
set noerrorbells                                                   " don't make noise
set showtabline=0                                                  " never show tabs
set wildmenu                                                       " turn on command line completion wild style
set completeopt=menuone                                            " always show menu for completions
set foldenable foldmethod=indent                                   " Turn on folding at indents
set foldopen=block,hor,mark,percent,quickfix,tag                   " what movements open folds
set foldtext=SimpleFoldText()                                      " Custom fold text function (cleaner than default)
set formatoptions=rq                                               " Automatically insert comment leader on return, and let gq format comments
set ignorecase incsearch hlsearch                                  " search: ignore case, higlight matches
if maparg('<C-L>', 'n') ==# ''
  nnoremap <silent> <C-L> :nohlsearch<CR><C-L>
endif
set nolist                                                         " do not show hidden characters
set nowrap shiftround shiftwidth=4                                 " configure (no) line wrapping
set smartindent                                                    " perform c-like indenting
set tabstop=4 nosmarttab noexpandtab                               " use real tab characters
set wildignore=*.dll,*.o,*.obj,*.bak,*.exe,*.pyc,*.jpg,*.gif,*.png " ignore these list file extensions
set wildmode=list:longest                                          " turn on wild mode huge list
set display+=lastline 											   " show last line of text
if &encoding ==# 'latin1' && has('gui_running')
  set encoding=utf-8
endif
if &listchars ==# 'eol:$'
  set listchars=tab:>\ ,trail:-,extends:>,precedes:<,nbsp:+
endif

" ------------------------------------------------------------------------------
" Envorinment Configuration
" ------------------------------------------------------------------------------
" if (s:running_windows)
" 	set shell=\"C:\Windows\SysWow64\cmd.exe\"
" 	set shellcmdflag=/c
" 	set shellxquote=("
" 	let $TMP="c:/tmp"
"	set diffexpr=MyDiff()
" endif
if has("gui_running")  
	if has("gui_win32")
		" this fails if there are any spaces in the path 
		set shell=%CYGWIN_HOME%\bin\bash.exe
		set shellcmdflag=--login\ -c
		set shellxquote=\"
		command! -complete=shellcmd -nargs=* -bang Shell call s:ExecuteInShell(<q-args>, '<bang>')
"	cabbrev shell Shell
	endif
endif
set directory=.,$TMP,$TEMP
set diffopt+=vertical " diff files side by side
set diffopt+=icase    " diff ignores case
set diffopt+=iwhite   " diff ignores whitespace

" ------------------------------------------------------------------------------
" Vim UI
" ------------------------------------------------------------------------------
colorscheme torte
set cursorline
set background=dark                                           " we plan to use a dark background
set laststatus=2                  " always show the status line
set lazyredraw                    " do not redraw while running macros
set linespace=0                   " don't insert any extra pixel lines betweens rows
set matchtime=5                   " how many tenths of a second to blink matching brackets for
set mousehide                     " hide the mouse cursor when typing
set nostartofline                 " leave my cursor where it was
set novisualbell                  " don't blink
set number numberwidth=5          " turn on line numbers
set report=0                      " tell us when anything is changed via :...
set ruler                         " Always show current positions along the bottom
set scrolloff=10                  " Keep 10 lines (top/bottom) for scope
set shortmess=aOstT               " shortens messages to avoid 'press a key' prompt
set showcmd                       " show the command being typed
set showmatch                     " show matching brackets
set sidescrolloff=10              " Keep 5 lines at the size
set showtabline=0
syntax on                         " syntax highlighting on
set statusline=%F%m%r%h%w[%L][%{&ff}]%y[%p%%][%04l,%04v][%{fugitive#statusline()}]
" set statusline=%F%m%r%h%w[%L][%{&ff}]%y[%p%%][%04l,%04v]
"              | | | | |  |   |      |  |     |    |
"              | | | | |  |   |      |  |     |    + current column
"              | | | | |  |   |      |  |     +-- current line
"              | | | | |  |   |      |  +-- current % into file
"              | | | | |  |   |      +-- current syntax in square brackets
"              | | | | |  |   +-- current fileformat
"              | | | | |  +-- number of lines
"              | | | | +-- preview flag in square brackets
"              | | | +-- help flag in square brackets
"              | | +-- readonly flag in square bracketskkk
"              | +-- rodified flag in square brackets
"              +-- full path to file in the buffer
"   		   ||+- show toolbar
if has("gui_running")
	set guioptions+=T	" include toolbar
	set guioptions+=m	" show menu
	let &t_Co=256
	set guitablabel=%M\ %t
endif
if has("terminfo")
	let &t_Sf="\ESC[3%p1%dm"
	let &t_Sb="\ESC[4%p1%dm"
else
	let &t_Sf="\ESC[3%dm"
	let &t_Sb="\ESC[4%dm"
endif

" Allow color schemes to do bright colors without forcing bold.
if &t_Co == 8 && $TERM !~# '^linux'
  set t_Co=16
endif

" Odds n Ends
set ttymouse=xterm2 " makes it work in everything

" run on startup
":helptags ~/vimfiles/doc

" ------------------------------------------------------------------------------
" Mappings
" ------------------------------------------------------------------------------
inoremap jj <esc>                        " type j...j to leave insert mode

let mapleader = ','                      " use , instead of \ for escaping commands
let maplocalleader = ','                 " use , instead of \ for escaping commands

" Map <Space> to / (search) and Ctrl-<Space> to ? (backwards search)
map <space> /
map <c-space> ?

" Disable highlight when <leader><cr> is pressed
map <silent> <leader><cr> :noh<cr>

"move between splits/windows with control-[movement]
map <C-j> <C-W>j
map <C-k> <C-W>k
map <C-h> <C-W>h
map <C-l> <C-W>l

" Close the current buffer
map <leader>bd :Bclose<cr>

" Close all the buffers
map <leader>ba :1,1000 bd!<cr>

" Switch CWD to the directory of the open buffer
map <leader>cd :cd %:p:h<cr>:pwd<cr>

" Specify the behavior when switching between buffers
try
  set switchbuf=useopen,usetab,newtab
  set stal=2
catch
endtry

" switch between buffers with tab w/ Ctrl-N/P
nnoremap <C-n> :bnext<CR>
nnoremap <C-p> :bprevious<CR>

" Replace word under cursor globally
nnoremap <Leader>a :%s/\<<C-r><C-w>\>/
" Replace word under cursor in line
nnoremap <Leader>s :s/\<<C-r><C-w>\>/

" ------------------------------------------------------------------------------
" Plugin Settings
" ------------------------------------------------------------------------------
" ctags
set tags=tags;/

" vimgrep
vnoremap <silent> gv :call VisualSelection('gv')<CR>
" Open vimgrep and put the cursor in the right position
map <leader>g :vimgrep // **/*.<left><left><left><left><left><left><left>
" Vimgreps in the current file
map <leader><space> :vimgrep // <C-R>%<C-A><right><right><right><right><right><right><right><right><right>
" When you press <leader>r you can search and replace the selected text
vnoremap <silent> <leader>r :call VisualSelection('replace')<CR>

" gist.vim
let g:github_user = 'GaryFurash'
let g:github_token = '56d288b02d32162efec1fe0918e5274c83acbe70'

" ------------------------------------------------------------------------------
" Autocommands (run on ... for filetype ...)
" ------------------------------------------------------------------------------
" TODO: create custom fold function for sqr
autocmd FileType sqr setlocal tabstop=2 shiftwidth=2 softtabstop=2 expandtab
autocmd BufRead,BufNewFile *.sqr,*.sqc setlocal tabstop=2 shiftwidth=2 softtabstop=0 expandtab
" use empty(s:running_windows) if string instead of number
if (s:running_windows)
	autocmd FileType xml,xsl,html exe ":silent %!xml fo -t"
else
	autocmd FileType xml,xsl,html exe ":silent %!xmllint XMLLINT_INDENT='\t' --format --recover - 2>/dev/null"
endif

" ------------------------------------------------------------------------------
" scala
" ------------------------------------------------------------------------------
" TODO: create custom fold function for sqr
let g:scala_sort_across_groups=1
au BufEnter *.scala setl formatprg=java\ -jar\ /Users/stefanb/Exec/scalariform.jar\ -f\ -q\ +alignParameters\ +alignSingleLineCaseStatements\ +doubleIndentClassDeclaration\ +preserveDanglingCloseParenthesis\ +rewriteArrowSymbols\ +preserveSpaceBeforeArguments\ --stdin\ --stdout
nmap <leader>m :SortScalaImports<CR>gggqG<C-o><C-o><leader><w>

" ------------------------------------------------------------------------------
" highlight unwanted(trailing) whitespace
" ------------------------------------------------------------------------------
" http://vim.wikia.com/wiki/Highlight_unwanted_spaces
:highlight ExtraWhitespace ctermbg=red guibg=red
:autocmd ColorScheme * highlight ExtraWhitespace ctermbg=red guibg=red
autocmd BufWinEnter * match ExtraWhitespace /\s\+$/
autocmd InsertEnter * match ExtraWhitespace /\s\+\%#\@<!$/
autocmd InsertLeave * match ExtraWhitespace /\s\+$/
autocmd BufWinLeave * call clearmatches()

" ------------------------------------------------------------------------------
" cusotm fold text function cleaner than the default
" ------------------------------------------------------------------------------
function! SimpleFoldText()
	return getline(v:foldstart).' '
endfunction

" ------------------------------------------------------------------------------
" execute a command and show the results in a new buffer
" Usage:	:Shell ls -al
"			<localeader>r		re-execute command
"			:Shell!				re-execute command
"			<localeader>g		go to previous window
" ------------------------------------------------------------------------------
function! s:ExecuteInShell(command, bang)
	let _ = a:bang != '' ? s:_ : a:command == '' ? '' : join(map(split(a:command), 'expand(v:val)'))

	if (_ != '')
		let s:_ = _
		let bufnr = bufnr('%')
		let winnr = bufwinnr('^' . _ . '$')
		silent! execute  winnr < 0 ? 'belowright new ' . fnameescape(_) : winnr . 'wincmd w'
		setlocal buftype=nowrite bufhidden=wipe nobuflisted noswapfile wrap number
		silent! :%d
		let message = 'Execute ' . _ . '...'
		call append(0, message)
		echo message
		silent! 2d | resize 1 | redraw
		silent! execute 'silent! %!'. _
		silent! execute 'resize ' . line('$')
		silent! execute 'syntax on'
		silent! execute 'autocmd BufUnload <buffer> execute bufwinnr(' . bufnr . ') . ''wincmd w'''
		silent! execute 'autocmd BufEnter <buffer> execute ''resize '' .  line(''$'')'
		silent! execute 'nnoremap <silent> <buffer> <CR> :call <SID>ExecuteInShell(''' . _ . ''', '''')<CR>'
		silent! execute 'nnoremap <silent> <buffer> <LocalLeader>r :call <SID>ExecuteInShell(''' . _ . ''', '''')<CR>'
		silent! execute 'nnoremap <silent> <buffer> <LocalLeader>g :execute bufwinnr(' . bufnr . ') . ''wincmd w''<CR>'
		nnoremap <silent> <buffer> <C-W>_ :execute 'resize ' . line('$')<CR>
		silent! syntax on
	endif
endfunction

" ------------------------------------------------------------------------------
" repeat a character value N times
" Usage		:call Repeat()
" ------------------------------------------------------------------------------
function! Repeat()
	let times = input("Count: ")
	let char  = input("Char: ")
	exe ":normal a" . repeat(char, times)
endfunction
imap <C-u> <ESC>:call Repeat()<CR>

" ------------------------------------------------------------------------------
function! WordMode()
" ------------------------------------------------------------------------------
"  TODO: save before variables, add correct tab settings
	setlocal formatoptions=1
	setlocal spell spelllang=en_us
	setlocal wrap
	vnoremap j gj
	vnoremap k gk
	nnoremap j gj
	nnoremap k gk
	" set border on the left side of the page
	setlocal foldcolumn=7
endfunction

" ------------------------------------------------------------------------------
" select text visually, then press ~ to cycle through upper, lower, title case
" ------------------------------------------------------------------------------
function! TwiddleCase(str)
  if a:str ==# toupper(a:str)
	let result = tolower(a:str)
  elseif a:str ==# tolower(a:str)
	let result = substitute(a:str,'\(\<\w\+\>\)', '\u\1', 'g')
  else
	let result = toupper(a:str)
  endif
  return result
endfunction
vnoremap ~ y:call setreg('', TwiddleCase(@"), getregtype(''))<CR>gv""Pgv

" ------------------------------------------------------------------------
function! ListUniqueSort(list, ...)
" ------------------------------------------------------------------------
  let dictionary = {}
  for i in a:list
	let dictionary[string(i)] = i
  endfor
  let result = []
  if ( exists( 'a:1' ) )
	let result = sort( values( dictionary ), a:1 )
  else
	let result = sort( values( dictionary ) )
  endif
  return result
endfunction

" ------------------------------------------------------------------------------
function! MyDiff()
" ------------------------------------------------------------------------------
	let opt = '-a --binary '
	if &diffopt =~ 'icase' | let opt = opt . '-i ' | endif
	if &diffopt =~ 'iwhite' | let opt = opt . '-b ' | endif
	let arg1 = v:fname_in
	if arg1 =~ ' ' | let arg1 = '"' . arg1 . '"' | endif
	let arg2 = v:fname_new
	if arg2 =~ ' ' | let arg2 = '"' . arg2 . '"' | endif
	let arg3 = v:fname_out
	if arg3 =~ ' ' | let arg3 = '"' . arg3 . '"' | endif
	if &sh =~ '\<cmd'
		silent execute '!""' . $VIM. '\vim74\diff.exe" ' . opt . arg1 . ' ' . arg2 . ' > ' . arg3 . '"'
	else
		silent execute '!'.$VIM.'\vim74\diff.exe" ' . opt . arg1 . ' ' . arg2 . ' > ' . arg3
	endif
endfunction


" ------------------------------------------------------------------------------
function! ToggleFoldLevel() 
" ------------------------------------------------------------------------------
	if (&foldlevel == 0)
		set foldlevel=99
	else
		set foldlevel=0
	endif
endfunction
nnoremap <leader>f :call ToggleFoldLevel()<cr>
