<sup>Past releases:
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

# +++ Work in progress (for December 7, 2022) +++<br> Eclipse IDE 2022-12 Improvements Video

* [December 7, 2022](https://calendar.google.com/calendar/event?eid=N2t1M2FmNWM1dnRianM1MWFmZG44dTAxYjkgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [65 projects](https://projects.eclipse.org/releases/2022-12) ([-1 +0 → 65](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2022-12) - [website](https://eclipse.org/eclipseide/2022-12) ([New & Noteworthy](https://eclipse.org/eclipseide/2022-12/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575781)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2022-12/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2022-12), [release](http://download.eclipse.org/releases/2022-12))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.25→**4.26**: [Eclipse 4.26 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.26/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.26/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 19](https://jdk.java.net/19/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/13?closed=1), [examples](https://wiki.eclipse.org/Java19/Examples)
    * (EclEmma (Java code coverage) 3.1.6: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 2.0.2→**2.1.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#210), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/2.1.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/2.0.2...2.1.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * LemMinx-Maven 0.6.0→**0.7.0**: [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.7.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.6.0...0.7.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * (Buildship (Gradle) 3.1.6: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.6), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.25→**4.26**: <!--[Eclipse 4.26 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.26/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.26/platform.html)), -->Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [text](https://github.com/eclipse-platform/eclipse.platform.text/commits/master)
    * Marketplace Client (MPC) 1.10.0→**1.10.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/)
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.41→**3.0.42**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Oomph 1.26→**1.27**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 6.3→**6.4**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.4)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.4), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.4.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.4.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.15.0→**1.0.0**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#100), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.15.0...1.0.0)
        * JavaScript/TypeScript language server ([`"typescript": "..."`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/package.json#L5); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.6.4→**4.9.3** [releases](https://github.com/microsoft/TypeScript/releases), announcements [4.7](https://devblogs.microsoft.com/typescript/announcing-typescript-4-7)+[4.8](https://devblogs.microsoft.com/typescript/announcing-typescript-4-8)+[4.9](https://devblogs.microsoft.com/typescript/announcing-typescript-4-9)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.19.1→**0.21.0**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0200-march-29-2022)
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.27→**3.28**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.28&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.28/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.7.1→**11.0.0**: [_New & Noteworthy_](https://github.com/eclipse-cdt/cdt/blob/main/NewAndNoteworthy/CDT-11.0.md), [release](https://github.com/eclipse-cdt/cdt/releases/tag/CDT_11_0_0), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_10_7_1...CDT_11_0_0), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.3.1: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.3.0...v6.3.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.3.1-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2.1: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.14→**0.15**: [release](https://github.com/eclipse/lsp4j/releases/tag/v0.15.0), [commits](https://github.com/eclipse/lsp4j/compare/v0.14.0...v0.15.0), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.20.5→**0.20.6**: [GitHub](https://github.com/eclipse/lsp4e), [release](https://github.com/eclipse/lsp4e/releases/tag/0.20.6), [commits](https://github.com/eclipse/lsp4e/compare/0.20.5...0.20.6), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.20.6))
    * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.6.0→**0.6.2**: [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.6.2-release-review), [release notes](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#062), [commits](https://github.com/eclipse/tm4e/compare/0.6.0...0.6.2)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.4: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.4-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java <!--[📽️](https://youtu.be/eEXvOjtauxI?t=16s)-->**
    * [Java 19 support](https://www.eclipse.org/eclipse/news/4.26/jdt.php#Java_19):
        * JEP 405: Record Patterns (Preview)
            * e.g. `if (o instanceof Node(Object left, Object right)) ...`
            * Nested: `if (o instanceof Node(Object left, Node(Object rl, Object rr)) ...`
        * JEP 427: Pattern Matching for switch (Third Preview):
            * As `instanceof` with optional binding, e.g. `case String s -> System.out.println("Hello " + s);`;
            * Optional `when` clause, e.g. `case String s when !s.isBlank() -> ...`;
        * Combination of JEP 405 + 427
        * ... JEP 425: Virtual Threads (Preview) and other non-language changes (all as preview features)
    * Java editor:
        * [New quick assists (Ctrl+1) for classes with fields](https://www.eclipse.org/eclipse/news/4.26/jdt.php#new-class-assists):
            * Create getters and setters
            * Create hashCode() and equals() methods
            * Create toString() method
        * [Improved _Extract local variable_ refactoring](https://www.eclipse.org/eclipse/news/4.26/jdt.php#smarter-extract-local): takes preceding null check into account, e.g. `if (s == null || s.length()) ...`
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2022-09-05..2022-12-10&s=committer-date&o=desc&type=Commits):)
        * ([Faster JUnit 4 and 5 test finders](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/cf5968f745bcae0f4cd3036dfcb009737b6d18e4))
    * Maven <!--[📽️](https://youtu.be/eEXvOjtauxI?t=159s)-->:
        * [_Automatically update Maven projects configuration_ enabled by default](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#automatic-configuration-updates-of-maven-projects-enabled-by-default), e.g. when changing [compiler settings](https://stackoverflow.com/a/68058292/6505250), e.g. for `--add-exports java.base/sun.security.util=ALL-UNNAMED`
        * [Autocompletion for more directory/file based properties](https://github.com/eclipse/lemminx-maven/pull/297): for mojo parameters with `type=File` or name ending with `Directory`
        * [Managed version info on hover](https://github.com/eclipse/lemminx-maven/pull/298)
        * [Performance and memory consumption improvements](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#performance-and-memory-consumption-improvements): [for large deeply nested multi-module projects, the build performance has been improved and the memory consumption has been reduced](https://github.com/eclipse-m2e/m2e-core/commit/281038aa6fdf411a8038e8c50ece86fa11bfe3eb)
        * ([Improved connectors for bnd-maven-plugin and maven-bundle-plugin](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#improved-connectors-for-bnd-maven-plugin-and-maven-bundle-plugin))
        * ([Console support for polyglot Maven projects and projects without Maven nature](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#console-support-for-polyglot-maven-projects-and-projects-without-maven-nature))
* (**General/Platform <!--[📽️](https://youtu.be/eEXvOjtauxI?t=323s)-->**)
    * ([Ctrl+E: Prepend parent directories for file name collisions](https://github.com/eclipse-platform/eclipse.platform.ui/pull/302))
    * ([UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2022-09-05..2022-12-10&s=committer-date&type=Commits):)
        * (Dark theme:)
            * ([Fast view](https://github.com/eclipse-platform/eclipse.platform.images/commit/8c216ca0527d7c85c8628dc11d1779de3e3c12c2) and [fast view restore](https://github.com/eclipse-platform/eclipse.platform.ui/commit/7a9fb73d375d1d1d6e51b9391ca1845472c4d777) icons)
            * ([_Project > Properties: Resource > Linked Resources_](https://github.com/eclipse-platform/eclipse.platform.ui/commit/5c05000b06c4f17e9af8158b917643069ab79092))
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+fast+OR+faster+OR+slow+org%3Aeclipse-platform+committer-date%3A2022-09-05..2022-12-10&s=committer-date&o=desc&type=Commits))
    * (MPC uses HTTP**S** only)
* **Web <!--[📽️](https://youtu.be/eEXvOjtauxI?t=16s)-->**
    * XML:
        * Editing: Element auto-closing when typing `>`, even without using content assist; adding `/` before `>` removes end tag
        * Preferences: _XML (Wild Web Developer) > Formatting_
        * _Bind to schema/grammar..._ link at the top of unbound XML files: enabled by default; can be disabled in the preferences _XML (Wild Web Developer) > CodeLense_
        * [RELAX NG support](https://github.com/eclipse/lemminx/issues/828) ([samples](https://github.com/eclipse/lemminx/tree/main/org.eclipse.lemminx/src/test/resources/relaxng)):
            * [XML syntax (`*.rng`)](https://en.wikipedia.org/wiki/RELAX_NG#XML_syntax): [`<a:documentation>...</a:documentation>`](https://relaxng.org/tutorial-20011203.html#IDA1OZR) shown as hover
            * [XML syntax (`*.rnc`)](https://en.wikipedia.org/wiki/RELAX_NG#Compact_syntax)
    * HTML: Preferences _HTML (Wild Web Developer)_ with _Formating_, etc.
    * CSS/SCSS/LESS: Preferences _CSS (Wild Web Developer)_ with _Validation_, etc.
    * TypeScript 4.9, [with e.g. `satisfies` operator](https://devblogs.microsoft.com/typescript/announcing-typescript-4-9-beta/#the-satisfies-operator)
    * (YSON/YAML schemas: Preferences _General > Schema Associations_)
    * (YAML: Preferences _YAML (Wild Web Developer) > Format_)
    * (DTD: Syntax coloring improved)
* **Git <!--[📽️](https://youtu.be/eEXvOjtauxI?t=16s)-->**
    * _Git Staging_ view: [_Compare with each other_](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.4#Compare_with_each_other_in_Staging_View)
    * ([Show blame menu item in ruler only if not showing blame already](https://git.eclipse.org/c/egit/egit.git/commit/?id=62fc9d7f81bc7b97d443b0d42770cba53d9ac7fc)
* **(Under development)**
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))
    * ([Syntax highlighting and more for various languages/formats via the tm4e language pack feature](https://github.com/eclipse/tm4e/pull/374))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (until release: video title with _+++Coming on December 7, 2022+++_ prefix)
