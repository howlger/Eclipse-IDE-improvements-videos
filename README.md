<sup>Past releases:
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

# +++ Work in progress (for September 14, 2022) +++<br> Eclipse IDE 2022-09 Improvements Video

* [September 14, 2022](https://calendar.google.com/calendar/event?eid=MWlubzM1cWdzZjU2aHJnZTgxc2hscmsxb2ogZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [66 projects](https://projects.eclipse.org/releases/2022-09) ([-1 +0 → 66](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2022-09) - [website](https://eclipse.org/eclipseide/2022-09) ([New & Noteworthy](https://eclipse.org/eclipseide/2022-09/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575781)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2022-09/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2022-09), [release](http://download.eclipse.org/releases/2022-09))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.24→**4.25**: [Eclipse 4.25 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.25/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.25/jdt.html)), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 19](https://jdk.java.net/19/): [issues](https://github.com/eclipse-jdt/eclipse.jdt.core/milestone/13?closed=1), [examples](https://wiki.eclipse.org/Java19/Examples)
    * (EclEmma (Java code coverage) 3.1.6: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 1.20.1→**2.0.2**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#202), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/2.0.2-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/1.20.1...2.0.2), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * LemMinx-Maven 0.5.2→**0.6.0**: [release notes](https://github.com/eclipse/lemminx-maven/releases/tag/0.6.0), [commits](https://github.com/eclipse/lemminx-maven/compare/0.5.2...0.6.0), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * (Buildship (Gradle) 3.1.6: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.6), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.24→**4.25**: [Eclipse 4.25 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.25/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.25/platform.html)), Git [UI](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master) [text](https://github.com/eclipse-platform/eclipse.platform.text/commits/master), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=Equinox&product=Platform&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.10.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.41→**3.0.42**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Oomph 1.25→**1.26**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 6.2→**6.3**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.3)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.3), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.3.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.3.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * ([Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.13.5→**0.15.0**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#0150), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.13.5...0.15.0))
        * (JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.6.4 [releases](https://github.com/microsoft/TypeScript/releases), announcements [4.6](https://devblogs.microsoft.com/typescript/announcing-typescript-4-6))
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.19.1→**0.21.0**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/main/CHANGELOG.md#0200-march-29-2022)
    * ([Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.26→**3.27**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.27&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.27/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.7→**10.7.1**: [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn107), [release](https://github.com/eclipse-cdt/cdt/releases/tag/CDT_10_7_1), [commits](https://github.com/eclipse-cdt/cdt/compare/CDT_10_7_0...CDT_10_7_1), [issues](https://github.com/eclipse-cdt/cdt/issues?q=is%3Aissue+sort%3Aupdated-desc))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.2.1→**6.3.0**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.2.1...v6.3.0), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.3.0-release-review), [news](https://eclipse-embed-cdt.github.io/news/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * [LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.14→**0.15**: [release](https://github.com/eclipse/lsp4j/releases/tag/v0.15.0), [commits](https://github.com/eclipse/lsp4j/compare/v0.14.0...v0.15.0), [review](https://projects.eclipse.org/projects/technology.lsp4j)
    * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.20.5→**0.20.6**: [GitHub](https://github.com/eclipse/lsp4e), [release](https://github.com/eclipse/lsp4e/releases/tag/0.20.6), [commits](https://github.com/eclipse/lsp4e/compare/0.20.5...0.20.6), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.20.6)
    * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.5→**0.6.0**: [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.6.0-release-review), [release notes](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#060), [commits](https://github.com/eclipse/tm4e/compare/0.4.5...0.6.0)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.4: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.4-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java <!-- [📽️](https://youtu.be/zDJtVYAJwyY?t=16s) -->**
    * [Java 19 support via Marketplace](https://marketplace.eclipse.org/content/java-19-support-eclipse-2022-09-425)
        * By the way, Eclipse 2022-09 requires Java 17 and is shipped with latest Java 17(.0.4)
    * Cleanups:
        * [_Java Feature > Java 14 > Convert to switch expression where possible_ improved](https://www.eclipse.org/eclipse/news/4.25/jdt.php#convert-to-switch-expression): if all cases either end in a return statement or a throw of an exception, then `return switch(...) { ... }` (in the past, only if all cases end in an assignment of the same variable or a throw of an exception)
        * [_Java Feature > Java 5 > Convert to enhanced 'for' loops_ improved](https://www.eclipse.org/eclipse/news/4.25/jdt.php#while-to-enhanced-for) to replace also _while_ loops with _for_ loops
        * [New buttons](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/162):
            * Per tab: _Select All_ and _Deselect All_
            * At the bottom: _Restore Defaults_ and _Reset Profile_
    * [_New JUnit Test Suite_ dialog also for JUnit 5](https://www.eclipse.org/eclipse/news/4.25/jdt.php#junit5-test-suite-wizard-support)
    * [_New Java Project_ dialog with module name and option for comment instead of separate dialog](https://github.com/eclipse-jdt/eclipse.jdt.ui/issues/59)
    * Debug:
        * [Double click in "All References and "All Instances" pop-up to navigate to Type](https://www.eclipse.org/eclipse/news/4.25/jdt.php#doubleclick-in-debug-popups)
    * ([Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2022-06-05..2022-09-10&s=committer-date&o=desc&type=Commits))
       * (Performance test results tables are back on download page, e.g. for [4.25RC2](https://download.eclipse.org/eclipse/downloads/drops4/S-4.25RC2-202208311800/performance/performance.php))
* **Maven <!-- [📽️](https://youtu.be/zDJtVYAJwyY?t=16s) -->**
    * [Autocompletion for directory/file based properties](https://github.com/eclipse/lemminx-maven/issues/292), e.g. `<parent><relativePath>../|</relativePath>`
    * [Annotation processors support](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#inclusion-of-m2e-apt-plugins-for-annotation-processors) (in the past, JBoss Tools m2e-apt plugins have been required to be installed for that)
    * [Maven archiver support](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#inclusion-of-maven-archiver-connector) (in the past, not shipped by default; now in [m2e core](https://github.com/eclipse-m2e/m2e-core/tree/master/org.eclipse.m2e.mavenarchiver))
    * [Colored Maven log in _Console_ view](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#support-for-colored-maven-console-printouts) (requires ANSI support to be enabled: see below)
* **General/Platform <!-- [📽️](https://youtu.be/zDJtVYAJwyY?t=475s) -->**
    * [Support for ANSI escape codes in Console](https://www.eclipse.org/eclipse/news/4.25/platform.php#debug-ansi-support): preferences _Run/Debug > Console > ANSI Support_
    * [System encoding for Console](https://www.eclipse.org/eclipse/news/4.25/platform.php#debug-system-encoding): in launch configuration in _Common_ tab
    * [Preference: _Enable word wrap when opening an editor_](https://www.eclipse.org/eclipse/news/4.25/platform.php#enable-word-wrap-on-open) in preferences _General > Editors > Text Editors_
    * [Preference: missing project encoding severity](https://www.eclipse.org/eclipse/news/4.25/platform.php#specify-project-encoding-severity) in preferences _General > Workspace_
    * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2022-06-05..2022-09-10&s=committer-date&type=Commits):
        * [Forms with default background color](https://www.eclipse.org/eclipse/news/4.25/platform.php#form-no-gradients)
        * [Selected CTabFolder highlighting](https://www.eclipse.org/eclipse/news/4.25/platform.php#CTabFolder-highlightBar)
        * [Less usage of icons in user confirmation dialogs](https://www.eclipse.org/eclipse/news/4.25/platform.php#less-icons-in-user-dialogs)
        * ([System theme removed](https://github.com/eclipse-platform/eclipse.platform.ui/commit/9328b2d43cea202deb96f1ce88d73dd39acaa99d))
    * [Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-equinox+org%3Aeclipse-platform+committer-date%3A2022-06-05..2022-09-10&s=committer-date&o=desc&type=Commits)
        * [Faster _File Search_](https://github.com/eclipse-platform/eclipse.platform.text/commit/e4fa8d9b12f5229ded1eed8540ddc10f45fe81d2)
* (**Git <!-- [📽️](https://youtu.be/zDJtVYAJwyY?t=730s) -->**)
    * (_Git Staging_ view: [Show `core.commentChar` in a tooltip](https://git.eclipse.org/c/egit/egit.git/commit/?id=b8501646b447f0c7b0f7dc73569bc9e654ae58fa))
* **(Under development)**
    * ([Preferences: _Install/Update > Trust_](https://www.eclipse.org/eclipse/news/4.23/platform.php#manage-trusted-pgp-keys) (work in progress; [_rollout for 2022-06_](https://gitlab.eclipse.org/eclipse-wg/ide-wg/ide-wg.eclipse.org/-/issues/11)))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))
    * ([Syntax highlighting and more for various languages/formats via the tm4e language pack feature](https://github.com/eclipse/tm4e/pull/374))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (until release: video title with _+++Coming on September 14, 2022+++_ prefix)
