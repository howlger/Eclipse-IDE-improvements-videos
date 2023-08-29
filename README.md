<sup>Past releases:
[2023-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2023-06)
[2023-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2023-03)
[2022-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2022-12)
[2022-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2022-09)
[2022-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2022-06)
[2022-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2022-03)
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

# +++ Work in progress (for September 13, 2023) +++<br>Eclipse IDE 2023-09 Improvements Video <!--[Eclipse IDE 2023-09 Improvements Video](https://youtu.be/OQe_hafeuz8)-->

* [September 13, 2023](https://calendar.google.com/calendar/event?eid=MGczMmNxbHZoMDJhYWNpdTdvYjZ1MjI4a20gZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2023-09) - [wiki](https://wiki.eclipse.org/Category:SimRel-2023-09) - [website](https://eclipse.org/eclipseide/2023-09) ([New & Noteworthy](https://eclipse.org/eclipseide/2023-09/noteworthy)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/2336)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2023-09/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2023-09), [release](http://download.eclipse.org/releases/2023-09))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.28→**4.29**: [Eclipse 4.29 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.29/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.29/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 21](https://jdk.java.net/21/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/33?closed=1), [update site](https://download.eclipse.org/eclipse/updates/4.29-P-builds/P20230720-0450/), [Marketplace?](https://marketplace.eclipse.org/search/site/Java%252021)
    * (EclEmma (Java code coverage) 3.1.6: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 2.3.0: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#230), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/2.3.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.2.0...2.3.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * (LemMinx-Maven 0.7.2: [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.7.2), [commits](https://github.com/eclipse/lemminx-maven/compare/0.7.1...0.7.2), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.7: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.7), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.28→**4.29**: [Eclipse 4.29 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.29/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.29/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.10.1: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 3.26.0→**[4.0.0](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/3?closed=1)**: [GitHub](https://github.com/eclipse-mylyn/org.eclipse.mylyn), [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * (Mylyn WikiText (Markdown editor, etc.) 3.0.47→**3.0.48**: [GitHub](https://github.com/eclipse-mylyn/org.eclipse.mylyn.docs), [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn.docs/compare/wikitext.core-3.0.47...wikitext.core-3.0.48))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.29→**1.30**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC)/[issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc), [Git](https://github.com/eclipse-oomph/oomph/commits/master))
    * (EPP: [issues](https://github.com/eclipse-packaging/packages/issues), [Git](https://github.com/eclipse-packaging/packages/commits/master))
* J**Git**/EGit 6.6→**6.7**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.7)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.7), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.7.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.7.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.1.1→**1.3.0**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#130), [commits](https://github.com/eclipse/wildwebdeveloper/compare/1.1.1...1.3.0)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.0.4→**5.1.6** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-5-1)
        * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.25.0→**0.27.0** ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper.xml/pom.xml#L40-L43)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0270-august-3-2023)
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.30→**3.31**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.31&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.31/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.2.0→**11.3.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.3.md), [release](https://github.com/eclipse-cdt/cdt/releases/tag/CDT_11_3_0), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_2_0...CDT_11_3_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.3.2→**6.4.0**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.3.1...v6.3.2), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.4.0-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.0.0→**8.1.0**: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.1_](https://github.com/eclipse-pdt/pdt/wiki/NewIn81))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.21.0→**0.21.1**: [GitHub](https://github.com/eclipse/lsp4j), [release](https://github.com/eclipse/lsp4j/releases/tag/v0.21.1), [commits](https://github.com/eclipse/lsp4j/compare/v0.21.0...v0.21.1), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.23.0: [GitHub](https://github.com/eclipse/lsp4e), [release](https://github.com/eclipse/lsp4e/releases/tag/0.23.0), [commits](https://github.com/eclipse/lsp4e/compare/0.21.0...0.23.0), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.23.0))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.6.2→**0.8.1**: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.8.1-release-review), [release notes](https://github.com/eclipse/tm4e/blob/main/RELEASE_NOTES.md#081), [commits](https://github.com/eclipse/tm4e/compare/0.6.2...0.8.1))


### Features to show

* **Java <!--[📽️](https://youtu.be/OQe_hafeuz8?t=17)-->**
    * [Java 21 support as preview/patch via Marketplace (probably shortly after Eclipse release)](https://marketplace.eclipse.org/search/site/Java%252021)
    * Java editor:
        * [Java Constant Hover](https://eclipse.dev/eclipse/news/4.29/jdt.php#java-constant-hover): for integer or float constants specified in binary, octal, or hex format
        * [Code completion improvements and fixes](https://github.com/search?utf8=%E2%9C%93&q=assist+OR+completion+OR+codecompletion+OR+intellisense+org%3Aeclipse-jdt+committer-date%3A2023-06-05..2023-09-10&s=committer-date&o=desc&type=Commits):
            * [Quick assist for deprecated method call](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/704): [example](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/687)
            * [Boost constructor parameters](https://github.com/eclipse-jdt/eclipse.jdt.core/pull/1103): [example](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/1102)
            * [Context-based name recommendation](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/655
            * [Code minings filters](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/457) (hard-coded)
        * [Quick fix: to convert an anonymous class improved](https://eclipse.dev/eclipse/news/4.29/jdt.php#lambda-cleanup-improvements): for examples see [tests](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/635/files#diff-b96d632fbc4a0ba97e97e168596307eb575e908d4c49873aac5b0893aebc60a4) (also as clean-up: see below)
    * [Clean-up: _Java Feature: Convert functional interface instances > Simplify lambda expression and method reference syntax_](https://eclipse.dev/eclipse/news/4.29/jdt.php#lambda-cleanup-improvements) (also as quick fix: see above)
    * [Improved _Ignore Whitespace_ in Java Compare](https://eclipse.dev/eclipse/news/4.29/jdt.php#ignoreWhitespace)
    * [JUnit: Show progress when searching test methods](https://eclipse.dev/eclipse/news/4.29/jdt.php#junit-search-progress)
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2023-06-05..2023-09-10&s=committer-date&o=desc&type=Commits):)
        * ([ClasspathJar: query length & lastModified together](https://github.com/eclipse-jdt/eclipse.jdt.core/pull/1246))
        * ([Improve indexing performance for .jar in classpath](https://github.com/eclipse-jdt/eclipse.jdt.core/pull/299))
        * ([FileHashing: avoid getCanonicalFile()](https://github.com/eclipse-jdt/eclipse.jdt.debug/commit/3f0dd5c661dfe1b017c5f8bdcff39ca9f8b5af44))
* **General/Platform<!--[📽️](https://youtu.be/OQe_hafeuz8?t=462)-->**
    * [Import more than one project at once](https://github.com/eclipse-platform/eclipse.platform/issues/226)
    * ([UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2023-06-05..2023-09-10&s=committer-date&type=Commits):)
        * ([Color preferences for form header messages](https://github.com/eclipse-platform/eclipse.platform.ui/issues/938) (instead of hard-coded colors))
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2023-06-05..2023-09-10&s=committer-date&o=desc&type=Commits):)
        * [AnnotationModel uses inefficient iteration over map](https://github.com/eclipse-platform/eclipse.platform.ui/issues/892)
        * [Update the marker in BasicMarkerUpdater::updateMarker in one operation](https://github.com/eclipse-platform/eclipse.platform.ui/commit/7da51e78950bfec17f05361f7d64cd817eb5b72c)
        * [Move calls to lock::isConflicting in DeadlocDetector to the end](https://github.com/eclipse-platform/eclipse.platform/commit/cebe637f94a94480c00b24f29d460ec163ba973c)
        * [Avoid redraw animation on StructuredViewer](https://github.com/eclipse-platform/eclipse.platform.ui/commit/3b9c02c4e1f8364bfb05f66fc5d046ab4d2ff8a2)
        * [Performance E4 Injector](https://github.com/eclipse-platform/eclipse.platform/pull/577)
    * [Enable 'Clear Console' key binding for all consoles](https://github.com/eclipse-platform/eclipse.platform/commit/78d2a8cc4955dce7be05966d7c18bb20b6931fdd)
    * ([Open New Workbench Window on Current Monitor](https://eclipse.dev/eclipse/news/4.29/platform.php#open-new-workbench-window-on-current-monitor))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded) - seems not yet supported by JDT)
    * (Mylyn:)
        * ([Rename Hudson connector to Jenkins connector](https://github.com/eclipse-mylyn/org.eclipse.mylyn/issues/63))
* **Web<!--[📽️](https://youtu.be/OQe_hafeuz8?t=366)-->**
    * [Vue.js support](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/issues/83)
    * [TypeScript 5.1](https://devblogs.microsoft.com/typescript/announcing-typescript-5-1)
        * ...
    * ECMAScript/JavaScript:
        * [Completions for `@param` JSDoc tags](https://devblogs.microsoft.com/typescript/announcing-typescript-5-1/#snippet-completions-for-param-jsdoc-tags)
        * [Implicit returns for `undefined`-returning functions](https://devblogs.microsoft.com/typescript/announcing-typescript-5-1/#easier-implicit-returns-for-undefined-returning-functions)?
        * React:
            * [Better type-checking between JSX elements and JSX tag types](https://devblogs.microsoft.com/typescript/announcing-typescript-5-1/#decoupled-type-checking-between-jsx-elements-and-jsx-tag-types)?
            *...?
        * _Generic Text Editor_ with language support (via LSP4E) for JavaScript, XML (except yet in the Maven POM editor), JSON, CSS, etc.:
            * ...
    * [New preferences _TextMate > Task Tags_](https://github.com/eclipse/tm4e/commit/75adb76aec66a1eed1f5131c54bab87ceda30844)
* (**Git<!--[📽️](https://youtu.be/OQe_hafeuz8?t=000)-->**)
    * ([SSH Connections support PKCS#11 Hardware Security Modules](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.7#SSH_Connections_support_PKCS.2311_Hardware_Security_Modules): see [Wikipedia](https://en.wikipedia.org/wiki/PKCS_11))
* **(Under development)**
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts`)
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([Syntax highlighting and more for various languages/formats via the tm4e language pack feature](https://github.com/eclipse/tm4e/pull/374))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on September 13, 2023+++ ` )
