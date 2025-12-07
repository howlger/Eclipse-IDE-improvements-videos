<sup>Past releases:
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

# +++ Work in progress (for December 10, 2025) +++<br>Eclipse IDE 2025-12 Improvements Video <!--# [Eclipse IDE 2025-12 Improvements Video](https://youtu.be/xpyqX-AxEP0) -->

* [December 10, 2025](https://calendar.google.com/calendar/event?eid=MjB1bmEzZDY4bjdmdmc2cmR0YTBqbWdxdTggZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2025-12) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/5332)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2025-12/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2025-12), [release](http://download.eclipse.org/releases/2025-12))
* Social media: [X/Twitter](https://x.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

 * Java, Maven, Gradle
    * Java development tools (JDT) 4.37→**4.38**: [Eclipse 4.38 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.38/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.38/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 25](https://jdk.java.net/25/): issues [core](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/3822)/[UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/2160)
    * EclEmma (Java code coverage) 3.1.10→**3.1.11**: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC)
    * M2Eclipse (Maven) 2.9.1→**2.10.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#2100), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.9.1...2.10.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * (LemMinx-Maven 0.12.0 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.12.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.1...0.12.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.9→**3.1.10**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.10), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
 * General
    * **Platform** 4.37→**4.38**: [Eclipse 4.38 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.38/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.38/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.12.1→**1.13.0**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.8.0→[**4.9.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/12?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.38→**1.39**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2025-12), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
 * (J**Git**/EGit 7.4→**7.5**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.5.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.5.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
 * (Web, XML)
     * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.10→**1.4.0**: [GitHub](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper), [release](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/releases/tag/1.4.0), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.10...1.4.0)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L6); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.7.3→**5.9.3** [releases](https://github.com/microsoft/TypeScript/releases), [5.8](https://devblogs.microsoft.com/typescript/announcing-typescript-5-8), [5.9](https://devblogs.microsoft.com/typescript/announcing-typescript-5-9)
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.31.0 ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/target-platform/target-platform.target#L60-L64)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse-lemminx/lemminx/blob/main/CHANGELOG.md#0310-may-8-2025))
        * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.14.1→**0.17.1**: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.14.1), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.14.1...0.17.1)
        * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.27.9→**0.29.4**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.27.9...0.29.4), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.27.9)
        * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.24.0: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.23.1...v0.24.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.39→**3.40**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
 * (C/C++, PHP)
     * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 12.2.0→**12.3.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-12.3.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/cdt_12_2...cdt_12_3), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([CDT-LSP](https://github.com/eclipse-cdt/cdt-lsp) 3.3.0→**3.4.0**: [commits](https://github.com/eclipse-cdt/cdt-lsp/commits/main/), [releases](https://github.com/eclipse-cdt/cdt-lsp/releases))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.6.1: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.6.0...v6.6.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.6.1), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.2.0→**8.4.0**: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [release](https://github.com/eclipse-pdt/pdt/releases/tag/R8_4_0))


### Features to show

 * **Java<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=17)-->**
     * Java 25 support (IDE packages are not [shipped with Java 25](https://download.eclipse.org/justj/jres/25/updates/release/latest) due to the [current unavailability of the Eclipse Temurin Java 25 JDK for Windows on ARM](https://github.com/adoptium/aqa-tests/issues/6623#issuecomment-3596446956))
        * Coverage (via EclEmma 3.1.11 based on [JaCoCo 0.8.14](https://www.jacoco.org/jacoco/trunk/doc/changes.html))
        * Flexible Constructor Bodies [(JEP 513)](https://openjdk.org/jeps/513):
        * [Import module support](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#java-25-import-module-support) ([JEP 511](https://openjdk.org/jeps/511))
           * [_Organize Imports_](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#organize-imports) removes unused import module statements (but leaves imports that are required either because they are not part of the exported module classes or they are found in more than one package for the modules imported or they are static imports
           * [New clean-up: _Java Features > Java 25 > Use import module_](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/66872a9531a94069a9ce4eb929c7f6e02401b70d)
     * [JUnit 6.0 support](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#eclipse-support-for-junit-601): JUnit 5 and 6 are conceptually the same and similar in use, but incompatible, e.g. JUnit 6 requires Java 17 or higher; Platform, Jupiter and Vintage share the same 6.x version number; deprecated things has been removed
        * [When creating a new JUnit test case, you can choose now to add JUnit 5 or JUnit 6 library to the build path](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#add-junit-6-library-to-the-build-path)
        * [Make sure not to mix JUnit 5 and JUnit 6 since this can cause `Cannot find class 'org.junit.platform.commons.annotation.Testable' on project build path`](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#junit-5-and-junit-6-conflicts)
     * Markdown comments:
        * [Markdown comment templates](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#markdown-comment-templates) (requires Java 23 or higher): in preferences _Java > Code Style > Code Templates_, the new option _Use markdown comments where available_ needs to be enabled
        * [New formatter option: _Enable Markdown Javadoc formatting_](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/2447) (in addition to _Enable Classic Javadoc formatting_)
     * [Multi-release JAR support](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#multi-release-jar-compilation-support): In _Project > Properties: Java Build Path_, in tab _Source_, source folders with new _Release_ option; also supported by Maven integration (see below)
     * [_Open Type_ dialog: Wildcard search for non-all-upper-case camle-case inputs](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#open-type-dialog-enhancement): e.g. `OutMem` now finds `OutOfMemoryError` where in the past you need to type `out*mem` (but `OME` still not finds `OutOfMemoryError` in contrast to `OMEr`)
     * Clean-ups
     * [No more false positive access restriction warnings for methods inherited from a restricted class](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#changed-handling-of-access-restriction-for-inherited-methods)
     * [More accurate deprecation warnings](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#changed-handling-of-access-restriction-for-inherited-methods)
        * No more for implicitly deprecated members that are false positive according to the Java language specification
           * [New warning with default severity _info_ along with a quick](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#new-support-for-reacting-to-problem-reporting-changes) since it might cause issues in pending migration: _The enclosing type ... is deprecated, perhaps this member should be marked as deprecated, too?_
        * More deprecation warnings when using deprecated elements from within the same compilation unit (file)
        * New warnings for deprecated annotation elements
     * Debug
        * [Set breakpoint  for inline chained lambdas](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#breakpoint-support-for-inline-chained-lambdas)
        * [_Variables_ view: _Compare With Clipboard_](https://eclipse.dev/eclipse/markdown/?f=news/4.38/jdt.md#compare-variable-value-with-clipboard) to compare the actual (stringified) value of a variable with the content of the clipboard
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2025-09-05..2025-12-10&s=committer-date&o=desc&type=Commits))
        * ([Performance regression fix for Java editor folding](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/6c5c1b95179d1cf29fc8b9a398dfc536553edd9b))
     * **Maven<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=242)-->**)
        * [Multi-Release-JAR support](https://github.com/eclipse-m2e/m2e-core/blob/main/RELEASE_NOTES.md#multi-release-jar-support)
        * [Maven execution JRE used for tests](https://github.com/eclipse-m2e/m2e-core/blob/main/RELEASE_NOTES.md#maven-execution-jre-used-for-tests)

     * (**Gradle<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=311)-->**)
 * **General/Platform<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=32)-->**
     * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2025-09-05..2025-12-10&s=committer-date&type=Commits)
        * _Console_ view:
           * [_Open New Console View_ commands pins now both the active and newly opened _Console_ views](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#pin-the-console-view), ensuring their content remains visible during output processing
           * [Configurable elapsed time format](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#configurable-elapsed-time-display-in-console) in the preferences _Run/Debug > Console: Elapsed Time Format
        * [Monitor-specific UI scaling enhancements (Windows only)](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#enhancements-of-monitor-specific-ui-scaling-on-windows): [Performance](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#performance),  [Layouting](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#layouting), [Images and icons](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#images-and-icons), [Cursors](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#cursors)
        * ([Filters in dialogs at more places](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#new-filtering-options-in-preference-page), e.g. in the preferences _Version Control (Team) > File Content_, _Java > Editor > Templates_ and _Ant > Editor > Templates_)
     * ([Merging the JVM and the operating system trust stores](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#merging-the-jvm-and-the-operating-system-trust-stores))
     * (Debug)
         * [Prompt on debug launch with skipped breakpoints](https://eclipse.dev/eclipse/markdown/?f=news/4.38/platform.md#prompt-on-debug-launch-with-skipped-breakpoints))
     * ([Syntax highlighting for `.env` files via TextMate Language Pack](https://github.com/eclipse-tm4e/tm4e/commit/9d031aa2d062eb208eb1beb7faa299e6b215267e#diff-f7f7e747508279985e0cfd0f0319580a2d833d07ac16e32fda2de7b0796b4ba4))
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2025-09-05..2025-12-10&s=committer-date&o=desc&type=Commits))
        * ([LocationMap should use HashMap with TreeSet for better performance](https://github.com/eclipse-platform/eclipse.platform/commit/440accda0972c30b58b72e79ee8ff5382d5c3812))
        * ([Cache method calls in loops and optimize string](https://github.com/eclipse-platform/eclipse.platform.ui/commit/343fd57b98addd612e285e10c70be340e784d0b0))
 * (**Git<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=000)-->**)
     * ([_History_ view: Clear commits in history view when the path changes](https://github.com/eclipse-egit/egit/commit/9f1ea28288453bc5a754fa3c3f90fab403007042) (see [EGit issue #121](https://github.com/eclipse-egit/egit/issues/121))
     * ([Update UI elements sooner after checkout](https://github.com/eclipse-egit/egit/commit/3495c5ec5cebd3919eeaeb836db30295cde959aa) (see [EGit issue #114](https://github.com/eclipse-egit/egit/issues/114))
 * (**Web<!-- [📽️](https://youtu.be/xpyqX-AxEP0?t=000)-->**)
    * TypeScript 5.9 support, e.g. [support for `import defer ...`](https://devblogs.microsoft.com/typescript/announcing-typescript-5-9/#support-for-import-defer)
    * JavaScript/TypeScript tooling:
        * [Granular checks for branches in return expressions](https://devblogs.microsoft.com/typescript/announcing-typescript-5-8/#granular-checks-for-branches-in-return-expressions)
        * [Preserved computed property names in declaration files](Preserved Computed Property Names in Declaration Files)
 * (**Under development**)
    * ([Initiative 31](https://github.com/swt-initiative31/): Prototyping work for candidate technology evaluation on Eclipse SWT)
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac), [commits](https://github.com/eclipse-jdt/eclipse.jdt.core/compare/master...eclipse-jdtls:eclipse-jdt-core-incubator:dom-with-javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on September 10, 2025+++ `)
