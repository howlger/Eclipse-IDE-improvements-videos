# Eclipse IDE Improvements Videos

## [Eclipse 2019-09](https://wiki.eclipse.org/Category:SimRel-2019-09) - [September 18, 2019](https://www.google.com/calendar/event?eid=MGxqNmgycHNmczZhZW9xdXN0NXUwbnVpY3QgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [75 projects](https://projects.eclipse.org/releases/2019-09) ([-1 +0 → -1](https://projects.eclipse.org/releases/2019-06)) - [Website](https://staging.eclipse.org/eclipseide/2019-09) ([New & Noteworthy](https://staging.eclipse.org/eclipseide/2019-09/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545158)
* [Latest CI builds](https://hudson.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2019-09), [release](http://download.eclipse.org/releases/2019-09))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)

### General and Git
* **Sources**
    * **Platform** 4.12→**4.13**: [Eclipse 4.13 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.13/platform.php)
    * (Marketplace Client (MPC) 1.7.6→**1.8**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage Service 1.2→1.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn Tasks 3.24.2→3.24.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * Mylyn WikiText 3.0.29→**3.0.33**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/)
    * (Oomph 1.13→1.13: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
    * J**Git**/EGit 5.4→**5.5**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.5)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.5), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.5.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.5.0-release-review)
* **Features to show**
    * **General**:
        * [Show key bindings when command is invoked (disabled by default)](https://www.eclipse.org/eclipse/news/4.13/platform.php#show-keybinding)
        * [Quick Search (Ctrl+Alt+Shift+L)](https://www.eclipse.org/eclipse/news/4.13/platform.php#quick-text-search)
        * [Status line shows offset or selection length](https://www.eclipse.org/eclipse/news/4.13/platform.php#editor-status-line)
        * [Compare editor with colors](https://www.eclipse.org/eclipse/news/4.13/platform.php#colors-in-compareviewer)
        * [External Tools Configuration: Show Command Line](https://www.eclipse.org/eclipse/news/4.13/platform.php#external-tool-showcommandline)
        * Bunch of minor UI improvements (see also [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=548042))
            * [Shorter dialog text](https://www.eclipse.org/eclipse/news/4.13/platform.php#shorter-dialog-texts) (without "Are you sure you want to..."), e.g. in _Close Unrelated Projects_
            * [Project Explorer: Close project via middle-click](https://www.eclipse.org/eclipse/news/4.13/platform.php#close-project-via-middle-click)
            * [_Window > Preferences: General > Editors > Text Editor_: Items shown with the configured color](https://www.eclipse.org/eclipse/news/4.13/platform.php#text-editors-color-preview)
            * [On Linux and macOS the the default theme, light or dark theme, is set based on the active OS theme](https://www.eclipse.org/eclipse/news/4.13/platform.php#start-in-dark-theme)
            * ([Improved dark theme on Windows](https://www.eclipse.org/eclipse/news/4.13/platform.php#styling-forms), e.g. Manifest editor)
            * ([_Project Explorer_: _Show In_ right-click menu also for non-Java projects](https://www.eclipse.org/eclipse/news/4.13/platform.php#showin-action-project-explorer))
            * ([Save active editor even when the _Project Explorer_ has focus](https://www.eclipse.org/eclipse/news/4.13/platform.php#save-action-project-explorer) → same behavior as in the _Package Explorer_)
            * ([Project Explorer: Inline rename](https://www.eclipse.org/eclipse/news/4.13/platform.php#project-explorer-normal-resource-inline-rename) → [can cause crashing of the Java VM](https://bugs.eclipse.org/bugs/show_bug.cgi?id=550857))
            * ([Launch Configuration: Inline rename of environment variable names and values](https://www.eclipse.org/eclipse/news/4.13/platform.php#environment-table-improvements))
    * **Git**:
        * [Creation of lightweight tags](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.5#Creating_Lightweight_Tags)
        * _History_ view:
            * [`--first-parent` mode button](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.5#Option_to_Show_First_Parents_Only)
            * [Resource filters via single button with drop-down](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.5#Shorter_View_Toolbar)
        * Other UI improvements:
            * [_Git Staging_ view: flat or (compact) tree toolbar button instead of submenu in view menu](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.5#Staged_files_as_list_or_tree)
            * [Direct renaming of branches](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.5#Renaming_branches_became_easier)

### Java, Maven, Gradle
* TODO

### C/C++, PHP, Rust, Web
* TODO

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
