<sup>Past releases:
[2026-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2026-06)
[2026-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2026-03)
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

# [Eclipse IDE 2026-09 Improvements Video](https://youtu.be/slu7xCKaSro)

* [September 9, 2026](https://calendar.google.com/calendar/event?eid=NHI4MGZvb3ByZjhqdGhoY2w0MHZlM2ZwZDkgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/2026-09/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/6906)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2026-09/) ([*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2026-09), [release](http://download.eclipse.org/releases/2026-09))
* Social media: [Mastodon](https://mastodon.social/@EclipseIDE), [X](https://x.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn)


### Sources

 * Java, Maven, Gradle
    * Java development tools (JDT) 4.40→**4.41**: [Eclipse 4.41 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.41/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.41/jdt.md)), commits [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 27](https://jdk.java.net/27/): issues [core](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/4951)/[UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/2885) [Marketplace?](https://marketplace.eclipse.org/search?search_api_fulltext=Java+27)
    * (EclEmma (Java code coverage) 3.1.11→**3.1.12**: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 2.11.1→**2.12.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/main/RELEASE_NOTES.md#2120), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.11.1...2.12.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * (LemMinx-Maven 0.12.0 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.12.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.1...0.12.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.10→**3.1.11**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.11), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
 * General
    * **Platform** 4.40→**4.41**: [Eclipse 4.41 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.41/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.41/platform.md)), commits [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * [Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.13.0→**1.13.1**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues)
    * [Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.11.0→[**4.12.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/15?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main)
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.41→**1.42**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issues](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2026-09), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues)
 * J**Git**/EGit 7.7→**7.8**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.8.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.8.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master)
 * Web, XML
     * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.4.0→**1.4.1**: [GitHub](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper), [release](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/releases/tag/1.4.1), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.4.0...1.4.1)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L6); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.9.3→**6.0.3** [releases](https://github.com/microsoft/TypeScript/releases), [6.0](https://devblogs.microsoft.com/typescript/announcing-typescript-6-0)
        * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.31.0→**0.31.2** ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/target-platform/target-platform.target#L60-L64)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse-lemminx/lemminx/blob/main/CHANGELOG.md#0312-june-8-2026)
     * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.17.2→**0.18.0**: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.18.0), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.17.2...0.18.0)
     * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.30.5→**0.30.8**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.30.5...0.30.8), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.30.8)
     * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 1.0.0: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.24.0...v1.0.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
     * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.42→**3.43**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/)
 * (Eclipse Plugin Development)
    * (**PDE** 4.40→**4.41**: [Eclipse 4.41 - New and Noteworthy - Plug-in Development Environment](https://www.eclipse.org/eclipse/news/4.41/pde.html) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.41/pde.md)), [commits](https://github.com/eclipse-pde/eclipse.pde/commits/master/))
 * (C/C++, PHP)
     * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 12.5.0→**12.6.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-12.6.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/cdt_12_5...cdt_12_6), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([CDT-LSP](https://github.com/eclipse-cdt/cdt-lsp) 3.6.0→**3.7.0**: [commits](https://github.com/eclipse-cdt/cdt-lsp/commits/main/), [releases](https://github.com/eclipse-cdt/cdt-lsp/releases))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.7.0→**6.8.0**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.7.0...v6.8.0), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.8.0), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.4.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [release](https://github.com/eclipse-pdt/pdt/releases/tag/R8_4_0))


### Features to show

 * **Java [📽️](https://youtu.be/slu7xCKaSro?t=17)**
     * Java 27 support [via Marketplace](https://marketplace.eclipse.org/search?search_api_fulltext=Java+27) probably soon ([issue](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/4946)/[branch](https://github.com/eclipse-jdt/eclipse.jdt.core/tree/BETA_JAVA27)/[update site](https://download.eclipse.org/eclipse/updates/4.41-Y-builds/))
     * [Eclipse IDE now requires and is shipped with Java 25](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2026-09)
        * For Windows on ARM (AArch64/ARM64), the [Microsoft JDK 25.0.4.1](https://learn.microsoft.com/en-us/java/openjdk/download#openjdk-25041-lts--see-previous-releases) is shipped as there is still no [Eclipse Adoptium Temurin JDK 25.0.4.1+1 for Windows AArch64](https://github.com/adoptium/temurin25-binaries/releases/tag/jdk-25.0.4.1%2B1)
     * [New wizard: _New > Compact Source File_](https://eclipse.dev/eclipse/markdown/?f=news/4.41/jdt.md#jep-512-create-compact-source-files-from-the-new-java-wizard) ([JEP 512](https://openjdk.org/jeps/512)): requires Java 25 or higher, e.g. `void main() { IO.println("Hello, World!"); }`; Note: If the active workspace was created with an older Eclipse version, the menu item will not show up in _File > New_; as a workaround, use the _Find Actions_ (Ctrl+3) or reset the current perspective (_Window > Perspective > Reset Perspective_)
     * Java editor
        * [Open types and methods within the same editor in a new, cloned editor](https://eclipse.dev/eclipse/markdown/?f=news/4.41/jdt.md#open-types-and-methods-in-a-new-editor-from-hyperlinks)
        * [New quick assist: _Convert Enhanced 'for' loop to 'forEach'_](https://eclipse.dev/eclipse/markdown/?f=news/4.41/jdt.md#enhanced-for-loop-to-foreach-quick-assist) ([pull request](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/3002))
     * ([_Open Type_ dialog: _Default wildcard (*) between camel case sections_ checkbox](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/3109) which is enabled by default to preserve the same behavior as before)
     * [New Java formatter option: _New Lines > After annotations > On record components_](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/3072) for whether annotations on record components, such as in `record Box(@Deprecated @SuppressWarnings("rawtypes") List items) {}`, should be formatted either inline or each on a separate line
     * ([UI: More icons in the _Navigate_ menu](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/3046))
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2026-06-05..2026-09-10&s=committer-date&o=desc&type=Commits))
        * ([Use Hash Lookup in OutlineTreeViewer](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/3009))
        * ([Improve performance](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/67256f986a442c728dee08d6884909292ae74d06))
     * (**Maven<!-- [📽️](https://youtu.be/slu7xCKaSro?t=000)-->**)
     * (**Gradle<!-- [📽️](https://youtu.be/slu7xCKaSro?t=000)-->**)
 * **General/Platform [📽️](https://youtu.be/slu7xCKaSro?t=180)**
     * [Text filter in _Problems_, _Bookmarks_, _Markers_ and _Tasks_ views](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#text-filter-for-problems-tasks-bookmarks-and-markers-views): shown by default; can be toggled in the view menu _Show text filter_
     * [_Console_ view: zoom in and out](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#zoom-in-and-out-in-the-console-view) via `Ctrl`+`+` / `Ctrl`+`-`
     * _Terminal_ view
        * [Reorder terminal tabs by drag and drop](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#reorder-terminal-tabs-by-drag-and-drop)
        * [New preference to disable reopening terminals after restart](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#disable-reopening-terminals-after-restart) in the preferences > _Terminal_, _Reopen terminals after restart_; enabled by default to preserve the same behavior as before 
     * _Find/Replace_ overlay (Ctrl+F) in text editors:
        * [Customizable key bindings](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#customizable-key-bindings-for-the-findreplace-overlay) when the find/replace overlay is focused (only for find/replace overlay, not for the classic find/replace dialog)
        * ([Content assist for regular expressions](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#content-assist-for-regular-expressions-in-the-findreplace-overlay-available-in-all-editors))
     * [Compare editor: Unified diff](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#unified-diff-in-the-compare-editor): disabled by default; can be enabled in the preferences _General > Compare/Patch > EXPERIMENTAL: Use Unified Diff instead of 2-way compare when possible_
     * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2026-06-05..2026-09-10&s=committer-date&type=Commits)
        * [Unsaved changes indicator on tabs is now the default](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#unsaved-changes-indicator-on-tabs-is-now-the-default)
        * [Active launch indicators in run and debug history](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#active-launch-indicators-in-run-and-debug-history)
        * [In launch history, hover shows how long ago it was previously launched](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#last-execution-time-in-launch-history)
        * ([_Find Actions_ dialog with three dots menu icon](https://github.com/eclipse-platform/eclipse.platform.ui/commit/bc410d9898e0149b40ebad2c0c0473ca77405a8e))
        * ([_Find Actions_: improved ranking](https://github.com/eclipse-platform/eclipse.platform.ui/commit/86a07a08b3f2d764ef578fde0be20e822a632232))
        * ([Import/Export breakpoint wizards now with breakpoint filtering support](https://github.com/eclipse-platform/eclipse.platform/commit/dd01729b449c16952cfd0fb2c433317b67b29bd2))
     * [Sort launch configurations by most recent launch](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#sort-launch-configurations-by-most-recent-launch)
     * [Quick group launch from selected configurations](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#quick-group-launch-from-selected-configurations)
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2026-06-05..2026-09-10&s=committer-date&o=desc&type=Commits))
        * ([Faster native file system access on Linux x86_64](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#faster-native-file-system-access-on-linux-x86_64))
        * ([Faster and size-consistent drawing of scaled images (Windows only)](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#faster-and-size-consistent-drawing-of-scaled-images-on-windows))
        * ([Avoid a second tree lookup in Workspace.getResourceInfo](https://github.com/eclipse-platform/eclipse.platform/commit/f6c2d1def2b06f4bc91b6b800b4e98ea616a2745))
     * (Debug)
        * ([_Resume Other Threads_](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#resume-other-threads-during-debugging))
     * ([Single sign-on enabled by default for Edge/WebView2 browser](https://eclipse.dev/eclipse/markdown/?f=news/4.41/platform.md#single-sign-on-enabled-by-default-for-edgewebview2-browser))
     * ([TextMate Language Pack updated](https://github.com/eclipse-tm4e/tm4e/pull/1030))
 * **Git [📽️](https://youtu.be/slu7xCKaSro?t=442)**
     * [Right-click menu _Team > Pull_ is enabled for mixed selections containing at least one Git repository](https://github.com/eclipse-egit/egit/commit/e54f5631f158061ddc1673da6c16ebb0f8f6a861) (instead of, as before, disabling _Pull_ when it is not applicable to all selected items)
     * [_Close Projects Outside Repository_](https://github.com/eclipse-egit/egit/commit/4c9b249d47475c424315b33f93ffbe81c61fd5d2)
     * ([Simple Fetch for each remote in right-click menu _Team > Remote_](https://github.com/eclipse-egit/egit/issues/185) ([commit](https://github.com/eclipse-egit/egit/commit/0417b979e60bfdd21866e845b1b0c26a49b88fbf)))
     * ([_Staging_ view: Open the submodule's repository on double-click](https://github.com/eclipse-egit/egit/commit/f95538e2b79f275c8513710680b6f0da8369c9a0))
 * **Web [📽️](https://youtu.be/slu7xCKaSro?t=483)**
     * TypeScript 6.0 support, e.g. [less context-sensitivity on this-less functions](https://devblogs.microsoft.com/typescript/announcing-typescript-6-0/#less-context-sensitivity-on-this-less-functions)
     * [XML Minify](https://github.com/redhat-developer/vscode-xml/pull/1139) ([commit](https://github.com/eclipse-lemminx/lemminx/pull/1774))
     * ([Support XPath predicates with wildcards](https://github.com/eclipse-lemminx/lemminx/pull/1762))
     * ([Active parameter in signature help](https://github.com/eclipse-lsp4e/lsp4e/pull/1578))
     * ([Inlay hints with text edits can be applied when clicking on them](https://github.com/eclipse-lsp4e/lsp4e/pull/1505))
 * (**Under development**)
    * ([Initiative 31](https://github.com/swt-initiative31/): Prototyping work for candidate technology evaluation on Eclipse SWT)
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac), [commits](https://github.com/eclipse-jdt/eclipse.jdt.core/compare/master...eclipse-jdtls:eclipse-jdt-core-incubator:dom-with-javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on September 9, 2026+++ `)
