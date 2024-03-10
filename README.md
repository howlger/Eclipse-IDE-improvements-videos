<sup>Past releases:
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

# [Eclipse IDE 2024-03 Improvements Video](https://youtu.be/jMJ7FBMxPgw)

* [March 13, 2024](https://calendar.google.com/calendar/event?eid=MXEwMm1zM2ExMnBwZWJwcjNyMnZkaTkyMHMgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2024-03) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/2336)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2024-03/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2024-03), [release](http://download.eclipse.org/releases/2024-03))
* Social media: [X/Twitter](https://twitter.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.30→**4.31**: [Eclipse 4.31 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.31/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.31/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 22](https://jdk.java.net/22/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/47?closed=1)
    * (EclEmma (Java code coverage) 3.1.8: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 2.5.0→**2.6.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#260), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/2.6.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.5.0...2.6.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * (LemMinx-Maven 0.11.0→**0.11.1** ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.11.1), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.0...0.11.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * Buildship (Gradle) 3.1.8→**3.1.9**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.9), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release)
* General
    * **Platform** 4.30→**4.31**: [Eclipse 4.31 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.31/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.31/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.10.2→**1.10.3**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * [Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.1.0→[**4.2.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/4?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main)
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.31: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2024-03), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
* (J**Git**/EGit 6.8→**6.9**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy-6.9)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy-6.9), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.9.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.9.0-release-review), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
* Web, XML
    * ([Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.3: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#133), [commits](https://github.com/eclipse/wildwebdeveloper/compare/1.3.0...1.3.3))
        * (JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.2.2 [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-5-2))
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.27.0 ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper.xml/pom.xml#L40-L43)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0270-august-3-2023))
        * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.8.1→**0.10.3**: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.8.1-release-review), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.8.1...0.10.3)
        * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.24.4→**0.25.0**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.24.4...0.25.0), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.24.8))
        * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.21.1→**0.22.0**: [GitHub](https://github.com/eclipse/lsp4j), [release](https://github.com/eclipse/lsp4j/releases/tag/v0.22.0), [commits](https://github.com/eclipse/lsp4j/compare/v0.21.1...v0.22.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.32→**3.33**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
* (C/C++, PHP)
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.4.0→**11.5.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.5.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_4_0...CDT_11_5_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.4.0→**6.5.0**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.4.0...v6.5.0), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.5.0-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.2.0→**8.3.0**: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.2_](https://github.com/eclipse-pdt/pdt/wiki/NewIn82))


### Features to show

* **Java [📽️](https://youtu.be/jMJ7FBMxPgw?t=16)**
    * Java 22 support [as preview/patch via Marketplace maybe after it has been released](https://marketplace.eclipse.org/search/site/Java%252021) ([branch](https://github.com/eclipse-jdt/eclipse.jdt.core/tree/BETA_JAVA22) exists, but [update site](https://download.eclipse.org/eclipse/updates/4.31-P-builds/) is yet empty)
    * Editor
        * [New Refactoring: _Make static_](https://eclipse.dev/eclipse/news/4.31/jdt.php#new-make-static-refactoring)
            * By the way, Compare Editor shows number of differences (see below)
        * [Analysis of resource leaks improved with the annotations `@Owning`/`@NotOwning`](https://eclipse.dev/eclipse/news/4.31/jdt.php#annotation-based-resource-analysis)
        * ([Support for code completion inside text block templates](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/1055): _String Templates_ still preview feature in Java 21 ([JEP 430](https://openjdk.org/jeps/430)) and Java 22 ([JEP 459](https://openjdk.org/jeps/459)))
    * Formatter:
        * [Switch statements/expressions: align arrows on column](https://eclipse.dev/eclipse/news/4.31/jdt.php#align-arrows)
    * **Mave [📽️](https://youtu.be/jMJ7FBMxPgw?t=188)**
        * [Improved toolchain.xml handling](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#improved-toolchainxml-handling): new preference _Maven > User Settings: User Toolchains_
        * [Project preference for automated Maven project configuration updates](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#project-preference-for-automated-maven-project-configuration-updates): _Automatically update Maven projects configuration_
        * ([Support of global and user settings in .mvn/maven.config](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#support-of-global-and-user-settings-in-mvnmavenconfig))
        * ([Improved resource linking](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#improved-resource-linking) (see also [commit](https://github.com/eclipse-m2e/m2e-core/commit/60e66fffd0758c4e94c49c0b7e0a2951582d44b3#diff-f622f7b2acc6da6d0be8a24fa90ff2b02f28b2c26200d5ead4361d286effdd8c)))
        * ([Embedded and use Maven 3.9.6](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#embedded-and-use-maven-396))
    * **(Gradle<!-- [📽️](https://youtu.be/jMJ7FBMxPgw?t=000)-->)**
        * ([Kotlin DSL editor support](https://github.com/eclipse/buildship/commit/fbc92bac13b73695671fc04105bb82047d50713e) via the update site https://download.eclipse.org/buildship/updates/latest/ (by Nikolai Vladimirov in the Google Summer of Code program))
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2023-12-05..2024-03-10&s=committer-date&o=desc&type=Commits):)
        * ([Remember non-existence of files](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/b2f56fbee3311425c351990cd8ca66d0ca73a940))
        * ([Increase JavaModelCache](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/d80b1bad9936c2a443a2d2499e9f69817ef6558e))
        * ([`final` and cache JavaElement members](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/4869388c3389ea51ff492a1129f1c442521c18da))
        * ([O(n) StringLiteral concatenation](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/ca12584201b5c03975f8a6b97a6fc45d089db47b))
        * ([Less calls to isInModuleDeclaration() and reorder costly conditions](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/6170f1e56b470f80e0596983ea3cc812a530da7a))
        * ([Faster TypeHierarchy](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/59f606863b506db2a7f56824420688e32f37630e))
        * ([Deduplicate "eclipse"](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/86aa2dd8738980fec8a7b1b0db179f1923fbcbdb) ([_"can be reproduced by renaming a class in Platform workspace to IPath"_](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/1743#issuecomment-1854653597)))
        * ([Cache JARs during UI Operations](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/fc6a25a6a1d46627eae34f4aeab98cafb71a5f70): improves performance of Call-Hierarchy, Type-Hierarchy, Hover, ...)
        * ([Batch reads in UI](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/9fb036c285a793408dcfdd03b2edbc5c3f771170))
* **General/Platform [📽️](https://youtu.be/jMJ7FBMxPgw?t=227)**
    * Windows Defender Exclusion Check
    * [Compare Editor: number of differences](https://eclipse.dev/eclipse/news/4.31/platform.php#Number_of_differences_shown)
    * [Default editor for a content type](https://github.com/eclipse-platform/eclipse.platform.ui/issues/1380): in preferences _General > Content Types_
    * [Open unassociated file with _Advanced Text Editor_](https://github.com/eclipse-platform/eclipse.platform.ui/issues/1380)
    * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2023-12-05..2024-03-10&s=committer-date&type=Commits)
        * [Light theme: highlighting of active editor/view](https://eclipse.dev/eclipse/news/4.31/platform.php#tab_highlight): similar to dark theme
        * ([On macOS, on hovering slightly different editor/view tab color](https://eclipse.dev/eclipse/news/4.31/platform.php#tab_hover))
        * [Options to hide view icons](https://github.com/eclipse-platform/eclipse.platform.ui/pull/1071): preferences _General > Appearance_
        * [Windows 11: The text editor font defaults now to _Consolas_](https://github.com/eclipse-platform/eclipse.platform.ui/commit/949383f81ba0d50e8eeab49d5e8f1ca3899a48f2)
        * [Maximum number of elements to show initial in views](https://eclipse.dev/eclipse/news/4.31/platform.php#viewer_limit_applied)
        * ([Showing resolved workspace path in launch dialog](https://eclipse.dev/eclipse/news/4.31/platform.php#tab_installation_details_features_filter) (_File > Switch Workspace > Other..._))
        * ([_Quick Search_: dialog title now with the query](https://eclipse.dev/eclipse/news/4.31/platform.php#display_search_pattern_in_Quick_Search_dialog))
        * ([_Installation Details_: Filter field for _Features_](https://eclipse.dev/eclipse/news/4.31/platform.php#tab_installation_details_features_filter))
        * ([improvement in progress bar consistency and smoothness](https://eclipse.dev/eclipse/news/4.31/platform.php#progress_bar_made_smooth_when_launching))
    * TextMate:
        * _WTP XML Classic_ theme
        * (Language configuration supports now also: _Indentation Rules_ and _Colorized Bracket Pairs_)
    * (Language support via LSP:)
        * ([Add missing keys for enabling go to next/previous annotation](https://github.com/eclipse/lsp4e/pull/910))
        * ([Closing quick outline dialog after selection](https://github.com/eclipse/lsp4e/pull/888))
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2023-12-05..2024-03-10&s=committer-date&o=desc&type=Commits):)
        * ([Linux: Speedup TreeItem retrieval by removing redundant iterations](https://github.com/eclipse-platform/eclipse.platform.swt/commit/42dd69529632c57467d7a8028485c74bcc97aceb))
        * ([Tree expand in reverse order](https://github.com/eclipse-platform/eclipse.platform.ui/commit/5930a51b59272ef620b4b7ab09e39d356912baa1))
    * (**Mylyn**)
* **(Git<!-- [📽️](https://youtu.be/jMJ7FBMxPgw?t=000)-->)**
* **(Web<!-- [📽️](https://youtu.be/jMJ7FBMxPgw?t=000)-->)**
* **(Under development)**
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([Syntax highlighting and more for various languages/formats via the tm4e language pack feature](https://github.com/eclipse/tm4e/pull/374))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on March 13, 2024+++ ` )
