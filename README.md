<sup>Past releases:
[2021-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2021-09)
[2021-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2021-06)
[2021-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2021-03)
[2020-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-12)
[2020-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-09)
[2020-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-06)
[2020-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-03)
[2019-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-12)
[2019-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-09)
[2019-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-06)
</sup>

# Eclipse IDE 2021-12 Improvements Video

* [December 8, 2021](https://www.google.com/calendar/event?eid=NzRlajUydW5qZTc0OGozNzdycjc3dXRxOTggZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [69 projects](https://projects.eclipse.org/releases/2021-12) ([-0 +2 → 69](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2021-12) - [website](https://eclipse.org/eclipseide/2021-12) ([New & Noteworthy](https://eclipse.org/eclipseide/2021-12/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=569333)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2021-12/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2021-12), [release](http://download.eclipse.org/releases/2021-12))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.21→**4.22**: [Eclipse 4.22 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.22/jdt.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_22.xml#themes_and_priorities), Git [core](https://git.eclipse.org/c/jdt/eclipse.jdt.core.git/log/) [UI](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/log/)
        * [Java 17](https://jdk.java.net/17/): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=570733&hide_resolved=0), [examples](https://wiki.eclipse.org/Java17/Examples)
    * (EclEmma (Java code coverage) 3.1.5: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.18.1→**1.19.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#1190), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.18.2-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/1.18.1...1.18.2), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * (LemMinx-Maven 0.4.0→**0.4.1**: [release notes](https://github.com/eclipse/lemminx-maven/blob/master/RELEASE_NOTES.md#041), [commits](https://github.com/eclipse/lemminx-maven/compare/0.4.0...0.4.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.5: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.5), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.21→**4.22**: [Eclipse 4.22 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.22/platform.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_22.xml#themes_and_priorities), [Git](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/log/), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.41: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.22→**1.23**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 5.13→**6.0**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.0)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.0), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.0.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.0.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.12.0→**0.13.1**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#0131), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.12.0...0.13.1)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.1.3→**4.4.4** [releases](https://github.com/microsoft/TypeScript/releases), announcements [4.2](https://devblogs.microsoft.com/typescript/announcing-typescript-4-2), [4.3](https://devblogs.microsoft.com/typescript/announcing-typescript-4-3), [4.4](https://devblogs.microsoft.com/typescript/announcing-typescript-4-4)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.16.2→**0.18.1**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#change-log)
    * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.23→**3.24**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.24&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.24/NewAndNoteworthy/)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.4→**10.5**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.5.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn105)
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.1.2: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.0.0...v6.1.2-202102181132), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.1.2-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.12: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.19→**0.20**: [GitHub](https://github.com/eclipse/lsp4e), [changelog](https://github.com/eclipse/lsp4e/blob/master/CHANGELOG.md#0200), [commits](https://github.com/eclipse/lsp4e/compare/0.19.0...0.20.0), [review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.20.0-release-review)
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.1→**0.4.2**: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.2-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#042)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.1→**1.2.2**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.2-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java**
    * [**Java 17** (LTS) **support**](https://www.eclipse.org/eclipse/news/4.22/jdt.php#Java_17)
         * [JEP 409: Sealed Classes (Final)](https://openjdk.java.net/jeps/409): show Quick Fixes (Ctrl+1) introduced in last version, but not shown in last video:
             * [_Declare '...' as permitted subtype of '...'_](https://www.eclipse.org/eclipse/news/4.21/jdt.php#add-to-permitted-types)
             * [_Declare '...' as direct super class/interface of '...'_](https://www.eclipse.org/eclipse/news/4.21/jdt.php#declare-as-super-interface)
         * [JEP 306: Restore Always-Strict Floating-Point Semantics](https://openjdk.java.net/jeps/306): `strictfp` warning when used since it's unnecessary since Java 17
         * ([JEP 406: Pattern Matching for switch (Preview)](https://openjdk.java.net/jeps/406))
    * Cleanups (+1; [AutoRefactor](https://github.com/JnRouvignac/AutoRefactor) merged into [Eclipse](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&query_format=advanced&short_desc=AutoRefactor&short_desc_type=allwordssubstr) by [Fabrice Tiercelin](https://projects.eclipse.org/projects/eclipse.jdt/elections/election-fabrice-tiercelin-committer-eclipse-java-development-tools-jdt))
        * _Java Feature_ (+1)
            * [_Convert String concatenation to Text Block_](https://www.eclipse.org/eclipse/news/4.22/jdt.php#strconcat-to-textblock): if the option _Only for local variables_ is disabled, also fields and parameters will be converted, which might cause compiler errors in callers and which might alter the behavior since _StringBuffer_ is synchronized in contrast to _StringBuilder_
    * Java editor:
        * [Default _Type Filters_: `java.awt.*` and `org.graalvm.*` disabled; `java.awt.List` added instead](https://bugs.eclipse.org/bugs/show_bug.cgi?id=576549)
        * ([Content assist fixed/improved](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575919) ([backstory](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575631#c14)))
        * [Content assist proposes lambda expressions](https://bugs.eclipse.org/bugs/show_bug.cgi?id=443091)
        * ([_Surround with try-with-resources_](https://www.eclipse.org/eclipse/news/4.22/jdt.php#surround-with-try-with-resources-quickfix) quick assist now also as quick fix (Ctrl+1))
    * [_Call Hierarchy_: improved lambda support](https://www.eclipse.org/eclipse/news/4.22/jdt.php#CallHierarchy)
    * Debug:
        * [_Set Object Label..._](https://www.eclipse.org/eclipse/news/4.22/jdt.php#label-objects)
    * [_Open Type_ dialog: pasted text automatically corrected](https://www.eclipse.org/eclipse/news/4.22/jdt.php#OpenTypeSelectionDialog)
    * JUnit:
        * [Support of records for JUnit tests](https://www.eclipse.org/eclipse/news/4.22/jdt.php#junit-record)
        * (Embedded JUnit updated: [4.13.0→4.13.2](https://www.eclipse.org/eclipse/news/4.22/jdt.php#junit-4.13.2) and [5.7.1→5.8.1](https://www.eclipse.org/eclipse/news/4.22/jdt.php#junit-5.8.1))
    * ([Performance](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&product=PDE&query_format=advanced&short_desc=performance&short_desc_type=allwordssubstr&target_milestone=4.22&target_milestone=4.22%20M1&target_milestone=4.22%20M2&target_milestone=4.22%20M3&target_milestone=4.22%20RC1&target_milestone=4.22%20RC2):
        * [Content assist faster for type names](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575562)
        * [Faster building of large Java projects](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575733) ([example](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575733#c14))
        * [Faster Java searching](https://bugs.eclipse.org/bugs/show_bug.cgi?id=576601)
        * [Faster index reading](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574464))
    * Maven:
        * [Maven POM Editor: in _Source_ tab _Generic Text Editor_ with LemMinX-Maven used by default](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#generic-editor-with-lemminx-maven-used-as-default-source-editor): content assist to add dependencies, versions, etc.
* **General**
    * [New view: _Launch Configuration_](https://www.eclipse.org/eclipse/news/4.22/platform.php#launch-config-view)
    * [Multiple text selection](https://www.eclipse.org/eclipse/news/4.22/platform.php#multi-selection)
        * In a text based editor: Alt+click
        * _Find_ dialog: _Select All_
        * In block selection mode via _To multi-selection_ command (useful for adding extra lines)
    * [_Problems_ view: double-clicking a problem without a path, selects the project in default view](https://www.eclipse.org/eclipse/news/4.22/platform.php#defaultShowIn)
    * [External browser used by default](https://www.eclipse.org/eclipse/news/4.22/platform.php#external-browser-default): in preferences _General > Web Browser_
    * [Performance](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=e4&product=Equinox&product=Incubator&product=Platform&query_format=advanced&short_desc=performance&short_desc_type=allwordssubstr&target_milestone=4.22&target_milestone=4.22%20M1&target_milestone=4.22%20M2&target_milestone=4.22%20M3&target_milestone=4.22%20RC1&target_milestone=4.22%20RC2):
        * Starts a bit faster: JEE IDE in about 5.4 instead of 5.8 seconds
            * [Faster `Program.getPrograms()`](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574639) and [also cached](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575569) (e.g. speeds up right-click + _Open With > Other: External programs_)
        * ([Faster editor open/close](https://bugs.eclipse.org/bugs/show_bug.cgi?id=576333))
        * ([Faster _Search > File..._](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575893))
    * [UI](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=575807&hide_resolved=0):
        * Dark Theme:
            * [On Windows: dark title bar](https://www.eclipse.org/eclipse/news/4.22/platform.php#win32-dark-titlebar-css)
            * _Minimize_ and _Maximize_ icons outline instead of filled with white
            * Content assist: dark instead of bright top border
* **Git**
    * [_Fetch Github/Gitlab Pull/Merge Request..._](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.0#Fetching_Pull_Requests): [Configure servers for Pull/Merge Requests in preferences _Version Control (Team) > Git > Servers_ (by default empty)](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.0#Configuring_Hosts_for_Pull_Requests)
    * [SSH Agent support](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.0#SSH_Agent) (see also [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.0#SSH_Agent_Support)): on Windows Pageant (PuTTY), on Linux and macOS via Unix domain socket mechanism (environment variable `SSH_AUTH_SOCK`): in preferences _Version Control (Team) > Git_: _Use SSH Agent for SSH connections_ (Linux/macOS) or _Use Pageant for SSH connections_ (Windows) enabled by default
    * ([_Clone Git Repository_ dialog: pasted clone command parameter in quotes](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566305): e.g. `git clone "ssh://jane@example.com:29418/sample"` (in additon to `git clone ssh://jane@example.com:29418/sample`))
    * ([Performance: stackless _BinaryBlobException_](https://git.eclipse.org/c/jgit/jgit.git/commit/?id=ee28780bf2dfe8574905835d43b5bb0738ad81ad))
* **Web**
    * JavaScript:
        * [Spelling suggestions](https://devblogs.microsoft.com/typescript/announcing-typescript-4-4/#spelling-corrections-js): error message with additional _Did you mean '...'?_; can be applied via Quick Fix (Ctrl+1)
    * (XML opened with the _Generic Text Editor_: Editing of start and end tag is bound together)
    * _Generic Text Editor_ in general: Alt+Shift+R (instead of F2) for _Rename_ (to avoid conflict with _Show Tooltip Description_)
* **Misc**
    * (Java 17 **embedded** (via [Eclipse Temurin](https://eclipse.org/temurin) and [JustJ](https://eclipse.org/justj)) in _Eclipse IDE for Java Developers_, _Eclipse IDE for Enterprise Java and Web Developers_, _Eclipse IDE for C/C++ Developers_ and _Eclipse IDE for Embedded C/C++ Developers_)
    * ([Apple silicon](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565690): [IDE packages](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575680) had to wait for the Java 17 HotSpot VM and the native libraries of CDT)

* **(Under development)**
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
