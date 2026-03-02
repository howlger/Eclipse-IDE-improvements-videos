<sup>Past releases:
[2025-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2025-12)
[2025-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2025-09)
[2025-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2025-06)
[2025-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2025-03)
[2024-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2024-12)
[2024-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2024-09)
[2024-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2024-06)
[2024-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2024-03)
[2023-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2023-12)
[2023-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2023-09)
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

# +++ Work in progress (for March 11, 2026) +++<br>Eclipse IDE 2026-03 Improvements Video <!--# [Eclipse IDE 2026-03 Improvements Video](https://youtu.be/3GIT1n12nVA) -->

* [March 11, 2026](https://calendar.google.com/calendar/event?eid=N3J2NmtxdGpxczB0bXRqOGxuajdoNXRhc2ggZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2026-03) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/5332)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2026-03/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2026-03), [release](http://download.eclipse.org/releases/2026-03))
* Social media: [X/Twitter](https://x.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

 * Java, Maven, Gradle
    * Java development tools (JDT) 4.38→**4.39**: [Eclipse 4.39 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.39/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.39/jdt.md)), commits [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 26](https://jdk.java.net/26/): issues [core](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/4405)/[UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/2495), [Marketplace?](https://marketplace.eclipse.org/search?search_api_fulltext=Java+26)
    * (EclEmma (Java code coverage) 3.1.11: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 2.10.0→**2.11.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#2110), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.10.0...2.11.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * (LemMinx-Maven 0.12.0 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.12.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.1...0.12.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.10→**3.1.11**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.11), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
 * General
    * **Platform** 4.38→**4.39**: [Eclipse 4.39 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.39/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.39/platform.md)), commits [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.13.0: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.9.0→[**4.10.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/13?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.39→**1.40**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2026-03), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
 * (J**Git**/EGit 7.5→**7.6**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.6.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.6.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
 * (Web, XML)
     * ([Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.4.0: [GitHub](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper), [release](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/releases/tag/1.4.0), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.10...1.4.0))
        * (JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L6); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.7.3→**5.9.3** [releases](https://github.com/microsoft/TypeScript/releases), [5.8](https://devblogs.microsoft.com/typescript/announcing-typescript-5-8), [5.9](https://devblogs.microsoft.com/typescript/announcing-typescript-5-9))
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.31.0 ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/target-platform/target-platform.target#L60-L64)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse-lemminx/lemminx/blob/main/CHANGELOG.md#0310-may-8-2025))
     * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.17.1: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.14.1), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.14.1...0.17.1))
     * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.29.4→**0.30.0**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.29.4...0.30.0), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.27.9)
     * [LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.24.0→**1.0.0**: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.24.0...v1.0.0), [review](https://projects.eclipse.org/projects/technology.lsp4j)
     * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.40→**3.41**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
 * (Eclipse Plugin Development)
    * (**PDE** 4.38→**4.39**: [Eclipse 4.39 - New and Noteworthy - Plug-in Development Environment](https://www.eclipse.org/eclipse/news/4.39/pde.html) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.39/pde.md)), [commits](https://github.com/eclipse-pde/eclipse.pde/commits/master/))
 * (C/C++, PHP)
     * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 12.3.0→**12.4.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-12.4.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/cdt_12_3...cdt_12_4), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([CDT-LSP](https://github.com/eclipse-cdt/cdt-lsp) 3.4.0→**3.5.0**: [commits](https://github.com/eclipse-cdt/cdt-lsp/commits/main/), [releases](https://github.com/eclipse-cdt/cdt-lsp/releases))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.6.1→**6.7.0**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.6.1...v6.7.0), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.6.1), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.4.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [release](https://github.com/eclipse-pdt/pdt/releases/tag/R8_4_0))


### Features to show

 * **Java<!-- [📽️](https://youtu.be/3GIT1n12nVA?t=18)-->**
     * Java 26 support [via Marketplace](https://marketplace.eclipse.org/search?search_api_fulltext=Java+26) probably soon ([issue](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/4483)/[branch](https://github.com/eclipse-jdt/eclipse.jdt.core/tree/BETA_JAVA26)/[update site](https://download.eclipse.org/eclipse/updates/4.39-Y-builds/))
     * Java editor
        * [New Convert _Class to Record..._ quick assist and refactoring](https://eclipse.dev/eclipse/markdown/?f=news/4.39/jdt.md#new-convert-class-to-record-quick-assist--refactoring):
           * _Refactor > Convert Class to Record..._
           * Quick assist provided on classes that can be converted to a record, e.g. having getter for all fields
        * [New quick assist for JUnit test _Disable test with @Disabled_/_Enable test (remove @Disabled)_](https://eclipse.dev/eclipse/markdown/?f=news/4.39/jdt.md#new-disableenable-test-quick-assist)
        * Improved Markdown comments parsing (see commits [1](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/e7d99f86e30cd4fa4353598bd1cb00ee2949b145), [2](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/94b0ee95190fd187072f228bbd4b347fc4608a0a), [3](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/66b7a608bfd19bf4dc7b9edb04aa1a3431910c0f), [4](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/bb146311f62866ed6a90ec9f503aa94aefbc7edc))
        * [Improved null analysis: less false positive warnings](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/184ea87508aeafd1581ebc64b25a6fd926eecef0)
        * ([Annotation quick fix hover with _Show Javadoc_](https://eclipse.dev/eclipse/markdown/?f=news/4.39/jdt.md#show-javadoc-from-annotationquick-fix-hover), since the annotation hover took precedence and blocked the usual Javadoc pop-up for the element)
        * ([Folding support for _Java > Editor > Only show the selected Java element_](https://eclipse.dev/eclipse/markdown/?f=news/4.39/jdt.md#folding-with-showing-selected-java-elements))
        * ([Offer _Add missing @Deprecated annotation_ quick fix also in enums](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/33772cdf34f609f5464cd25b3f158d56405cda88) (the quick fix has been introduced in the previous release))
        * ([Fix quick-fixes to not add static for well-known JUnit annotations](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/f99d557fdfc92a1d89e9e3881854e7d2e75ad253))
     * Java formatter
        * [Improved formatting of Markdown Javadoc comments](https://eclipse.dev/eclipse/markdown/?f=news/4.39/jdt.md#support-for-markdown-syntax-in-java-comment-formatting) (introduced in the last release)
     * Debug
        * [Improved highlighting for inline chained lambdas](https://eclipse.dev/eclipse/markdown/?f=news/4.39/jdt.md#improved-highlighting-for-inline-chained-lambdas)
        * [Drag and drop variables and expressions into the Debug Shell](https://eclipse.dev/eclipse/markdown/?f=news/4.39/jdt.md#drag-and-drop-variables-and-expressions-into-the-debug-shell)
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2025-12-05..2026-03-10&s=committer-date&o=desc&type=Commits))
        * ([Avoid duplicated read of file attributes in ExternalFoldersManager](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/7f2f38b17607e8d06970e8f5ef34ae7be348bc2b))
     * (**Maven<!-- [📽️](https://youtu.be/3GIT1n12nVA?t=555)-->**)
        * ([Embedded Maven updated from 3.9.11 to 3.9.12](https://github.com/eclipse-m2e/m2e-core/blob/main/RELEASE_NOTES.md#embedded-and-use-maven-3912))
     * (**Gradle<!-- [📽️](https://youtu.be/3GIT1n12nVA?t=311)-->**)
 * **General/Platform<!-- [📽️](https://youtu.be/3GIT1n12nVA?t=600)-->**
     * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2025-12-05..2026-03-10&s=committer-date&type=Commits)
        * [Dynamic _Console_ view icon](https://eclipse.dev/eclipse/markdown/?f=news/4.39/platform.md#dynamic-console-view-icon): Can be disabled in the preferences _Run/Debug > Console_: _Update Console icon based on currently active page_
            * [_Console_ view menu: _Preferences..._](https://github.com/eclipse-platform/eclipse.platform/commit/f6b0597189bfdafd6e35924d6a5695cb99e4fbd7)
        * ([Preferences _General > Appearance > Colors and Fonts_: Descriptions for top-level categories](https://eclipse.dev/eclipse/markdown/?f=news/4.39/platform.md#improved-theme-descriptions-in-colors-and-fonts-preferences))
        * ([Equinox launcher scaling defaults (Windows only)](https://eclipse.dev/eclipse/markdown/?f=news/4.39/platform.md#equinox-launcher-scaling-defaults-windows-only))
    * LSP-based editors:
        * [Inline renaming](https://github.com/eclipse-lsp4e/lsp4e/commit/f5eb029e8d0631f75b322325b9a7d7eaa62ae311), e.g. in a XML file on an element name, hitting Ctrl+Alt+R allows to rename the element name directly without a dialog (same in JavaScript file to rename a variable)
        * ([Support for Github Markdown tables in text hovers](https://github.com/eclipse-lsp4e/lsp4e/commit/3ff7ca79d00fe4ffc01464a3e88ea419b2215d98))
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2025-12-05..2026-03-10&s=committer-date&o=desc&type=Commits))
        * (Use `String.replace()` instead of `String.replaceAll()` when possible: in [platform](https://github.com/eclipse-platform/eclipse.platform/commit/2446c7303c481f6e8ecc810729b8b2bcd7fd987d) and [platform.ui](https://github.com/eclipse-platform/eclipse.platform.ui/commit/7bb8891bf4f5268f1fb49e0531bc192672d7ce72))
 * **Git<!-- [📽️](https://youtu.be/3GIT1n12nVA?t=000)-->**
     * [New option: _Use notification instead of dialog for fetch result_](https://github.com/eclipse-egit/egit/commit/2ef313999cfc3d0508497bb26d14797ebfff78a2) in preferences _Version Control (Team) > Git > Confirmations and Warnings_, section _Show result dialogs after git remote operations_ (disabled by default)
     * [Sort tags in descending order in repository view](https://github.com/eclipse-egit/egit/commit/1745af181fca2aa0613244022b34d04633939454): Tags are usually used to tag releases, typically the most recent versions are more interesting hence sort them in descending order.
     * [_Git Staging_ view menu: _Reuse Compare Editor_ toggle](https://github.com/eclipse-egit/egit/commit/47e58c9d2053c255f172c4163950beed4326507d) (enabled by default)
     * [Support diff3 conflict style in merges](https://github.com/eclipse-jgit/jgit/commit/d4ceb3f8daf02a39d109921d08f79bf98774e925) `merge.conflictstyle=diff3`
 * (**Web<!-- [📽️](https://youtu.be/3GIT1n12nVA?t=674)-->**)
 * (**Under development**)
    * ([Initiative 31](https://github.com/swt-initiative31/): Prototyping work for candidate technology evaluation on Eclipse SWT)
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac), [commits](https://github.com/eclipse-jdt/eclipse.jdt.core/compare/master...eclipse-jdtls:eclipse-jdt-core-incubator:dom-with-javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on March 11, 2026+++ `)
