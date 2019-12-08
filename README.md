# Eclipse IDE Improvements Videos

## [Eclipse 2019-12](https://wiki.eclipse.org/Category:SimRel-2019-12) - [December 18, 2019](https://www.google.com/calendar/event?eid=NWFubTFwcWNyMWMzc2gzZDYxcTFqcTA1NjMgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [76 projects](https://projects.eclipse.org/releases/2019-12) ([-0 +1 → +1](https://projects.eclipse.org/releases/2019-09)) - [Website](https://staging.eclipse.org/eclipseide/2019-12) ([New & Noteworthy](https://staging.eclipse.org/eclipseide/2019-12/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545158)
* [Latest CI builds](https://hudson.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2019-12), [release](http://download.eclipse.org/releases/2019-12))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)

### General and Git
* **Sources**
    * **Platform** 4.13→**4.14**: [Eclipse 4.14 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.14/platform.php), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.8→**1.8.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage Service 1.2→**1.2.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn Tasks 3.24.2→3.24.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * Mylyn WikiText 3.0.33→3.0.33: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/)
    * (Oomph 1.13/14→**1.14/15**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
    * J**Git**/EGit 5.5→**5.6**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.6)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.6), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.6.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.6.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC)
* **Features to show**
    * **General**:
        * [**_Find Actions_** (formerly _Quick Access_)](https://www.eclipse.org/eclipse/news/4.14/platform.php#quick-access-improvements)
            * Separate window (with menu e.g. to remember size → amount of proposals) instead of text field in the upper right corner
            * [Now with results from _Open Resource_](https://www.eclipse.org/eclipse/news/4.14/platform.php#open-file-find-actions)
            * [Now with results from _Quick Search_](https://www.eclipse.org/eclipse/news/4.14/platform.php#quick-access-improvements)
        * [Show problems inline as _Code Minings_](https://www.eclipse.org/eclipse/news/4.14/platform.php#show-markers-as-code-minings) (disabled by default)
            * In the Java editor _Code Minings_ have to be enabled
        * [Backspace/delete can treat spaces as tabs](https://www.eclipse.org/eclipse/news/4.14/platform.php#delete-spaces-as-tabs)
        * UI improvements:
            * [Perspective switcher](https://www.eclipse.org/eclipse/news/4.14/platform.php#perspective-switcher)
            * [New view menu icon](https://www.eclipse.org/eclipse/news/4.14/platform.php#new-view-menu-icon) and new filter icons
            * [Inline renaming](https://www.eclipse.org/eclipse/news/4.14/platform.php#project-explorer-inline-rename) (for simple files, not for files with refactor support like Java files)
            * Dark theme:
                * (TODO [Forms](https://www.eclipse.org/eclipse/news/4.14/platform.php#ui-forms-styling))
                * (TODO [Reduced number of colors](https://www.eclipse.org/eclipse/news/4.14/platform.php#dark-colors-usage))
        * (TODO Performance improvement that can be shown, e.g. startup, etc.)
        * [Automatic updates: _Latest Eclipse Release_ enabled by default](https://bugs.eclipse.org/bugs/show_bug.cgi?id=551709)
    * **Git**:
        * [_History_ view: Select branches to show](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.6#History_View:_Select_the_Branches_to_Show)
        * [_Repositories_ view: repository groups](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.6#Repositories_View:_Repository_Groups)
        * [Apache HTTP client](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.6#HTTP_Library) to be able to [access repositories via HTTP(S) via authenticated proxy](https://bugs.eclipse.org/bugs/show_bug.cgi?id=549832)
        * [Performance improvements](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.6#Performance_Improvements):
            * [Pulling in Parallel](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.6#Pulling_in_Parallel): by default increased from 1 to 3
            * Accesses of Git config files far less frequently than before
            * When checking out files (e.g. on branch switching) only files actually modified will be refreshed

### Java, Maven, Gradle
* **Sources**
    * Java development tools (JDT) 4.13→**4.14**: [Eclipse 4.14 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.14/jdt.php)
        * Java 13: [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=539066), [examples](https://wiki.eclipse.org/Java13/Examples)
    * (EclEmma (Java code coverage)) 3.1.2→3.1.2: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.13→1.13: [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.13-release-review))
    * (Buildship (Gradle) 3.1.2→**3.1.3**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.3) → [announcement 3.1.3](https://discuss.gradle.org/t/buildship-3-1-3-is-now-available/33910))
    * (WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.15→**3.16**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* **Features to show**
    * **Java**:
        * Java 13 built-in support:
            * New Java Project: JavaSE-13
            * Text blocks (Preview feature; [JEP 355](https://openjdk.java.net/jeps/355): [Text Blocks](https://bugs.eclipse.org/bugs/show_bug.cgi?id=531716))
                * Warning and Quick Fixes for text blocks without preview features enabled
                * [Keyboard shortcut for Text Block creation](https://www.eclipse.org/eclipse/news/4.14/jdt.php#Text_Block_Creation_Keyboard_ShortCut)
                * [Formatter: Indentation of text blocks](https://www.eclipse.org/eclipse/news/4.14/jdt.php#formatter-text-block)
            * `switch` (Preview feature; [JEP 354](https://openjdk.java.net/jeps/354): [Switch Expression](https://bugs.eclipse.org/bugs/show_bug.cgi?id=549435))
                * In switch expressions `break` became `yield` (new Java keyword; in switch statements it's still `break`; → incompatible to Java 12)
        * Java editor:
            * Content assist:
                * [Postfix completion](https://www.eclipse.org/eclipse/news/4.14/jdt.php#postfix-completion) (disabled by default)
                * (Improvements Chain Completion ([introduced in 4.13](https://www.eclipse.org/eclipse/news/4.13/jdt.php#chain-completion)) e.g. [bug 550821](https://bugs.eclipse.org/bugs/show_bug.cgi?id=550821), etc. (disabled by default))
            * [Templates for empty Java source files](https://www.eclipse.org/eclipse/news/4.14/jdt.php#templates-empty-java-file)
            * [Quick fix: _Surround with try-with-resources_](https://www.eclipse.org/eclipse/news/4.14/jdt.php#try-with-resources)
            * [Source clean ups: _Remove unnecessary array creation_](https://www.eclipse.org/eclipse/news/4.14/jdt.php#unnecessary-array-creation)
            * [Source clean ups: _Push negation down in expression_](https://www.eclipse.org/eclipse/news/4.14/jdt.php#push-down-negation)
        * Formatter
            * See above: text blocks, etc.
            * [Blank lines between Javadoc tags](https://www.eclipse.org/eclipse/news/4.14/jdt.php#formatter-javadoc-tags-blank-lines)
            * [Space after not operator](https://www.eclipse.org/eclipse/news/4.14/jdt.php#formatter-space-before-not)
        * JPMS:
            * [Javadoc tag checking for modules](https://www.eclipse.org/eclipse/news/4.14/jdt.php#module-javadoc-checking)
        * [_Console_: Interpretation of control characters can be enabled](https://www.eclipse.org/eclipse/news/4.14/platform.php#control-character-console)
        * [Debug: No suspending on exception recurrence](https://www.eclipse.org/eclipse/news/4.14/jdt.php#exception-instance-recurrence)
        * (Performance: TODO [Content assist not in UI thread?](https://www.eclipse.org/eclipse/news/4.14/jdt.php#completion-ext-flag-uithread))
        * (Apache Ant: [1.10.5→**1.10.7**](https://www.eclipse.org/eclipse/news/4.14/platform.php#ant-version-upgrade); [support for the `include` task added](https://www.eclipse.org/eclipse/news/4.14/platform.php#ant-ui-support-for-include-task))
    * **Maven**:
        * (Not yet, probably in next release: Embedded Maven updated from 3.6.1 to 3.6.3 (→ supports POM-less Tycho))

### C/C++, PHP, Rust, Web
* TODO

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
