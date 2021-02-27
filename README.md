<sup>Old releases:
[2019-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-06)
[2019-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-09)
[2019-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-12)
[2020-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-03)
[2020-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-06)
[2020-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-09)
[2020-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-12)
</sup>

# [Eclipse IDE 2021-03](https://wiki.eclipse.org/Category:SimRel-2021-03) Improvements Video
* [March 17, 2021](https://www.google.com/calendar/event?eid=NnNtbjdzMXJiZXRjN2lnYnNyZHV1azgwOTAgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [70 projects](https://projects.eclipse.org/releases/2021-03) ([-1 +0 → -1](projects_diff.txt)) - [Website](https://eclipse.org/eclipseide/2021-03) ([New & Noteworthy](https://eclipse.org/eclipseide/2021-03/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=553853)
* [Latest CI builds](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) ([log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2021-03), [release](http://download.eclipse.org/releases/2021-03))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.18→**4.19**: [Eclipse 4.19 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.19/jdt.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_19.xml#themes_and_priorities), Git [core](https://git.eclipse.org/c/jdt/eclipse.jdt.core.git/log/) [UI](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/log/)
        * [Java 16](https://jdk.java.net/16/) as preview via [Marketplace](https://marketplace.eclipse.org/content/java-16-support-eclipse-2021-03-419): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=565620&hide_resolved=0), [examples](https://wiki.eclipse.org/Java16/Examples)
    * (EclEmma (Java code coverage) 3.1.4: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.16.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=m2e&query_format=advanced&order=changeddate%20DESC&target_milestone=1.16.2), [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.16.2-release-review))
    * (Buildship (Gradle) 3.1.4: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.4) → [announcements](https://discuss.gradle.org/tag/buildship-release))
    * (WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.19→**3.20**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* General
    * **Platform** 4.19→**4.19**: [Eclipse 4.19 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.19/platform.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_18.xml#themes_and_priorities), [Git](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/log/), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.0→**1.9.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.38: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.17/18: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 5.10→**5.11**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.11)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.11.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.11.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.11.4→**0.11.5**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.11.4...0.11.5)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.0.5→**4.1.3** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-4-1/)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.14.1→**0.15**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#change-log)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.1→**10.2**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.2.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn102)
        * [Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.0→**6.1.2**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.0.0...v6.1.2-202102181132), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.1.2-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/)
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.9→**0.10**: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.16→**0.17**: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), ([review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.15.0-release-review)))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.1: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.1-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#041)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.1.0→**1.1.1**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.1.1-release-review))


### Features to show

* **Java**
    * [Java 16 support via Marketplace](https://marketplace.eclipse.org/content/java-16-support-eclipse-2021-03-419)
    * Java editor:
        * [Non-blocking Java code completion also in the _Eclipse IDE for Enterprise Java Developers_](https://www.eclipse.org/eclipse/news/4.16/jdt.php#default-non-blocking-completion)
        * Quick assists:
            * [Create try-with-resources](https://www.eclipse.org/eclipse/news/4.19/jdt.php#try-with-resources-quick-assist)
        * Quick fixes:
            * [Create permitted type declaration](https://www.eclipse.org/eclipse/news/4.19/jdt.php#create-permitted-type-declaration)
        * [Add catch clause to try-with-resources assists](https://www.eclipse.org/eclipse/news/4.19/jdt.php#add-catch-to-try-with-resources-assists)
    * Clean-up (+16; [AutoRefactor](https://github.com/JnRouvignac/AutoRefactor) merged into [Eclipse](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&query_format=advanced&short_desc=AutoRefactor&short_desc_type=allwordssubstr) by [Fabrice Tiercelin](https://projects.eclipse.org/projects/eclipse.jdt/elections/election-fabrice-tiercelin-committer-eclipse-java-development-tools-jdt))
        * [_Java Feature_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#java-feature) (+3; new tab)
            * [Java 15 with preview features: _Pattern matching for instanceof_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#pattern-matching)
            * [Java 8: _Use Comparator.comparing()_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#comparator-comparing)
            * [Java 7: _Use Multi-catch_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#multi-catch)
        * [_Source Fixing_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#source-fixing) (+2; new tab)
            * [_Avoid Object::equals or String::equalsIgnoreCase on null objects_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#invert-equals)
            * [_Compare to zero_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#comparison-zero)
        * _Code Style_ (+2)
            * [_Reduce indentation when possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#reduce-indentation)
            * [_Extract increment/decrement from statement_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#extract-increment)
        * _Duplicate code_ (+1)
            * [_Pull down common code from if/else statement_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#control-flow-merge)
        * _Unnecessary Code_ (+3)
            * [_Redundant String.substring() parameter_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#substring)
            * [_Unreachable block_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#unreachable-block)
            * [_Convert loop into if when possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#unlooped-while)
        * _Optimization_ (+5)
            * [_Convert fields into local variables if the use is only local_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#convert-fields)
            * [_Make inner classes static where possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#static-inner-class)
            * [_Use String.replace() instead of String.replaceAll() when possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#string-replace)
            * [_Primitive comparison_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#primitive-comparison)
            * [_Primitive parsing_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#primitive-parsing)
    * [Coloring of restricted identifiers](https://www.eclipse.org/eclipse/news/4.19/jdt.php#restricted-identifier-preference)
    * Formatter
        *
    * [Externally annotate sources](https://www.eclipse.org/eclipse/news/4.19/jdt.php#annotate-for-source-folders)
    * Debug
        * [Toggle tracepoints in editor ruler](https://www.eclipse.org/eclipse/news/4.19/jdt.php#toggle-tracepoints)
        * [Toggle breakpoint on a list of methods including abstract method](https://www.eclipse.org/eclipse/news/4.19/jdt.php#toggle-breakpoints-works-listofmethods-including-abstract)
    * Performance:
        * [Parallel index search](https://www.eclipse.org/eclipse/news/4.19/jdt.php#parallel-index-search)
        * Atomic marker API
    * ([JUnit 5.7.1](https://www.eclipse.org/eclipse/news/4.19/jdt.php#junit-5.7.1): see [release notes](https://junit.org/junit5/docs/5.7.1/release-notes/#release-notes-5.7.1/))
* **General**
    * TODO
* **Git**
    * TODO
* **Web**
    * TODO
* **(Under development)**
    * TODO

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
