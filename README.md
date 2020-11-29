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

* TODO

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
