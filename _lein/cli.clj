




<!DOCTYPE html>
<html class="   ">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    
    <title>tools.cli/src/main/clojure/clojure/tools/cli.clj at master · clojure/tools.cli</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png" />
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png" />
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png" />
    <meta property="fb:app_id" content="1401488693436528"/>

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="clojure/tools.cli" name="twitter:title" /><meta content="tools.cli - Command-line processing" name="twitter:description" /><meta content="https://avatars2.githubusercontent.com/u/317875?s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars2.githubusercontent.com/u/317875?s=400" property="og:image" /><meta content="clojure/tools.cli" property="og:title" /><meta content="https://github.com/clojure/tools.cli" property="og:url" /><meta content="tools.cli - Command-line processing" property="og:description" />

    <link rel="assets" href="https://github.global.ssl.fastly.net/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035/">
    <link rel="xhr-socket" href="/_sockets" />

    <meta name="msapplication-TileImage" content="/windows-tile.png" />
    <meta name="msapplication-TileColor" content="#ffffff" />
    <meta name="selected-link" value="repo_source" data-pjax-transient />
    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="9687F18D:33B1:1901AAA:53553CDA" name="octolytics-dimension-request_id" /><meta content="715614" name="octolytics-actor-id" /><meta content="GaryFurash" name="octolytics-actor-login" /><meta content="2bd41b9b52c8dd85af4e720ada4e200dbd5477714b69548ba0e1e03748b60ed2" name="octolytics-actor-hash" />
    

    
    
    <link rel="icon" type="image/x-icon" href="https://github.global.ssl.fastly.net/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="MoVBSXsOKJE1LEuVCK1S8DuUN8iO/otyNiKRkQig1CM=" name="csrf-token" />

    <link href="https://github.global.ssl.fastly.net/assets/github-cb29f8bea2642215caf339bb233bab57a2f5c425.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://github.global.ssl.fastly.net/assets/github2-dcc4741ab191e42d5f0e7bc8107928d3afedb6ed.css" media="all" rel="stylesheet" type="text/css" />
    


        <script crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/frameworks-f8f8d8ee1afb4365ba5e002fdbc3c8e61738713b.js" type="text/javascript"></script>
        <script async="async" crossorigin="anonymous" src="https://github.global.ssl.fastly.net/assets/github-3d40051ee9deef4dcbac4b258559962e1ff08bc6.js" type="text/javascript"></script>
        
        
      <meta http-equiv="x-pjax-version" content="afc5a09a157cf0901a9a63cf80e8d4a9">

        <link data-pjax-transient rel='permalink' href='/clojure/tools.cli/blob/9e740a6334976cd867c7d70bff54612222434af8/src/main/clojure/clojure/tools/cli.clj'>

  <meta name="description" content="tools.cli - Command-line processing" />

  <meta content="317875" name="octolytics-dimension-user_id" /><meta content="clojure" name="octolytics-dimension-user_login" /><meta content="1640042" name="octolytics-dimension-repository_id" /><meta content="clojure/tools.cli" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="1640042" name="octolytics-dimension-repository_network_root_id" /><meta content="clojure/tools.cli" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/clojure/tools.cli/commits/master.atom" rel="alternate" title="Recent Commits to tools.cli:master" type="application/atom+xml" />

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/">
  <span class="mega-octicon octicon-mark-github"></span>
</a>

    
    <a href="/notifications" aria-label="You have unread notifications" class="notification-indicator tooltipped tooltipped-s" data-gotokey="n">
        <span class="mail-status unread"></span>
</a>

      <div class="command-bar js-command-bar  in-repository">
          <form accept-charset="UTF-8" action="/search" class="command-bar-form" id="top_search_form" method="get">

<div class="commandbar">
  <span class="message"></span>
  <input type="text" data-hotkey="/ s" name="q" id="js-command-bar-field" placeholder="Search or type a command" tabindex="1" autocapitalize="off"
    
    data-username="GaryFurash"
      data-repo="clojure/tools.cli"
      data-branch="master"
      data-sha="ff46169966f7641423e103c4659ca97ee480300c"
  >
  <div class="display hidden"></div>
</div>

    <input type="hidden" name="nwo" value="clojure/tools.cli" />

    <div class="select-menu js-menu-container js-select-menu search-context-select-menu">
      <span class="minibutton select-menu-button js-menu-target" role="button" aria-haspopup="true">
        <span class="js-select-button">This repository</span>
      </span>

      <div class="select-menu-modal-holder js-menu-content js-navigation-container" aria-hidden="true">
        <div class="select-menu-modal">

          <div class="select-menu-item js-navigation-item js-this-repository-navigation-item selected">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" class="js-search-this-repository" name="search_target" value="repository" checked="checked" />
            <div class="select-menu-item-text js-select-button-text">This repository</div>
          </div> <!-- /.select-menu-item -->

          <div class="select-menu-item js-navigation-item js-all-repositories-navigation-item">
            <span class="select-menu-item-icon octicon octicon-check"></span>
            <input type="radio" name="search_target" value="global" />
            <div class="select-menu-item-text js-select-button-text">All repositories</div>
          </div> <!-- /.select-menu-item -->

        </div>
      </div>
    </div>

  <span class="help tooltipped tooltipped-s" aria-label="Show command bar help">
    <span class="octicon octicon-question"></span>
  </span>


  <input type="hidden" name="ref" value="cmdform">

</form>
        <ul class="top-nav">
          <li class="explore"><a href="/explore">Explore</a></li>
            <li><a href="https://gist.github.com">Gist</a></li>
            <li><a href="/blog">Blog</a></li>
          <li><a href="https://help.github.com">Help</a></li>
        </ul>
      </div>

    


  <ul id="user-links">
    <li>
      <a href="/GaryFurash" class="name">
        <img alt="Gary Furash" class=" js-avatar" data-user="715614" height="20" src="https://avatars2.githubusercontent.com/u/715614?s=140" width="20" /> GaryFurash
      </a>
    </li>

    <li class="new-menu dropdown-toggle js-menu-container">
      <a href="#" class="js-menu-target tooltipped tooltipped-s" aria-label="Create new...">
        <span class="octicon octicon-plus"></span>
        <span class="dropdown-arrow"></span>
      </a>

      <div class="new-menu-content js-menu-content">
      </div>
    </li>

    <li>
      <a href="/settings/profile" id="account_settings"
        class="tooltipped tooltipped-s"
        aria-label="Account settings ">
        <span class="octicon octicon-tools"></span>
      </a>
    </li>
    <li>
      <form class="logout-form" action="/logout" method="post">
        <button class="sign-out-button tooltipped tooltipped-s" aria-label="Sign out">
          <span class="octicon octicon-log-out"></span>
        </button>
      </form>
    </li>

  </ul>

<div class="js-new-dropdown-contents hidden">
  

<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo-create"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


    <li class="section-title">
      <span title="clojure/tools.cli">This repository</span>
    </li>
      <li>
        <a href="/clojure/tools.cli/issues/new"><span class="octicon octicon-issue-opened"></span> New issue</a>
      </li>
</ul>

</div>


    
  </div>
</div>

      

        



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        

<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="MoVBSXsOKJE1LEuVCK1S8DuUN8iO/otyNiKRkQig1CM=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="1640042" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/clojure/tools.cli/watchers">
        39
      </a>
      <span class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye-watch"></span>
          Watch
        </span>
      </span>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notification status</span>
            <span class="octicon octicon-remove-close js-menu-close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">You only receive notifications for conversations in which you participate or are @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-watch"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">You receive notifications for all conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye-unwatch"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">You do not receive any notifications for conversations in this repository.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
  

  <div class="js-toggler-container js-social-container starring-container ">
    <a href="/clojure/tools.cli/unstar"
      class="minibutton with-count js-toggler-target star-button starred"
      aria-label="Unstar this repository" title="Unstar clojure/tools.cli" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star-delete"></span><span class="text">Unstar</span>
    </a>

    <a href="/clojure/tools.cli/star"
      class="minibutton with-count js-toggler-target star-button unstarred"
      aria-label="Star this repository" title="Star clojure/tools.cli" data-remote="true" data-method="post" rel="nofollow">
      <span class="octicon octicon-star"></span><span class="text">Star</span>
    </a>

      <a class="social-count js-social-count" href="/clojure/tools.cli/stargazers">
        156
      </a>
  </div>

  </li>


        <li>
          <a href="/clojure/tools.cli/fork" class="minibutton with-count js-toggler-target fork-button lighter tooltipped-n" title="Fork your own copy of clojure/tools.cli to your account" aria-label="Fork your own copy of clojure/tools.cli to your account" rel="nofollow" data-method="post">
            <span class="octicon octicon-git-branch-create"></span><span class="text">Fork</span>
          </a>
          <a href="/clojure/tools.cli/network" class="social-count">18</a>
        </li>


</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="repo-label"><span>public</span></span>
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/clojure" class="url fn" itemprop="url" rel="author"><span itemprop="title">clojure</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/clojure/tools.cli" class="js-current-repository js-repo-home-link">tools.cli</a></strong>

          <span class="page-context-loader">
            <img alt="Octocat-spinner-32" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline js-new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            

<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/clojure/tools.cli" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-gotokey="c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_tags repo_branches /clojure/tools.cli">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

        <li class="tooltipped tooltipped-w" aria-label="Issues">
          <a href="/clojure/tools.cli/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="i" data-selected-links="repo_issues /clojure/tools.cli/issues">
            <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>

      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/clojure/tools.cli/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-gotokey="p" data-selected-links="repo_pulls /clojure/tools.cli/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class='counter'>0</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


        <li class="tooltipped tooltipped-w" aria-label="Wiki">
          <a href="/clojure/tools.cli/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_wiki /clojure/tools.cli/wiki">
            <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
            <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>        </li>
    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/clojure/tools.cli/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /clojure/tools.cli/pulse">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/clojure/tools.cli/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /clojure/tools.cli/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Network">
        <a href="/clojure/tools.cli/network" aria-label="Network" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-selected-links="repo_network /clojure/tools.cli/network">
          <span class="octicon octicon-git-branch"></span> <span class="full-word">Network</span>
          <img alt="Octocat-spinner-32" class="mini-loader" height="16" src="https://github.global.ssl.fastly.net/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                

  

<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><strong>HTTPS</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/clojure/tools.cli.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/clojure/tools.cli.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><strong>SSH</strong> clone URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="git@github.com:clojure/tools.cli.git" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="git@github.com:clojure/tools.cli.git" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>

  

<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><strong>Subversion</strong> checkout URL</h3>
  <div class="clone-url-box">
    <input type="text" class="clone js-url-field"
           value="https://github.com/clojure/tools.cli" readonly="readonly">

    <span aria-label="copy to clipboard" class="js-zeroclipboard url-box-clippy minibutton zeroclipboard-button" data-clipboard-text="https://github.com/clojure/tools.cli" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <span class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <a href="https://help.github.com/articles/which-remote-url-should-i-use">
    <span class="octicon octicon-question"></span>
    </a>
  </span>
</p>


  <a href="github-windows://openRepo/https://github.com/clojure/tools.cli" class="minibutton sidebar-button" title="Save clojure/tools.cli to your computer and use it in GitHub Desktop." aria-label="Save clojure/tools.cli to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/clojure/tools.cli/archive/master.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download clojure/tools.cli as a zip file"
                   title="Download clojure/tools.cli as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:e81955f3c649b918f47d6bf919182442 -->

<p title="This is a placeholder element" class="js-history-link-replace hidden"></p>

<a href="/clojure/tools.cli/find/master" data-pjax data-hotkey="t" class="js-show-file-finder" style="display:none">Show File Finder</a>

<div class="file-navigation">
  

<div class="select-menu js-menu-container js-select-menu" >
  <span class="minibutton select-menu-button js-menu-target" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-remove-close js-menu-close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/blob/TCLI-6/src/main/clojure/clojure/tools/cli.clj"
                 data-name="TCLI-6"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="TCLI-6">TCLI-6</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/blob/gh-pages/src/main/clojure/clojure/tools/cli.clj"
                 data-name="gh-pages"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="gh-pages">gh-pages</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/blob/master/src/main/clojure/clojure/tools/cli.clj"
                 data-name="master"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="master">master</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/blob/next/src/main/clojure/clojure/tools/cli.clj"
                 data-name="next"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="next">next</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.3.1/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.3.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.3.1">tools.cli-0.3.1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.3.0-beta1/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.3.0-beta1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.3.0-beta1">tools.cli-0.3.0-beta1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.3.0/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.3.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.3.0">tools.cli-0.3.0</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.2.4/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.2.4"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.2.4">tools.cli-0.2.4</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.2.3/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.2.3"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.2.3">tools.cli-0.2.3</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.2.2/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.2.2"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.2.2">tools.cli-0.2.2</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.2.1/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.2.1"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.2.1">tools.cli-0.2.1</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.2.0/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.2.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.2.0">tools.cli-0.2.0</a>
            </div> <!-- /.select-menu-item -->
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/clojure/tools.cli/tree/tools.cli-0.1.0/src/main/clojure/clojure/tools/cli.clj"
                 data-name="tools.cli-0.1.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text js-select-button-text css-truncate-target"
                 title="tools.cli-0.1.0">tools.cli-0.1.0</a>
            </div> <!-- /.select-menu-item -->
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/clojure/tools.cli" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">tools.cli</span></a></span></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/clojure/tools.cli/tree/master/src" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">src</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/clojure/tools.cli/tree/master/src/main" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">main</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/clojure/tools.cli/tree/master/src/main/clojure" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">clojure</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/clojure/tools.cli/tree/master/src/main/clojure/clojure" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">clojure</span></a></span><span class="separator"> / </span><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/clojure/tools.cli/tree/master/src/main/clojure/clojure/tools" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">tools</span></a></span><span class="separator"> / </span><strong class="final-path">cli.clj</strong> <span aria-label="copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="src/main/clojure/clojure/tools/cli.clj" data-copied-hint="copied!"><span class="octicon octicon-clippy"></span></span>
  </div>
</div>


  <div class="commit file-history-tease">
    <img alt="Sung Pae" class="main-avatar js-avatar" data-user="55776" height="24" src="https://avatars1.githubusercontent.com/u/55776?s=140" width="24" />
    <span class="author"><a href="/guns" rel="author">guns</a></span>
    <local-time datetime="2014-01-02T04:28:07-06:00" from="now" title-format="%Y-%m-%d %H:%M:%S %z" title="2014-01-02 04:28:07 -0600">January 02, 2014</local-time>
    <div class="commit-title">
        <a href="/clojure/tools.cli/commit/b2ffe90b00e299dbcbaeb0c903409d50e64cbcd9" class="message" data-pjax="true" title="Refactor summarize for clarity">Refactor summarize for clarity</a>
    </div>

    <div class="participation">
      <p class="quickstat"><a href="#blob_contributors_box" rel="facebox"><strong>5</strong>  contributors</a></p>
          <a class="avatar tooltipped tooltipped-s" aria-label="guns" href="/clojure/tools.cli/commits/master/src/main/clojure/clojure/tools/cli.clj?author=guns"><img alt="Sung Pae" class=" js-avatar" data-user="55776" height="20" src="https://avatars1.githubusercontent.com/u/55776?s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="gar3thjon3s" href="/clojure/tools.cli/commits/master/src/main/clojure/clojure/tools/cli.clj?author=gar3thjon3s"><img alt="Gareth Jones" class=" js-avatar" data-user="5753" height="20" src="https://avatars1.githubusercontent.com/u/5753?s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="hugoduncan" href="/clojure/tools.cli/commits/master/src/main/clojure/clojure/tools/cli.clj?author=hugoduncan"><img alt="Hugo Duncan" class=" js-avatar" data-user="54043" height="20" src="https://avatars2.githubusercontent.com/u/54043?s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="seancorfield" href="/clojure/tools.cli/commits/master/src/main/clojure/clojure/tools/cli.clj?author=seancorfield"><img alt="Sean Corfield" class=" js-avatar" data-user="43875" height="20" src="https://avatars2.githubusercontent.com/u/43875?s=140" width="20" /></a>
    <a class="avatar tooltipped tooltipped-s" aria-label="abedra" href="/clojure/tools.cli/commits/master/src/main/clojure/clojure/tools/cli.clj?author=abedra"><img alt="Aaron Bedra" class=" js-avatar" data-user="2090" height="20" src="https://avatars3.githubusercontent.com/u/2090?s=140" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="Sung Pae" class=" js-avatar" data-user="55776" height="24" src="https://avatars1.githubusercontent.com/u/55776?s=140" width="24" />
            <a href="/guns">guns</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Gareth Jones" class=" js-avatar" data-user="5753" height="24" src="https://avatars1.githubusercontent.com/u/5753?s=140" width="24" />
            <a href="/gar3thjon3s">gar3thjon3s</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Hugo Duncan" class=" js-avatar" data-user="54043" height="24" src="https://avatars2.githubusercontent.com/u/54043?s=140" width="24" />
            <a href="/hugoduncan">hugoduncan</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Sean Corfield" class=" js-avatar" data-user="43875" height="24" src="https://avatars2.githubusercontent.com/u/43875?s=140" width="24" />
            <a href="/seancorfield">seancorfield</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Aaron Bedra" class=" js-avatar" data-user="2090" height="24" src="https://avatars3.githubusercontent.com/u/2090?s=140" width="24" />
            <a href="/abedra">abedra</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
        <span class="icon"><b class="octicon octicon-file-text"></b></span>
        <span class="mode" title="File Mode">file</span>
        <span class="meta-divider"></span>
          <span>504 lines (416 sloc)</span>
          <span class="meta-divider"></span>
        <span>19.068 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
            <a class="minibutton tooltipped tooltipped-w"
               href="github-windows://openRepo/https://github.com/clojure/tools.cli?branch=master&amp;filepath=src%2Fmain%2Fclojure%2Fclojure%2Ftools%2Fcli.clj" aria-label="Open this file in GitHub for Windows">
                <span class="octicon octicon-device-desktop"></span> Open
            </a>
                <a class="minibutton tooltipped tooltipped-n js-update-url-with-hash"
                   aria-label="Clicking this button will automatically fork this project so you can edit the file"
                   href="/clojure/tools.cli/edit/master/src/main/clojure/clojure/tools/cli.clj"
                   data-method="post" rel="nofollow">Edit</a>
          <a href="/clojure/tools.cli/raw/master/src/main/clojure/clojure/tools/cli.clj" class="button minibutton " id="raw-url">Raw</a>
            <a href="/clojure/tools.cli/blame/master/src/main/clojure/clojure/tools/cli.clj" class="button minibutton js-update-url-with-hash">Blame</a>
          <a href="/clojure/tools.cli/commits/master/src/main/clojure/clojure/tools/cli.clj" class="button minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

            <a class="minibutton danger empty-icon tooltipped tooltipped-s"
               href="/clojure/tools.cli/delete/master/src/main/clojure/clojure/tools/cli.clj"
               aria-label="Fork this project and delete file"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">

          Delete
        </a>
      </div><!-- /.actions -->
    </div>
        <div class="blob-wrapper data type-clojure js-blob-data">
        <table class="file-code file-diff tab-size-8">
          <tr class="file-code-line">
            <td class="blob-line-nums">
              <span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
<span id="L402" rel="#L402">402</span>
<span id="L403" rel="#L403">403</span>
<span id="L404" rel="#L404">404</span>
<span id="L405" rel="#L405">405</span>
<span id="L406" rel="#L406">406</span>
<span id="L407" rel="#L407">407</span>
<span id="L408" rel="#L408">408</span>
<span id="L409" rel="#L409">409</span>
<span id="L410" rel="#L410">410</span>
<span id="L411" rel="#L411">411</span>
<span id="L412" rel="#L412">412</span>
<span id="L413" rel="#L413">413</span>
<span id="L414" rel="#L414">414</span>
<span id="L415" rel="#L415">415</span>
<span id="L416" rel="#L416">416</span>
<span id="L417" rel="#L417">417</span>
<span id="L418" rel="#L418">418</span>
<span id="L419" rel="#L419">419</span>
<span id="L420" rel="#L420">420</span>
<span id="L421" rel="#L421">421</span>
<span id="L422" rel="#L422">422</span>
<span id="L423" rel="#L423">423</span>
<span id="L424" rel="#L424">424</span>
<span id="L425" rel="#L425">425</span>
<span id="L426" rel="#L426">426</span>
<span id="L427" rel="#L427">427</span>
<span id="L428" rel="#L428">428</span>
<span id="L429" rel="#L429">429</span>
<span id="L430" rel="#L430">430</span>
<span id="L431" rel="#L431">431</span>
<span id="L432" rel="#L432">432</span>
<span id="L433" rel="#L433">433</span>
<span id="L434" rel="#L434">434</span>
<span id="L435" rel="#L435">435</span>
<span id="L436" rel="#L436">436</span>
<span id="L437" rel="#L437">437</span>
<span id="L438" rel="#L438">438</span>
<span id="L439" rel="#L439">439</span>
<span id="L440" rel="#L440">440</span>
<span id="L441" rel="#L441">441</span>
<span id="L442" rel="#L442">442</span>
<span id="L443" rel="#L443">443</span>
<span id="L444" rel="#L444">444</span>
<span id="L445" rel="#L445">445</span>
<span id="L446" rel="#L446">446</span>
<span id="L447" rel="#L447">447</span>
<span id="L448" rel="#L448">448</span>
<span id="L449" rel="#L449">449</span>
<span id="L450" rel="#L450">450</span>
<span id="L451" rel="#L451">451</span>
<span id="L452" rel="#L452">452</span>
<span id="L453" rel="#L453">453</span>
<span id="L454" rel="#L454">454</span>
<span id="L455" rel="#L455">455</span>
<span id="L456" rel="#L456">456</span>
<span id="L457" rel="#L457">457</span>
<span id="L458" rel="#L458">458</span>
<span id="L459" rel="#L459">459</span>
<span id="L460" rel="#L460">460</span>
<span id="L461" rel="#L461">461</span>
<span id="L462" rel="#L462">462</span>
<span id="L463" rel="#L463">463</span>
<span id="L464" rel="#L464">464</span>
<span id="L465" rel="#L465">465</span>
<span id="L466" rel="#L466">466</span>
<span id="L467" rel="#L467">467</span>
<span id="L468" rel="#L468">468</span>
<span id="L469" rel="#L469">469</span>
<span id="L470" rel="#L470">470</span>
<span id="L471" rel="#L471">471</span>
<span id="L472" rel="#L472">472</span>
<span id="L473" rel="#L473">473</span>
<span id="L474" rel="#L474">474</span>
<span id="L475" rel="#L475">475</span>
<span id="L476" rel="#L476">476</span>
<span id="L477" rel="#L477">477</span>
<span id="L478" rel="#L478">478</span>
<span id="L479" rel="#L479">479</span>
<span id="L480" rel="#L480">480</span>
<span id="L481" rel="#L481">481</span>
<span id="L482" rel="#L482">482</span>
<span id="L483" rel="#L483">483</span>
<span id="L484" rel="#L484">484</span>
<span id="L485" rel="#L485">485</span>
<span id="L486" rel="#L486">486</span>
<span id="L487" rel="#L487">487</span>
<span id="L488" rel="#L488">488</span>
<span id="L489" rel="#L489">489</span>
<span id="L490" rel="#L490">490</span>
<span id="L491" rel="#L491">491</span>
<span id="L492" rel="#L492">492</span>
<span id="L493" rel="#L493">493</span>
<span id="L494" rel="#L494">494</span>
<span id="L495" rel="#L495">495</span>
<span id="L496" rel="#L496">496</span>
<span id="L497" rel="#L497">497</span>
<span id="L498" rel="#L498">498</span>
<span id="L499" rel="#L499">499</span>
<span id="L500" rel="#L500">500</span>
<span id="L501" rel="#L501">501</span>
<span id="L502" rel="#L502">502</span>
<span id="L503" rel="#L503">503</span>

            </td>
            <td class="blob-line-code"><div class="code-body highlight"><pre><div class='line' id='LC1'><span class="p">(</span><span class="kd">ns </span><span class="o">^</span><span class="p">{</span><span class="ss">:author</span> <span class="s">&quot;Gareth Jones, Sung Pae&quot;</span><span class="p">}</span></div><div class='line' id='LC2'>&nbsp;&nbsp;<span class="nv">clojure.tools.cli</span></div><div class='line' id='LC3'>&nbsp;&nbsp;<span class="p">(</span><span class="ss">:use</span> <span class="p">[</span><span class="nv">clojure.string</span> <span class="ss">:as</span> <span class="nv">s</span> <span class="ss">:only</span> <span class="p">[</span><span class="nv">replace</span><span class="p">]]</span></div><div class='line' id='LC4'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">clojure.pprint</span> <span class="ss">:only</span> <span class="p">[</span><span class="nv">cl-format</span><span class="p">]])</span></div><div class='line' id='LC5'>&nbsp;&nbsp;<span class="p">(</span><span class="ss">:refer-clojure</span> <span class="ss">:exclude</span> <span class="p">[</span><span class="nv">replace</span><span class="p">]))</span></div><div class='line' id='LC6'><br/></div><div class='line' id='LC7'><span class="p">(</span><span class="kd">defn- </span><span class="nv">tokenize-args</span></div><div class='line' id='LC8'>&nbsp;&nbsp;<span class="s">&quot;Reduce arguments sequence into [opt-type opt ?optarg?] vectors and a vector</span></div><div class='line' id='LC9'><span class="s">  of remaining arguments. Returns as [option-tokens remaining-args].</span></div><div class='line' id='LC10'><br/></div><div class='line' id='LC11'><span class="s">  Expands clumped short options like \&quot;-abc\&quot; into:</span></div><div class='line' id='LC12'><span class="s">  [[:short-opt \&quot;-a\&quot;] [:short-opt \&quot;-b\&quot;] [:short-opt \&quot;-c\&quot;]]</span></div><div class='line' id='LC13'><br/></div><div class='line' id='LC14'><span class="s">  If \&quot;-b\&quot; were in the set of options that require arguments, \&quot;-abc\&quot; would</span></div><div class='line' id='LC15'><span class="s">  then be interpreted as: [[:short-opt \&quot;-a\&quot;] [:short-opt \&quot;-b\&quot; \&quot;c\&quot;]]</span></div><div class='line' id='LC16'><br/></div><div class='line' id='LC17'><span class="s">  Long options with `=` are always parsed as option + optarg, even if nothing</span></div><div class='line' id='LC18'><span class="s">  follows the `=` sign.</span></div><div class='line' id='LC19'><br/></div><div class='line' id='LC20'><span class="s">  If the :in-order flag is true, the first non-option, non-optarg argument</span></div><div class='line' id='LC21'><span class="s">  stops options processing. This is useful for handling subcommand options.&quot;</span></div><div class='line' id='LC22'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">required-set</span> <span class="nv">args</span> <span class="o">&amp;</span> <span class="nv">options</span><span class="p">]</span></div><div class='line' id='LC23'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">in-order</span><span class="p">]}</span> <span class="nv">options</span><span class="p">]</span></div><div class='line' id='LC24'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">loop </span><span class="p">[</span><span class="nv">opts</span> <span class="p">[]</span> <span class="nv">argv</span> <span class="p">[]</span> <span class="p">[</span><span class="nv">car</span> <span class="o">&amp;</span> <span class="nv">cdr</span><span class="p">]</span> <span class="nv">args</span><span class="p">]</span></div><div class='line' id='LC25'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="nv">car</span></div><div class='line' id='LC26'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">condp</span> <span class="nb">re-seq </span><span class="nv">car</span></div><div class='line' id='LC27'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">;; Double dash always ends options processing</span></div><div class='line' id='LC28'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">#</span><span class="s">&quot;^--$&quot;</span> <span class="p">(</span><span class="nf">recur</span> <span class="nv">opts</span> <span class="p">(</span><span class="nb">into </span><span class="nv">argv</span> <span class="nv">cdr</span><span class="p">)</span> <span class="p">[])</span></div><div class='line' id='LC29'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">;; Long options with assignment always passes optarg, required or not</span></div><div class='line' id='LC30'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">#</span><span class="s">&quot;^--\S+=&quot;</span> <span class="p">(</span><span class="nf">recur</span> <span class="p">(</span><span class="nb">conj </span><span class="nv">opts</span> <span class="p">(</span><span class="nb">into </span><span class="p">[</span><span class="ss">:long-opt</span><span class="p">]</span> <span class="p">(</span><span class="nf">s/split</span> <span class="nv">car</span> <span class="o">#</span><span class="s">&quot;=&quot;</span> <span class="mi">2</span><span class="p">)))</span></div><div class='line' id='LC31'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">argv</span> <span class="nv">cdr</span><span class="p">)</span></div><div class='line' id='LC32'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">;; Long options, consumes cdr head if needed</span></div><div class='line' id='LC33'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">#</span><span class="s">&quot;^--&quot;</span> <span class="p">(</span><span class="k">let </span><span class="p">[[</span><span class="nv">optarg</span> <span class="nv">cdr</span><span class="p">]</span> <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">contains? </span><span class="nv">required-set</span> <span class="nv">car</span><span class="p">)</span></div><div class='line' id='LC34'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nb">first </span><span class="nv">cdr</span><span class="p">)</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">cdr</span><span class="p">)]</span></div><div class='line' id='LC35'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">nil</span> <span class="nv">cdr</span><span class="p">])]</span></div><div class='line' id='LC36'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="p">(</span><span class="nb">conj </span><span class="nv">opts</span> <span class="p">(</span><span class="nb">into </span><span class="p">[</span><span class="ss">:long-opt</span> <span class="nv">car</span><span class="p">]</span> <span class="p">(</span><span class="k">if </span><span class="nv">optarg</span> <span class="p">[</span><span class="nv">optarg</span><span class="p">]</span> <span class="p">[])))</span></div><div class='line' id='LC37'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">argv</span> <span class="nv">cdr</span><span class="p">))</span></div><div class='line' id='LC38'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">;; Short options, expands clumped opts until an optarg is required</span></div><div class='line' id='LC39'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">#</span><span class="s">&quot;^-.&quot;</span> <span class="p">(</span><span class="k">let </span><span class="p">[[</span><span class="nv">os</span> <span class="nv">cdr</span><span class="p">]</span> <span class="p">(</span><span class="k">loop </span><span class="p">[</span><span class="nv">os</span> <span class="p">[]</span> <span class="p">[</span><span class="nv">c</span> <span class="o">&amp;</span> <span class="nv">cs</span><span class="p">]</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">car</span><span class="p">)]</span></div><div class='line' id='LC40'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">o</span> <span class="p">(</span><span class="nb">str </span><span class="sc">\-</span> <span class="nv">c</span><span class="p">)]</span></div><div class='line' id='LC41'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">contains? </span><span class="nv">required-set</span> <span class="nv">o</span><span class="p">)</span></div><div class='line' id='LC42'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">seq </span><span class="nv">cs</span><span class="p">)</span></div><div class='line' id='LC43'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">;; Get optarg from rest of car</span></div><div class='line' id='LC44'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nb">conj </span><span class="nv">os</span> <span class="p">[</span><span class="ss">:short-opt</span> <span class="nv">o</span> <span class="p">(</span><span class="nf">s/join</span> <span class="nv">cs</span><span class="p">)])</span> <span class="nv">cdr</span><span class="p">]</span></div><div class='line' id='LC45'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">;; Get optarg from head of cdr</span></div><div class='line' id='LC46'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nb">conj </span><span class="nv">os</span> <span class="p">[</span><span class="ss">:short-opt</span> <span class="nv">o</span> <span class="p">(</span><span class="nb">first </span><span class="nv">cdr</span><span class="p">)])</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">cdr</span><span class="p">)])</span></div><div class='line' id='LC47'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">seq </span><span class="nv">cs</span><span class="p">)</span></div><div class='line' id='LC48'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="p">(</span><span class="nb">conj </span><span class="nv">os</span> <span class="p">[</span><span class="ss">:short-opt</span> <span class="nv">o</span><span class="p">])</span> <span class="nv">cs</span><span class="p">)</span></div><div class='line' id='LC49'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nb">conj </span><span class="nv">os</span> <span class="p">[</span><span class="ss">:short-opt</span> <span class="nv">o</span><span class="p">])</span> <span class="nv">cdr</span><span class="p">]))))]</span></div><div class='line' id='LC50'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="p">(</span><span class="nb">into </span><span class="nv">opts</span> <span class="nv">os</span><span class="p">)</span> <span class="nv">argv</span> <span class="nv">cdr</span><span class="p">))</span></div><div class='line' id='LC51'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="nv">in-order</span></div><div class='line' id='LC52'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="nv">opts</span> <span class="p">(</span><span class="nb">into </span><span class="nv">argv</span> <span class="p">(</span><span class="nb">cons </span><span class="nv">car</span> <span class="nv">cdr</span><span class="p">))</span> <span class="p">[])</span></div><div class='line' id='LC53'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="nv">opts</span> <span class="p">(</span><span class="nb">conj </span><span class="nv">argv</span> <span class="nv">car</span><span class="p">)</span> <span class="nv">cdr</span><span class="p">)))</span></div><div class='line' id='LC54'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">opts</span> <span class="nv">argv</span><span class="p">]))))</span></div><div class='line' id='LC55'><br/></div><div class='line' id='LC56'><span class="p">(</span><span class="kd">defn- </span><span class="nv">normalize-args</span></div><div class='line' id='LC57'>&nbsp;&nbsp;<span class="s">&quot;Rewrite arguments sequence into a normalized form that is parsable by cli.&quot;</span></div><div class='line' id='LC58'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">specs</span> <span class="nv">args</span><span class="p">]</span></div><div class='line' id='LC59'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">required-opts</span> <span class="p">(</span><span class="nf">-&gt;&gt;</span> <span class="nv">specs</span></div><div class='line' id='LC60'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">filter </span><span class="p">(</span><span class="nb">complement </span><span class="ss">:flag</span><span class="p">))</span></div><div class='line' id='LC61'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">mapcat </span><span class="ss">:switches</span><span class="p">)</span></div><div class='line' id='LC62'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">into </span><span class="o">#</span><span class="p">{}))</span></div><div class='line' id='LC63'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="c1">;; Preserve double-dash since this is a pre-processing step</span></div><div class='line' id='LC64'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">largs</span> <span class="p">(</span><span class="nb">take-while </span><span class="p">(</span><span class="nb">partial not= </span><span class="s">&quot;--&quot;</span><span class="p">)</span> <span class="nv">args</span><span class="p">)</span></div><div class='line' id='LC65'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">rargs</span> <span class="p">(</span><span class="nb">drop </span><span class="p">(</span><span class="nb">count </span><span class="nv">largs</span><span class="p">)</span> <span class="nv">args</span><span class="p">)</span></div><div class='line' id='LC66'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">opts</span> <span class="nv">largs</span><span class="p">]</span> <span class="p">(</span><span class="nf">tokenize-args</span> <span class="nv">required-opts</span> <span class="nv">largs</span><span class="p">)]</span></div><div class='line' id='LC67'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">concat </span><span class="p">(</span><span class="nb">mapcat rest </span><span class="nv">opts</span><span class="p">)</span> <span class="nv">largs</span> <span class="nv">rargs</span><span class="p">)))</span></div><div class='line' id='LC68'><br/></div><div class='line' id='LC69'><span class="c1">;;</span></div><div class='line' id='LC70'><span class="c1">;; Legacy API</span></div><div class='line' id='LC71'><span class="c1">;;</span></div><div class='line' id='LC72'><br/></div><div class='line' id='LC73'><span class="p">(</span><span class="kd">defn- </span><span class="nv">build-doc</span> <span class="p">[{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">switches</span> <span class="nv">docs</span> <span class="nv">default</span><span class="p">]}]</span></div><div class='line' id='LC74'>&nbsp;&nbsp;<span class="p">[(</span><span class="nb">apply str </span><span class="p">(</span><span class="nf">interpose</span> <span class="s">&quot;, &quot;</span> <span class="nv">switches</span><span class="p">))</span></div><div class='line' id='LC75'>&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">or </span><span class="p">(</span><span class="nb">str </span><span class="nv">default</span><span class="p">)</span> <span class="s">&quot;&quot;</span><span class="p">)</span></div><div class='line' id='LC76'>&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">or </span><span class="nv">docs</span> <span class="s">&quot;&quot;</span><span class="p">)])</span></div><div class='line' id='LC77'><br/></div><div class='line' id='LC78'><span class="p">(</span><span class="kd">defn- </span><span class="nv">banner-for</span> <span class="p">[</span><span class="nv">desc</span> <span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC79'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">when </span><span class="nv">desc</span></div><div class='line' id='LC80'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">println </span><span class="nv">desc</span><span class="p">)</span></div><div class='line' id='LC81'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">println</span><span class="p">))</span></div><div class='line' id='LC82'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">docs</span> <span class="p">(</span><span class="nb">into </span><span class="p">(</span><span class="nb">map </span><span class="nv">build-doc</span> <span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC83'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[[</span><span class="s">&quot;--------&quot;</span> <span class="s">&quot;-------&quot;</span> <span class="s">&quot;----&quot;</span><span class="p">]</span></div><div class='line' id='LC84'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="s">&quot;Switches&quot;</span> <span class="s">&quot;Default&quot;</span> <span class="s">&quot;Desc&quot;</span><span class="p">]])</span></div><div class='line' id='LC85'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">max-cols</span> <span class="p">(</span><span class="nf">-&gt;&gt;</span> <span class="p">(</span><span class="nb">for </span><span class="p">[</span><span class="nv">d</span> <span class="nv">docs</span><span class="p">]</span> <span class="p">(</span><span class="nb">map count </span><span class="nv">d</span><span class="p">))</span></div><div class='line' id='LC86'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">apply map </span><span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="o">&amp;</span> <span class="nv">c</span><span class="p">]</span> <span class="p">(</span><span class="nb">apply vector </span><span class="nv">c</span><span class="p">)))</span></div><div class='line' id='LC87'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">map </span><span class="o">#</span><span class="p">(</span><span class="nb">apply max </span><span class="nv">%</span><span class="p">)))</span></div><div class='line' id='LC88'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">vs</span> <span class="p">(</span><span class="nb">for </span><span class="p">[</span><span class="nv">d</span> <span class="nv">docs</span><span class="p">]</span></div><div class='line' id='LC89'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">mapcat </span><span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="o">&amp;</span> <span class="nv">x</span><span class="p">]</span> <span class="p">(</span><span class="nb">apply vector </span><span class="nv">x</span><span class="p">))</span> <span class="nv">max-cols</span> <span class="nv">d</span><span class="p">))]</span></div><div class='line' id='LC90'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">doseq </span><span class="p">[</span><span class="nv">v</span> <span class="nv">vs</span><span class="p">]</span></div><div class='line' id='LC91'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">cl-format</span> <span class="nv">true</span> <span class="s">&quot;~{ ~vA  ~vA  ~vA ~}&quot;</span> <span class="nv">v</span><span class="p">)</span></div><div class='line' id='LC92'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">prn</span><span class="p">))))</span></div><div class='line' id='LC93'><br/></div><div class='line' id='LC94'><span class="p">(</span><span class="kd">defn- </span><span class="nv">name-for</span> <span class="p">[</span><span class="nv">k</span><span class="p">]</span></div><div class='line' id='LC95'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">replace </span><span class="nv">k</span> <span class="o">#</span><span class="s">&quot;^--no-|^--\[no-\]|^--|^-&quot;</span> <span class="s">&quot;&quot;</span><span class="p">))</span></div><div class='line' id='LC96'><br/></div><div class='line' id='LC97'><span class="p">(</span><span class="kd">defn- </span><span class="nv">flag-for</span> <span class="p">[</span><span class="o">^</span><span class="nv">String</span> <span class="nv">v</span><span class="p">]</span></div><div class='line' id='LC98'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">not </span><span class="p">(</span><span class="nf">.startsWith</span> <span class="nv">v</span> <span class="s">&quot;--no-&quot;</span><span class="p">)))</span></div><div class='line' id='LC99'><br/></div><div class='line' id='LC100'><span class="p">(</span><span class="kd">defn- </span><span class="nv">opt?</span> <span class="p">[</span><span class="o">^</span><span class="nv">String</span> <span class="nv">x</span><span class="p">]</span></div><div class='line' id='LC101'>&nbsp;&nbsp;<span class="p">(</span><span class="nf">.startsWith</span> <span class="nv">x</span> <span class="s">&quot;-&quot;</span><span class="p">))</span></div><div class='line' id='LC102'><br/></div><div class='line' id='LC103'><span class="p">(</span><span class="kd">defn- </span><span class="nv">flag?</span> <span class="p">[</span><span class="o">^</span><span class="nv">String</span> <span class="nv">x</span><span class="p">]</span></div><div class='line' id='LC104'>&nbsp;&nbsp;<span class="p">(</span><span class="nf">.startsWith</span> <span class="nv">x</span> <span class="s">&quot;--[no-]&quot;</span><span class="p">))</span></div><div class='line' id='LC105'><br/></div><div class='line' id='LC106'><span class="p">(</span><span class="kd">defn- </span><span class="nv">end-of-args?</span> <span class="p">[</span><span class="nv">x</span><span class="p">]</span></div><div class='line' id='LC107'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">= </span><span class="s">&quot;--&quot;</span> <span class="nv">x</span><span class="p">))</span></div><div class='line' id='LC108'><br/></div><div class='line' id='LC109'><span class="p">(</span><span class="kd">defn- </span><span class="nv">spec-for</span></div><div class='line' id='LC110'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">arg</span> <span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC111'>&nbsp;&nbsp;<span class="p">(</span><span class="nf">-&gt;&gt;</span> <span class="nv">specs</span></div><div class='line' id='LC112'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">filter </span><span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="nv">s</span><span class="p">]</span></div><div class='line' id='LC113'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">switches</span> <span class="p">(</span><span class="nb">set </span><span class="p">(</span><span class="nf">s</span> <span class="ss">:switches</span><span class="p">))]</span></div><div class='line' id='LC114'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">contains? </span><span class="nv">switches</span> <span class="nv">arg</span><span class="p">))))</span></div><div class='line' id='LC115'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">first</span><span class="p">))</span></div><div class='line' id='LC116'><br/></div><div class='line' id='LC117'><span class="p">(</span><span class="kd">defn- </span><span class="nv">default-values-for</span></div><div class='line' id='LC118'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC119'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">reduce </span><span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="nv">m</span> <span class="nv">s</span><span class="p">]</span></div><div class='line' id='LC120'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">contains? </span><span class="nv">s</span> <span class="ss">:default</span><span class="p">)</span></div><div class='line' id='LC121'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">((</span><span class="ss">:assoc-fn</span> <span class="nv">s</span><span class="p">)</span> <span class="nv">m</span> <span class="p">(</span><span class="ss">:name</span> <span class="nv">s</span><span class="p">)</span> <span class="p">(</span><span class="ss">:default</span> <span class="nv">s</span><span class="p">))</span></div><div class='line' id='LC122'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">m</span><span class="p">))</span></div><div class='line' id='LC123'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">{}</span> <span class="nv">specs</span><span class="p">))</span></div><div class='line' id='LC124'><br/></div><div class='line' id='LC125'><span class="p">(</span><span class="kd">defn- </span><span class="nv">apply-specs</span></div><div class='line' id='LC126'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">specs</span> <span class="nv">args</span><span class="p">]</span></div><div class='line' id='LC127'>&nbsp;&nbsp;<span class="p">(</span><span class="k">loop </span><span class="p">[</span><span class="nv">options</span>    <span class="p">(</span><span class="nf">default-values-for</span> <span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC128'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">extra-args</span> <span class="p">[]</span></div><div class='line' id='LC129'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">args</span>       <span class="nv">args</span><span class="p">]</span></div><div class='line' id='LC130'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">if-not </span><span class="p">(</span><span class="nb">seq </span><span class="nv">args</span><span class="p">)</span></div><div class='line' id='LC131'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">options</span> <span class="nv">extra-args</span><span class="p">]</span></div><div class='line' id='LC132'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">opt</span>  <span class="p">(</span><span class="nb">first </span><span class="nv">args</span><span class="p">)</span></div><div class='line' id='LC133'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">spec</span> <span class="p">(</span><span class="nf">spec-for</span> <span class="nv">opt</span> <span class="nv">specs</span><span class="p">)]</span></div><div class='line' id='LC134'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">cond</span></div><div class='line' id='LC135'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">end-of-args?</span> <span class="nv">opt</span><span class="p">)</span></div><div class='line' id='LC136'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="nv">options</span> <span class="p">(</span><span class="nb">into </span><span class="nv">extra-args</span> <span class="p">(</span><span class="nf">vec</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">args</span><span class="p">)))</span> <span class="nv">nil</span><span class="p">)</span></div><div class='line' id='LC137'><br/></div><div class='line' id='LC138'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">and </span><span class="p">(</span><span class="nf">opt?</span> <span class="nv">opt</span><span class="p">)</span> <span class="p">(</span><span class="nb">nil? </span><span class="nv">spec</span><span class="p">))</span></div><div class='line' id='LC139'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">throw</span> <span class="p">(</span><span class="nf">Exception.</span> <span class="p">(</span><span class="nb">str </span><span class="s">&quot;&#39;&quot;</span> <span class="nv">opt</span> <span class="s">&quot;&#39; is not a valid argument&quot;</span><span class="p">)))</span></div><div class='line' id='LC140'><br/></div><div class='line' id='LC141'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">and </span><span class="p">(</span><span class="nf">opt?</span> <span class="nv">opt</span><span class="p">)</span> <span class="p">(</span><span class="nf">spec</span> <span class="ss">:flag</span><span class="p">))</span></div><div class='line' id='LC142'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="p">((</span><span class="nf">spec</span> <span class="ss">:assoc-fn</span><span class="p">)</span> <span class="nv">options</span> <span class="p">(</span><span class="nf">spec</span> <span class="ss">:name</span><span class="p">)</span> <span class="p">(</span><span class="nf">flag-for</span> <span class="nv">opt</span><span class="p">))</span></div><div class='line' id='LC143'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">extra-args</span></div><div class='line' id='LC144'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">rest </span><span class="nv">args</span><span class="p">))</span></div><div class='line' id='LC145'><br/></div><div class='line' id='LC146'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">opt?</span> <span class="nv">opt</span><span class="p">)</span></div><div class='line' id='LC147'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="p">((</span><span class="nf">spec</span> <span class="ss">:assoc-fn</span><span class="p">)</span> <span class="nv">options</span> <span class="p">(</span><span class="nf">spec</span> <span class="ss">:name</span><span class="p">)</span> <span class="p">((</span><span class="nf">spec</span> <span class="ss">:parse-fn</span><span class="p">)</span> <span class="p">(</span><span class="nb">second </span><span class="nv">args</span><span class="p">)))</span></div><div class='line' id='LC148'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">extra-args</span></div><div class='line' id='LC149'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">drop </span><span class="mi">2</span> <span class="nv">args</span><span class="p">))</span></div><div class='line' id='LC150'><br/></div><div class='line' id='LC151'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:default</span></div><div class='line' id='LC152'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">recur</span> <span class="nv">options</span> <span class="p">(</span><span class="nb">conj </span><span class="nv">extra-args</span> <span class="p">(</span><span class="nb">first </span><span class="nv">args</span><span class="p">))</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">args</span><span class="p">)))))))</span></div><div class='line' id='LC153'><br/></div><div class='line' id='LC154'><span class="p">(</span><span class="kd">defn- </span><span class="nv">switches-for</span></div><div class='line' id='LC155'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">switches</span> <span class="nv">flag</span><span class="p">]</span></div><div class='line' id='LC156'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">-&gt; </span><span class="p">(</span><span class="nb">for </span><span class="p">[</span><span class="o">^</span><span class="nv">String</span> <span class="nv">s</span> <span class="nv">switches</span><span class="p">]</span></div><div class='line' id='LC157'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">cond</span></div><div class='line' id='LC158'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">and </span><span class="nv">flag</span> <span class="p">(</span><span class="nf">flag?</span> <span class="nv">s</span><span class="p">))</span>            <span class="p">[(</span><span class="nb">replace </span><span class="nv">s</span> <span class="o">#</span><span class="s">&quot;\[no-\]&quot;</span> <span class="s">&quot;no-&quot;</span><span class="p">)</span> <span class="p">(</span><span class="nb">replace </span><span class="nv">s</span> <span class="o">#</span><span class="s">&quot;\[no-\]&quot;</span> <span class="s">&quot;&quot;</span><span class="p">)]</span></div><div class='line' id='LC159'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">and </span><span class="nv">flag</span> <span class="p">(</span><span class="nf">.startsWith</span> <span class="nv">s</span> <span class="s">&quot;--&quot;</span><span class="p">))</span> <span class="p">[(</span><span class="nb">replace </span><span class="nv">s</span> <span class="o">#</span><span class="s">&quot;--&quot;</span> <span class="s">&quot;--no-&quot;</span><span class="p">)</span> <span class="nv">s</span><span class="p">]</span></div><div class='line' id='LC160'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:default</span>                        <span class="p">[</span><span class="nv">s</span><span class="p">]))</span></div><div class='line' id='LC161'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">flatten</span><span class="p">))</span></div><div class='line' id='LC162'><br/></div><div class='line' id='LC163'><span class="p">(</span><span class="kd">defn- </span><span class="nv">generate-spec</span></div><div class='line' id='LC164'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">raw-spec</span><span class="p">]</span></div><div class='line' id='LC165'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[[</span><span class="nv">switches</span> <span class="nv">raw-spec</span><span class="p">]</span> <span class="p">(</span><span class="nb">split-with </span><span class="o">#</span><span class="p">(</span><span class="nb">and </span><span class="p">(</span><span class="nb">string? </span><span class="nv">%</span><span class="p">)</span> <span class="p">(</span><span class="nf">opt?</span> <span class="nv">%</span><span class="p">))</span> <span class="nv">raw-spec</span><span class="p">)</span></div><div class='line' id='LC166'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">docs</span> <span class="nv">raw-spec</span><span class="p">]</span>     <span class="p">(</span><span class="nb">split-with string? </span><span class="nv">raw-spec</span><span class="p">)</span></div><div class='line' id='LC167'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">options</span>             <span class="p">(</span><span class="nb">apply hash-map </span><span class="nv">raw-spec</span><span class="p">)</span></div><div class='line' id='LC168'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">aliases</span>             <span class="p">(</span><span class="nb">map </span><span class="nv">name-for</span> <span class="nv">switches</span><span class="p">)</span></div><div class='line' id='LC169'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">flag</span>                <span class="p">(</span><span class="nb">or </span><span class="p">(</span><span class="nf">flag?</span> <span class="p">(</span><span class="nb">last </span><span class="nv">switches</span><span class="p">))</span> <span class="p">(</span><span class="nf">options</span> <span class="ss">:flag</span><span class="p">))]</span></div><div class='line' id='LC170'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">merge </span><span class="p">{</span><span class="ss">:switches</span> <span class="p">(</span><span class="nf">switches-for</span> <span class="nv">switches</span> <span class="nv">flag</span><span class="p">)</span></div><div class='line' id='LC171'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:docs</span>     <span class="p">(</span><span class="nb">first </span><span class="nv">docs</span><span class="p">)</span></div><div class='line' id='LC172'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:aliases</span>  <span class="p">(</span><span class="nb">set </span><span class="nv">aliases</span><span class="p">)</span></div><div class='line' id='LC173'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:name</span>     <span class="p">(</span><span class="nb">keyword </span><span class="p">(</span><span class="nb">last </span><span class="nv">aliases</span><span class="p">))</span></div><div class='line' id='LC174'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:parse-fn</span> <span class="nv">identity</span></div><div class='line' id='LC175'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:assoc-fn</span> <span class="nv">assoc</span></div><div class='line' id='LC176'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:flag</span>     <span class="nv">flag</span><span class="p">}</span></div><div class='line' id='LC177'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">when </span><span class="nv">flag</span> <span class="p">{</span><span class="ss">:default</span> <span class="nv">false</span><span class="p">})</span></div><div class='line' id='LC178'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">options</span><span class="p">)))</span></div><div class='line' id='LC179'><br/></div><div class='line' id='LC180'><span class="p">(</span><span class="kd">defn </span><span class="nv">cli</span></div><div class='line' id='LC181'>&nbsp;&nbsp;<span class="s">&quot;THIS IS A LEGACY FUNCTION and may be deprecated in the future. Please use</span></div><div class='line' id='LC182'><span class="s">  clojure.tools.cli/parse-opts in new applications.</span></div><div class='line' id='LC183'><br/></div><div class='line' id='LC184'><span class="s">  Parse the provided args using the given specs. Specs are vectors</span></div><div class='line' id='LC185'><span class="s">  describing a command line argument. For example:</span></div><div class='line' id='LC186'><br/></div><div class='line' id='LC187'><span class="s">  [\&quot;-p\&quot; \&quot;--port\&quot; \&quot;Port to listen on\&quot; :default 3000 :parse-fn #(Integer/parseInt %)]</span></div><div class='line' id='LC188'><br/></div><div class='line' id='LC189'><span class="s">  First provide the switches (from least to most specific), then a doc</span></div><div class='line' id='LC190'><span class="s">  string, and pairs of options.</span></div><div class='line' id='LC191'><br/></div><div class='line' id='LC192'><span class="s">  Valid options are :default, :parse-fn, and :flag. See</span></div><div class='line' id='LC193'><span class="s">  https://github.com/clojure/tools.cli/wiki/Documentation-for-0.2.4 for more</span></div><div class='line' id='LC194'><span class="s">  detailed examples.</span></div><div class='line' id='LC195'><br/></div><div class='line' id='LC196'><span class="s">  Returns a vector containing a map of the parsed arguments, a vector</span></div><div class='line' id='LC197'><span class="s">  of extra arguments that did not match known switches, and a</span></div><div class='line' id='LC198'><span class="s">  documentation banner to provide usage instructions.&quot;</span></div><div class='line' id='LC199'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">args</span> <span class="o">&amp;</span> <span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC200'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[[</span><span class="nv">desc</span> <span class="nv">specs</span><span class="p">]</span> <span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">string? </span><span class="p">(</span><span class="nb">first </span><span class="nv">specs</span><span class="p">))</span></div><div class='line' id='LC201'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nb">first </span><span class="nv">specs</span><span class="p">)</span> <span class="p">(</span><span class="nb">rest </span><span class="nv">specs</span><span class="p">)]</span></div><div class='line' id='LC202'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">nil</span> <span class="nv">specs</span><span class="p">])</span></div><div class='line' id='LC203'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">specs</span> <span class="p">(</span><span class="nb">map </span><span class="nv">generate-spec</span> <span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC204'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">args</span> <span class="p">(</span><span class="nf">normalize-args</span> <span class="nv">specs</span> <span class="nv">args</span><span class="p">)]</span></div><div class='line' id='LC205'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[[</span><span class="nv">options</span> <span class="nv">extra-args</span><span class="p">]</span> <span class="p">(</span><span class="nf">apply-specs</span> <span class="nv">specs</span> <span class="nv">args</span><span class="p">)</span></div><div class='line' id='LC206'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">banner</span>  <span class="p">(</span><span class="nb">with-out-str </span><span class="p">(</span><span class="nf">banner-for</span> <span class="nv">desc</span> <span class="nv">specs</span><span class="p">))]</span></div><div class='line' id='LC207'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">options</span> <span class="nv">extra-args</span> <span class="nv">banner</span><span class="p">])))</span></div><div class='line' id='LC208'><br/></div><div class='line' id='LC209'><span class="c1">;;</span></div><div class='line' id='LC210'><span class="c1">;; New API</span></div><div class='line' id='LC211'><span class="c1">;;</span></div><div class='line' id='LC212'><br/></div><div class='line' id='LC213'><span class="p">(</span><span class="k">def </span><span class="o">^</span><span class="p">{</span><span class="ss">:private</span> <span class="nv">true</span><span class="p">}</span> <span class="nv">spec-keys</span></div><div class='line' id='LC214'>&nbsp;&nbsp;<span class="p">[</span><span class="ss">:id</span> <span class="ss">:short-opt</span> <span class="ss">:long-opt</span> <span class="ss">:required</span> <span class="ss">:desc</span> <span class="ss">:default</span> <span class="ss">:default-desc</span> <span class="ss">:parse-fn</span></div><div class='line' id='LC215'>&nbsp;&nbsp;&nbsp;<span class="ss">:assoc-fn</span> <span class="ss">:validate-fn</span> <span class="ss">:validate-msg</span><span class="p">])</span></div><div class='line' id='LC216'><br/></div><div class='line' id='LC217'><span class="p">(</span><span class="kd">defn- </span><span class="nv">compile-spec</span> <span class="p">[</span><span class="nv">spec</span><span class="p">]</span></div><div class='line' id='LC218'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">sopt-lopt-desc</span> <span class="p">(</span><span class="nb">take-while </span><span class="o">#</span><span class="p">(</span><span class="nb">or </span><span class="p">(</span><span class="nb">string? </span><span class="nv">%</span><span class="p">)</span> <span class="p">(</span><span class="nb">nil? </span><span class="nv">%</span><span class="p">))</span> <span class="nv">spec</span><span class="p">)</span></div><div class='line' id='LC219'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">spec-map</span> <span class="p">(</span><span class="nb">apply hash-map </span><span class="p">(</span><span class="nb">drop </span><span class="p">(</span><span class="nb">count </span><span class="nv">sopt-lopt-desc</span><span class="p">)</span> <span class="nv">spec</span><span class="p">))</span></div><div class='line' id='LC220'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">short-opt</span> <span class="nv">long-opt</span> <span class="nv">desc</span><span class="p">]</span> <span class="nv">sopt-lopt-desc</span></div><div class='line' id='LC221'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">long-opt</span> <span class="p">(</span><span class="nb">or </span><span class="nv">long-opt</span> <span class="p">(</span><span class="ss">:long-opt</span> <span class="nv">spec-map</span><span class="p">))</span></div><div class='line' id='LC222'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">long-opt</span> <span class="nv">req</span><span class="p">]</span> <span class="p">(</span><span class="nb">when </span><span class="nv">long-opt</span></div><div class='line' id='LC223'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">rest </span><span class="p">(</span><span class="nb">re-find </span><span class="o">#</span><span class="s">&quot;^(--[^ =]+)(?:[ =](.*))?&quot;</span> <span class="nv">long-opt</span><span class="p">)))</span></div><div class='line' id='LC224'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">id</span> <span class="p">(</span><span class="nb">when </span><span class="nv">long-opt</span></div><div class='line' id='LC225'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">keyword </span><span class="p">(</span><span class="nb">subs </span><span class="nv">long-opt</span> <span class="mi">2</span><span class="p">)))</span></div><div class='line' id='LC226'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">validate-fn</span> <span class="nv">validate-msg</span><span class="p">]</span> <span class="p">(</span><span class="ss">:validate</span> <span class="nv">spec-map</span><span class="p">)]</span></div><div class='line' id='LC227'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">merge </span><span class="p">{</span><span class="ss">:id</span> <span class="nv">id</span></div><div class='line' id='LC228'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:short-opt</span> <span class="nv">short-opt</span></div><div class='line' id='LC229'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:long-opt</span> <span class="nv">long-opt</span></div><div class='line' id='LC230'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:required</span> <span class="nv">req</span></div><div class='line' id='LC231'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:desc</span> <span class="nv">desc</span></div><div class='line' id='LC232'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:validate-fn</span> <span class="nv">validate-fn</span></div><div class='line' id='LC233'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:validate-msg</span> <span class="nv">validate-msg</span><span class="p">}</span></div><div class='line' id='LC234'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">select-keys </span><span class="nv">spec-map</span> <span class="nv">spec-keys</span><span class="p">))))</span></div><div class='line' id='LC235'><br/></div><div class='line' id='LC236'><span class="p">(</span><span class="kd">defn- </span><span class="nv">distinct?*</span> <span class="p">[</span><span class="nv">coll</span><span class="p">]</span></div><div class='line' id='LC237'>&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">seq </span><span class="nv">coll</span><span class="p">)</span></div><div class='line' id='LC238'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">apply </span><span class="nv">distinct?</span> <span class="nv">coll</span><span class="p">)</span></div><div class='line' id='LC239'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">true</span><span class="p">))</span></div><div class='line' id='LC240'><br/></div><div class='line' id='LC241'><span class="p">(</span><span class="kd">defn- </span><span class="nv">compile-option-specs</span></div><div class='line' id='LC242'>&nbsp;&nbsp;<span class="s">&quot;Map a sequence of option specification vectors to a sequence of:</span></div><div class='line' id='LC243'><br/></div><div class='line' id='LC244'><span class="s">  {:id           Keyword  ; :server</span></div><div class='line' id='LC245'><span class="s">   :short-opt    String   ; \&quot;-s\&quot;</span></div><div class='line' id='LC246'><span class="s">   :long-opt     String   ; \&quot;--server\&quot;</span></div><div class='line' id='LC247'><span class="s">   :required     String   ; \&quot;HOSTNAME\&quot;</span></div><div class='line' id='LC248'><span class="s">   :desc         String   ; \&quot;Remote server\&quot;</span></div><div class='line' id='LC249'><span class="s">   :default      Object   ; #&lt;Inet4Address example.com/93.184.216.119&gt;</span></div><div class='line' id='LC250'><span class="s">   :default-desc String   ; \&quot;example.com\&quot;</span></div><div class='line' id='LC251'><span class="s">   :parse-fn     IFn      ; #(InetAddress/getByName %)</span></div><div class='line' id='LC252'><span class="s">   :assoc-fn     IFn      ; assoc</span></div><div class='line' id='LC253'><span class="s">   :validate-fn  IFn      ; (partial instance? Inet4Address)</span></div><div class='line' id='LC254'><span class="s">   :validate-msg String   ; \&quot;Must be an IPv4 host\&quot;</span></div><div class='line' id='LC255'><span class="s">   }</span></div><div class='line' id='LC256'><br/></div><div class='line' id='LC257'><span class="s">  :id defaults to the keywordized name of long-opt without leading dashes, but</span></div><div class='line' id='LC258'><span class="s">  may be overridden in the option spec.</span></div><div class='line' id='LC259'><br/></div><div class='line' id='LC260'><span class="s">  The option spec entry `:validate [fn msg]` desugars into the two entries</span></div><div class='line' id='LC261'><span class="s">  :validate-fn and :validate-msg.</span></div><div class='line' id='LC262'><br/></div><div class='line' id='LC263'><span class="s">  A :default entry will not be included in the compiled spec unless specified.</span></div><div class='line' id='LC264'><br/></div><div class='line' id='LC265'><span class="s">  An option spec may also be passed as a map containing the entries above,</span></div><div class='line' id='LC266'><span class="s">  in which case that subset of the map is transferred directly to the result</span></div><div class='line' id='LC267'><span class="s">  vector.</span></div><div class='line' id='LC268'><br/></div><div class='line' id='LC269'><span class="s">  An assertion error is thrown if any :id values are unset, or if there exist</span></div><div class='line' id='LC270'><span class="s">  any duplicate :id, :short-opt, or :long-opt values.&quot;</span></div><div class='line' id='LC271'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC272'>&nbsp;&nbsp;<span class="p">{</span><span class="ss">:post</span> <span class="p">[(</span><span class="nb">every? </span><span class="p">(</span><span class="nb">comp identity </span><span class="ss">:id</span><span class="p">)</span> <span class="nv">%</span><span class="p">)</span></div><div class='line' id='LC273'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">distinct?*</span> <span class="p">(</span><span class="nb">map </span><span class="ss">:id</span> <span class="nv">%</span><span class="p">))</span></div><div class='line' id='LC274'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">distinct?*</span> <span class="p">(</span><span class="nb">remove nil? </span><span class="p">(</span><span class="nb">map </span><span class="ss">:short-opt</span> <span class="nv">%</span><span class="p">)))</span></div><div class='line' id='LC275'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">distinct?*</span> <span class="p">(</span><span class="nb">remove nil? </span><span class="p">(</span><span class="nb">map </span><span class="ss">:long-opt</span> <span class="nv">%</span><span class="p">)))]}</span></div><div class='line' id='LC276'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">map </span><span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="nv">spec</span><span class="p">]</span></div><div class='line' id='LC277'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">map? </span><span class="nv">spec</span><span class="p">)</span></div><div class='line' id='LC278'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">select-keys </span><span class="nv">spec</span> <span class="nv">spec-keys</span><span class="p">)</span></div><div class='line' id='LC279'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">compile-spec</span> <span class="nv">spec</span><span class="p">)))</span></div><div class='line' id='LC280'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">specs</span><span class="p">))</span></div><div class='line' id='LC281'><br/></div><div class='line' id='LC282'><span class="p">(</span><span class="kd">defn- </span><span class="nv">default-option-map</span> <span class="p">[</span><span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC283'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">reduce </span><span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="nv">m</span> <span class="nv">s</span><span class="p">]</span></div><div class='line' id='LC284'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">contains? </span><span class="nv">s</span> <span class="ss">:default</span><span class="p">)</span></div><div class='line' id='LC285'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">assoc </span><span class="nv">m</span> <span class="p">(</span><span class="ss">:id</span> <span class="nv">s</span><span class="p">)</span> <span class="p">(</span><span class="ss">:default</span> <span class="nv">s</span><span class="p">))</span></div><div class='line' id='LC286'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">m</span><span class="p">))</span></div><div class='line' id='LC287'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">{}</span> <span class="nv">specs</span><span class="p">))</span></div><div class='line' id='LC288'><br/></div><div class='line' id='LC289'><span class="p">(</span><span class="kd">defn- </span><span class="nv">find-spec</span> <span class="p">[</span><span class="nv">specs</span> <span class="nv">opt-type</span> <span class="nv">opt</span><span class="p">]</span></div><div class='line' id='LC290'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">first </span><span class="p">(</span><span class="nb">filter </span><span class="o">#</span><span class="p">(</span><span class="nb">= </span><span class="nv">opt</span> <span class="p">(</span><span class="nf">opt-type</span> <span class="nv">%</span><span class="p">))</span> <span class="nv">specs</span><span class="p">)))</span></div><div class='line' id='LC291'><br/></div><div class='line' id='LC292'><span class="p">(</span><span class="kd">defn- </span><span class="nv">pr-join</span> <span class="p">[</span><span class="o">&amp;</span> <span class="nv">xs</span><span class="p">]</span></div><div class='line' id='LC293'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">pr-str </span><span class="p">(</span><span class="nf">s/join</span> <span class="sc">\s</span><span class="nv">pace</span> <span class="nv">xs</span><span class="p">)))</span></div><div class='line' id='LC294'><br/></div><div class='line' id='LC295'><span class="p">(</span><span class="kd">defn- </span><span class="nv">missing-required-error</span> <span class="p">[</span><span class="nv">opt</span> <span class="nv">example-required</span><span class="p">]</span></div><div class='line' id='LC296'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">str </span><span class="s">&quot;Missing required argument for &quot;</span> <span class="p">(</span><span class="nf">pr-join</span> <span class="nv">opt</span> <span class="nv">example-required</span><span class="p">)))</span></div><div class='line' id='LC297'><br/></div><div class='line' id='LC298'><span class="p">(</span><span class="kd">defn- </span><span class="nv">parse-error</span> <span class="p">[</span><span class="nv">opt</span> <span class="nv">optarg</span> <span class="nv">msg</span><span class="p">]</span></div><div class='line' id='LC299'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">str </span><span class="s">&quot;Error while parsing option &quot;</span> <span class="p">(</span><span class="nf">pr-join</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">)</span> <span class="s">&quot;: &quot;</span> <span class="nv">msg</span><span class="p">))</span></div><div class='line' id='LC300'><br/></div><div class='line' id='LC301'><span class="p">(</span><span class="kd">defn- </span><span class="nv">validate-error</span> <span class="p">[</span><span class="nv">opt</span> <span class="nv">optarg</span> <span class="nv">msg</span><span class="p">]</span></div><div class='line' id='LC302'>&nbsp;&nbsp;<span class="p">(</span><span class="nb">str </span><span class="s">&quot;Failed to validate &quot;</span> <span class="p">(</span><span class="nf">pr-join</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">)</span></div><div class='line' id='LC303'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="nv">msg</span> <span class="p">(</span><span class="nb">str </span><span class="s">&quot;: &quot;</span> <span class="nv">msg</span><span class="p">)</span> <span class="s">&quot;&quot;</span><span class="p">)))</span></div><div class='line' id='LC304'><br/></div><div class='line' id='LC305'><span class="p">(</span><span class="kd">defn- </span><span class="nv">validate</span> <span class="p">[</span><span class="nv">value</span> <span class="nv">spec</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">]</span></div><div class='line' id='LC306'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">validate-fn</span> <span class="nv">validate-msg</span><span class="p">]}</span> <span class="nv">spec</span><span class="p">]</span></div><div class='line' id='LC307'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">or </span><span class="p">(</span><span class="nb">nil? </span><span class="nv">validate-fn</span><span class="p">)</span></div><div class='line' id='LC308'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">try</span> <span class="p">(</span><span class="nf">validate-fn</span> <span class="nv">value</span><span class="p">)</span> <span class="p">(</span><span class="nf">catch</span> <span class="nv">Throwable</span> <span class="nv">_</span><span class="p">)))</span></div><div class='line' id='LC309'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">value</span> <span class="nv">nil</span><span class="p">]</span></div><div class='line' id='LC310'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="ss">::error</span> <span class="p">(</span><span class="nf">validate-error</span> <span class="nv">opt</span> <span class="nv">optarg</span> <span class="nv">validate-msg</span><span class="p">)])))</span></div><div class='line' id='LC311'><br/></div><div class='line' id='LC312'><span class="p">(</span><span class="kd">defn- </span><span class="nv">parse-value</span> <span class="p">[</span><span class="nv">value</span> <span class="nv">spec</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">]</span></div><div class='line' id='LC313'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">parse-fn</span><span class="p">]}</span> <span class="nv">spec</span></div><div class='line' id='LC314'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">value</span> <span class="nv">error</span><span class="p">]</span> <span class="p">(</span><span class="k">if </span><span class="nv">parse-fn</span></div><div class='line' id='LC315'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">try</span></div><div class='line' id='LC316'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nf">parse-fn</span> <span class="nv">value</span><span class="p">)</span> <span class="nv">nil</span><span class="p">]</span></div><div class='line' id='LC317'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">catch</span> <span class="nv">Throwable</span> <span class="nv">e</span></div><div class='line' id='LC318'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">nil</span> <span class="p">(</span><span class="nf">parse-error</span> <span class="nv">opt</span> <span class="nv">optarg</span> <span class="p">(</span><span class="nb">str </span><span class="nv">e</span><span class="p">))]))</span></div><div class='line' id='LC319'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">value</span> <span class="nv">nil</span><span class="p">])]</span></div><div class='line' id='LC320'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="nv">error</span></div><div class='line' id='LC321'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="ss">::error</span> <span class="nv">error</span><span class="p">]</span></div><div class='line' id='LC322'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">validate</span> <span class="nv">value</span> <span class="nv">spec</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">))))</span></div><div class='line' id='LC323'><br/></div><div class='line' id='LC324'><span class="p">(</span><span class="kd">defn- </span><span class="nv">parse-optarg</span> <span class="p">[</span><span class="nv">spec</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">]</span></div><div class='line' id='LC325'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">required</span><span class="p">]}</span> <span class="nv">spec</span><span class="p">]</span></div><div class='line' id='LC326'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">and </span><span class="nv">required</span> <span class="p">(</span><span class="nb">nil? </span><span class="nv">optarg</span><span class="p">))</span></div><div class='line' id='LC327'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="ss">::error</span> <span class="p">(</span><span class="nf">missing-required-error</span> <span class="nv">opt</span> <span class="nv">required</span><span class="p">)]</span></div><div class='line' id='LC328'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">parse-value</span> <span class="p">(</span><span class="k">if </span><span class="nv">required</span> <span class="nv">optarg</span> <span class="nv">true</span><span class="p">)</span> <span class="nv">spec</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">))))</span></div><div class='line' id='LC329'><br/></div><div class='line' id='LC330'><span class="p">(</span><span class="kd">defn- </span><span class="nv">parse-option-tokens</span></div><div class='line' id='LC331'>&nbsp;&nbsp;<span class="s">&quot;Reduce sequence of [opt-type opt ?optarg?] tokens into a map of</span></div><div class='line' id='LC332'><span class="s">  {option-id value} merged over the default values in the option</span></div><div class='line' id='LC333'><span class="s">  specifications.</span></div><div class='line' id='LC334'><br/></div><div class='line' id='LC335'><span class="s">  Unknown options, missing required arguments, option argument parsing</span></div><div class='line' id='LC336'><span class="s">  exceptions, and validation failures are collected into a vector of error</span></div><div class='line' id='LC337'><span class="s">  message strings.</span></div><div class='line' id='LC338'><br/></div><div class='line' id='LC339'><span class="s">  Returns [option-map error-messages-vector].&quot;</span></div><div class='line' id='LC340'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">specs</span> <span class="nv">tokens</span><span class="p">]</span></div><div class='line' id='LC341'>&nbsp;&nbsp;<span class="p">(</span><span class="nf">reduce</span></div><div class='line' id='LC342'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">fn </span><span class="p">[[</span><span class="nv">m</span> <span class="nv">errors</span><span class="p">]</span> <span class="p">[</span><span class="nv">opt-type</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">]]</span></div><div class='line' id='LC343'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">if-let </span><span class="p">[</span><span class="nv">spec</span> <span class="p">(</span><span class="nf">find-spec</span> <span class="nv">specs</span> <span class="nv">opt-type</span> <span class="nv">opt</span><span class="p">)]</span></div><div class='line' id='LC344'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[[</span><span class="nv">value</span> <span class="nv">error</span><span class="p">]</span> <span class="p">(</span><span class="nf">parse-optarg</span> <span class="nv">spec</span> <span class="nv">opt</span> <span class="nv">optarg</span><span class="p">)]</span></div><div class='line' id='LC345'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">if-not </span><span class="p">(</span><span class="nb">= </span><span class="nv">value</span> <span class="ss">::error</span><span class="p">)</span></div><div class='line' id='LC346'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[((</span><span class="ss">:assoc-fn</span> <span class="nv">spec</span> <span class="nv">assoc</span><span class="p">)</span> <span class="nv">m</span> <span class="p">(</span><span class="ss">:id</span> <span class="nv">spec</span><span class="p">)</span> <span class="nv">value</span><span class="p">)</span> <span class="nv">errors</span><span class="p">]</span></div><div class='line' id='LC347'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">m</span> <span class="p">(</span><span class="nb">conj </span><span class="nv">errors</span> <span class="nv">error</span><span class="p">)]))</span></div><div class='line' id='LC348'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">m</span> <span class="p">(</span><span class="nb">conj </span><span class="nv">errors</span> <span class="p">(</span><span class="nb">str </span><span class="s">&quot;Unknown option: &quot;</span> <span class="p">(</span><span class="nb">pr-str </span><span class="nv">opt</span><span class="p">)))]))</span></div><div class='line' id='LC349'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nf">default-option-map</span> <span class="nv">specs</span><span class="p">)</span> <span class="p">[]]</span> <span class="nv">tokens</span><span class="p">))</span></div><div class='line' id='LC350'><br/></div><div class='line' id='LC351'><span class="p">(</span><span class="kd">defn- </span><span class="nv">make-summary-parts</span> <span class="p">[</span><span class="nv">show-defaults?</span> <span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC352'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">short-opt</span> <span class="nv">long-opt</span> <span class="nv">required</span> <span class="nv">default</span> <span class="nv">default-desc</span> <span class="nv">desc</span><span class="p">]}</span> <span class="nv">specs</span></div><div class='line' id='LC353'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">opt</span> <span class="p">(</span><span class="nb">cond </span><span class="p">(</span><span class="nb">and </span><span class="nv">short-opt</span> <span class="nv">long-opt</span><span class="p">)</span> <span class="p">(</span><span class="nb">str </span><span class="nv">short-opt</span> <span class="s">&quot;, &quot;</span> <span class="nv">long-opt</span><span class="p">)</span></div><div class='line' id='LC354'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">long-opt</span> <span class="p">(</span><span class="nb">str </span><span class="s">&quot;    &quot;</span> <span class="nv">long-opt</span><span class="p">)</span></div><div class='line' id='LC355'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">short-opt</span> <span class="nv">short-opt</span><span class="p">)</span></div><div class='line' id='LC356'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">opt</span> <span class="nv">dd</span><span class="p">]</span> <span class="p">(</span><span class="k">if </span><span class="nv">required</span></div><div class='line' id='LC357'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[(</span><span class="nb">str </span><span class="nv">opt</span> <span class="sc">\s</span><span class="nv">pace</span> <span class="nv">required</span><span class="p">)</span></div><div class='line' id='LC358'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">or </span><span class="nv">default-desc</span> <span class="p">(</span><span class="k">if </span><span class="nv">default</span> <span class="p">(</span><span class="nb">str </span><span class="nv">default</span><span class="p">)</span> <span class="s">&quot;&quot;</span><span class="p">))]</span></div><div class='line' id='LC359'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">opt</span> <span class="s">&quot;&quot;</span><span class="p">])]</span></div><div class='line' id='LC360'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="nv">show-defaults?</span></div><div class='line' id='LC361'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">opt</span> <span class="nv">dd</span> <span class="p">(</span><span class="nb">or </span><span class="nv">desc</span> <span class="s">&quot;&quot;</span><span class="p">)]</span></div><div class='line' id='LC362'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">opt</span> <span class="p">(</span><span class="nb">or </span><span class="nv">desc</span> <span class="s">&quot;&quot;</span><span class="p">)])))</span></div><div class='line' id='LC363'><br/></div><div class='line' id='LC364'><span class="p">(</span><span class="kd">defn- </span><span class="nv">format-lines</span> <span class="p">[</span><span class="nv">lens</span> <span class="nv">parts</span><span class="p">]</span></div><div class='line' id='LC365'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">fmt</span> <span class="p">(</span><span class="nf">case</span> <span class="p">(</span><span class="nb">count </span><span class="nv">lens</span><span class="p">)</span></div><div class='line' id='LC366'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mi">2</span> <span class="s">&quot;~{  ~vA  ~vA~}&quot;</span></div><div class='line' id='LC367'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="mi">3</span> <span class="s">&quot;~{  ~vA  ~vA  ~vA~}&quot;</span><span class="p">)]</span></div><div class='line' id='LC368'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">map </span><span class="o">#</span><span class="p">(</span><span class="nf">s/trimr</span> <span class="p">(</span><span class="nf">cl-format</span> <span class="nv">nil</span> <span class="nv">fmt</span> <span class="p">(</span><span class="nb">interleave </span><span class="nv">lens</span> <span class="nv">%</span><span class="p">)))</span> <span class="nv">parts</span><span class="p">)))</span></div><div class='line' id='LC369'><br/></div><div class='line' id='LC370'><span class="p">(</span><span class="kd">defn </span><span class="o">^</span><span class="p">{</span><span class="ss">:added</span> <span class="s">&quot;0.3.0&quot;</span><span class="p">}</span> <span class="nv">summarize</span></div><div class='line' id='LC371'>&nbsp;&nbsp;<span class="s">&quot;Reduce options specs into a options summary for printing at a terminal.&quot;</span></div><div class='line' id='LC372'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC373'>&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="p">(</span><span class="nb">seq </span><span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC374'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[</span><span class="nv">show-defaults?</span> <span class="p">(</span><span class="nb">some </span><span class="o">#</span><span class="p">(</span><span class="nb">and </span><span class="p">(</span><span class="ss">:required</span> <span class="nv">%</span><span class="p">)</span> <span class="p">(</span><span class="ss">:default</span> <span class="nv">%</span><span class="p">))</span> <span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC375'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">parts</span> <span class="p">(</span><span class="nb">map </span><span class="p">(</span><span class="nb">partial </span><span class="nv">make-summary-parts</span> <span class="nv">show-defaults?</span><span class="p">)</span> <span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC376'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">lens</span> <span class="p">(</span><span class="nb">apply map </span><span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="o">&amp;</span> <span class="nv">cols</span><span class="p">]</span> <span class="p">(</span><span class="nb">apply max </span><span class="p">(</span><span class="nb">map count </span><span class="nv">cols</span><span class="p">)))</span> <span class="nv">parts</span><span class="p">)</span></div><div class='line' id='LC377'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">lines</span> <span class="p">(</span><span class="nf">format-lines</span> <span class="nv">lens</span> <span class="nv">parts</span><span class="p">)]</span></div><div class='line' id='LC378'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nf">s/join</span> <span class="sc">\n</span><span class="nv">ewline</span> <span class="nv">lines</span><span class="p">))</span></div><div class='line' id='LC379'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="s">&quot;&quot;</span><span class="p">))</span></div><div class='line' id='LC380'><br/></div><div class='line' id='LC381'><span class="p">(</span><span class="kd">defn- </span><span class="nv">required-arguments</span> <span class="p">[</span><span class="nv">specs</span><span class="p">]</span></div><div class='line' id='LC382'>&nbsp;&nbsp;<span class="p">(</span><span class="nf">reduce</span></div><div class='line' id='LC383'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">fn </span><span class="p">[</span><span class="nv">s</span> <span class="p">{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">required</span> <span class="nv">short-opt</span> <span class="nv">long-opt</span><span class="p">]}]</span></div><div class='line' id='LC384'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="k">if </span><span class="nv">required</span></div><div class='line' id='LC385'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">(</span><span class="nb">into </span><span class="nv">s</span> <span class="p">(</span><span class="nb">remove nil? </span><span class="p">[</span><span class="nv">short-opt</span> <span class="nv">long-opt</span><span class="p">]))</span></div><div class='line' id='LC386'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">s</span><span class="p">))</span></div><div class='line' id='LC387'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="o">#</span><span class="p">{}</span> <span class="nv">specs</span><span class="p">))</span></div><div class='line' id='LC388'><br/></div><div class='line' id='LC389'><span class="p">(</span><span class="kd">defn </span><span class="o">^</span><span class="p">{</span><span class="ss">:added</span> <span class="s">&quot;0.3.0&quot;</span><span class="p">}</span> <span class="nv">parse-opts</span></div><div class='line' id='LC390'>&nbsp;&nbsp;<span class="s">&quot;Parse arguments sequence according to given option specifications and the</span></div><div class='line' id='LC391'><span class="s">  GNU Program Argument Syntax Conventions:</span></div><div class='line' id='LC392'><br/></div><div class='line' id='LC393'><span class="s">    https://www.gnu.org/software/libc/manual/html_node/Argument-Syntax.html</span></div><div class='line' id='LC394'><br/></div><div class='line' id='LC395'><span class="s">  Option specifications are a sequence of vectors with the following format:</span></div><div class='line' id='LC396'><br/></div><div class='line' id='LC397'><span class="s">    [short-opt long-opt-with-required-description description</span></div><div class='line' id='LC398'><span class="s">     :property value]</span></div><div class='line' id='LC399'><br/></div><div class='line' id='LC400'><span class="s">  The first three string parameters in an option spec are positional and</span></div><div class='line' id='LC401'><span class="s">  optional, and may be nil in order to specify a later parameter.</span></div><div class='line' id='LC402'><br/></div><div class='line' id='LC403'><span class="s">  By default, options are boolean flags that are set to true when toggled, but</span></div><div class='line' id='LC404'><span class="s">  the second string parameter may be used to specify that an option requires</span></div><div class='line' id='LC405'><span class="s">  an argument.</span></div><div class='line' id='LC406'><br/></div><div class='line' id='LC407'><span class="s">    e.g. [\&quot;-p\&quot; \&quot;--port PORT\&quot;] specifies that --port requires an argument,</span></div><div class='line' id='LC408'><span class="s">         of which PORT is a short description.</span></div><div class='line' id='LC409'><br/></div><div class='line' id='LC410'><span class="s">  The :property value pairs are optional and take precedence over the</span></div><div class='line' id='LC411'><span class="s">  positional string arguments. The valid properties are:</span></div><div class='line' id='LC412'><br/></div><div class='line' id='LC413'><span class="s">    :id           The key for this option in the resulting option map. This</span></div><div class='line' id='LC414'><span class="s">                  is normally set to the keywordized name of the long option</span></div><div class='line' id='LC415'><span class="s">                  without the leading dashes.</span></div><div class='line' id='LC416'><br/></div><div class='line' id='LC417'><span class="s">                  Must be a unique truthy value.</span></div><div class='line' id='LC418'><br/></div><div class='line' id='LC419'><span class="s">    :short-opt    The short format for this option, normally set by the first</span></div><div class='line' id='LC420'><span class="s">                  positional string parameter: e.g. \&quot;-p\&quot;. Must be unique.</span></div><div class='line' id='LC421'><br/></div><div class='line' id='LC422'><span class="s">    :long-opt     The long format for this option, normally set by the second</span></div><div class='line' id='LC423'><span class="s">                  positional string parameter; e.g. \&quot;--port\&quot;. Must be unique.</span></div><div class='line' id='LC424'><br/></div><div class='line' id='LC425'><span class="s">    :required     A description of the required argument for this option if</span></div><div class='line' id='LC426'><span class="s">                  one is required; normally set in the second positional</span></div><div class='line' id='LC427'><span class="s">                  string parameter after the long option: \&quot;--port PORT\&quot;.</span></div><div class='line' id='LC428'><br/></div><div class='line' id='LC429'><span class="s">                  The absence of this entry indicates that the option is a</span></div><div class='line' id='LC430'><span class="s">                  boolean toggle that is set to true when specified on the</span></div><div class='line' id='LC431'><span class="s">                  command line.</span></div><div class='line' id='LC432'><br/></div><div class='line' id='LC433'><span class="s">    :desc         A optional short description of this option.</span></div><div class='line' id='LC434'><br/></div><div class='line' id='LC435'><span class="s">    :default      The default value of this option. If none is specified, the</span></div><div class='line' id='LC436'><span class="s">                  resulting option map will not contain an entry for this</span></div><div class='line' id='LC437'><span class="s">                  option unless set on the command line.</span></div><div class='line' id='LC438'><br/></div><div class='line' id='LC439'><span class="s">    :default-desc An optional description of the default value. This should be</span></div><div class='line' id='LC440'><span class="s">                  used when the string representation of the default value is</span></div><div class='line' id='LC441'><span class="s">                  too ugly to be printed on the command line.</span></div><div class='line' id='LC442'><br/></div><div class='line' id='LC443'><span class="s">    :parse-fn     A function that receives the required option argument and</span></div><div class='line' id='LC444'><span class="s">                  returns the option value.</span></div><div class='line' id='LC445'><br/></div><div class='line' id='LC446'><span class="s">                  If this is a boolean option, parse-fn will receive the value</span></div><div class='line' id='LC447'><span class="s">                  true. This may be used to invert the logic of this option:</span></div><div class='line' id='LC448'><br/></div><div class='line' id='LC449'><span class="s">                  [\&quot;-q\&quot; \&quot;--quiet\&quot;</span></div><div class='line' id='LC450'><span class="s">                   :id :verbose</span></div><div class='line' id='LC451'><span class="s">                   :default true</span></div><div class='line' id='LC452'><span class="s">                   :parse-fn not]</span></div><div class='line' id='LC453'><br/></div><div class='line' id='LC454'><span class="s">    :assoc-fn     A function that receives the current option map, the current</span></div><div class='line' id='LC455'><span class="s">                  option :id, and the current parsed option value, and returns</span></div><div class='line' id='LC456'><span class="s">                  a new option map.</span></div><div class='line' id='LC457'><br/></div><div class='line' id='LC458'><span class="s">                  This may be used to create non-idempotent options, like</span></div><div class='line' id='LC459'><span class="s">                  setting a verbosity level by specifying an option multiple</span></div><div class='line' id='LC460'><span class="s">                  times. (\&quot;-vvv\&quot; -&gt; 3)</span></div><div class='line' id='LC461'><br/></div><div class='line' id='LC462'><span class="s">                  [\&quot;-v\&quot; \&quot;--verbose\&quot;</span></div><div class='line' id='LC463'><span class="s">                   :default 0</span></div><div class='line' id='LC464'><span class="s">                   :assoc-fn (fn [m k _] (update-in m [k] inc))]</span></div><div class='line' id='LC465'><br/></div><div class='line' id='LC466'><span class="s">    :validate     A vector of [validate-fn validate-msg].</span></div><div class='line' id='LC467'><br/></div><div class='line' id='LC468'><span class="s">    :validate-fn  A function that receives the parsed option value and returns</span></div><div class='line' id='LC469'><span class="s">                  a falsy value when the value is invalid.</span></div><div class='line' id='LC470'><br/></div><div class='line' id='LC471'><span class="s">    :validate-msg An optional message that will be added to the :errors vector</span></div><div class='line' id='LC472'><span class="s">                  on validation failure.</span></div><div class='line' id='LC473'><br/></div><div class='line' id='LC474'><span class="s">  parse-opts returns a map with four entries:</span></div><div class='line' id='LC475'><br/></div><div class='line' id='LC476'><span class="s">    {:options     The options map, keyed by :id, mapped to the parsed value</span></div><div class='line' id='LC477'><span class="s">     :arguments   A vector of unprocessed arguments</span></div><div class='line' id='LC478'><span class="s">     :summary     A string containing a minimal options summary</span></div><div class='line' id='LC479'><span class="s">     :errors      A possible vector of error message strings generated during</span></div><div class='line' id='LC480'><span class="s">                  parsing; nil when no errors exist</span></div><div class='line' id='LC481'><span class="s">     }</span></div><div class='line' id='LC482'><br/></div><div class='line' id='LC483'><span class="s">  A few function options may be specified to influence the behavior of</span></div><div class='line' id='LC484'><span class="s">  parse-opts:</span></div><div class='line' id='LC485'><br/></div><div class='line' id='LC486'><span class="s">    :in-order     Stop option processing at the first unknown argument. Useful</span></div><div class='line' id='LC487'><span class="s">                  for building programs with subcommands that have their own</span></div><div class='line' id='LC488'><span class="s">                  option specs.</span></div><div class='line' id='LC489'><br/></div><div class='line' id='LC490'><span class="s">    :summary-fn   A function that receives the sequence of compiled option specs</span></div><div class='line' id='LC491'><span class="s">                  (documented at #&#39;clojure.tools.cli/compile-option-specs), and</span></div><div class='line' id='LC492'><span class="s">                  returns a custom option summary string.</span></div><div class='line' id='LC493'><span class="s">  &quot;</span></div><div class='line' id='LC494'>&nbsp;&nbsp;<span class="p">[</span><span class="nv">args</span> <span class="nv">option-specs</span> <span class="o">&amp;</span> <span class="nv">options</span><span class="p">]</span></div><div class='line' id='LC495'>&nbsp;&nbsp;<span class="p">(</span><span class="k">let </span><span class="p">[{</span><span class="ss">:keys</span> <span class="p">[</span><span class="nv">in-order</span> <span class="nv">summary-fn</span><span class="p">]}</span> <span class="nv">options</span></div><div class='line' id='LC496'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">specs</span> <span class="p">(</span><span class="nf">compile-option-specs</span> <span class="nv">option-specs</span><span class="p">)</span></div><div class='line' id='LC497'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="nv">req</span> <span class="p">(</span><span class="nf">required-arguments</span> <span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC498'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">tokens</span> <span class="nv">rest-args</span><span class="p">]</span> <span class="p">(</span><span class="nf">tokenize-args</span> <span class="nv">req</span> <span class="nv">args</span> <span class="ss">:in-order</span> <span class="nv">in-order</span><span class="p">)</span></div><div class='line' id='LC499'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">[</span><span class="nv">opts</span> <span class="nv">errors</span><span class="p">]</span> <span class="p">(</span><span class="nf">parse-option-tokens</span> <span class="nv">specs</span> <span class="nv">tokens</span><span class="p">)]</span></div><div class='line' id='LC500'>&nbsp;&nbsp;&nbsp;&nbsp;<span class="p">{</span><span class="ss">:options</span> <span class="nv">opts</span></div><div class='line' id='LC501'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:arguments</span> <span class="nv">rest-args</span></div><div class='line' id='LC502'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:summary</span> <span class="p">((</span><span class="nb">or </span><span class="nv">summary-fn</span> <span class="nv">summarize</span><span class="p">)</span> <span class="nv">specs</span><span class="p">)</span></div><div class='line' id='LC503'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="ss">:errors</span> <span class="p">(</span><span class="nb">when </span><span class="p">(</span><span class="nb">seq </span><span class="nv">errors</span><span class="p">)</span> <span class="nv">errors</span><span class="p">)}))</span></div></pre></div></td>
          </tr>
        </table>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.05206s from github-fe139-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-fullscreen-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder="" data-suggester="fullscreen_suggester"></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-remove-close close js-ajax-error-dismiss"></a>
      Something went wrong with that request. Please try again.
    </div>

  </body>
</html>

