# Eclipse IDE Improvements Videos

## [Eclipse 2020-09](https://wiki.eclipse.org/Category:SimRel-2020-09) - [September 16, 2020](https://calendar.google.com/calendar/event?eid=NmFxcmVjMHY5cjd1dDhxMjUzYXZwamM3aWkgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [70 projects](https://projects.eclipse.org/releases/2020-09) ([-4 +1 → -3](projects_diff.txt)) - [Website](https://eclipse.org/eclipseide/2020-09) ([New & Noteworthy](https://eclipse.org/eclipseide/2020-09/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=553853)
* [Latest CI builds](https://hudson.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2020-09), [release](http://download.eclipse.org/releases/2020-09))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* General
    * **Platform** 4.16→**4.17**: [Eclipse 4.17 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.17/platform.php), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_17.xml#themes_and_priorities), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.8.3→**1.8.4**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 1.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.36→**3.0.38**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.1→**3.25.2**: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.16/17→**1.17/18**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* Java, Maven, Gradle
    * Java development tools (JDT) 4.16→**4.17**: [Eclipse 4.17 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.17/jdt.php), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_17.xml#themes_and_priorities)
        * Java 15 as preview via [Marketplace](https://marketplace.eclipse.org/content/java-15-support-eclipse-2020-09-417) ([bug 566302](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566302)): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=559959), [examples](https://wiki.eclipse.org/Java15/Examples)
    * (EclEmma (Java code coverage)) 3.1.3→**3.1.4**: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.16→**1.16.2**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=m2e&query_format=advanced&order=changeddate%20DESC&target_milestone=1.15.0), [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.15-release-review))
    * (Buildship (Gradle) 3.1.4: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.4) → [announcements](https://discuss.gradle.org/tag/buildship-release))
    * WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.17→**3.18**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/)
* J**Git**/EGit 5.8→**5.9**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.9)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.9), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.9.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.9.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.9.1→**0.11.1**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.9.1...0.11.1)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 3.8.2→**3.9.7** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-3-9/)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.11: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#change-log)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 9.11.1→**10.0**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.0.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn100)
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.9: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.15→**0.15.1**: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), ([review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.15.0-release-review)))
    * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.3.4→**0.4.1**: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.1-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#041)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 0.4.2: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/0.4.2-release-review))


### Features to show

* **Java**
    * [Java 15 support via Marketplace](https://marketplace.eclipse.org/content/java-15-support-eclipse-2020-09-417)
    * Java editor:
        * ([Non-blocking Java code completion](https://www.eclipse.org/eclipse/news/4.16/jdt.php#default-non-blocking-completion) ← in _Eclipse IDE for Enterprise Java Developers_ [still blocked by JPA JPQL proposals](https://bugs.eclipse.org/bugs/show_bug.cgi?id=563158#c5))
        * Content assist:
            * [Substring/subword matches also for types](https://www.eclipse.org/eclipse/news/4.17/jdt.php#content-assist-substring-types), e.g. _linkedq_ → _Concurrent**LinkedQ**ueue_, _**Linked**Blocking**Q**ueue_, _**Linked**Transfer**Q**ueue_
            * In the _Eclipse IDE for **Enterprise Java** Developers_ wrong order of substring proposals fixed ([Mylyn bug](https://bugs.eclipse.org/bugs/show_bug.cgi?id=506804)), e.g. when typing char by char `List.of` first proposal is `copyOf` instead of `of`
        * Quick fixes:
            * [Use `String.format` instead of string concatenation](https://www.eclipse.org/eclipse/news/4.17/jdt.php#String.format-quickfix), e.g. `String info = args.length + " arguments; path: " + System.getenv("PATH");`
            * [_Add missing method_ for method references in simple cases](https://www.eclipse.org/eclipse/news/4.17/jdt.php#method_reference-quickfix), e.g. `void foo() { List.of(1, 2, 3).forEach(this::missing); }`
        * [Toggle showing Java code minings via _Find Actions_](https://www.eclipse.org/eclipse/news/4.17/jdt.php#toggle-code-minings)
    * Clean up:
        * [_Optimization_ tab](https://www.eclipse.org/eclipse/news/4.17/jdt.php#optimization) with old _Use lazy logical operator_ and new _Precompiles reused regular expressions_ (see below)
        * [_Precompiles reused regular expressions_](https://www.eclipse.org/eclipse/news/4.17/jdt.php#regex): when the same String is used more than one time as regular expression
        * [_Use Objects.equals() in the equals method implementation_](https://www.eclipse.org/eclipse/news/4.17/jdt.php#objects-equals) (in the _Unnecessary Code_ tab at the bottom)
    * ([Formatter: line wrapping of `assert`](https://www.eclipse.org/eclipse/news/4.17/jdt.php#formatter-wrap-assert))
    * _JUnit_ view:
        * [_Collapse All_](https://www.eclipse.org/eclipse/news/4.17/jdt.php#junit-collapse-all)
        * [_Sort By_: _Execution Order_ (default and old behavior), _Execution Time_ or _Name_](https://www.eclipse.org/eclipse/news/4.17/jdt.php#junit-sort-time) (in view menu)
    * Debug:
        * [Java launch configurations: Use helpful NullPointerExceptions checkbox](https://www.eclipse.org/eclipse/news/4.17/jdt.php#helpful-nullpointer-exceptions) in all Java based launch configurations in the _Arguments_ tab; enabled by default and available
        * [_Variables_ view: _Show Type Names_ shows actual instead of declared type](https://www.eclipse.org/eclipse/news/4.17/jdt.php#variables-actual-type) (the _Show Type Names_ toolbar button can be pressed if in the view menu _Layout > Show Columns_ is disabled)
        * [Inspect/Display/Execute of expressions with anonymous class instances works now](https://www.eclipse.org/eclipse/news/4.17/jdt.php#anonymous-class-inspection) - Inspect (Ctrl+Shift+I)
* **General**
    * [Multiple last edit locations](https://www.eclipse.org/eclipse/news/4.17/platform.php#multiple-last-edit-locations): Ctrl+Alt+←/→ Previous/Next Edit Location
    * [Console view: interpretation of ASCII control characters ignores null byte (`\0`)](https://www.eclipse.org/eclipse/news/4.17/platform.php#console-null-byte) ← helpful on Linux where after a null byte the rest of the line will not be shown
    * [Font (size) in trees and tables can be changed](https://www.eclipse.org/eclipse/news/4.17/platform.php#adjustable-view-fonts)
    * [UI](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=563540):
        * [Linux: Improved light theme](https://www.eclipse.org/eclipse/news/4.17/platform.php#gtk-light-theme) to align better with the default GTK3 theme
        * Improved dark theme
            * [Notification when switching theme to restart Eclipse](https://bugs.eclipse.org/bugs/show_bug.cgi?id=564335)
            * [Highlighting of active tab](https://www.eclipse.org/eclipse/news/4.17/platform.php#dark-selection-highlighter)
            * Windows:
                * [Dark menus](https://www.eclipse.org/eclipse/news/4.17/platform.php#dark-win32-menu)
                * [Selection highlighting in tables has been fixed](https://www.eclipse.org/eclipse/news/4.17/platform.php#dark-selection-win32-highlighter), e.g. in the content assist and in the _Quick Switch Editor_ (Ctrl+E)
                * [Dark drop-down boxes](https://www.eclipse.org/eclipse/news/4.17/platform.php#dark-win32-combo)
        * (Shorter text, e.g. [_... exists. Do you wish to overwrite?_ → _Overwrite ...?_](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565800))
        * [Improved interactive and startup performance](https://bugs.eclipse.org/bugs/show_bug.cgi?id=563542) (when copying a file from outside into Eclipse)
            * Startup of _Eclipse IDE for Java Developers_ on my machine: ~ 4.5s instead of 5s
* **Git**
     * ([Git index 4 support](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.9#New_Features))
     * _Git Staging_ view:
         * _Always show Push Wizard for Commit and Push_ preference (_Team > Git > Confirmations and Warnings_)
         * ([Commit message content assist replaces selection](https://git.eclipse.org/c/egit/egit.git/commit/?id=eb071addfdd0313dcb4cbd6d0183d284fb97c05b) (instead of inserting proposal before the selection))
* **Web**
    * Embedded Node.js
    * Language servers updated, e.g. code action _Extract function_ preservers empty lines now
    * [JavaScript task tag detection](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565543)
    * [Add TextMate theme](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#041): _Window > **Preferences: TextMate > Theme: Add...**_ e.g. customized [standard theme](https://github.com/eclipse/tm4e/tree/master/org.eclipse.tm4e.ui/themes)
* **Misc**
    * Java 11 required to run Eclipse
        * ([Install/Update: Check compatibility with used Java version](https://www.eclipse.org/eclipse/news/4.16/platform.php#verify-jre-installation) since last release)
    * Eclipse Installer and 3 of the 13 IDE packages are shipped with Java:
        * _Eclipse IDE for **C/C++** Developers_ (CDT 9.11.1→**10.0**)
        * _Eclipse IDE for **Web and JavaScript** Developers_
        * _Eclipse IDE for **Rust** Developers_
    * (No Mylyn Task view in Java IDE package anymore, but it's still in the Java EE package)
    * ([Update sites: HTTPS instead of HTTP](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/commit/?id=4ba6ff7b188d38345c70d6b5a58a979fa6ca0a77))
    * [By default no confirm on exit dialog](https://www.eclipse.org/eclipse/news/4.17/platform.php#confirm-on-exit)
* **(Under development)**
    * ([Prepared to include Chromium, but not yet included](https://bugs.eclipse.org/bugs/show_bug.cgi?id=549585#c117))
    * ([Eclipse also available for Linux AArch64 aka Arm64](https://www.eclipse.org/eclipse/news/4.17/platform.php#arm64) ([bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=565419)) to run Eclipse native e.g. on [Raspberry Pi](https://twitter.com/akurtakov/status/1291011562745061378), but no Linux AArch64 IDE packages yet)
    * ([Support upcoming Mac on Apple silicon](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565690))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
