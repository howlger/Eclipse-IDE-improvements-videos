# Eclipse IDE Improvements Videos

## [Eclipse 2019-06](https://wiki.eclipse.org/Category:SimRel-2019-06) - [June 19, 2019](https://calendar.google.com/calendar/event?eid=NGNmcXVrajlwa3E4bG5iZWR2OGxhc2U4ZnYgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [75 projects](https://projects.eclipse.org/releases/2019-06) - [Website](https://eclipse.org/eclipseide/2019-06) ([New & Noteworthy](https://eclipse.org/eclipseide/2019-06/noteworthy))
* [Latest CI builds](https://hudson.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2019-06), [release](http://download.eclipse.org/releases/2019-06))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))

### General and Git
* **Sources**
    * **Platform** 4.11→**4.12** [Eclipse 4.12 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.12/platform.php)
    * Marketplace Client (MPC) 1.7.5→**1.7.6**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&target_milestone=1.7.4&target_milestone=1.7.5), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/)
    * (Eclipse User Storage Service 1.2→1.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn Tasks 3.24.2→3.24.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * Mylyn WikiText 3.0.25→**3.0.29**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/)
    * WTP Source Editing (XML editor, etc.) 3.13→**3.14**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/)
    * Oomph 1.12→**1.13**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/)
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
    * J**Git**/EGit 5.3→**5.4**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.4)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.4), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.4.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.4.0-release-review)
* **Features to show**
    * **General**:
        * Performance improvements, e.g. faster startup (tested with the Jave IDE and a small workspace)
        * [Importing projects from the command line](https://www.eclipse.org/eclipse/news/4.12/platform.php#pass-directory-to-launcher)
            1. _Start Eclipse and import project (Eclipse not in full screen)_
            2. _Open a file (e.g. this file) from the command line (not new feature, but to show folder vs. file)_
            3. _Import another project from the command line (to show dialog is opened in the running Eclipse)_
        * [Run launch configurations via Quick Access (Ctrl+3)](https://www.eclipse.org/eclipse/news/4.12/platform.php#launch-config-quickaccess)
            1. _Create or use import External Tool run configuration: `Clock`, `c:\windows\system32\cmd.exe`, `/c echo %time%`_
            2. _Quick Access (Ctrl+3) + type `clock`_
            3. _→ Current time shown in Console view_
        * [Improved view menu icon (in Dark theme and/or in high-DPI)](https://www.eclipse.org/eclipse/news/4.12/platform.php#view-menu)
        * ([XML editor Outline view: show the beginning of the comment instead of 'comment'](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/commit/?id=f9b248d880a857dfc17c4f525860ba856110cd7b))
        * ([XML editor Outline view: show the beginning of contained text](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/commit/?id=44a79685c3cc8546700fb4542f36e24e231c0065))
    * **Git**:
        * [History view: Check Out This Version](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.4#Checking_out_Files_from_a_Commit)
        * _Git Repositories_ view:
            * [Filters and Customizations...](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.4#Filtering_Content_from_the_Git_Repositories_View)
            * [Right-click on a branch node: Show In > Git Reflog](https://bugs.eclipse.org/bugs/show_bug.cgi?id=544981)
            * [Double click fetch nodes to run fetch command](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545273)
        * ([Shorten SHA1 in editor title](https://bugs.eclipse.org/bugs/show_bug.cgi?id=544983))
        * ([Only warn about losing changes if there are changes at all](https://bugs.eclipse.org/bugs/show_bug.cgi?id=546194))

### Java, Maven, Gradle
* **Sources**
* **Features to show**

### C/C++, PHP, Rust, Web
* **Sources**
* **Features to show**

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
