<sup>Past releases:
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

# +++ Work in progress (for March 15, 2023) +++<br>Eclipse IDE 2023-03 Improvements Video

* [March 15, 2023](https://calendar.google.com/calendar/event?eid=Mjcwc2Y1b2xubm85N3FoZjR1M2o5anI2NnYgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [? projects](https://projects.eclipse.org/releases/2023-03) ([-? +? → ?](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2023-03) - [website](https://eclipse.org/eclipseide/2022-12) ([New & Noteworthy](https://eclipse.org/eclipseide/2023-03/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575781)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2023-03/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2023-03), [release](http://download.eclipse.org/releases/2022-12))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.26→**4.27**: [Eclipse 4.27 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.27/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.27/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 20](https://jdk.java.net/20/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/20?closed=1), [examples](https://wiki.eclipse.org/Java20/Examples), [update site](https://download.eclipse.org/eclipse/updates/4.27-P-builds/P20230202-0830/), [Marketplace?](https://marketplace.eclipse.org/search/site/Java%252020)
    * (EclEmma (Java code coverage) 3.1.6: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 2.1.0→**2.2.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#220), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/2.2.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.1.0...2.2.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * LemMinx-Maven 0.7.0→**0.7.1**: [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.7.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.7.0...0.7.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * (Buildship (Gradle) 3.1.6: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.6), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.26→**4.27**: [Eclipse 4.27 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.27/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.27/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [text](https://github.com/eclipse-platform/eclipse.platform.text/commits/master)
    * (Marketplace Client (MPC) 1.10.0→**1.10.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Mylyn WikiText (Markdown editor, etc.) 3.0.42→**3.0.46**: [GitHub](https://github.com/eclipse-mylyn/org.eclipse.mylyn.docs), [commits](https://github.com/eclipse-mylyn/org.eclipse.mylyn.docs/compare/wikitext.core-3.0.44...wikitext.core-3.0.46))
    * (Oomph 1.26→**1.27**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 6.4→**6.5**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.5)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.5), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.5.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.5.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 1.0.0→**1.0.2**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#102), [commits](https://github.com/eclipse/wildwebdeveloper/compare/1.0.0...1.0.2)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.9.3→**4.9.5** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-4-9)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.21.0→**0.23.0**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0230-december-14-2022)
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.28→**3.29**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.29&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.29/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 11.0.0→**11.1.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.1.md), [release](https://github.com/eclipse-cdt/cdt/releases/tag/CDT_11_1_0), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_11_0_0...CDT_11_1_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.3.1: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.3.0...v6.3.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.3.1-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2.1: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.19: [release](https://github.com/eclipse/lsp4j/releases/tag/v0.19.0), [commits](https://github.com/eclipse/lsp4j/compare/v0.15.0...v0.19.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.21.0: [GitHub](https://github.com/eclipse/lsp4e), [release](https://github.com/eclipse/lsp4e/releases/tag/0.21.0), [commits](https://github.com/eclipse/lsp4e/compare/0.20.5...0.21.0), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.21.0))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.6.2: [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.6.2-release-review), [release notes](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#062), [commits](https://github.com/eclipse/tm4e/compare/0.6.0...0.6.2))
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.4: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.4-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java<!-- [📽️](https://youtu.be/jJau4kUoLrA?t=16s)-->**
    * Java 20 support via Marketplace?
    * [Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2022-12-05..2023-03-10&s=committer-date&o=desc&type=Commits):
        * ([Use meta index for reference search](https://github.com/eclipse-jdt/eclipse.jdt.core/pull/532))
        * [Faster compilation for parameterized types](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/549), e.g. [`compile-perf.zip`](https://github.com/eclipse-jdt/eclipse.jdt.core/files/10041321/compile-perf.zip) _Clean_ >4min → 24s
    * Java editor:
        * Code completion improvements and fixes:
            * [`record Person(|) {}`](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/667)
            * [Templates in lambda internal blocks](https://github.com/eclipse-jdt/eclipse.jdt.core/pull/651)
            * [Array constructor reference](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/583), e.g. `Arrays.asList("1").stream().toArray(String[]::|)` should propose `new`
        * [New code mining preference: _Ignore inexact reference matches_](https://www.eclipse.org/eclipse/news/4.27/jdt.php#new-code-mining-preference) to ignore [potential matches](https://www.eclipse.org/lists/jdt-core-dev/msg00051.html) (if not everything can completely resolved, e.g. because of compile errors; [pull request #397](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/397))
        * ([Javadoc: `{@return ...}` support](https://www.eclipse.org/eclipse/news/4.27/jdt.php#javadoc-inline-return): shown in Javadoc view and hover, but [can cause _Javadoc: Missing tag for return type_ false positive](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/795))
        * ([_Open Declaration_ in nested switch expressions fixed](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/708))
    * ([Clean-up _Member Access > Use 'this' qualifier for field access: Only if necessary_ has been fixed to work for parameterized types also](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/411))
    * [JUnit: Tests in subpackages will now also be launched](https://www.eclipse.org/eclipse/news/4.27/jdt.php#junit-subpackage-support)
    * (Java formatter:)
        * ([New setting for sealed types](https://github.com/eclipse-jdt/eclipse.jdt.core/commit/7f2b6b230ae5f09345d2f0ebbddae00d9a72b9fe) ([UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/3adb1da52d57c2aa2e1a1edcfcf29640c3dd4ce3): _Line Wrapping > Wrapping Settings > Class Declarations > 'permits' clause_)
        * ([Support for record patterns](https://github.com/eclipse-jdt/eclipse.jdt.core/issues/264) (preview feature in Java [19](https://openjdk.org/jeps/405) and [20](https://openjdk.org/jeps/432)))
    * Maven<!-- [📽️](https://youtu.be/jJau4kUoLrA?t=218s)-->:
        * [Ignore Test Sources and Resources compilation if `maven.test.skip=true` is specified](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#ignore-test-sources-and-resources-compilation-if-maventestskiptrue-is-specified)
        * No manual project configuration anymore in the following cases:
            * [Mojos without a mapping are now executed by default in incremental builds](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#mojos-without-a-mapping-are-now-executed-by-default-in-incremental-builds) ([**M**aven plain **O**ld **J**ava **O**bject](https://maven.apache.org/guides/plugin/guide-java-plugin-development.html#your-first-mojo))
            * [Configuration of Maven Execution JRE](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#configuration-of-maven-execution-jre) (see [commit](https://github.com/eclipse-m2e/m2e-core/commit/32dc6407c919bb8eb8217df4a3ccddff18ab1ed4))
        * ([Eclipse plugin development: in _Target Editor_, dialog to add or edit Maven dependencies updated](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#updated-dependency-editor))
* **General/Platform<!-- [📽️](https://youtu.be/jJau4kUoLrA?t=000s)-->**
    * [_Open Resource_ substring search instead of starts with](https://www.eclipse.org/eclipse/news/4.27/platform.php#open-resource-new-search-behavior): use prefix `>` for _starts with_ (old behavior)
    * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2022-12-05..2023-03-10&s=committer-date&type=Commits):
        * [Preferences: _General > Editors > Text Editors: Line spacing (extra % of font height)_](https://github.com/eclipse-platform/eclipse.platform.text/issues/98)
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2022-12-05..2023-03-10&s=committer-date&o=desc&type=Commits):)
        * ([Faster Search & Replace](https://github.com/eclipse-platform/eclipse.platform.text/commit/8775ea8bd9a6d683d596da5d8d6c89bfd29e8406))
* **Web<!-- [📽️](https://youtu.be/jJau4kUoLrA?t=302s)-->**
    * XML:
        * [More formatting preferences: _XML (Wild Web Developer) > Formatting_](https://github.com/eclipse/wildwebdeveloper/commit/7c20109bf5e559367826ba66ba9ef596814e88d5): _Preserve new lines_ is what I missed in the past
        * ([Quick fixes for complex types: _Insert all expected elements_ and _Insert only required elements_](https://github.com/eclipse/lemminx/issues/1218): [issues that have already been fixed after LemMinX 0.23.0](https://github.com/eclipse/lemminx/issues/1218#issuecomment-1190078320))
* (**Git<!-- [📽️](https://youtu.be/jJau4kUoLrA?t=588s)-->**: no changes in the UI (EGit), performance improvements in the underlying Java implementation of Git (JGit), but no scenarios found where this can be reproduced via EGit)
    * ([JGit: Commit-graph support](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574368) ([supplemental data to speed up showing history and computing merge bases](https://git-scm.com/docs/commit-graph)): [if `core.commitGraph` and `gc.writeCommitGraph` are set to `true`, _Collect Garbage_ will (re)write `.git/objects/info/commit-graph`](https://git.eclipse.org/c/jgit/jgit.git/commit/?id=b082c58e0ff3e829071e90b47df022e77cd3dea2), e.g. [torvalds/linux.git](https://github.com/torvalds/linux.git) → [8x faster](https://bugs.eclipse.org/bugs/show_bug.cgi?id=574368#c1))
    * ([JGit: Faster fetching](https://git.eclipse.org/c/jgit/jgit.git/commit/?id=21e902dd7fa4ff53dc35fd7c48f8b5edc52f8eea))
    * ([JGit: Faster _Collect Garbage_](https://git.eclipse.org/c/jgit/jgit.git/commit/?id=cd3fc7a2995c06cf2425f51758094e039c938559))
* **(Under development)**
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([Syntax highlighting and more for various languages/formats via the tm4e language pack feature](https://github.com/eclipse/tm4e/pull/374))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (until release: video title with _+++Coming on December 7, 2022+++_ prefix)
