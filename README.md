<sup>Past releases:
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

# [Eclipse IDE 2024-12 Improvements Video](https://youtu.be/jTaiDGVwygE)

* [December 4, 2024](https://calendar.google.com/calendar/event?eid=MnJoYzFsOGk1Y3BocjNrYTY4NW9kdXNuODUgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2024-12) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/3963)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2024-12/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2024-12), [release](http://download.eclipse.org/releases/2024-12))
* Social media: [X/Twitter](https://x.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.33→**4.34**: [Eclipse 4.34 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.34/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.34/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 23](https://jdk.java.net/23/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/69?closed=1)
    * (EclEmma (Java code coverage) 3.1.9: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 2.6.2→**2.7.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#270), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.6.2...2.7.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * (LemMinx-Maven 0.11.1 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.11.1), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.0...0.11.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * Buildship (Gradle) 3.1.9→**3.1.10**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.10), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release)
* General
    * **Platform** 4.33→**4.34**: [Eclipse 4.34 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.34/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.34/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.10.3→**1.11.0**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.4.0→[**4.5.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/8?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.34→**1.35**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2024-12), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
* (J**Git**/EGit 7.0→**7.1**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.1.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.1.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.7→**1.3.9**: [GitHub](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper), [release notes](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/RELEASE_NOTES.md#139), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.7...1.3.9)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.5.4→**5.7.2** [releases](https://github.com/microsoft/TypeScript/releases), announcement [5.6](https://devblogs.microsoft.com/typescript/announcing-typescript-5-6), [5.7](https://devblogs.microsoft.com/typescript/announcing-typescript-5-7)
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.27.0→**0.28.0** ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper.xml/pom.xml#L40-L43)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0280-may-27-2024))
        * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.13.0→**0.14.0**: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.14.0), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.13.0...0.14.0)
        * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.26.2→**0.26.4**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.26.2...0.26.4), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.26.4))
        * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.23.1: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.22.0...v0.23.1), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.35→**3.36**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
 * (C/C++, PHP)
     * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.6.0→**11.6.1**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.6.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_6_0...CDT_11_6_1), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([CDT-LSP](https://github.com/eclipse-cdt/cdt-lsp) **2.0.0**: [commits](https://github.com/eclipse-cdt/cdt-lsp/commits/master/), [release](https://github.com/eclipse-cdt/cdt-lsp/releases/tag/CDT_LSP_2_0_0))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.6.0→**6.6.1**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.6.0...v6.6.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.6.1), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.2.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.2_](https://github.com/eclipse-pdt/pdt/wiki/NewIn82))


### Features to show

 * **IDE packages for additional platforms [📽️](https://youtu.be/J-oudd3UWmg?t=19)**:
     * **[Windows on ARM](https://github.com/eclipse-packaging/packages/issues/162)** (supported by the [Eclipse platform since the last release](https://download.eclipse.org/eclipse/downloads/drops4/R-4.32-202406010610/#PlatformRuntime) and now also by [OpenJDK](https://openjdk.org/jeps/388)/[Eclipse Temurin](https://adoptium.net/temurin/releases/?os=windows&arch=aarch64&version=21))
     * [Linux on RISC-V](https://github.com/eclipse-packaging/packages/issues/162) (supported by the Eclipse platform since this release; longer supported by [OpenJDK](https://openjdk.org/jeps/422)/Eclipse Temurin)
 * **Java[📽️](https://youtu.be/J-oudd3UWmg?t=45)**
     * [Java 23 support](https://eclipse.dev/eclipse/news/4.34/jdt.php#Java_23) (but IDE packages shipped with Java 21, the latest LTS version)
        * [JEP 467: Markdown Documentation Comments](https://openjdk.org/jeps/467), including [rendering in hover and _Javadoc_ view](https://eclipse.dev/eclipse/news/4.34/jdt.php#markdown-doc)
        * Preview features:
            * [JEP 476: Module Import Declarations (Preview)](https://openjdk.org/jeps/476), e.g. `import module java.desktop;` (with that, type import statements are only needed for ambiguous simple names, like `java.util.List` vs. `java.awt.List`)
            * [JEP 482: Flexible Constructor Bodies (Second Preview)](https://openjdk.org/jeps/482): In constructors, `super(...)` no longer needs to be the first statement
            * [JEP 477: Implicitly Declared Classes and Instance Main Methods (Third Preview)](https://openjdk.org/jeps/477): `void main() { println("Hello, World!"); }` is a minimal and complete "Hello, World!" application
     * Java editor
        * [New warning: _Unnecessary code > Value of lambda parameter is not used (22 or higher)_ with corresponding quick fix to configure its problem severity](https://eclipse.dev/eclipse/news/4.34/jdt.php#ui-unused-lambda-params)
        * [New quick fix: _Rename to unnamed variable_](https://eclipse.dev/eclipse/news/4.34/jdt.php#unused-to-unnamed-quickfix): when using Java 22 or above (see also corresponding clean-up bellow)
     * Clean-ups
         * [Enhanced: _Unnecessary Code > Unused code > Remove unused local variables_](https://eclipse.dev/eclipse/news/4.34/jdt.php#unused-to-unnamed-quickfix): to rename to unnamed variable (`_`) where possible and when using Java 22 or above (unused lambda parameters, _try-with-resources_ resources, pattern variables in _switch_ and variables in enhanced as well as in regular _for_ statements)
         * [New: _Code Style > Control statements > Simplify boolean if/else to single return if possible_](https://eclipse.dev/eclipse/news/4.34/jdt.php#boolean-if-else-cleanup): `if (...) { return true; } else { return false; }` → `return ...;`
         * ([Enhanced: _Code Style > Control statements > Convert if/else if/else chain with 3 blocks min to switch_](https://eclipse.dev/eclipse/news/4.34/jdt.php#if-else-to-switch-null-handling) to properly handle cases where the value can be `null`: Java 20 and lower (`if (... != null) { switch (...) { ... } } else { ... }`) vs. Java 21 and higher (`case null: ...` thanks to [JEP 441](https://openjdk.org/jeps/441)))
     * [_Call Hierarchy_ view: new filter button](https://eclipse.dev/eclipse/news/4.34/jdt.php#move-filter-button) with new option [to show test code only](https://eclipse.dev/eclipse/news/4.34/jdt.php#new-filter-options) (_Filter Test Code_ became _Hide Test Code_ or _Test Code only_)
     * [Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2024-09-05..2024-12-10&s=committer-date&o=desc&type=Commits)
         * (Faster _Project > Clean..._ via [BatchImageBuilder: write .class files in batches](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/334703df1992132f62da0a3370f47492b99ae613))
         * ([Avoid reading SourceFile twice](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/55d99cde490111cad4874bc05eec03397ca5bc0e))
         * ([In the preferences _Java > Installed JREs > Execution Environments_, faster switching of the JRE](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/2884) (via [Share JRT entries across projects](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/2884) and [Faster `ExecutionEnvironmentsPreferencePage.performOk()`](https://github.com/eclipse-jdt/eclipse.jdt.debug/commit/c14e32ffe3e7b1bea78f2585a3f3c00d08993083)))
     * (**Maven<!-- [📽️](https://youtu.be/J-oudd3UWmg?t=328)-->**)
     * **Gradle [📽️](https://youtu.be/J-oudd3UWmg?t=311)**
         * [Problems API integration](https://discuss.gradle.org/t/buildship-3-1-10-is-now-available/49045): disabled by default; can be enabled in the preferences _Gradel > Experimental features: Enable Problems API support_, e.g. to get problem messages from `javac`, but not e.g. [from this _Modernizer Gradle plugin_](https://github.com/andygoossens/gradle-modernizer-plugin/issues/7) (experimental; see also [commit](https://github.com/eclipse/buildship/commit/ec8eee378138a446e95631f56baaf389405210fd))
         * ([Syntax highlighting in the compare editor for `build.gradle` files](https://github.com/eclipse/buildship/pull/1311))
 * **General/Platform [📽️](https://youtu.be/J-oudd3UWmg?t=364)**
     * Text editors
        * ([Syntax highlighting for many formats in all IDE packages via TM4E language pack](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2024-12))
        * ([Find/replace overlay: error marker for regular expressions](https://eclipse.dev/eclipse/news/4.34/platform.php#improved-regex-handeling))
     * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2024-09-05..2024-12-10&s=committer-date&type=Commits)
        * [On Windows, Monitor-specific scaling (experimental)](https://eclipse.dev/eclipse/news/4.34/platform.php#rescale-on-runtime-preference): disabled by default; can be enabled in _Window > Preferences: General > Appearance_
        * [Multi-page editors: Tabs at top or bottom](https://eclipse.dev/eclipse/news/4.34/platform.php#dynamic-tab-alignment): in preferences _General > Editors_ for _Align multi-page editor tabs_ choose _Top_ or _Bottom_
        * ([Code Mining text color configurable](https://eclipse.dev/eclipse/news/4.34/platform.php#code-minig-color))
        * ([Make Grey Highlight of Inactive Tabs Darker](https://github.com/eclipse-platform/eclipse.platform.ui/commit/8df2017769466ee8993656468e7ccb8fc99a5228))
        * ([On Windows, improvements to Edge browser](https://eclipse.dev/eclipse/news/4.34/platform.php#edge-browser-improvements))
     * [Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2024-09-05..2024-12-10&s=committer-date&o=desc&type=Commits)
        * Faster Quick Search: via [Parallel Quick Search](https://github.com/eclipse-platform/eclipse.platform.ui/commit/8d8da43c0baf9f7dab9ca7f3fcf818d7d62cdd1f) and [QuickTextSearcher avoid streaming](https://github.com/eclipse-platform/eclipse.platform.ui/commit/a43889deed6bece2600069c81d5b2368d2d86137)
        * ([Search: fail fast for binary file types without opening the file](https://github.com/eclipse-platform/eclipse.platform.ui/commit/4af4df453fe6fb1de6d487975b987931eaeb9605))
        * ([Improve 'Replace All' performance](https://github.com/eclipse-platform/eclipse.platform.ui/commit/c9b34e44a6fa6d6619916e31f2c1fd0439cb5d71))
        * ([Delete Files of Directories in parallel](https://github.com/eclipse-platform/eclipse.platform/commit/6d514be2aca4b9be131184b63570fd4351c47c77))
        * ([Improve performance for large selection](https://github.com/eclipse-platform/eclipse.platform.ui/commit/5fb1fb4d790c1f65dec22997fbb4e38079b6b7a5))
 * (**Git<!-- [📽️](https://youtu.be/J-oudd3UWmg?t=000)-->**)
 * **Web [📽️](https://youtu.be/J-oudd3UWmg?t=470)**
    * TypeScript 5.7 support
    * JavaScript/TypeScript tooling (in JavaScript enable validation via `// @ts-check`):
        * [Correct `override` checks on computed properties](https://devblogs.microsoft.com/typescript/announcing-typescript-5-6/#correct-override-checks-on-computed-properties) (`override` in JavaScript via JSDoc: `/** @override */`)
        * [Checks for never-initialized variables](https://devblogs.microsoft.com/typescript/announcing-typescript-5-7/#checks-for-never-initialized-variables) (TypeScript only)
 * (**Under development**)
    * ([Initiative 31](https://github.com/swt-initiative31/): Prototyping work for candidate technology evaluation on Eclipse SWT)
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on December 4, 2024+++ ` )
