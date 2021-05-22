<sup>Past releases:
[2020-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2021-03)
[2020-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-12)
[2020-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-09)
[2020-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-06)
[2020-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-03)
[2019-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-12)
[2019-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-09)
[2019-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-06)
</sup>

# [Eclipse IDE 2021-06](https://wiki.eclipse.org/Category:SimRel-2021-06) Improvements Video
<p style="background:#ffc;padding:0.2em;text-align:center">+++ work in progress +++</p>

* [June 16, 2021](https://www.google.com/calendar/event?eid=NGlyZWg3dXE0NTl1MXBqM2tuY2d2dWZsa2cgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [70 projects](https://projects.eclipse.org/releases/2021-06) ([-0 +0 → 70](projects_diff.txt)) - [Website](https://eclipse.org/eclipseide/2021-06) ([New & Noteworthy](https://eclipse.org/eclipseide/2021-06/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=569333)
* [Latest CI builds](https://download.eclipse.org/technology/epp/staging/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2021-06), [release](http://download.eclipse.org/releases/2021-06))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.19→**4.20**: [Eclipse 4.20 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.20/jdt.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_20.xml#themes_and_priorities), Git [core](https://git.eclipse.org/c/jdt/eclipse.jdt.core.git/log/) [UI](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/log/)
        * [Java 16](https://jdk.java.net/16/): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=565620&hide_resolved=0), [examples](https://wiki.eclipse.org/Java16/Examples)
    * (EclEmma (Java code coverage) 3.1.4: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.17.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=m2e&query_format=advanced&order=changeddate%20DESC&target_milestone=1.17.2), [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#1172), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.16.2-release-review))
    * (Buildship (Gradle) 3.1.5: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.5) → [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.20→**4.20**: [Eclipse 4.20 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.20/platform.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_20.xml#themes_and_priorities), [Git](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/log/), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.1→**1.9.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.38→**3.0.39**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.20→**1.21**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 5.11→**5.12**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.12)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.12), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.12.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.12.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.11.5→**0.11.6**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.11.5...0.11.6)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.1.3→**4.2?** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-4-2)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.15→**0.16.2?**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#change-log)
    * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.21→**3.22**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.22&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.22/NewAndNoteworthy/)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.2→**10.3**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.3.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn103)
        * [Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.1.2: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.0.0...v6.1.2-202102181132), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.1.2-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/)
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.10→**0.12**: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.18: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), ([review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.15.0-release-review)))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.1: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.1-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#041)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.1.1→**1.2.0**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.0-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java**
    * Java 16
    * Cleanups (+12; [AutoRefactor](https://github.com/JnRouvignac/AutoRefactor) merged into [Eclipse](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&query_format=advanced&short_desc=AutoRefactor&short_desc_type=allwordssubstr) by [Fabrice Tiercelin](https://projects.eclipse.org/projects/eclipse.jdt/elections/election-fabrice-tiercelin-committer-eclipse-java-development-tools-jdt))
        * [Default Java cleanup profile with more cleanups](https://www.eclipse.org/eclipse/news/4.20/jdt.php#cleanup-profile-updated): ? -> 17 cleanups
        * Improved:
            * [_Use String.replace()_](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/commit/?id=c6297368f09953947ef1f8f8a9856ffd830c6e72)
            * _Simplify lambda expression_:
                * [Better detect type of method](https://bugs.eclipse.org/bugs/show_bug.cgi?id=572692)
                * [Prefer type ref to method ref to avoid compile error](https://bugs.eclipse.org/bugs/show_bug.cgi?id=572334)
                * [Handle type ref for self class](https://bugs.eclipse.org/bugs/show_bug.cgi?id=572495)
            * [_Merge conditions of if/else if/else that have the same blocks_ to apply also for nested if/else](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/commit/?id=dc0ea9671cf07383c1acb383525756d89a5f54e5)
            * [_Static inner class_ to handle generics](https://bugs.eclipse.org/bugs/show_bug.cgi?id=572716)
            * ...
        * _Java Feature_ (+1)
            * [_Replace system property with constant_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#replace-system-properties)
        * _Source Fixing_ (+0)
        * _Code Style_ (+1)
            * [_Use instanceof keyword instead of Class.isInstance()_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#use-instanceof)
        * _Duplicate code_ (+3)
            * [_Replace (X && Y) || (X && Z) by (X && (Y || Y))_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#operand-factorization) Operand factorization when operands are passive and primitive
            * [_Single 'if' statement rather than duplicate blocks that fall through_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#one-falling-through-if)
            * [_Pull out a duplicate 'if' from an if/else_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#pull-out-if) when if conditions are passive
        * _Unnecessary Code_ (+4)
            * [_Boolean value rather than comparison_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#redundant-truth)
            * [_Use implicit comparator when possible_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#operand-factorization): removes anonymous class, lambda, `Comparator.comparing()`, `Comparator.naturalOrder()` and `null`
            * [_Create array with curly when possible_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#array-with-curly)
            * [_Remove variable assignment before return_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#return-without-assignment)
        * _Optimization_ (+3)
            * [_String.isBlank() rather than String.strip().isEmpty()_](https://bugs.eclipse.org/bugs/show_bug.cgi?id=573289) avoids the creation of an intermediate trimmed string
            * [_valueOf() rather than instantiation_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#valueof-rather-than-instantiation) (significantly less memory)
            * [_Primitive type rather than wrapper class_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#primitive-rather-than-wrapper)
    * Java editor:
        * [Quick fix _Create local variable_ improved](https://www.eclipse.org/eclipse/news/4.20/jdt.php#foreach-expression-type) to infer the type from an _foreach_ loop
    * [_Search_ view: _In Static Imports_ filter](https://www.eclipse.org/eclipse/news/4.20/jdt.php#search-filter-static-imports)
    * [_New Java Project_ dialog: create `module-info.java` option instead extra dialog](https://www.eclipse.org/eclipse/news/4.20/jdt.php#create-moduleinfo)
    * Performance:
        * ([No local history for derived files anymore](https://www.eclipse.org/eclipse/news/4.20/platform.php#history-for-derived-files))
    * Debug
        * [Debug hover for chain of variables](https://www.eclipse.org/eclipse/news/4.20/jdt.php#chain-fields)
        * [Launch configuration: _Copy_](https://www.eclipse.org/eclipse/news/4.20/jdt.php#copy-jars)
* **General**
    * [Terminal](https://wiki.eclipse.org/CDT/User/NewIn103#Terminal) (by CDT 10.3)
        * Open web link or file via Ctrl +  click
        * Local terminals remember working director, shell, arguments and other settings
    * [Quick Search mention max occurrences reached](https://www.eclipse.org/eclipse/news/4.20/platform.php#quick-text-search)
    * [Export certificate during installation](https://www.eclipse.org/eclipse/news/4.20/platform.php#export-certificate-at-install)
    * [UI](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=571203&hide_resolved=0)
    * [Performance improvements](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=571430&hide_resolved=0)
* **Git**
    * Performance:
* **Web**
    * Embedded language server updated:
        * TypeScript/JavaScript 4.2:
            * [Declare Missing Helper Function](https://devblogs.microsoft.com/typescript/announcing-typescript-4-2/#declare-missing-helper)
            * [Stricter Checks For The in Operator](https://devblogs.microsoft.com/typescript/announcing-typescript-4-2/#stricter-in-checks)
        * XML:
            * [Unclosed elements: easier to understand and to fix](https://github.com/eclipse/lemminx/issues/963)
    * WTP:
        * [HTML Snippets](https://www.eclipse.org/webtools/releases/3.22/NewAndNoteworthy/#HTML%20Snippets)
* **(Under development)**
    * ([Apple silicon](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565690))
    * ([Upgrade and improve Chromium support in SWT](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566608): no commits in last 3 month (see also [how to enable it](https://bugs.eclipse.org/bugs/show_bug.cgi?id=549585#c117)))
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))
    * ([Implemented "openDoc" to open the given URL in an external browser](https://github.com/eclipse/wildwebdeveloper/commit/9f742827d63237a0deb9311971cecbe33e4db558) for ESLint Quick Fix (Ctrl+1) _Show documentation for ..._)

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
