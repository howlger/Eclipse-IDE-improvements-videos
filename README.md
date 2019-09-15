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
            * [Improved interactive performance](https://www.eclipse.org/eclipse/news/4.13/platform.php#ui-performance), e.g. [in the Smart Import dialog, switching between _Select All_ and _Deselect All_ is clearly faster](https://bugs.eclipse.org/bugs/show_bug.cgi?id=546450)
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
            * [_Git Repositories_ view: F2 on repository node to rename current branch](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.5#Renaming_branches_became_easier)
            * Shorter dialog texts, verbs instead of OK ([e.g. _Reword_ instead of _OK_](https://bugs.eclipse.org/bugs/show_bug.cgi?id=548144)), performance improvements, etc.

### Java, Maven, Gradle
* **Sources**
    * Java development tools (JDT) 4.12→**4.13**: [Eclipse 4.13 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.13/jdt.php)
        * Java 13 as preview via [Marketplace](https://marketplace.eclipse.org/content/java-13-support-eclipse-2019-09-413) ([bug 547710](https://bugs.eclipse.org/bugs/show_bug.cgi?id=547710)): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=539066), [examples](https://wiki.eclipse.org/Java13/Examples)
    * (EclEmma (Java code coverage)) 3.1.3→3.1.3: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.12→**1.13**: [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.13-release-review))
    * Buildship (Gradle) 3.1.0→**3.1.2**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.2) → announcements [3.1.1](https://discuss.gradle.org/t/buildship-3-1-1-is-now-available/32257), [3.1.2](https://discuss.gradle.org/t/buildship-3-1-2-is-now-available/33034)
    * (WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.14→**3.15**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* **Features to show**
    * **Java**:
        * Java 13 support via [Marketplace](https://marketplace.eclipse.org/content/java-13-support-eclipse-2019-09-413):
            * (New Java Project: JavaSE-13)
            * (Enable Preview features)
                * [JEP 355](https://openjdk.java.net/jeps/355): [Text Blocks](https://bugs.eclipse.org/bugs/show_bug.cgi?id=531716)
                * [JEP 354](https://openjdk.java.net/jeps/354): [Switch Expression](https://bugs.eclipse.org/bugs/show_bug.cgi?id=549435)
        * Java editor:
            * ([Chain Completion Code Assist](https://www.eclipse.org/eclipse/news/4.13/jdt.php#chain-completion) (disabled by default) → does not work for me)
            * [Quick fix: _Convert to enhanced 'for' loop_](https://www.eclipse.org/eclipse/news/4.13/jdt.php#foreach-loop-collections)
            * [Quick fix: _Initialize final field '...' in constructor_](https://www.eclipse.org/eclipse/news/4.13/jdt.php#foreach-loop-collections)
            * [Source clean ups: Use _Autoboxing_ and _Unboxing_](https://www.eclipse.org/eclipse/news/4.13/jdt.php#autoboxing-unboxing)
            * [Source clean ups: _Remove redundant modifier_ improved to remove also _abstract_ at interfaces](https://www.eclipse.org/eclipse/news/4.13/jdt.php#enhanced-redundant-modifier-removal)
        * Formatter
            * [Blank lines: New option _Remove excess blank lines_ (if lines set to 0)](https://www.eclipse.org/eclipse/news/4.13/jdt.php#remove-excess-blank-lines)
            * [Blank lines: New section (some restructured, most new) and configurable for more places (12→20)](https://www.eclipse.org/eclipse/news/4.13/jdt.php#blank-lines-changes)
        * [_Console_: Synchronize standard and error output (disables coloring)](https://www.eclipse.org/eclipse/news/4.13/jdt.php#console-output-synchronization)
        * JPMS:
            * [_Patch with..._ can be overridden in launch configuration](https://www.eclipse.org/eclipse/news/4.13/jdt.php#blank-lines-changes)
            * [Code templates: _Comments > Modules_](https://www.eclipse.org/eclipse/news/4.13/jdt.php#javadoc-for-module-info)
        * [Embedded JUnit 5.4→5.5.1](https://www.eclipse.org/eclipse/news/4.13/jdt.php#junit-5.5.1)
            * Declarative timeouts via [`@Timeout(value = 42, unit = SECONDS)`](https://github.com/junit-team/junit5/blob/master/junit-jupiter-api/src/main/java/org/junit/jupiter/api/Timeout.java) (in addition to `assertTimeout(Duration.ofSeconds(1), () -> { ... });``
        * [Full build on project preferences change (`.settings/org.eclipse.jdt.core.prefs`)](https://www.eclipse.org/eclipse/news/4.13/jdt.php#full-build-on-jdt-core-settings-change)
            * `-Dorg.eclipse.disableAutoBuildOnSettingsChange=true`
    * **Gradle**:
        * name deduplication
        * _Debug As > Gradle Test_
            * → launches a Gradle build that executes the selected test in debug mode and automatically connects an IDE debug session to it
        * Closed projects are replaced with a library (JAR) dependency that is automatically built during the synchronization

### C/C++, PHP, Rust, Web
* TODO

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
