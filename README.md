<sup>Past releases:
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

# [Eclipse IDE 2023-12 Improvements Video](https://youtu.be/ilM7GY1uEYI)

* [December 6, 2023](https://calendar.google.com/calendar/event?eid=MnZoYWYyaDZrZnRuOWtpdG9ucjh0NDQwMDYgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [projects](https://projects.eclipse.org/releases/2023-12) - [wiki](https://wiki.eclipse.org/Category:SimRel-2023-12) - [website](https://eclipse.org/eclipseide/2023-12) ([New & Noteworthy](https://eclipse.org/eclipseide/2023-12/noteworthy)) - [splash screen](https://gitlab.eclipse.org/eclipsefdn/helpdesk/-/issues/2336)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2023-12/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [*.aggrcon](https://github.com/eclipse-simrel/simrel.build/commits/main), update sites: [staging](https://download.eclipse.org/staging/2023-12), [release](http://download.eclipse.org/releases/2023-12))
* Social media: [X/Twitter](https://twitter.com/EclipseJavaIDE), [Mastodon](https://mastodon.social/@EclipseFdn), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.29→**4.30**: [Eclipse 4.30 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.30/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.30/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 21](https://jdk.java.net/21/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/33?closed=1)
    * EclEmma (Java code coverage) 3.1.8: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC)
    * M2Eclipse (Maven) 2.4.0→**2.5.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#250), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/2.4.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.4.0...2.5.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * LemMinx-Maven 0.10.1→**0.11.0** ([included via m2e](https://github.com/eclipse-m2e/m2e-core/blob/master/org.eclipse.m2e.editor.lemminx/pom.xml#L48)): [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.11.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.10.1...0.11.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * Buildship (Gradle) 3.1.8: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.8), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release)
* General
    * **Platform** 4.29→**4.30**: [Eclipse 4.30 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.30/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse/commits/master/news/4.30/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [platform](https://github.com/eclipse-platform/eclipse.platform/commits/master)
    * ([Marketplace Client (MPC)](https://projects.eclipse.org/projects/technology.packaging.mpc) 1.10.1→**1.10.2**: [commits](https://github.com/eclipse-mpc/epp.mpc/commits/master), [issues](https://github.com/eclipse-mpc/epp.mpc/issues))
    * [Mylyn](https://projects.eclipse.org/projects/tools.mylyn) (task-focused UI) 4.0.0→[**4.1.0**](https://github.com/eclipse-mylyn/org.eclipse.mylyn/milestone/4?closed=1): [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn/commits/main)
    * (Mylyn WikiText (Markdown editor, etc.) 3.0.48→**3.0.49**: [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn.docs/compare/wikitext.core-3.0.48...wikitext.core-3.0.49))
    * ([Oomph](https://projects.eclipse.org/projects/tools.oomph) 1.30→**1.31**: [commits](https://github.com/eclipse-oomph/oomph/commits/master), [issus](https://github.com/eclipse-oomph/oomph/issues?q=is%3Aissue+is%3Aclosed+sort%3Aupdated-desc))
    * (EPP: [changelog](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2023-12), [commits](https://github.com/eclipse-packaging/packages/commits/master), [issues](https://github.com/eclipse-packaging/packages/issues))
* J**Git**/EGit 6.7→**6.8**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.8)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.8), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.8.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.8.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://github.com/eclipse-jgit/jgit/commits/master)/[EGit](https://github.com/eclipse-egit/egit/commits/master)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.3.0→**1.3.3**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#133), [commits](https://github.com/eclipse/wildwebdeveloper/compare/1.3.0...1.3.3)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 5.1.6→**5.2.2** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-5-2)
        * ([LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.27.0 ([`org.eclipse.lemminx ... <version>...</version>`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper.xml/pom.xml#L40-L43)): [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0270-august-3-2023))
        * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.8.1: [GitHub](https://github.com/eclipse/tm4e), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.8.1-release-review), [release notes](https://github.com/eclipse/tm4e/blob/main/RELEASE_NOTES.md#081), [commits](https://github.com/eclipse/tm4e/compare/0.6.2...0.8.1))
        * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.23.0→**0.24.4**: [GitHub](https://github.com/eclipse/lsp4e), [release](https://github.com/eclipse/lsp4e/releases/tag/0.24.4), [commits](https://github.com/eclipse/lsp4e/compare/0.23.0...0.24.4), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.24.4))
        * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.21.1: [GitHub](https://github.com/eclipse/lsp4j), [release](https://github.com/eclipse/lsp4j/releases/tag/v0.21.1), [commits](https://github.com/eclipse/lsp4j/compare/v0.21.0...v0.21.1), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.31→**3.32**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.32&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.32/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* (C/C++, PHP)
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.3.0→**11.4.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.4.md), [release](https://github.com/eclipse-cdt/cdt/releases/tag/CDT_11_43_0), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_3_0...CDT_11_4_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.4.0: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.3.2...v6.4.0), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.4.0-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 8.1.0→**8.2.0**: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy 8.2_](https://github.com/eclipse-pdt/pdt/wiki/NewIn82))


### Features to show

* **Java [📽️](https://youtu.be/ilM7GY1uEYI?t=15)**
    * [Java 21 support](https://eclipse.dev/eclipse/news/4.30/jdt.php#Java_21)
        * [Record Patterns (JEP 440)](https://openjdk.org/jeps/440)
        * [Pattern Matching for switch (JEP 441)](https://openjdk.org/jeps/441)
    * Java editor:
        * New quick fixes:
            * For enhanced switch expressions and statements introduced in Java 21 (see above)
                * [_Add 'default' case_](https://eclipse.dev/eclipse/news/4.30/jdt.php#add-default-case-quick-fix)
                * [_Remove 'default' case_](https://eclipse.dev/eclipse/news/4.30/jdt.php#remove-default-case-quick-fix)
                * [_Insert 'break' statement_](https://eclipse.dev/eclipse/news/4.30/jdt.php#insert-break-statement)
            * [_Rename to follow constant naming convention_](https://eclipse.dev/eclipse/news/4.30/jdt.php#constant-renaming)
        * ([Code completion improvements and fixes](https://github.com/search?utf8=%E2%9C%93&q=assist+OR+completion+OR+codecompletion+OR+intellisense+org%3Aeclipse-jdt+committer-date%3A2023-09-05..2023-12-10&s=committer-date&o=desc&type=Commits))
    * [Clean-up: _Source Fixing: Deprecated Method Calls > Replace with inlined method where possible_](https://eclipse.dev/eclipse/news/4.30/jdt.php#deprecated-cleanup) (the corresponding quick assist _Replace with inlined method_ has been introduce in the previous release)
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2023-09-05..2023-12-10&s=committer-date&o=desc&type=Commits):)
        * ([BinaryIndexer: avoid java.io.File.toUri()](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/398ba0b6b5459704d35bc4a3de72290fc907a8a9))
        * ([In P2Utils.findBundle() the check if the bundle file exists is deferred to the latest possibility in order to speed-up the search if multiple versions are present](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/80cdc892db1271aaeffd5ea88c73c74b088dcb07))
        * ([Use JavaElementComparator in CleanUpRefactoringWizard](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/3f6796695adf6fdd9d607cd200f9af05f5c1d20d))
        * ([Avoid O(n^2) in ContentProviders](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/aadde02f88c7529c28842d389d4c9b30c3b0ee7b))
    * (**Maven<!-- [📽️](https://youtu.be/ilM7GY1uEYI?t=000)-->**)
    * (**Gradle<!-- [📽️](https://youtu.be/ilM7GY1uEYI?t=000)-->**:)
        * ([Kotlin DSL editor support](https://gist.github.com/D0zee/90b63a9cfd2edb7a039f111e2406f5b8#file-gsoc-md): optional installable feature; does not work on Windows yet (by Nikolai Vladimirov in the Google Summer of Code program))
* (**General/Platform<!-- [📽️](https://youtu.be/ilM7GY1uEYI?t=000)-->**)
    * ([Opening a directory shows existing projects in _Project Explorer_](https://github.com/eclipse-platform/eclipse.platform.ui/commit/35a5e7bfdc632a8ec9e752c8e068a010c2c346dc): if the project has already been imported, it will be selected in the _Project Explorer_ and ensured that it is opened; otherwise, the dialog for importing projects will be displayed as in the past)
    * ([UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2023-09-05..2023-12-10&s=committer-date&type=Commits))
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2023-09-05..2023-12-10&s=committer-date&o=desc&type=Commits):)
        * ([PropertyManager2 iterates the tree for infinite depth for deleting/moving an IFile](https://github.com/eclipse-platform/eclipse.platform/commit/5e0a9979f91c067059ccb88cbe5166f82b3492a3))
    * (Mylyn:)
        * ([Performance: Use an OSGi declarative service instead of IStartup](https://github.com/eclipse-mylyn/org.eclipse.mylyn/pull/201))
* **Web [📽️](https://youtu.be/ilM7GY1uEYI?t=236)**
    * Latest [TypeScript 5.2](https://devblogs.microsoft.com/typescript/announcing-typescript-5-2) (e.g. [`using ...`](https://devblogs.microsoft.com/typescript/announcing-typescript-5-2/#using-declarations-and-explicit-resource-management)) and ECMAScript/JavaScript:
        * [_Code Actions > Inline variable_](https://devblogs.microsoft.com/typescript/announcing-typescript-5-2/#inline-variable-refactoring)
    * ([Allow using TypeScript version specified by project](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/pull/1308))
    * CSS (via Generic Text Editor):
        * [Support (no errors anymore) `:nth-child()`/`:nth-last-child()` with `... of ...`](https://github.com/microsoft/vscode-css-languageservice/pull/356), e.g. `li:nth-child(1 of .not-hidden)`
        * [Support (code completion and no warnings anymore) for the properties `container`, `container-name` and `container-type`](https://github.com/microsoft/vscode-css-languageservice/pull/365), e.g. `div { container-type: size; }`
        * ([Support (no errors anymore) for `<timeline-range-name>` in `@keyframes`](https://github.com/microsoft/vscode-css-languageservice/pull/355), e.g. `@keyframes sample { cover 50% { color: red; } }` ([experimental](https://developer.mozilla.org/en-US/docs/Web/CSS/@keyframes#timeline-range-name)))
    * [Vue support: code completion for Vue-specific things](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/issues/1332), e.g. `<li v-|` ([project name must not contain spaces](https://github.com/eclipse-wildwebdeveloper/wildwebdeveloper/issues/1413))
* (**Git<!-- [📽️](https://youtu.be/ilM7GY1uEYI?t=000)-->**)
    * (Performance:)
        * ([Optimize RefDirectory.getRefsByPrefix(String...)](https://github.com/eclipse-jgit/jgit/commit/4f18c5095049116350828e9bb499964ea887ac02))
        * ([RepositoryTreeNode: cache hashCode](https://github.com/eclipse-egit/egit/commit/981b7278c232903ff22cf66d81552907bee86609))
        * ([DeleteBranchOperation: bulk delete branches](https://github.com/eclipse-egit/egit/commit/e554c235f331129e10b1157e6921b4d7f5be21fd))
* **(EPP)**
    * (11→10 IDE packages: [no _Eclipse IDE for Scientific Computing_ anymore](https://github.com/eclipse-packaging/packages/blob/master/CHANGELOG.md#2023-12))
* **(Under development)**
    * ([Gradle: Kotlin DSL support](https://github.com/eclipse/buildship/pull/1259): `build.gradle.kts`)
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([Syntax highlighting and more for various languages/formats via the tm4e language pack feature](https://github.com/eclipse/tm4e/pull/374))
    * ([_Run/Debug As > ..._ right-click menu directly shows available launch configurations_](https://www.eclipse.org/eclipse/news/4.28/platform.php#launch-debug-shortcuts-expanded): supported by JDT?)

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (title prefix until release: `+++Coming on December 6, 2023+++ ` )
