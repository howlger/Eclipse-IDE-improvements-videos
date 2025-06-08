<sup>Past releases:
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

# +++ Work in progress (for June 11, 2025) +++<br>Eclipse IDE 2025-06 Improvements Video <!--# [Eclipse IDE 2025-06 Improvements Video](https://youtu.be/2p_9unQiSz4) -->

* [June 11, 2025](https://calendar.google.com/calendar/event?eid=NjBjaWZybWpkcDNhZGhuYjE4cWYxNnFkYnIgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2025-06) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/5332)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2025-06/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2025-03), [release](http://download.eclipse.org/releases/2025-06))
* Social media: [X/Twitter](https://x.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.35→**4.36**: [Eclipse 4.36 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.36/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.36/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 24](https://jdk.java.net/24/): issues [core](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/83?closed=1), [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/milestone/93?closed=1)
    * EclEmma (Java code coverage) 3.1.9→**3.1.10**: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC)
    * (M2Eclipse (Maven) 2.8.0→**2.9.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#290), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.8.0...2.9.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * (LemMinx-Maven 0.11.1→**0.12.0** ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.12.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.1...0.12.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.9→**3.1.10**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.10), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.35→**4.36**: [Eclipse 4.36 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.36/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.36/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.12.0→**1.12.1**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.6.0→[**4.7.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/10?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.36→**1.37**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2025-06), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
* J**Git**/EGit 7.2→**7.3**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.3.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.3.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master)
* Web, XML
    * ([Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.9: [GitHub](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper), [release notes](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/RELEASE_NOTES.md#139), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.7...1.3.9))
        * (JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.7.2 [releases](https://github.com/microsoft/TypeScript/releases), announcement [5.6](https://devblogs.microsoft.com/typescript/announcing-typescript-5-6), [5.7](https://devblogs.microsoft.com/typescript/announcing-typescript-5-7))
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.28.0 ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/target-platform/target-platform.target#L60-L64)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0280-may-27-2024))
        * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.14.1: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.14.1), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.14.0...0.14.1))
        * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.27.1→**0.27.4**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.27.1...0.27.4), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.27.4)
        * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.24.0: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.23.1...v0.24.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.37→**3.38**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
 * (C/C++, PHP)
     * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 12.0.0→**12.1.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-12.1.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_6_0...CDT_11_6_1), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([CDT-LSP](https://github.com/eclipse-cdt/cdt-lsp) 3.1.0→**3.2.0**: [commits](https://github.com/eclipse-cdt/cdt-lsp/commits/main/), [release](https://github.com/eclipse-cdt/cdt-lsp/releases/tag/CDT_LSP_3_0_0))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.6.1: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.6.0...v6.6.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.6.1), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.2.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.2_](https://github.com/eclipse-pdt/pdt/wiki/NewIn82))


### Features to show

 * **Java<!-- [📽️](https://youtu.be/2p_9unQiSz4?t=17)-->**
     * [Java 24 support](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#java-compiler) (but IDE packages shipped with Java 21, the latest LTS version)
        * No new language features, also no new preview language features
        * New APIs: Stream Gatherers ([JEP 485](https://openjdk.org/jeps/485)) and Class-File API ([JEP 484](https://openjdk.org/jeps/484))
        * New implementation of the quantum-resistant Module-Lattice-Based Key-Encapsulation Mechanism (ML-KEM): Key Encapsulation Mechanism ([JEP 496](https://openjdk.org/jeps/496)) and Digital Signature Algorithm ([JEP 497](https://openjdk.org/jeps/497))
     * Java editor
        * Folding:
           * [Folding for other code blocks enabled by default](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#new-folding-mechanism-as-default)
           * [Custom folding regions](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#custom-folding-regions)
           * [Project specific folding settings](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#project-properties-page-for-folding)
        * [Inline refactoring improved](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#inliner-improvements-for-lambdas): to inline a method into lambda expressions and method references works now also
        * ([Minimum indent support V2](https://github.com/eclipse-jdt/eclipse.jdt.core/pull/3795))
     * ([Move refactoring for Java files dialog now with filter field](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/2034))
     * Clean-ups
         * [New: _Unnecessary Code > Remove unnecessary suppress warnings tokens_](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#unnecessary-suppresswarnings-clean-up)
         * [_Java Feature > Java 21 > Pattern instanceof to Switch_](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#improved-pattern-instanceof-to-switch-clean-up): `if (... instanceof ...) { ...` → `switch (...) { case ... -> ...` (introduced in the previous version, but not shown in the video due some [limitations](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/2066))
     * Debug
        * [Collapsing stack frames](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#collapsing-stack-frames): disabled by default; can be enabled via the _Debug_ view menu _Java > Collapse Stack Frames_; collapses JRE/dependencies stack frames to focus on the project code
        * [_Variables_ view right-click menu: _Navigate to Declaration_](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#navigate-to-variable-declaration) to open the variable declaration
        * [Auto-resuming trigger points](https://eclipse.dev/eclipse/markdown/?f=news/4.36/jdt.md#auto-resuming-trigger-points) via the new _Continue execution on hit_ option available for trigger points: trigger point only to activate breakpoints without pausing at them
        * [Custom labels for breakpoints](https://eclipse.dev/eclipse/markdown/?f=news/4.36/platform.md#custom-labels-for-breakpoints) in _Breakpoints_ view via right-click menu _Label_; blank label to reset it to the default label (general/platform improvement: not only for Java)
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2025-03-05..2025-06-10&s=committer-date&o=desc&type=Commits))
         * ([Add Filter Mechanism for Target in Move Refactoring - with caching](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/2034))
     * (**Maven<!-- [📽️](https://youtu.be/2p_9unQiSz4?t=242)-->**)
     * (**Gradle<!-- [📽️](https://youtu.be/2p_9unQiSz4?t=311)-->**)
 * **General/Platform<!-- [📽️](https://youtu.be/2p_9unQiSz4?t=337)-->**
     * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2025-03-05..2025-06-10&s=committer-date&type=Commits)
        * [SVG icons](https://eclipse.dev/eclipse/markdown/?f=news/4.36/platform.md#support-for-svg-images)
        * ([Improved disabled icons](https://eclipse.dev/eclipse/markdown/?f=news/4.36/platform.md#improved-disabled-icons-generation))
        * [Monitor-specific UI scaling as default (Windows only)](https://eclipse.dev/eclipse/markdown/?f=news/4.36/platform.md#monitor-specific-ui-scaling-as-default-windows-only)
        * ([Prevent DevStyle Darkest Dark theme to be installed since it breaks Eclipse startup](https://github.com/eclipse-platform/eclipse.platform.ui/commit/84a34136650232cae539f9519ac6f4ea5b08d2cd))
     * [_Generic Code Editor_ as new default text editor](https://github.com/eclipse-platform/eclipse.platform.ui/commit/9d52b26c3f3d22eb91754ce673043227e5ce9318) instead of the _Plain Text Editor_; for new text files as well as for a new _Untitled Text File_
     * [Help view: _Link with Selection_](https://github.com/eclipse-platform/eclipse.platform/issues/1874): disable it to pin its content instead of displaying the related topics of the current active UI element
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2025-03-05..2025-06-10&s=committer-date&o=desc&type=Commits))
 * (**Git<!-- [📽️](https://youtu.be/2p_9unQiSz4?t=000)-->**)
     * ([Improved empty repositories view layout with enabled monitor specific scaling on Windows](https://github.com/eclipse-egit/egit/commit/9a77ad7a13bb5cb04b07cceec009410e1805f4a9))
     * ([Improved empty commit message detection](https://github.com/eclipse-egit/egit/commit/c0f2434f81d2c7755a7017e74d0dc1ce96b58309))
 * (**Web<!-- [📽️](https://youtu.be/2p_9unQiSz4?t=470)-->**)
 * (**Under development**)
    * ([Initiative 31](https://github.com/swt-initiative31/): Prototyping work for candidate technology evaluation on Eclipse SWT)
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on June 11, 2025+++ ` )
