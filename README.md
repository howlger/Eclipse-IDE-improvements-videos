<sup>Past releases:
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

# Eclipse IDE 2021-09 Improvements Video

* [September 15, 2021](https://www.google.com/calendar/event?eid=M3RqcXVjamVmNG01bm03bjV0amk3MjcxdmogZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [67 projects](https://projects.eclipse.org/releases/2021-09) ([-1 +0 → 67](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2021-09) - [website](https://eclipse.org/eclipseide/2021-09) ([New & Noteworthy](https://eclipse.org/eclipseide/2021-09/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=569333)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2021-09/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2021-09), [release](http://download.eclipse.org/releases/2021-09))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.20→**4.21**: [Eclipse 4.21 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.21/jdt.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_21.xml#themes_and_priorities), Git [core](https://git.eclipse.org/c/jdt/eclipse.jdt.core.git/log/) [UI](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/log/)
        * [Java 17](https://jdk.java.net/17/) (as preview via [Marketplace](https://marketplace.eclipse.org/content/java-17-support-eclipse-2021-09-421)): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=570733&hide_resolved=0), [examples](https://wiki.eclipse.org/Java17/Examples)
    * EclEmma (Java code coverage) 3.1.4→**3.1.5**: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC)
    * (M2Eclipse (Maven) 1.18.0→**1.18.1**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.18.1-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/1.18.0...1.18.1), [https://github.com/eclipse-m2e/m2e-core/issues](https://github.com/eclipse-m2e/m2e-core/issues))
    * (Buildship (Gradle) 3.1.5: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.6), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.20→**4.21**: [Eclipse 4.21 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.21/platform.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_21.xml#themes_and_priorities), [Git](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/log/), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.1: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.39: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.21→**1.22**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 5.12→**5.13**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.13)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.13), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.13.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.13.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.11.5→**0.12.0**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.11.5...0.12.0)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.1.3 [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-4-2)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.15→**0.16.2**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#change-log)
    * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.22→**3.23**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.23&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.23/NewAndNoteworthy/)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.3→**10.4**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.4.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn104)
        * [Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.1.2: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.0.0...v6.1.2-202102181132), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.1.2-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/)
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.12: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.18→**0.19**: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), [review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.19.0-release-review))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.1: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.1-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#041)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.0→**1.2.1**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.1-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java**
    * [Java 17 support via Marketplace](https://marketplace.eclipse.org/content/java-17-support-eclipse-2021-09-421)
        * Coverage already built in (by EclEmma 3.1.5 containing [JaCoCo 0.8.7](https://www.jacoco.org/jacoco/trunk/doc/changes.html))
    * Java editor:
        * [Content assist fixed/improved: missing proposals in Eclipse 2020-06 (4.20)](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574913) caused by a [major change](https://git.eclipse.org/r/c/jdt/eclipse.jdt.core/+/178809) made a bit late before the last release to fix a bug and to improve the handling of incomplete code (see [how this happened](https://bugs.eclipse.org/bugs/show_bug.cgi?id=573853#c6))
        * [_Raw Paste_](https://www.eclipse.org/eclipse/news/4.21/jdt.php#raw-paste) disables _Smart Insert_ (preferences: _Java > Editor > Typing_)
            * Code snippet: no adjusting of indentation, no updating of imports
            * Into string literal: no escaping of quotes (`\"`) and line breaks (e.g. `\r\n`)
        * [New quick assist _Convert while to do/while_](https://www.eclipse.org/eclipse/news/4.21/jdt.php#while-to-do-while) provided only when condition  is known to be initially `true`
        * (New quick fixes:
            * [_Change project compliance and JRE to 14_ for multi-constant switch-case labels](https://www.eclipse.org/eclipse/news/4.21/jdt.php#change-compliance-jre-multi-constant-labels) (just mention it when enabling preview features by making a class _sealed_)
            * [_Declare '...' as permitted subtype of '...'_](https://www.eclipse.org/eclipse/news/4.21/jdt.php#add-to-permitted-types)
            * [_Declare '...' as direct super class/interface of '...'_](https://www.eclipse.org/eclipse/news/4.21/jdt.php#declare-as-super-interface))
        * [Refactoring _Extract Superclass_ improved](https://www.eclipse.org/eclipse/news/4.21/jdt.php#extract-superclass-enhancement) to support movement of uninitialized non-static final fields
    * Cleanups (+1; [AutoRefactor](https://github.com/JnRouvignac/AutoRefactor) merged into [Eclipse](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&query_format=advanced&short_desc=AutoRefactor&short_desc_type=allwordssubstr) by [Fabrice Tiercelin](https://projects.eclipse.org/projects/eclipse.jdt/elections/election-fabrice-tiercelin-committer-eclipse-java-development-tools-jdt))
        * _Performance_ (+1; formerly _Optimization_)
            * [_Use StringBuilder instead of StringBuffer_](https://www.eclipse.org/eclipse/news/4.21/jdt.php#stringbuffer-to-stringbuilder): if the option _Only for local variables_ is disabled, also fields and parameters will be converted, which might cause compiler errors in callers and which might alter the behavior since _StringBuffer_ is synchronized in contrast to _StringBuilder_
    * ([Find external annotations anywhere](https://www.eclipse.org/eclipse/news/4.21/jdt.php#external_annotations_all_locations) (adding [_Last NullPointerException_](https://github.com/lastnpe/eclipse-null-eea-augments) to the JRE works in a plain Java project, but in a [Maven](https://mvnrepository.com/artifact/org.lastnpe.eea/eea-all) project only for the system library, not for dependencies))
    * (Debug
        * [Evaluate variables in current execution stack](https://www.eclipse.org/eclipse/news/4.21/jdt.php#debug-intrim-eval))
    * ([Performance](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=574015&hide_resolved=0))
    * Default preferences:
        * [_Java > Appearance > Type Filters_ populated with `com.sun.*`, `java.awt.*`, ...](https://www.eclipse.org/eclipse/news/4.21/jdt.php#default-type-filters) (previously empty): will be ignored in content assist, _Organize Imports_, _Open Type_ and quick fix
        * [_Java > Editor > Content Assist > Favorites_: `org.mockito.ArgumentMatchers` added](https://www.eclipse.org/eclipse/news/4.21/jdt.php#mockitomatchers)
* **General**
    * [UI](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=574014&hide_resolved=0)
        * [View/editor close button polishing](https://www.eclipse.org/eclipse/news/4.21/platform.php#new-close-icon)
        * [Save Resources dialog: tells _Save ... of ..._ or _Don't Save_ instead of _Save Selected_](https://bugs.eclipse.org/bugs/show_bug.cgi?id=572939)
        * Dark Theme:
            * [Dark tooltips](https://www.eclipse.org/eclipse/news/4.21/platform.php#eclipse-win-dark-themed-tooltips)
            * [Content assist background color now same as in file tree](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566280)
            * [Print margin gray instead of red](https://bugs.eclipse.org/bugs/show_bug.cgi?id=573634) ...and by default disabled in JEE again
    * ([Performance](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=574015&hide_resolved=0): starts a bit faster (Java IDE in 6.x seconds, 0.2..0.6s less))
    * ([Install/Update: remember accepted licenses](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574622))
    * ([Number of recently opened files can now increased from 20 to 100](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574061))
* **Git**
    * [_Compare Editor_ in file tree section which is shown when comparing multiple files](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.13#Compare_Editor)
        * Compact tree → less space
        * _Collapse/Expand All_ buttons in the upper right (right-menu provides only _Expand All_)
        * _Show In > ..._ in right-click menu (content depends on the perspective)
        * _Compare With Each Other_ in right-click menu when two files are selected (useful when a file has been renamed or moved, shown as a deleted file and an added file instead of a moved file due to changes made in addition to the move)
    * (_History_ view in right click menu, _Compare with Working Tree_ also enabled when multiple files are selected)
    * [_Git Repositories_ view: right-click menu](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.13#New_Comparison_Commands):
        * _Compare with Working Tree_ for a branch, a tag or another reference
        * _Compare With > ..._ for files and folders in the working tree(options: _HEAD Revision_; _Branch, Tag, or Reference..._; _Commit..._)
        * ([_Show In > System Explorer_ also for repository node](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574144) (in right-click menu disabled, but _Show In System Explorer_ command works via _Find Actions_ (Ctrl+3)))
    * [_Show Revision Information_ will updated whenever the HEAD of that repository changes](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.13#Blame), e.g. when switching the branch or when changes of the currently shown file are committed
    * ([Signing: `GNUPGHOME` is used if present](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.13#GPG) (instead of default locations; can be overridden by `-Djgit.gpg.home=...`))
    * (UI: [Fetch wizard polishing/simplification](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575566) (right-click repository > _Remote > Fetch..._))
    * (Performance: [Change singletons to enumeration literals](https://git.eclipse.org/c/egit/egit.git/commit/?id=a3c2f76211643062a0529a7afc8474345f39994e))
* **Web**
* **(Under development)**
    * ([Apple silicon](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565690): [IDE packages](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575680) have to wait for the Java 17 HotSpot VM and native libraries of CDT and maybe of others)
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))
    * ([Implemented "openDoc" to open the given URL in an external browser](https://github.com/eclipse/wildwebdeveloper/commit/9f742827d63237a0deb9311971cecbe33e4db558) for ESLint Quick Fix (Ctrl+1) _Show documentation for ..._)

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
