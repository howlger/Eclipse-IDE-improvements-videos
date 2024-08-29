<sup>Past releases:
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

# [Eclipse IDE 2024-06 Improvements Video](https://youtu.be/jTaiDGVwygE)

* [June 12, 2024](https://calendar.google.com/calendar/event?eid=MWwxdHBmMmQyanUxNnV0aWswYTA4aWFvbmEgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2024-06) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/3963)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2024-06/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2024-06), [release](http://download.eclipse.org/releases/2024-06))
* Social media: [X/Twitter](https://twitter.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.31→**4.32**: [Eclipse 4.32 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.32/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.32/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 22](https://jdk.java.net/22/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/47?closed=1)
        * [Java 23](https://jdk.java.net/23/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/69?closed=1) - [already supported in _New Java Project_ dialog?](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/1349)
        * [Drop support of older Java versions?](https://github.com/eclipse-jdt/eclipse.jdt.core/discussions/820)
    * (EclEmma (Java code coverage) 3.1.8→**3.1.9**: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 2.6.0→**2.6.1**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#261), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.6.0...2.6.1), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * (LemMinx-Maven 0.11.1 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.11.1), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.0...0.11.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.9: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.9), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.31→**4.32**: [Eclipse 4.32 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.32/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.32/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.10.3: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.2.0→[**4.3.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/6?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.32→**1.33**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2024-06), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
* (J**Git**/EGit 6.9→**6.10**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/6.10.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/6.10.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.3→**1.3.6**: [GitHub](https://github.com/https://github.com/eclipse-wildwebdeveloper/wildwebdeveloperwebdeveloper), [release notes](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/RELEASE_NOTES.md#136), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.3...1.3.6)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.2.2→**5.4.5** [releases](https://github.com/microsoft/TypeScript/releases), announcement [5.3](https://devblogs.microsoft.com/typescript/announcing-typescript-5-3)/[5.4](https://devblogs.microsoft.com/typescript/announcing-typescript-5-4)
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.27.0 ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper.xml/pom.xml#L40-L43)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0270-august-3-2023))
        * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.10.3→**0.12.0**: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.12.0), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.10.3...0.12.0)
        * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.25.0→**0.26.2**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.25.0...0.26.2), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.26.2))
        * [LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.22.0→**0.23.1**: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.22.0...v0.23.1), [review](https://projects.eclipse.org/projects/technology.lsp4j)
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.33→**3.34**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
* (C/C++, PHP)
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.5.0→**11.6.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.6.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_5_0...CDT_11_6_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.5.0→**6.6.0**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.5.0...v6.6.0), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.6.0-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.2.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.2_](https://github.com/eclipse-pdt/pdt/wiki/NewIn82))


### Features to show

* **Java [📽️](https://youtu.be/jTaiDGVwygE?t=17)**
    * [Eclipse 2024-06 (4.32) requires and is shipped with Java 21](https://www.eclipse.org/setups/sponsor/?campaign=2024-06)
    * **[Java 22 support](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/47?closed=1)** ([`JavaSE-23` is offered as execution environment by mistake](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/1448))
        * [JEP 456: Unnamed Variables & Patterns](https://openjdk.org/jeps/456): `_` is only allowed in the following cases, not e.g. in a method declaration (`new Consumer<Object>() { @Override public void accept(Object _) { ... }  };` → compile error):
            * Unnamed lambda parameter: `Consumer<String> progress = _ -> System.out.println('.');`
            * Unnamed exception parameter: `try { ... } catch (Exception _) { ... }`
            * Unnamed pattern: `switch ... case Point(var x, var _)`
            * Unnamed local variable: `for (Item _ : items) total++;`
    * Java editor
        * [New Quick Assist: _Split try resource expressions into inner try-with-resources_](https://eclipse.dev/eclipse/news/4.32/jdt.php#split-try-with-resources)
        * [New Quick Assist: _Extract anonymous class declaration to local_](https://eclipse.dev/eclipse/news/4.32/jdt.php#extract-anonymous-class)
        * [Improved Quick Assist: _Use 'MessageFormat/String.format' for string concatenation_](https://eclipse.dev/eclipse/news/4.32/jdt.php#message-format-text-block) for multi-line concatenation to use a text block when using Java 15 or higher
        * [New refactor function: _Encapsulate Fields..._](https://eclipse.dev/eclipse/news/4.32/jdt.php#batch-encapsulate-fields) replaces/enhances _Encapsulate Field..._ for multiple fields
        * [Ctrl+hover menu for a type now also with _Open Call Hierarchy_](https://eclipse.dev/eclipse/news/4.32/jdt.php#types-call-hierarchy-on-ctrl-click) - [seems to work for record and enum types, but not for class types](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/1367#issuecomment-2143788876)
        * ([Record accessor completion](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/1227): `record X1(int foo) { foo| }`)
    * [Clean-up improved: _Unnecessary Code: Remove overridden assignment_](https://eclipse.dev/eclipse/news/4.32/jdt.php#combine-decl-and-assignment) to join a variable declaration that is immediately followed by an assignment (e.g. `int count; count = 0;` → `int count = 0;`)
    * [Javadoc hover and view: Coloring and improved formatting for type parameters](https://eclipse.dev/eclipse/news/4.32/jdt.php#javadocStylingImprovements): coloring can be disabled or configured via new button
    * (**Maven<!-- [📽️](https://youtu.be/jTaiDGVwygE?t=188)-->**)
    * (**Gradle<!-- [📽️](https://youtu.be/jTaiDGVwygE?t=000)-->**)
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2024-03-05..2024-06-10&s=committer-date&o=desc&type=Commits))
* **General/Platform [📽️](https://youtu.be/jTaiDGVwygE?t=302)**
    * [TextMate Language Pack provides syntax highlighting](https://github.com/eclipse/tm4e/tree/main/org.eclipse.tm4e.language_pack) for  [61 languages and formats](https://github.com/eclipse/tm4e/blob/9b43c93cbf881e2b840a663fcb0b8caa5363a338/org.eclipse.tm4e.language_pack/README.md#supported-fileformats) ([initial contribution](https://github.com/eclipse/tm4e/pull/374); included via [Eclipse Wild Web Developer](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/commit/796ae273669719c5deb208dcf045ab5d23cc8cbf))
    * [Compare Editor with syntax highlighting](https://eclipse.dev/eclipse/news/4.32/platform.php#generic_editor_in_diff) powered by the Generic Editor and the TextMate Language Pack (from the tm4e project)
    * ([UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2024-03-05..2024-06-10&s=committer-date&type=Commits))
        * ([Keep theme coloring of cells in FocusCellOwnerDrawHighlighter](https://github.com/eclipse-platform/eclipse.platform.ui/commit/229d768ff1fecd095fdde4224de5ae9675236055))
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2024-03-05..2024-06-10&s=committer-date&o=desc&type=Commits))
        * ([Simplify SafeFileInputStream: avoid streaming/wrapping: just read the whole file at once; ~200ms faster startup for platform workspace](https://github.com/eclipse-platform/eclipse.platform/commit/9bac4117943933b5f4319e43a94f791d49051fb4))
        * ([SafeFileOutputStream: remember the hash of content to avoid read on save when content hash did not change (~50ms slower)](https://github.com/eclipse-platform/eclipse.platform/commit/8911e2dafaf1044fb28b671bcf2d9b931cdcbc45))
        * ([Do not normalize locations that are already normalized](https://github.com/eclipse-platform/eclipse.platform/commit/a9889fa757c2aee62a551e616fea0e64b13cdd08))
    * (**Mylyn**)
* (**Git<!-- [📽️](https://youtu.be/jTaiDGVwygE?t=000)-->**)
* **Web [📽️](https://youtu.be/jTaiDGVwygE?t=370)**
    * TypeScript 5.4 support, e.g. [`NoInfer` utility type](https://devblogs.microsoft.com/typescript/announcing-typescript-5-4/#the-noinfer-utility-type)
    * JavaScript/TypeScript tooling:
        * [Checks for super property accesses on instance fields](https://devblogs.microsoft.com/typescript/announcing-typescript-5-3/#checks-for-super-property-accesses-on-instance-fields)
        * [Preserved Narrowing in Closures Following Last Assignments](https://devblogs.microsoft.com/typescript/announcing-typescript-5-4/#preserved-narrowing-in-closures-following-last-assignments) avoids false-positive _Property '...' does not exist on type ..._ errors
        * [Quick fix for adding missing parameters: _Add missing/optional parameters..._](https://devblogs.microsoft.com/typescript/announcing-typescript-5-4/#quick-fix-for-adding-missing-parameters)
* (**Under development**)
    * ([Windows on Arm64 (WoA)](https://eclipse.dev/eclipse/news/4.32/platform.php#winows-on-arm): Eclipse SDK already available, but no IDE packages due to missing Eclipse Temurin JDKs (years ago done in OpenJDK in [JEP 388](https://openjdk.org/jeps/388), but [no OpenJDK JDK 23 Windows/AArch64 early-access builds](https://jdk.java.net/23/); [Microsoft OpenJDK 21 Windows AArch64/ARM64](https://learn.microsoft.com/en-us/java/openjdk/download#openjdk-21)))
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on June 12, 2024+++ ` )
