<sup>Past releases:
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

# [Eclipse IDE 2025-09 Improvements Video](https://youtu.be/xpyqX-AxEP0)

* [September 10, 2025](https://calendar.google.com/calendar/event?eid=MGRhOGN2a2tobzYwcWhjaTQ2cGpqOW5jcDYgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2025-09) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/5332)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2025-09/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2025-09), [release](http://download.eclipse.org/releases/2025-09))
* Social media: [X/Twitter](https://x.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

 * Java, Maven, Gradle
    * Java development tools (JDT) 4.36→**4.37**: [Eclipse 4.37 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.37/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.37/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 25](https://jdk.java.net/25/): issues [core](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/3822)/[UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/2160), [Marketplace?](https://marketplace.eclipse.org/search?search_api_fulltext=Java+25)
    * (EclEmma (Java code coverage) 3.1.10: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 2.9.0→**2.9.1**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#291), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.9.0...2.9.1), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * (LemMinx-Maven 0.12.0 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.12.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.1...0.12.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.9→**3.1.10**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.10), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
 * General
    * **Platform** 4.36→**4.37**: [Eclipse 4.37 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.37/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.37/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.12.1→**1.13.0**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.7.0→[**4.8.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/11?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.37→**1.38**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2025-09), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
 * (J**Git**/EGit 7.3→**7.4**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.4.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.4.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
 * (Web, XML)
     * ([Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.9→**1.3.10**: [GitHub](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper), [release](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/releases/tag/1.3.10), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.9...1.3.10))
        * (JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L6); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.7.2→**5.7.3** [releases](https://github.com/microsoft/TypeScript/releases), [5.6](https://devblogs.microsoft.com/typescript/announcing-typescript-5-6), [5.7](https://devblogs.microsoft.com/typescript/announcing-typescript-5-7))
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.28.0→**0.31.0** ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/target-platform/target-platform.target#L60-L64)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse-lemminx/lemminx/blob/main/CHANGELOG.md#0310-may-8-2025))
        * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.14.1: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.14.1), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.14.0...0.14.1))
        * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.27.4→**0.27.9**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.27.4...0.27.9), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.27.9))
        * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.24.0: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.23.1...v0.24.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.38→**3.39**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
 * (C/C++, PHP)
     * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 12.1.0→**12.2.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-12.2.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/cdt_12_1...cdt_12_2), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([CDT-LSP](https://github.com/eclipse-cdt/cdt-lsp) 3.2.0→**3.3.0**: [commits](https://github.com/eclipse-cdt/cdt-lsp/commits/main/), [releases](https://github.com/eclipse-cdt/cdt-lsp/releases))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.6.1: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.6.0...v6.6.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.6.1), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.2.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.2_](https://github.com/eclipse-pdt/pdt/wiki/NewIn82))


### Features to show

 * **Java 25 [📽️](https://youtu.be/xpyqX-AxEP0?t=17)**
     * Java 25 support [via Marketplace probably soon](https://marketplace.eclipse.org/search?search_api_fulltext=Java+25) ([branch](https://github.com/eclipse-jdt/eclipse.jdt.core/tree/BETA_JAVA25)/[update site](https://download.eclipse.org/eclipse/updates/4.37-Y-builds/))
 * **General/Platform [📽️](https://youtu.be/xpyqX-AxEP0?t=32)**
     * [_Compare With > Clipboard_ and _Replace With > Clipboard_](https://eclipse.dev/eclipse/markdown/?f=news/4.37/platform.md#comparereplace-with-clipboard)
     * [Sorting functionality for Quick Search results](https://github.com/eclipse-platform/eclipse.platform.ui/commit/0c268ac70cb38d68d405e479c3c85c888a4e14f4)
     * ([Multi-release compilation support](https://github.com/eclipse-jdt/eclipse.jdt.core/pull/3900) experimental/incubation, so better show it in the next release)
     * ([UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2025-06-05..2025-09-10&s=committer-date&type=Commits))
        * ([Toggle indicator in Windows 11 menus](https://eclipse.dev/eclipse/markdown/?f=news/4.37/platform.md#toggle-indicator-in-windows-11-menus))
        * ([Provide Search Capabilities for WebKit Browser on GTK+](https://eclipse.dev/eclipse/markdown/?f=news/4.37/platform.md#provide-search-capabilities-for-webkit-browser-on-gtk))
     * ([Support launching with a terminal console](https://eclipse.dev/eclipse/markdown/?f=news/4.37/platform.md#support-launching-with-a-terminal-console) → needs _Terminal Session Support_ to be installed from the Eclipse project which seems not be part of this simultaneous release)
     * (Debug)
         * ([_Breakpoints_ view menu: _Group By > Enablement_](https://eclipse.dev/eclipse/markdown/?f=news/4.37/platform.md#group-breakpoints-by-enablement) (general improvement): see Java below)
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2025-06-05..2025-09-10&s=committer-date&o=desc&type=Commits))
        * ([Avoid useless computation of getMatchingRegexpAssociated that uses Pattern (time consumming)](https://github.com/eclipse-platform/eclipse.platform/commit/7f4b9bcca0046a8fcc34c3d918123a82f8d1efe0))
 * **Java [📽️](https://youtu.be/xpyqX-AxEP0?t=132)**
     * Java editor (1/2)
        * [New quick fix: _Replace deprecated field_](https://eclipse.dev/eclipse/markdown/?f=news/4.37/jdt.md#new-quick-fixclean-up-to-replace-deprecated-fields): also as clean-up _Source Fixing > Replace deprecated field where possible_
     * Clean-ups
        * [New: _Source Fixing > Replace deprecated field where possible_](https://eclipse.dev/eclipse/markdown/?f=news/4.37/jdt.md#new-quick-fixclean-up-to-replace-deprecated-fields): see above
     * Java editor (2/2)
        * [Java-specific sticky scrolling](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/51a745491eee50750c9eaed215c5c903e6aa3498)
        * [Folding: Support overlapping start and end markers for custom folding regions](https://eclipse.dev/eclipse/markdown/?f=news/4.37/jdt.md#support-overlapping-start-and-end-markers-for-custom-folding-regions)
        * ([_Refactor > Extract Method..._ dialog with options for _final_ and _synchronized_](https://eclipse.dev/eclipse/markdown/?f=news/4.37/jdt.md#access-modifier-specification-added-to-extract-method))
     * Debug
        * [In the Java editor, in the right ruler right-click menu: _Toggle Triggerpoint_ and _Toggle Breakpoint with Hit Count_](https://eclipse.dev/eclipse/markdown/?f=news/4.37/jdt.md#toggle-triggerpoint-and-breakpoint-with-hit-count)
        * [_Breakpoints_ view menu: _Group By > Enablement_](https://eclipse.dev/eclipse/markdown/?f=news/4.37/platform.md#group-breakpoints-by-enablement) (general/platform improvement: see above)
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2025-06-05..2025-09-10&s=committer-date&o=desc&type=Commits))
        * ([More efficient, more modern, fast failing version of computation of the abstract contracts of an interface while deriving SAM](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/0eb7ed33a2e33e82a5670b0283fb1bb396d4029e))
     * (**Maven<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=242)-->**)
     * (**Gradle<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=311)-->**)
 * (**Git<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=000)-->**)
 * (**Web<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=000)-->**)
 * (**Under development**)
    * ([Initiative 31](https://github.com/swt-initiative31/): Prototyping work for candidate technology evaluation on Eclipse SWT)
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac), [commits](https://github.com/eclipse-jdt/eclipse.jdt.core/compare/master...eclipse-jdtls:eclipse-jdt-core-incubator:dom-with-javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on September 10, 2025+++ `)
