<sup>Past releases:
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

# +++ Work in progress (for June 10, 2026) +++<br>Eclipse IDE 2026-06 Improvements Video <!--# [Eclipse IDE 2026-06 Improvements Video](https://youtu.be/Ik-sitUBWII)-->

* [June 10, 2026](https://calendar.google.com/calendar/event?eid=MWdvNWEza24wbW5xb2p2ZXZzZTI2b2RmNjggZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [wiki](https://github.com/eclipse-simrel/.github/blob/main/wiki/Simultaneous_Release.md) - [website](https://eclipseide.org/) ([New & Noteworthy](https://eclipseide.org/release/noteworthy/2026-06/)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/6906)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2026-06/) ([*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2026-06), [release](http://download.eclipse.org/releases/2026-06))
* Social media: [Mastodon](https://mastodon.social/@EclipseIDE), [X](https://x.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn)


### Sources

 * Java, Maven, Gradle
    * Java development tools (JDT) 4.39→**4.40**: [Eclipse 4.40 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.40/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.40/jdt.md)), commits [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 26](https://jdk.java.net/26/): issues [core](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/4405)/[UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/2495)
    * (EclEmma (Java code coverage) 3.1.11: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [commits](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 2.11.0→**2.11.1**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#2111), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.11.0...2.11.1), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * (LemMinx-Maven 0.12.0 ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.12.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.11.1...0.12.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
    * (Buildship (Gradle) 3.1.10→**3.1.11**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.11), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
 * General
    * **Platform** 4.39→**4.40**: [Eclipse 4.40 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.40/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.40/platform.md)), commits [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.13.0: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * ([Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.10.0→[**4.11.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/14?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.40→**1.41**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2026-06), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
 * (J**Git**/EGit 7.6→**7.7**: wiki [JGit](https://github.com/eclipse-jgit/jgit/wiki/New-and-Noteworthy)/[EGit](https://github.com/eclipse-egit/egit/wiki/New-and-Noteworthy), review [JGit](https://projects.eclipse.org/projects/technology.jgit/releases/7.7.0)/[EGit](https://projects.eclipse.org/projects/technology.egit/releases/7.7.0), commits [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master))
 * (Web, XML)
     * ([Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.4.0: [GitHub](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper), [release](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/releases/tag/1.4.0), [commits](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/compare/1.3.10...1.4.0))
        * (JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L6); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.7.3→**5.9.3** [releases](https://github.com/microsoft/TypeScript/releases), [5.8](https://devblogs.microsoft.com/typescript/announcing-typescript-5-8), [5.9](https://devblogs.microsoft.com/typescript/announcing-typescript-5-9))
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.31.0 ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/blob/master/target-platform/target-platform.target#L60-L64)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse-lemminx/lemminx/blob/main/CHANGELOG.md#0310-may-8-2025))
     * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.17.2: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/releases/0.17.2), [releases](https://github.com/eclipse/tm4e/releases), [commits](https://github.com/eclipse/tm4e/compare/0.17.1...0.17.2))
     * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.30.0→**0.30.5**: [GitHub](https://github.com/eclipse/lsp4e), [releases](https://github.com/eclipse/lsp4e/releases), [commits](https://github.com/eclipse/lsp4e/compare/0.30.0...0.30.5), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.30.5)
     * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 1.0.0: [GitHub](https://github.com/eclipse/lsp4j), [releases](https://github.com/eclipse/lsp4j/releases), [commits](https://github.com/eclipse/lsp4j/compare/v0.24.0...v1.0.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
     * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.41→**3.42**: commits [JSF](https://github.com/eclipse-jsf/webtools.jsf/commits/master/)/[JEE](https://github.com/eclipse-jeetools/webtools.javaee/commits/master/)/[Dali](https://github.com/eclipse-dali/webtools.dali/commits/master/)/[Server Tools](https://github.com/eclipse-servertools/servertools/commits/master/)/[Source Editing](https://github.com/eclipse-sourceediting/sourceediting/commits/master/))
 * (Eclipse Plugin Development)
    * (**PDE** 4.39→**4.40**: [Eclipse 4.40 - New and Noteworthy - Plug-in Development Environment](https://www.eclipse.org/eclipse/news/4.40/pde.html) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.40/pde.md)), [commits](https://github.com/eclipse-pde/eclipse.pde/commits/master/))
 * (C/C++, PHP)
     * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 12.4.0→**12.5.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-12.5.md), [releases](https://github.com/eclipse-cdt/cdt/releases), [commits](https://github.com/eclipse-cdt/cdt/compare/cdt_12_4...cdt_12_5), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([CDT-LSP](https://github.com/eclipse-cdt/cdt-lsp) 3.5.0→**3.6.0**: [commits](https://github.com/eclipse-cdt/cdt-lsp/commits/main/), [releases](https://github.com/eclipse-cdt/cdt-lsp/releases))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.7.0: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.6.1...v6.7.0), [review](https://projects.eclipse.org/projects/iot.embed-cdt/releases/6.6.1), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.4.0: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [commits](https://github.com/eclipse/pdt/commits/master), [release](https://github.com/eclipse-pdt/pdt/releases/tag/R8_4_0))


### Features to show

 * **Java<!-- [📽️](https://youtu.be/Ik-sitUBWII?t=17)-->**
     * Java 26 support
     * Java editor
        * New quick assists
           * [_Convert String to Text Block_](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/2904) for strings containing `\n`
           * [_Replace qualified name_](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/12a69e18a46eaa9ca2b9c7a11246bc8401d7015d), e.g. for a field like `java.util.List<String> l= new java.util.ArrayList<>();`
        * New [_Convert ... to '@NonNull'_](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/2916) and [_Change '...()' to '@NonNull'_](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/777ed5d552eaca9f817585b486b73e7431fc54ba) quick fixes
        * [Improved _Convert Class to Record_ refactoring and quick assist](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/c660dceb3a5d1b42311c32f75ac030f06af53077) to be applicable in more cases (see also [1](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/805d48373f651b9685ee5f89b7236897c14e46cc), [2](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/84eea6698da87a30b411b76707d8efa44830d9a3))
        * [Enhanced Folding and Custom Folding Regions](https://eclipse.dev/eclipse/markdown/?f=news/4.40/jdt.md#improvements-for-enhanced-folding-and-custom-folding-regions) ([pull request](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/2860)):
           * Better performance, especially for large files with many foldable elements
           * Folding regions now include the entire body of control statements, including the opening and closing braces
           * Minor glitches fixed
     * ([Java compare with semantic highlighting](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/f9457bea909e316282dd2b7aec5576aff6e25e99) for local source files (show it together with General/Platform _Compare_ editor improvements: see above))
     * [Java Formatter: New option to Place textblock quotes on their own line](https://eclipse.dev/eclipse/markdown/?f=news/4.40/jdt.md#new-formatter-to-place-textblock-quotes-on-their-own-line)
     * ([Preferences > _Java_ > _Editor_ > _Code Minings_: New _Select/Deselect All_ buttons](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/5e1a018415007f9126230f748358cb99081d015e))
     * Debug
        * [Statement-Level Stepping Support](https://eclipse.dev/eclipse/markdown/?f=news/4.40/jdt.md#statement-level-stepping-support)
        * [Context-Aware Watch Expressions](https://eclipse.dev/eclipse/markdown/?f=news/4.40/jdt.md#context-aware-watch-expressions)
        * [Stepping in Class File Editor](https://eclipse.dev/eclipse/markdown/?f=news/4.40/jdt.md#stepping-in-class-file-editor)
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2026-03-05..2026-06-10&s=committer-date&o=desc&type=Commits))
        * ([Folding in Java editor performance improvements](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/2860) (see above))
     * (**Maven<!-- [📽️](https://youtu.be/Ik-sitUBWII?t=000)-->**)
        * ([Embedded Maven updated from 3.9.11 to 3.9.16](https://github.com/eclipse-m2e/m2e-core/blob/main/RELEASE_NOTES.md#embedded-and-use-maven-3916))
     * (**Gradle<!-- [📽️](https://youtu.be/Ik-sitUBWII?t=000)-->**)
 * **General/Platform<!-- [📽️](https://youtu.be/Ik-sitUBWII?t=242)-->**
     * Debug
        * [Paste multiple expressions from clipboard in _Expressions_ view](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#paste-multiple-expressions-from-clipboard-in-expressions-view)
        * [Refined copy actions in _Variables_ and _Expressions_ views](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#refined-copy-actions-in-variables-and-expressions-views)
     * [Global search navigation shortcuts: Alt/Cmd+`,` and Alt/Cmd+`.`](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#global-search-navigation-shortcuts) to navigate to the previous or next search result independent which view or editor is focused (Ctrl+`,` and Ctrl+`.` work only if the _Search_ view is in focus)
     * [Improved defaults in the _Compare_ editor](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#improved-defaults-in-compare-editor)
        * Natural diff order: Follows the commonly used convention with the original/base content on the left and the modified content on the right
        * Structural compare shown in _Outline_ view by default
        * Improved visualization of changes: line ranges are now used by default to connect differences
        * [Java compare with semantic highlighting](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/f9457bea909e316282dd2b7aec5576aff6e25e99) for local source files (Java improvement; see above)
        * Git: [Compare: display timestamp in addition to commit ID](https://github.com/eclipse-egit/egit/commit/ac6dbe80a03f41b38c08f078d01703377bafa6cd) ([issue](https://github.com/eclipse-egit/egit/issues/178))
     * [Show zero-width spaces and characters (`ZWSP`)](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#show-zero-width-spaces-and-characters-zwsp): see preferences > _General_ > _Editors_ > _Text Editors_ > _Show whitespace characters_
     * [_Console_ view: New preference to limit line length](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#line-length-limit-in-the-console)
     * [Import projects: New options _Skip folders starting with ".' (e.g., .git)_](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#skip-dot-folders-when-scanning-for-projects-to-import): speeds up scanning; enabled by default
     * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2026-03-05..2026-06-10&s=committer-date&type=Commits)
        * [New dirty indicator for view and editor tabs](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#new-dirty-indicator-for-view-and-editor-tabs): disabled by default, can be enabled in the preferences > _General_ > _Appearance_ > _Indicate unsaved changes by overlaying the close button_
        * In preferences > _General_ > _Appearance_:
            * [Option to set default theme](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#manage-default-theme) which will be used for new workspaces
            * [_Classic_ theme removed](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#removed-classic-theme)
            * [_Use round tabs_ removed](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#removed-rounded-tabs-support)
        * ([_Colors and Fonts_ preference page with _Open/Close All_ buttons](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#enhanced-colors-and-fonts-preference-page-with-toolbar-actions))
        * ([Updated dark theme styling for form-based UIs](https://eclipse.dev/eclipse/markdown/?f=news/4.40/platform.md#updated-dark-theme-styling-for-form-based-uis))
     * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2026-03-05..2026-06-10&s=committer-date&o=desc&type=Commits))
        * ([Search view: performance issues on remove and sort](https://github.com/eclipse-platform/eclipse.platform.ui/commit/300659d64e86868f3aa85dbc287bb8ee345db093))
 * **Git<!-- [📽️](https://youtu.be/Ik-sitUBWII?t=340)-->**
     * [Auto fetch](https://github.com/eclipse-egit/egit/commit/1b219ebe1e97d3f6fbf83163ae8aef12e9da780a)
     * [Non-blocking push result notification](https://github.com/eclipse-egit/egit/commit/59c725e3d7581787a824aedec9df116285634eea) ([issue](https://github.com/eclipse-egit/egit/issues/144))
        * [Show pull request creation link in push notification](https://github.com/eclipse-egit/egit/commit/823d33062962069c0c50023cd6f7204180b3faa4) ([issue](https://github.com/eclipse-egit/egit/issues/163))
     * _History_ view
        * [_Show all branches_ and _All Changes in Repository_ enabled by default](https://github.com/eclipse-egit/egit/commit/ad0477c1481530d970458263c9b6f423adf97dcc) ([issue](https://github.com/eclipse-egit/egit/issues/143))
        * [Files can now be dropped and dragged from the Revision Detail area into the editor area to open it](https://github.com/eclipse-egit/egit/commit/a8566fa1d2de21649258099a6229925ea7fe8af6) or to any drop target that accepts files
     * [Repositories view: _Close/Open All Projects_](https://github.com/eclipse-egit/egit/commit/9c5d2b49f49ba036d038df4fe250259f21c867a3) in new _Projects_ submenu (together with the existing _Import Projects..._)
     * [_Push Branch_ dialog: Parse pasted branch refs from Git hosts](https://github.com/eclipse-egit/egit/commit/52382f2ee66b62fd5d97b0f16bf4b97f42d882af) ([issue](https://github.com/eclipse-egit/egit/issues/164))
     * ([Compare: display timestamp in addition to commit ID](https://github.com/eclipse-egit/egit/commit/ac6dbe80a03f41b38c08f078d01703377bafa6cd) ([issue](https://github.com/eclipse-egit/egit/issues/178)) (show it together with General/Platform _Compare_ editor improvements: see below))
     * ([Show success notification when applying stash](https://github.com/eclipse-egit/egit/commit/a48d2e69d22e139e8bf81dc295c86d906b5cec95) ([issue](https://github.com/eclipse-egit/egit/issues/161)))
     * ([_Staging_ view: Make the filter Unicode-aware](https://github.com/eclipse-egit/egit/commit/a49378f070f2d6a0774b29d1df5158b071bddbeb))
     * ([Fix case-insensitive matching of commit message proposals](https://github.com/eclipse-egit/egit/commit/0afc4aa1fcfa1fca47b38564bc0f9dcb87b2b615))
     * ([GitDecorator: Coalesce GitDecorator UI notifications across instances](https://github.com/eclipse-egit/egit/commit/7aa7765e6e56c9e92fd89f5a6c626e42d037172e))
     * (Use filter instead of search icon in the [_Repositories_ view to filter tags](https://github.com/eclipse-egit/egit/commit/7aa7765e6e56c9e92fd89f5a6c626e42d037172e) and in the [_Staging View_ view](https://github.com/eclipse-egit/egit/commit/eab66cfa8150567052255859e51dcbd8906db6a1))
 * (**Web<!-- [📽️](https://youtu.be/Ik-sitUBWII?t=000)-->**)
 * (**Under development**)
    * ([Initiative 31](https://github.com/swt-initiative31/): Prototyping work for candidate technology evaluation on Eclipse SWT)
    * ([JDT to support javac instead of ejc](https://www.eclipse.org/lists/jdt-dev/msg02333.html) driven by jdtls: [incubator](https://github.com/eclipse-jdtls/eclipse-jdt-core-incubator/labels/javac), [commits](https://github.com/eclipse-jdt/eclipse.jdt.core/compare/master...eclipse-jdtls:eclipse-jdt-core-incubator:dom-with-javac))
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts` (does not work on Windows yet))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))


## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on June 10, 2026+++ `)
