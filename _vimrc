"============================================================================
"title          :_vimrc
"description    :vim configuration file
"author         :Gary Furash
"date           :20140722
"version        :1
"usage          :place this (or alias this) in your home directory as .vimrc
"notes          :
"bash_version   :4.1.11(2)-release
"============================================================================

" ------------------------------------------------------------------------
" Startup
" ------------------------------------------------------------------------
let s:running_windows = has("win16") || has("in32") || has("win74")
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
set noerrorbells                                                   " don't make noise
set showtabline=0                                                  " never show tabs
set wildmenu                                                       " turn on command line completion wild style
set completeopt=menuone                                            " always show menu for completions
set foldenable foldmethod=indent                                   " Turn on folding at indents
set foldopen=block,hor,mark,percent,quickfix,tag                   " what movements open folds
set foldtext=SimpleFoldText()                                      " Custom fold text function (cleaner than default)
set formatoptions=rq                                               " Automatically insert comment leader on return, and let gq format comments
"set ignorecase incsearch hlsearch                                 " search: ignore case, higlight matches
set ignorecase hlsearch                                  		   " search: ignore case, higlight matches
if maparg('<C-L>', 'n') ==# ''
	nnoremap <silent> <C-L> :nohlsearch<CR><C-L>
endif
set nolist                                                         " do not show hidden characters
set nowrap shiftround shiftwidth=4                                 " configure (no) line wrapping
set smartindent                                                    " perform c-like indenting
set tabstop=4 nosmarttab noexpandtab                               " use real tab characters
set wildignore=*.dll,*.o,*.obj,*.bak,*.exe,*.pyc,*.jpg,*.gif,*.png " ignore these list file extensions
set wildmode=list:longest                                          " turn on wild mode huge list
if &encoding ==# 'latin1' && has('gui_running')
	set encoding=utf-8
endif

" ------------------------------------------------------------------------------
" Envorinment Configuration
" ------------------------------------------------------------------------------

" create backup and temporary directories if they don't exist
function! InitBackupDir()
	if has('win32') || has('win32unix') "windows/cygwin
		let l:separator = '_'
	else
		let l:separator = '.'
	endif
	let l:parent = $HOME . '/' . l:separator . 'vim/'
	let l:backup = l:parent . 'backup/'
	let l:tmp = l:parent . 'tmp/'
	if exists('*mkdir')
		if !isdirectory(l:parent)
			call mkdir(l:parent)
		endif
		if !isdirectory(l:backup)
			call mkdir(l:backup)
		endif
		if !isdirectory(l:tmp)
			call mkdir(l:tmp)
		endif
	endif
	let l:missing_dir = 0
	if isdirectory(l:tmp)
		execute 'set backupdir=' . escape(l:backup, ' ') . '/,.'
	else
		let l:missing_dir = 1
	endif
	if isdirectory(l:backup)
		execute 'set directory=' . escape(l:tmp, ' ') . '/,.'
	else
		let l:missing_dir = 1
	endif
	if l:missing_dir
		echo 'Warning: Unable to create backup directories:' l:backup 'and' l:tmp
		echo 'Try: mkdir -p' l:backup
		echo 'and: mkdir -p' l:tmp
		set backupdir=.
		set directory=.
	endif
endfunction

call InitBackupDir()
set directory=.,$TMP,$TEMP

" add windows executables, configure shell for windows
if has('win32') || has ('win64')
	"let $PATH.=';' . 'C:\Progra~2\gnuwin32\bin'
	"let $PATH.=';' . '%USERPROFILE%\bin'
	"let $PATH.=';' . '%JAVA_HOME%\bin'
	"let $PATH.=';' . ';%ORACLE_HOME%;'
	"let $PATH.=';' . '%PYTHONHOME%;'
	"let $PATH.=';' . '%PYTHONHOME%\Scripts;'
	"let $PATH.=';' . '%PYTHONHOME%\Lib\site-packages\PyQt4;'
	"TODO: toggle based on CYGWIN_HOME environemnt variable or user command
	"set shell=cmd.exe
 	"set shellcmdflag=/c
 	"set shellxquote=("
	let $PATH='C:\bin\cygwin64\bin;C:\bin\Cygwin64\usr\local\bin;C:\bin\Cygwin64\usr\bin\;' . $PATH
	let &shell='C:/bin/cygwin64/bin/bash.exe' . ' --rcfile /cygdrive/c/users/' . $USERNAME . '/etc/_bashrc ' . '-i '
 	set shellcmdflag=-c
 	set shellxquote=\"
	set diffexpr=MyDiff()
endif

" ------------------------------------------------------------------------------
" Vim DIFF
" ------------------------------------------------------------------------------
set diffopt+=vertical " diff files side by side
set diffopt+=icase    " diff ignores case
set diffopt+=iwhite   " diff ignores whitespace

" ------------------------------------------------------------------------------
" Vim UI
" ------------------------------------------------------------------------------
colorscheme omen
set cursorline
set display+=lastline    " show last line of text
set laststatus=2         " always show the status line
set lazyredraw           " do not redraw while running macros
set linespace=0          " don't insert any extra pixel lines betweens rows
set matchtime=5          " how many tenths of a second to blink matching brackets for
set mouse=a              " use mouse everywhere
set mousehide            " hide the mouse cursor when typing
set nostartofline        " leave my cursor where it was
set novisualbell         " don't blink
set number numberwidth=5 " turn on line numbers
set report=0             " tell us when anything is changed via :...
set ruler                " Always show current positions along the bottom
set scrolloff=10         " Keep 10 lines (top/bottom) for scope
set shortmess=aOstT      " shortens messages to avoid 'press a key' prompt
set showcmd              " show the command being typed
set showmatch            " show matching brackets
set showtabline=0
set sidescrolloff=10     " Keep 5 lines at the size
syntax on                " syntax highlighting on
if &listchars ==# 'eol:$'
	set listchars=tab:>\ ,trail:-,extends:>,precedes:<,nbsp:+
endif

if has("gui_running")
	let &t_Co=256
	set guitablabel=%M\ %t
	set ch=2			" Make command line two lines high
	set guioptions+=aegimrLt
	set guioptions-=T	" include toolbar
	set hlsearch		" Switch on search pattern highlighting.
endif

" set font based on operating system
if has("gui_running")
	if has("gui_gtk2")
	:set guifont=Luxi\ Mono\ 12
	elseif has("x11")
	" Also for GTK 1
	:set guifont=*-lucidatypewriter-medium-r-normal-*-*-180-*-*-m-*-*
	elseif has("gui_win32")
	set guifont=DejaVu_Sans_Mono:h9:cANSI
	endif
endif

if has("terminfo")
	let &t_Sf="\ESC[3%p1%dm"
	let &t_Sb="\ESC[4%p1%dm"
else
	let &t_Sf="\ESC[3%dm"
	let &t_Sb="\ESC[4%dm"
endif

" setup the cursor in terminal mode
if &term =~ '^xterm'
	let &t_ti.="\e[1 q"
	let &t_SI.="\e[5 q"
	let &t_EI.="\e[1 q"
	let &t_te.="\e[0 q"
endif

" Allow color schemes to do bright colors without forcing bold.
if &t_Co == 8 && $TERM !~# '^linux'
	set t_Co=16
endif

" Odds n Ends
set ttymouse=xterm2 " makes it work in everything

" ------------------------------------------------------------------------------
" Configure VIM Status Line
" ------------------------------------------------------------------------------
set statusline=\ "
set statusline+=%1*%-25.80f%*\ 						"filename min 25, max 80 (right justified)
set statusline+=%2*
set statusline+=%h 									"help file flag
set statusline+=%r 									"read only flag
set statusline+=%m 									"modified flag
set statusline+=%w 									"preview flag
set statusline+=%*\ "
set statusline+=%3*[
set statusline+=%{strlen(&ft)?&ft:'none'} 			"filetype
set statusline+=]%*\ "
set statusline+=[%{&ff}]\ "							"file format
"set statusline+=%4*%{fugitive#statusline()}%*\ " 	"git status
set statusline+=%= 									" right align
set statusline+=%8*%-14.(%l,%c%V%)\ %<%P%* 			"offset

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
nmap <silent> <c-k> :wincmd k<CR>
nmap <silent> <c-j> :wincmd j<CR>
nmap <silent> <c-h> :wincmd h<CR>
nmap <silent> <c-l> :wincmd l<CR>

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

command! -nargs=* Wrap set wrap linebreak nolist

" ------------------------------------------------------------------------------
" Autocommands (run on ... for filetype ...)
" ------------------------------------------------------------------------------
" TODO: create custom fold function for sqr
autocmd FileType sqr setlocal tabstop=2 shiftwidth=2 softtabstop=2 expandtab
autocmd BufRead,BufNewFile *.sqr,*.sqc setlocal tabstop=2 shiftwidth=2 softtabstop=0 expandtab
" todo: fix to work on both windows and cygwin/linux
" use empty(s:running_windows) if string instead of number
if (s:running_windows)
	autocmd FileType xml,xsl,html exe ":silent %!xml fo -t"
else
	autocmd FileType xml,xsl,html exe ":silent %!xmllint XMLLINT_INDENT='\t' --format --recover - 2>/dev/null"
endif
autocmd FileType javascript noremap <buffer>  <c-f> :call JsBeautify()<cr>
autocmd FileType html noremap <buffer> <c-f> :call HtmlBeautify()<cr>
autocmd FileType css noremap <buffer> <c-f> :call CSSBeautify()<cr>
autocmd FileType javascript set dictionary+=$HOME/.vim/dict/node.dict

" ------------------------------------------------------------------------------
" Plugin Settings
" ------------------------------------------------------------------------------
let g:miniBufExplMapWindowNavVim = 1
let g:miniBufExplMapWindowNavArrows = 1
let g:miniBufExplMapCTabSwitchBufs = 1
let g:miniBufExplModSelTarget = 1

" turnon whitespace cleaning except for...
let g:better_whitespace_enabled = 1
let g:strip_whitespace_on_save = 1
" let g:better_whitespace_filetypes_blacklist=['<filetype1>', '<filetype2>', '<etc>']

" ------------------------------------------------------------------------------
" scala
" ------------------------------------------------------------------------------
" TODO: create custom fold function for sqr
let g:scala_sort_across_groups=1
au BufEnter *.scala setl formatprg=java\ -jar\ /Users/stefanb/Exec/scalariform.jar\ -f\ -q\ +alignParameters\ +alignSingleLineCaseStatements\ +doubleIndentClassDeclaration\ +preserveDanglingCloseParenthesis\ +rewriteArrowSymbols\ +preserveSpaceBeforeArguments\ --stdin\ --stdout
nmap <leader>m :SortScalaImports<CR>gggqG<C-o><C-o><leader><w>

" ------------------------------------------------------------------------------
"  filetype mappings
" ------------------------------------------------------------------------------
autocmd BufRead,BufNewFile *.dms set filetype=sql

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
