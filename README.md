<sup>Past releases:
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

# [Eclipse IDE 2024-09 Improvements Video](https://youtu.be/u8llH82TfPc)

* [September 11, 2024](https://calendar.google.com/calendar/event?eid=MTNudGlsMjd1cWFoM2ZkdjY3bjJjbWs1Z2wgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2024-09) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/3963)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2024-09/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2024-09), [release](http://download.eclipse.org/releases/2024-09))
* Social media: [X/Twitter](https://twitter.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.32→**4.33**: [Eclipse 4.33 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.33/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.33/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 23](https://jdk.java.net/23/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/69?closed=1)
        * [Drop support of Java versions older than Java 8](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/2536)
    * (EclEmma (Java code coverage) 3.1.9→**3.1.10**: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 2.6.1→**2.6.2**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#262), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.6.1...2.6.2), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * (LemMinx-Maven 0.11.1 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.11.1), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.0...0.11.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.9: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.9), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.32→**4.33**: [Eclipse 4.33 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.33/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.33/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.10.3→**1.11.0**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.3.0→[**4.4.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/7?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.33→**1.34**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2024-09), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
* (J**Git**/EGit 6.10→**7.0**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy-7.0), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.0.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.0.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.6→**1.3.7**: [GitHub](https://github.com/https://github.com/eclipse-wildwebdeveloper/wildwebdeveloperwebdeveloper), [release notes](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/RELEASE_NOTES.md#137), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.6...1.3.7)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.4.5→**5.5.4** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-5-5)
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.27.0→**0.28.0** ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper.xml/pom.xml#L40-L43)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0280-may-27-2024))
        * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.12.0→**0.13.0**: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.13.0), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.10.3...0.12.0)
        * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.26.2→**0.26.4**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.26.2...0.26.4), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.26.4))
        * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.23.1: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.22.0...v0.23.1), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.34→**3.35**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
* (C/C++, PHP)
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.6.0→**11.7.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.7.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_6_0...CDT_11_7_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.6.0→**6.6.1**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.6.0...v6.6.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.6.1), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.2.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.2_](https://github.com/eclipse-pdt/pdt/wiki/NewIn82))


### Features to show

* **Java (1/2) [📽️](https://youtu.be/u8llH82TfPc?t=16)**
    * Java 23 support [as preview/patch via Marketplace maybe after it has been released](https://marketplace.eclipse.org/search?search_api_fulltext=Java+23) ([branch](https://github.com/eclipse-jdt/eclipse.jdt.core/tree/BETA_JAVA23) and [update site](https://download.eclipse.org/eclipse/updates/4.33-P-builds/P20240828-1240/) exist, but [composite update site](https://download.eclipse.org/eclipse/updates/4.33-P-builds/) is empty)
    * [No support of Java versions older than Java 8 anymore](https://eclipse.dev/eclipse/news/4.33/jdt.php#removed-support-for-java7-and-below) (see [details](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/2536); in _New Java Project_ dialog Java versions pull-down menu in reversed order: highest version on top now)
       * [Update older project by going to _Project > Properties: Java Compiler_ and hitting _Apply and Close_](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/95a365fc91472629e70e763516fb0576cddf4ee6#diff-75bddcdfd2484e74dd12777aa5f88c804a476cb214989f7363c5a654ef9eb0b1)
* **General/Platform (1/2) [📽️](https://youtu.be/u8llH82TfPc?t=93)**
    * Text editors
       * [Find/replace overlay](https://eclipse.dev/eclipse/news/4.33/platform.php#find-replace-overlay): enabled by default (option hidden when text editor is too small); can be disabled or moved to the bottom in the preferences _General > Editors > Text Editors_
       * [Sticky scrolling](https://eclipse.dev/eclipse/news/4.33/platform.php#sticky-scrolling): disabled by default; can be enabled in the preferences _General > Editors > Text Editors_
* **Java (2/2) [📽️](https://youtu.be/u8llH82TfPc?t=204)**
    * Java editor
        * ([Quick fix to change constructor type](https://eclipse.dev/eclipse/news/4.33/jdt.php#quickfix-change-constructor-type))
    * Clean-ups
        * [Improved: _Code Style: Convert if/else if/else chain with 3 blocks min to switch_](https://eclipse.dev/eclipse/news/4.33/jdt.php#enhanced-if-else-switch-cleanup) works now also for Strings and enums
        * [Improved: _Java Features > Java 15: Convert String concatenation to Text Block > Include StringBuffer or StringBuilder concatenations_](https://eclipse.dev/eclipse/news/4.33/jdt.php#enhnaced-stringbuf-to-text-block-cleanup) works now also without a final `toString()` on the `StringBuffer`/`StringBuilder`
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2024-06-05..2024-09-10&s=committer-date&o=desc&type=Commits))
        * ([Use new `IFile` API `IFile.readAllBytes()`/`readAllChars()`](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/18d9a53b48f3ecb3a700b286dde8727c3ae8a3e3))
* **General/Platform (2/2) [📽️](https://youtu.be/u8llH82TfPc?t=262)**
    * Debug
        * [Possibility to pin _Inspect_ pop-up](https://eclipse.dev/eclipse/news/4.33/platform.php#pin-debug-inspect-popup)
    * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2024-06-05..2024-09-10&s=committer-date&type=Commits)
        * [Preview version of improved light theme](https://eclipse.dev/eclipse/news/4.33/platform.php#new-light-theme)
        * ([Improvement to light and dark theme for Linux](https://github.com/eclipse-platform/eclipse.platform.ui/commit/e41945cce6a8f2ed49c783c58de425cf5ca310f6))
        * (Hover indicators added for tabs in views and editor - [light theme](https://github.com/eclipse-platform/eclipse.platform.ui/commit/c3ea86f3921d9ec3803ac53d9a69c01bddf14701) and [dark theme](https://github.com/eclipse-platform/eclipse.platform.ui/commit/1356bb314d4a8c25804f023263872c2f0c948b23))
        * (Improvement to the existing [light theme](https://github.com/eclipse-platform/eclipse.platform.ui/commit/387ec96abfebbf471fe1b79d0020275e29727ad2) and [dark theme](https://github.com/eclipse-platform/eclipse.platform.ui/commit/3678858b611d4c4428b5f5342a427d19de87fb3b))
        * ([Dark theme: Fix color of toolbar item for macOS only](https://github.com/eclipse-platform/eclipse.platform.swt/pull/1234) (not yet fixed on Windows))
        * ([Convert shared DnD icons from bmp to png and add 2x zoom variants](https://github.com/eclipse-platform/eclipse.platform.ui/commit/b502ad73786ead3e22c1cfc639c1671d7e953bc1))
        * (Code minings: unnecessary vertical spaces fixed on Windows (might be related to [multi lines code minings](https://eclipse.dev/eclipse/news/4.33/platform.php#multi-line-code-mining) or [Draw code minings at end of line before eol character if possible](https://github.com/eclipse-platform/eclipse.platform.ui/commit/1acae4f9333132ff94da8712908d3b185a165d74)))
        * ([Adapt close-hovering icon for notification API](https://github.com/eclipse-platform/eclipse.platform.ui/commit/991408d8354de3024f4e650a53badb8eaa82dac7))
    * ([New preference to show/hide active editor name](https://eclipse.dev/eclipse/news/4.33/platform.php#show-hide-editor-name))
    * ([Automatic link handler registration on macOS](https://eclipse.dev/eclipse/news/4.33/platform.php#link-handlers-on-mac))
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2024-06-05..2024-09-10&s=committer-date&o=desc&type=Commits))
        * ([Compare View for big files with Line Spacing freezes eclipse](https://github.com/eclipse-platform/eclipse.platform/commit/80fd47a8edc2915fd4b9fa8efc152881ca7f05e2))
        * ([Use `InputStream.transferTo()` instead of custom transfers](https://github.com/eclipse-platform/eclipse.platform/commit/cbfee1844b9a9df60424b56c5074378f869fbdfd))
        * ([Speed up `LocalFile.copy()` by using Java-NIO's `Files.copy()`](https://github.com/eclipse-platform/eclipse.platform/commit/034c7ccc662543ca902a8a95fef74cf71c6b3081))
        * ([Replace DosHandler by a Handler calling native functions via JNA](https://github.com/eclipse-platform/eclipse.platform/commit/317d41b4a3ced617791a5cce97689ae7ba343274))
        * ([Avoid 2nd file access on lightweightAutoRefresh](https://github.com/eclipse-platform/eclipse.platform/commit/9fa486f709df66134116aed0a7a94ba5b975b22b))
        * ([`IFile.write(byte[])`: reduce `store.fetchInfo()`](https://github.com/eclipse-platform/eclipse.platform/commit/31f4f9871349eea1af5b4bb77be22be364fb3763), [2](https://github.com/eclipse-platform/eclipse.platform/commit/c5603d23b5f8879bf018850fe89924c04288ed43))
    * (**Mylyn**)
* **Maven [📽️](https://youtu.be/u8llH82TfPc?t=328)**
    * [Environment variables, system properties, etc. used in JUnit launch configurations](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#surefirefailsafe-plugin-configuration-propagated-to-junittestng-launch-configuration): after editing, manually run _Maven > Update Project..._ to update existing run configurations ([documentation](https://maven.apache.org/surefire/maven-surefire-plugin/test-mojo.html))
    * [Embedded Maven updated from 3.9.7 to 3.9.9](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#embedded-and-use-maven-399)
* (**Gradle<!-- [📽️](https://youtu.be/u8llH82TfPc?t=000)-->**)
* (**Git<!-- [📽️](https://youtu.be/u8llH82TfPc?t=000)-->**)
    * ([Support of X.509 signatures on commits and tags if an external GPG is used](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy-7.0#x509-signatures))
* **Web [📽️](https://youtu.be/u8llH82TfPc?t=424)**
    * TypeScript 5.5 support
    * JavaScript/TypeScript tooling (in JavaScript enable validation via `// @ts-check`):
        * [Regular expression syntax checking](https://devblogs.microsoft.com/typescript/announcing-typescript-5-5/#regular-expression-syntax-checking4)
        * [Inferred type predicates](https://devblogs.microsoft.com/typescript/announcing-typescript-5-5/#inferred-type-predicates1)
* (**Under development**)
    * ([Windows on Arm64 (WoA)](https://eclipse.dev/eclipse/news/4.32/platform.php#winows-on-arm): Eclipse SDK already available, but no IDE packages due to missing Eclipse Temurin JDKs (years ago done in OpenJDK in [JEP 388](https://openjdk.org/jeps/388), but [no OpenJDK JDK 23 Windows/AArch64 early-access builds](https://jdk.java.net/23/); [Microsoft OpenJDK 21 Windows AArch64/ARM64](https://learn.microsoft.com/en-us/java/openjdk/download#openjdk-21)))
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on September 11, 2024+++ ` )
