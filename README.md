<sup>Past releases:
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

# +++ Work in progress (for June 14, 2023) +++<br>Eclipse IDE 2023-06 Improvements Video <!--[Eclipse IDE 2023-06 Improvements Video](https://youtu.be/JgMLyGBEQ1c)-->

* [June 14, 2023](https://calendar.google.com/calendar/event?eid=M25kMGtnbWlqc2ZoYTk2OXU3ZWw3cTgyNGUgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [? projects](https://projects.eclipse.org/releases/2023-06) ([-? +? → ?](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2023-06) - [website](https://eclipse.org/eclipseide/2023-06) ([New & Noteworthy](https://eclipse.org/eclipseide/2023-06/noteworthy)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/2336)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2023-06/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2023-06), [release](http://download.eclipse.org/releases/2023-06))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.27→**4.28**: [Eclipse 4.28 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.28/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.28/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 20](https://jdk.java.net/20/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/20?closed=1), [examples](https://wiki.eclipse.org/Java20/Examples)
    * (EclEmma (Java code coverage) 3.1.6: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 2.2.0→**2.3.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#230), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/2.3.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.2.0...2.3.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * LemMinx-Maven 0.7.1→**0.7.2**: [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.7.2), [commits](https://github.com/eclipse/lemminx-maven/compare/0.7.1...0.7.2), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * Buildship (Gradle) 3.1.6→**3.1.7**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.7), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release)
* General
    * **Platform** 4.27→**4.28**: [Eclipse 4.28 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.28/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.28/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [text](https://github.com/eclipse-platform/eclipse.platform.text/commits/master)
    * (Marketplace Client (MPC) 1.10.0→**1.10.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * Mylyn (task-focused UI) **3.26.0**: [GitHub](https://github.com/eclipse-mylyn/org.eclipse.mylyn), [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main)
    * (Mylyn WikiText (Markdown editor, etc.) 3.0.46→**3.0.47**: [GitHub](https://github.com/eclipse-mylyn/org.eclipse.mylyn.docs), [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn.docs/compare/wikitext.core-3.0.46...wikitext.core-3.0.47))
    * (Oomph 1.28→**1.28**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [issues](https://github.com/eclipse-packaging/packages/issues), [Git](https://github.com/eclipse-packaging/packages/commits/master)
* J**Git**/EGit 6.5→**6.6**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.6)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.6), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.6.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.6.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.0.2→**1.1.1**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#111), [commits](https://github.com/eclipse/wildwebdeveloper/compare/1.0.2...1.1.1)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.9.5→**5.0.4** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-5-0)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.23.0→**0.25.0** ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper.xml/pom.xml#L40-L43)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0250-april-18-2023)
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.29→**3.30**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.30&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.30/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.1.0→**11.2.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.2.md), [release](https://github.com/eclipse-cdt/cdt/releases/tag/CDT_11_2_0), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_1_0...CDT_11_2_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.3.1→**6.3.2**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.3.1...v6.3.2), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.3.2-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2.1→**8.0.0**: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn80))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.20.1→**0.21.0**: [GitHub](https://github.com/eclipse/lsp4j), [release](https://github.com/eclipse/lsp4j/releases/tag/v0.21.0), [commits](https://github.com/eclipse/lsp4j/compare/v0.20.1...v0.21.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.21.0→**0.23.0**: [GitHub](https://github.com/eclipse/lsp4e), [release](https://github.com/eclipse/lsp4e/releases/tag/0.23.0), [commits](https://github.com/eclipse/lsp4e/compare/0.21.0...0.23.0), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.23.0))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.6.2: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.6.2-release-review), [release notes](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#062), [commits](https://github.com/eclipse/tm4e/compare/0.6.0...0.6.2))
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.4: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.4-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java <!--[📽️](https://youtu.be/JgMLyGBEQ1c?t=18s)-->**
    * Java 20 support: language changes in preview features only
    * Java editor:
        * [Code completion improvements and fixes](https://github.com/search?utf8=%E2%9C%93&q=assist+OR+completion+OR+codecompletion+OR+intellisense+org%3Aeclipse-jdt+committer-date%3A2023-03-05..2023-06-10&s=committer-date&o=desc&type=Commits):
            * [`String[] lines = new |` proposes `String`](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/1021)
            * [Missing proposals for switch case labels in switch expressions inside lambda](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/697)
            * [Missing Ctrl+Shift+Space info for nested object constructors](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/969)
        * [_Open Call Hierarchy_ on Ctrl+click](https://www.eclipse.org/eclipse/news/4.28/jdt.php#call-hierarchy-on-ctrl-click)
        * [Quick fix: _Convert String concatenation to Text Block_](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/725) (also as clean-up: see below)
    * [Clean-up: _Java Feature: Convert String concatenation to Text Block > Include StringBuffer or StringBuilder concatenations_](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/435) (also as quick fix: see above)
    * (Java formatter:)
        * [New Javadoc HTML format option](https://www.eclipse.org/eclipse/news/4.28/jdt.php#new-javadoc-html-formatting-option)
    * [New preferences: _Java > Launching_](https://www.eclipse.org/eclipse/news/4.28/jdt.php#new-launch-config-name-preferences)
    * [Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2023-03-05..2023-06-10&s=committer-date&o=desc&type=Commits):
        * [Faster compilation for lambdas](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/ed4bdac88b5b96e7bbdebc86d54fff2bce23325e)
    * Maven <!--[📽️](https://youtu.be/JgMLyGBEQ1c?t=269s)-->:
        * [New warnings with quick fixes](https://github.com/eclipse/lemminx-maven/pull/362):
            * _GroupId is duplicate of parent groupId_
            * _Version is duplicate of parent version_
        * [Hover on property: link to open property declaration](https://github.com/eclipse/lemminx-maven/issues/370)
        * ([Embedded Maven updated from 3.8.7 to 3.9.1](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#embedded-and-use-maven-391))
        * ([Support for Java 20 and later](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#support-for-java-20-and-later))
        * ([Enhanced M2E Maven Target support](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#enhanced-m2e-maven-target-support))
    * Gradle <!--[📽️](https://youtu.be/JgMLyGBEQ1c?t=000s)-->:
        * [Smart Import](https://github.com/eclipse/buildship/issues/356)
        * ([`toolingAPI` compatibility checks](https://github.com/eclipse/buildship/pull/1161): [Gradle version has to be compatible with the Java version running Eclipse and the Java version running Gradle](https://github.com/eclipse/buildship/issues/1125#issuecomment-1004619371) (see [for each Java version unsupported Gradle versions](https://github.com/eclipse/buildship/blob/master/org.eclipse.buildship.core/src/main/resources/org/eclipse/buildship/core/internal/gradle/java-unsupported-gradle.properties))
* **Web <!--[📽️](https://youtu.be/JgMLyGBEQ1c?t=498s)-->**
    * [TypeScript 5.0](https://devblogs.microsoft.com/typescript/announcing-typescript-5-0) (language server requires Node.js 12.20 or higher (ECMAScript 2018) to run)
    * ECMAScript/JavaScript:
        * [Decorators](https://devblogs.microsoft.com/typescript/announcing-typescript-5-0/#decorators) (upcoming ECMAScript feature)
        * [`@overload` Support in JSDoc](https://devblogs.microsoft.com/typescript/announcing-typescript-5-0/#overload-support-in-jsdoc)
        * [`@satisfies` Support in JSDoc](https://devblogs.microsoft.com/typescript/announcing-typescript-5-0/#satisfies-support-in-jsdoc)
        * _Generic Text Editor_ with language support (via LSP4E) for JavaScript, XML (except yet in the Maven POM editor), JSON, CSS, etc.:
            * [_Select enclosing Element_/_Restore Last Selection_ (Alt+Shift+Up/Down)](https://github.com/eclipse/lsp4e/pull/562): expands/reduces selection (not supported in YAML)
            * [_Go to Matching Breaket_ (Alt+Shift+P)](https://github.com/eclipse/lsp4e/pull/562)
* **General/Platform<!--[📽️](https://youtu.be/JgMLyGBEQ1c?t=000s)-->**
    * [Mylyn task-focused UI](https://github.com/eclipse-packaging/packages/issues/19)
    * Security:
        * [Enforce HTTPS protocol (CVE-2021-41033)](https://www.eclipse.org/eclipse/news/4.28/platform.php#force-https)
        * [Track trusted hosts (CVE-2021-41037)](https://www.eclipse.org/eclipse/news/4.28/platform.php#trusted-authorities)
        * [PGP key revocation](https://www.eclipse.org/eclipse/news/4.28/platform.php#pgp-revocation)
        * [Improved untrusted artifact handling](https://www.eclipse.org/eclipse/news/4.28/platform.php#untrusted-artifacts)
    * [_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded)
    * ([UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2023-03-05..2023-06-10&s=committer-date&type=Commits):)
        * [Onboarding information in editor area](https://www.eclipse.org/eclipse/news/4.28/platform.php#editor-onboarding)
        * [Improve responsiveness of _Switch Workspace_ dialog](https://github.com/eclipse-platform/eclipse.platform.ui/pull/299)
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2023-03-05..2023-06-10&s=committer-date&o=desc&type=Commits):)
        * ([Resizing views with empty editor area slow, shows paint artifacts](https://github.com/eclipse-platform/eclipse.platform.ui/commit/2fd96fae6a3ff279611ba8ebf58ca97bddfa732f))
* (**Git<!--[📽️](https://youtu.be/JgMLyGBEQ1c?t=000s)-->**: no changes in the UI (EGit), performance improvements in the underlying Java implementation of Git (JGit), but no scenarios found where this can be reproduced via EGit)
* **(Under development)**
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([Syntax highlighting and more for various languages/formats via the tm4e language pack feature](https://github.com/eclipse/tm4e/pull/374))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on June 14, 2023+++ ` )
