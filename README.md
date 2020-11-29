# Eclipse IDE Improvements Videos

## [Eclipse 2020-12](https://wiki.eclipse.org/Category:SimRel-2020-12) - [September 16, 2020](https://calendar.google.com/calendar/event?eid=NWJyY3FsZ24wZmU1aW9jcmg2bTdocmY2a2sgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [71 projects](https://projects.eclipse.org/releases/2020-12) ([-0 +1 → +1](projects_diff.txt)) - [Website](https://eclipse.org/eclipseide/2020-12) ([New & Noteworthy](https://eclipse.org/eclipseide/2020-12/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=553853)
* [Latest CI builds](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2020-12), [release](http://download.eclipse.org/releases/2020-12))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* General
    * **Platform** 4.17→**4.18**: [Eclipse 4.18 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.18/platform.php), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_18.xml#themes_and_priorities), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.8.4→**1.9.0**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.38: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.17/18: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* Java, Maven, Gradle
    * Java development tools (JDT) 4.17→**4.18**: [Eclipse 4.18 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.18/jdt.php), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_18.xml#themes_and_priorities)
        * [Java 15](https://jdk.java.net/15/): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=559959), [examples](https://wiki.eclipse.org/Java15/Examples)
    * (EclEmma (Java code coverage) 3.1.4: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.16.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=m2e&query_format=advanced&order=changeddate%20DESC&target_milestone=1.16.2), [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.16.2-release-review))
    * (Buildship (Gradle) 3.1.4: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.4) → [announcements](https://discuss.gradle.org/tag/buildship-release))
    * (WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.19→**3.20**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* J**Git**/EGit 5.9→**5.10**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.10)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.10), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.10.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.10.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.11.1→**0.11.3**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.11.1...0.11.3)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 3.9.7→**4.0.5** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-4-0/)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.11→**0.14.1**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#change-log)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.0→**10.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.1.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn101)
        * [Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) **6.0**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v5.2.1...v6.0.0-rc2), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.0.0-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/)
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.9→**0.10**: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.16→**0.17**: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), ([review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.15.0-release-review)))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.1: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.1-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#041)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 0.4.2→**1.0**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.0.0-release-review))


### Features to show

* **Java**
    * **Java 15 embedded**, at least in the 3 most popular and 3 other IDE packages:
        * _Eclipse IDE for **Java** Developers_
        * _Eclipse IDE for **Enterprise Java** Developers_
        * _Eclipse IDE for **C/C++** Developers_
        * _Eclipse IDE for **Embedded C/C++** Developers_ (new; 13→14 IDE packages): C/C++ for Arm/RISC-V based on the formerly _GNU MCU/ARM Eclipse_ plugin, which became the _C/C++ Development Tools_ Eclipse project
            * By the way, **Linux AArch64**: all 14 IDE packages also available for Linux ARM 64bit, e.g. to run Eclipse native on [Raspberry Pi](https://twitter.com/akurtakov/status/1291011562745061378)
                * in addition to the x86 64bit Windows, macOS and Linux platforms
                * macOS with Apple silicon (M1 which is also ARM 64bit) not yet native supported
                * but [support for Big Sur (macOS 11)](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565691)
        * _Eclipse IDE for **Web and JavaScript** Developers_
        * _Eclipse IDE for **Rust** Developers_
    * Built-in **Java 15 support**
        * [JEP 378: Text Blocks](https://openjdk.java.net/jeps/378) `""" ... """`
            * `\` (at the end of the line to ignore line break), `\s` (visible space)
            * Additional methods:
                * `String::stripIndent()`: used to strip away incidental white space from the text block content
                * `String::translateEscapes()`: used to translate escape sequences
                * `String::formatted(Object... args)`: simplify value substitution in the text block
        * Preview:
            * [JEP 375: Pattern Matching for instanceof (Second Preview)](https://openjdk.java.net/jeps/375): [_"with no changes relative to the preview in JDK 14, in order to gather additional feedback"_](https://openjdk.java.net/jeps/375#History)
            * [JEP 384: Records (Second Preview)](https://openjdk.java.net/jeps/384)
            * [JEP 360: Sealed Classes](https://openjdk.java.net/jeps/360): second preview in Java 16
                * Quick fixes to change between sealed, non-sealed and final
                * Java Search: _Permitted type declarations_
    * Java editor:
        * [Completion overwrites by default](https://www.eclipse.org/eclipse/news/4.18/jdt.php#completion-overwrites)
        * [Insert best guessed parameters by default](https://www.eclipse.org/eclipse/news/4.18/jdt.php#param-best-guessed)
        * Quick assists:
            * [Create new implementation](https://www.eclipse.org/eclipse/news/4.18/jdt.php#quick-assist-new-impl) on an interface or abstract class declaration launches the New Java Class wizard
        * Quick fixes:
            * [Quick fixes on permitted types (sealed classes Java 15 preview feature)](https://www.eclipse.org/eclipse/news/4.18/jdt.php#quick-fixes-permitted-types) to add `sealed`, `non-sealed`, or `final` modifiers on permitted type declarations, as applicable
            * [Convert switch statement to switch expression](https://www.eclipse.org/eclipse/news/4.18/jdt.php#switch-expressions) (also available as clean-up: see below)
    * Clean-up (+25; [AutoRefactor](https://github.com/JnRouvignac/AutoRefactor) merged into [Eclipse](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&query_format=advanced&short_desc=AutoRefactor&short_desc_type=allwordssubstr) by [Fabrice Tiercelin](https://projects.eclipse.org/projects/eclipse.jdt/elections/election-fabrice-tiercelin-committer-eclipse-java-development-tools-jdt))
        * _Code Style_ (+5)
            * [_Convert to switch expression (Java 14 or higher)_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#switch-expressions) (also available as quick fix: see above)
            * [_Combine nested 'if' statement in 'else' block to 'else if'_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#else-if)
            * [_Add elements in collections without loop_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#add-remove)
            * [_Convert if/else if/else chain to switch_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#use-switch)
            * [_Compare with != 0 for bitwise expressions (use it carefully, it may alter the behavior)_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#bitwise-expressions)
            * [_Pull up assignment_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#pull-up-assignment)
        * _Duplicate code_ (+4)
            * [_Replace (X && Y) || (!X && Z) by X ? Y : Z_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#ternary-operator): use ternary operator
            * [_Use '==' or '^' on booleans_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#xor): equals (`==`) and XOR (`^`) on passive boolean operands only
            * [_Remove redundant end of block with jump statement_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#redundant-falling-blocks)
            * [_Redundant if condition_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#if-condition)
        * _Unnecessary Code_ (+12)
            * [_Use Objects.hash() (1.7 or higher)_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#hash)
            * [_Use String.join() when possible (1.8 or higher)_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#string-join)
            * [_Use Arrays.fill() when possible_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#arrays-fill)
            * [_Evaluate without null check_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#redundant-null-check)
            * [_Double negation_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#double-negation)
            * [_Remove redundant comparison statement_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#redundant-comparison-statement)
            * [_Remove redundant super() call in constructor_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#redundant-super)
            * [_Initialize collection at creation_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#collection-cloning)
            * [_Initialize map at creation_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#map-cloning)
            * [_Remove overridden assignment_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#overridden-assignment)
            * [_Remove useless continue_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#redundant-continue)
            * [_Use try-with-resource (1.7 or higher)_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#try-with-resource)
        * _Optimization_ (+4)
            * [_Exit loop earlier_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#break-loop)
            * [_Replace String concatenation by StringBuilder_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#stringbuilder)
            * [_Primitive serialization_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#primitive-serialization)
            * [_Prefer boolean literals_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#boolean-literal)
    * Formatter
        * [Annotations wrapping](https://www.eclipse.org/eclipse/news/4.18/jdt.php#formatter-wrap-annotations)
    * [Launch configuration: _Use @argfile when launching_](https://www.eclipse.org/eclipse/news/4.18/jdt.php#launch-with-argfile)
    * ([Stabilized logical structures in Variables view with active GC](https://www.eclipse.org/eclipse/news/4.18/jdt.php#logicalstructure-gc): _Debug_ view no longer breaks when logical structures are shown while the application's garbage collector is active (`com.sun.jdi.ObjectCollectedException` occurred while retrieving value))
    * [The Preferences > Java > Appearance > [x] Sort library entries alphabetically in Package Explorer is now enabled by default](https://www.eclipse.org/eclipse/news/4.18/jdt.php#package-explorer-lib-sortedbydefault)
    * [JUnit 5.7](https://www.eclipse.org/eclipse/news/4.18/jdt.php#junit-5.7): see [release notes](https://junit.org/junit5/docs/current/release-notes/index.html#release-notes-5.7.0/)
* **General**
    * [UI](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=566539&hide_resolved=0)
        * [New "System" theme](https://www.eclipse.org/eclipse/news/4.18/platform.php#system-theme)
            * [macOS: Light theme improved](https://www.eclipse.org/eclipse/news/4.18/platform.php#mac-theme-light)
        * [_Open With > ..._ no longer remembers the chosen editor to open that file next time](https://www.eclipse.org/eclipse/news/4.18/platform.php#store-default-editor) ([bug 378488](https://bugs.eclipse.org/bugs/show_bug.cgi?id=378488))
        * [_Open With > ..._ no longer remembers the chosen editor to open that file next time](https://www.eclipse.org/eclipse/news/4.18/platform.php#store-default-editor) ([bug 378488](https://bugs.eclipse.org/bugs/show_bug.cgi?id=378488))
        * [Remember last used page in the Search dialog](https://www.eclipse.org/eclipse/news/4.18/platform.php#remember-last-search): enabled by default; moved to _Preferences_ dialog (from _Search_ dialog _Customize..._)
        * [Installation Details - Configuration: filter field](https://www.eclipse.org/eclipse/news/4.18/platform.php#configuration-filter)
        * Dark theme improvements:
            * [Windows: progress bars](https://www.eclipse.org/eclipse/news/4.18/platform.php#win32-dark-progressbar)
            * [Avoid hard code dark colors in the dark theme and find better colors](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566549)
            * [Git _History_ view: Branch label color is too bright](https://bugs.eclipse.org/bugs/show_bug.cgi?id=536171)
    * ([Performance improvements](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566485): faster start-up (e.g. by [improved MPC](https://bugs.eclipse.org/bugs/show_bug.cgi?id=560084)), etc. (on my machine the Java IDE starts about 0.15 s faster: 6.2→6.05 s))
    * [Console view: _Enable word wrap_ preference](https://www.eclipse.org/eclipse/news/4.18/platform.php#console-word-wrap)
    * ([Terminate descendants of operating-system processes launched by Eclipse](https://www.eclipse.org/eclipse/news/4.18/platform.php#terminate-descendants)
    * [Preferences: _Teams_ became _Version Control (Teams)_](https://bugs.eclipse.org/bugs/show_bug.cgi?id=32023)
    * ([Generic extensible "test report" view](https://www.eclipse.org/eclipse/news/4.18/platform_isv.php#unit-test-view) ([bug 507626](https://bugs.eclipse.org/bugs/show_bug.cgi?id=507626))
* **Git**
    * [F5 in _Staging_ and _History_ views](https://bugs.eclipse.org/bugs/show_bug.cgi?id=567600)
    * [Better secure store handling for SSH key passphrases](https://git.eclipse.org/c/egit/egit.git/commit/?id=05f6aa2f360c8111b7b83af7dd824eb5b5eed531): Preferences: _Store SSH key passphrases in secure store_, etc.
    * [ProxyJump support](https://git.eclipse.org/c/jgit/jgit.git/commit/?id=566e49d7d39b12c785be24b8b61b4960a4b7ea17) (see [ProxyJump support](https://man.openbsd.org/ssh_config#ProxyJump))
    * ([_Staging_ view: redraws reduced](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565019))
* **Web**
    * LSP4E: _Format_ menu item has been relocated Generic Editor _Source_ submenu
    * ([Wild Web Developer not yet updated: 2020-12 still contains the version of 2020-09, although newer versions exist](https://twitter.com/howlger/status/1333435109056401411))
* **(Under development)**
    * ([Upgrade and improve Chromium support in SWT](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566608): no commits in last 3 month (see also [how to enable it](https://bugs.eclipse.org/bugs/show_bug.cgi?id=549585#c117)))
    * ([Eclipse also available for Linux AArch64 aka Arm64](https://www.eclipse.org/eclipse/news/4.17/platform.php#arm64) ([bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=565419)) to run Eclipse native e.g. on [Raspberry Pi](https://twitter.com/akurtakov/status/1291011562745061378), but no Linux AArch64 IDE packages yet)
    * ([Support upcoming Mac on Apple silicon](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565690))
    * ([Java 16](https://jdk.java.net/16/) support: [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=565620), [examples](https://wiki.eclipse.org/Java16/Examples))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
