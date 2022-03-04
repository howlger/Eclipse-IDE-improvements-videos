<sup>Past releases:
[2021-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2021-12)
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

# +++ Work in progress (for March 16, 2022) +++<br> Eclipse IDE 2022-03 Improvements Video

* [March 16, 2022](https://calendar.google.com/calendar/event?eid=MG5na2VxbGIzdTYxcW80MGFjbzZ2bW9nbnAgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [68 projects](https://projects.eclipse.org/releases/2022-03) ([-1 +0 → 68](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2022-03) - [website](https://eclipse.org/eclipseide/2022-03) ([New & Noteworthy](https://eclipse.org/eclipseide/2022-03/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=569333)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2022-03/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2022-03), [release](http://download.eclipse.org/releases/2022-03))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.22→**4.23**: [Eclipse 4.23 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.23/jdt.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_23.xml#themes_and_priorities), Git [core](https://git.eclipse.org/c/jdt/eclipse.jdt.core.git/log/) [UI](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/log/)
        * [Java 18](https://jdk.java.net/18/): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=575752&hide_resolved=0), [examples](https://wiki.eclipse.org/Java18/Examples)
    * (EclEmma (Java code coverage) 3.1.5: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 1.19.0→**1.20.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#1200), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.20.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/1.19.0...1.20.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * LemMinx-Maven 0.4.1→**0.5.0**: [release notes](https://github.com/eclipse/lemminx-maven/blob/master/RELEASE_NOTES.md#050), [commits](https://github.com/eclipse/lemminx-maven/compare/0.4.1...0.5.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * (Buildship (Gradle) 3.1.5: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.5), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.22→**4.23**: [Eclipse 4.23 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.23/platform.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_23.xml#themes_and_priorities), [Git](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/log/), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=Equinox&product=Platform&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.2→**1.9.3**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.41→**3.0.42**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.23→**1.24**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 6.0→**6.1**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.1)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.1.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.1.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.13.1→**0.13.3**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#0133), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.13.1...0.13.3)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.4.4→**4.5.5** [releases](https://github.com/microsoft/TypeScript/releases), announcements [4.5](https://devblogs.microsoft.com/typescript/announcing-typescript-4-5)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.18.1→**0.18.4**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#0184-february-01-2022)
    * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.24→**3.25**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.25&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.25/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/)
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.5→**10.6**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.6.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn106))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.1.2: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.0.0...v6.1.2-202102181132), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.1.2-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.12: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.20→**0.20.2**: [GitHub](https://github.com/eclipse/lsp4e), [changelog](https://github.com/eclipse/lsp4e/blob/master/CHANGELOG.md#0200), [commits](https://github.com/eclipse/lsp4e/compare/0.20.0...0.20.2), [review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.20.2-release-review)
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.2→**0.4.3**: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.3-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#043), [commits](https://github.com/eclipse/tm4e/compare/0.4.2...0.4.3)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.2→**1.2.3**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.3-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* TODO

* **(Under development)**
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
