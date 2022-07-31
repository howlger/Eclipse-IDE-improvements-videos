<sup>Past releases:
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

# [Eclipse IDE 2022-06 Improvements Video](https://youtu.be/zDJtVYAJwyY)

* [June 15, 2022](https://calendar.google.com/calendar/event?eid=N3JqaXRwa21jNW5lYmU4OTc0aGZzY2J0NGEgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [67 projects](https://projects.eclipse.org/releases/2022-06) ([-1 +0 → 67](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2022-06) - [website](https://eclipse.org/eclipseide/2022-06) ([New & Noteworthy](https://eclipse.org/eclipseide/2022-06/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575781)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2022-06/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2022-06), [release](http://download.eclipse.org/releases/2022-06))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.23→**4.24**: [Eclipse 4.24 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.24/jdt.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.24/jdt.html)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_24.xml#themes_and_priorities), Git [core](https://github.com/eclipse-jdt/eclipse.jdt.core/commits/master) [UI](https://github.com/eclipse-jdt/eclipse.jdt.ui/commits/master)
        * [Java 18](https://jdk.java.net/18/): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=575752&hide_resolved=0), [examples](https://wiki.eclipse.org/Java18/Examples)
    * EclEmma (Java code coverage) 3.1.5→**3.1.6**: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC)
    * (M2Eclipse (Maven) 1.20.0→**1.20.1**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#1201), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.20.1-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/1.20.0...1.20.1), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed))
        * LemMinx-Maven 0.4.1→**0.5.1**: [release notes](https://github.com/eclipse/lemminx-maven/blob/master/RELEASE_NOTES.md#051), [commits](https://github.com/eclipse/lemminx-maven/compare/0.4.1...0.5.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * Buildship (Gradle) 3.1.5→**3.1.6**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.6), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release)
* General
    * **Platform** 4.23→**4.24**: [Eclipse 4.24 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.24/platform.php) ([log](https://github.com/eclipse-platform/www.eclipse.org-eclipse-news/commits/master/4.24/platform.html)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_24.xml#themes_and_priorities), [Git](https://github.com/eclipse-platform/eclipse.platform.ui/commits/master), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=Equinox&product=Platform&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.2→**1.9.3**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.41→**3.0.42**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.23→**1.24**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 6.1→**6.2**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.2)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.2), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.2.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.2.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.13.3→**0.13.5**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#0135), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.13.3...0.13.5)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.5.5→**4.6.4** [releases](https://github.com/microsoft/TypeScript/releases), announcements [4.6](https://devblogs.microsoft.com/typescript/announcing-typescript-4-6)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.18.4→**0.19.1**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#0200-march-29-2022)
    * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.25→**3.26**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.26&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.26/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/)
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.6→**10.7**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.7.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn107))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.1.2→**6.2.1**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.1.2...v6.2.1), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.2.1-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * [LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.12→**0.14**: [Git](https://github.com/eclipse/lsp4j/commits/main), [review](https://projects.eclipse.org/projects/technology.lsp4j)
    * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.20.2→**0.20.4**: [GitHub](https://github.com/eclipse/lsp4e), [changelog](https://github.com/eclipse/lsp4e/blob/master/CHANGELOG.md#0204), [commits](https://github.com/eclipse/lsp4e/compare/0.20.2...0.20.4), [review](https://projects.eclipse.org/projects/technology.lsp4e/releases/0.20.4)
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.3→**0.4.5**: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.5-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#045), [commits](https://github.com/eclipse/tm4e/compare/0.4.3...0.4.5)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.3: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.3-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java [📽️](https://youtu.be/zDJtVYAJwyY?t=16s)**
    * [Java 18 support](https://www.eclipse.org/eclipse/news/4.24/jdt.php#Java_18)
        * All Java [IDE packages shipped with Java 17](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/commit/?id=c79b66ba2004861ad90596e51ab299ce8888ab99) (including [Scout](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/commit/?id=3b9200281029a3407487da5a191a80a334ad28ff)), so a Java 18 JDK has to be configured in the preferences _Java > Installed JREs_
        * Code Snippets in Java API Documentation
        * (Pattern Matching for switch (Second Preview))
        * (Code coverage also for Java 18 (via EclEmma 3.1.6))
    * [Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-jdt+committer-date%3A2022-03-05..2022-06-10&s=committer-date&o=desc&type=Commits)
        * [Faster content assist, e.g for `List<String> list = new A|`](https://github.com/eclipse-jdt/eclipse.jdt.ui/commit/44d1cac7bbaf7a53357ad63dc01e45bfc1082633)
    * Java editor:
        * [New quick fixes to create sub type for sealed super type](https://www.eclipse.org/eclipse/news/4.24/jdt.php#create_sub_type_for_sealed_type)
        * [New quick assist: _Create new interface, extending ..._](https://www.eclipse.org/eclipse/news/4.24/jdt.php#extend_interface_assist)
    * Cleanups:
        * [_Unnecessary Code > Unused code > Remove unused private method parameters_](https://www.eclipse.org/eclipse/news/4.24/jdt.php#strconcat-to-textblock)
        * [_Unnecessary Code > Unnecessary code > Remove overridden assignment > Move declaration if necessary_](https://github.com/eclipse-jdt/eclipse.jdt.ui/pull/27)
        * [_Java Feature > Java 7 > Replace system property with constant_ improved](https://www.eclipse.org/eclipse/news/4.24/jdt.php#extend-system-properties): _Boolean property_ → _Boxed type property_ also for _Integer_ and _Long_
    * ([_JUnit_ view: _Rerun Test - Failures First_ button](https://www.eclipse.org/eclipse/news/4.24/jdt.php#junit5-rerun-failures-first))
    * Debug:
        * ([_Java Stack Trace Console_: support for Java stack traces copied from _Debug_ view (via _Copy Stack_ action)](https://www.eclipse.org/eclipse/news/4.24/jdt.php#debug-stack))
    * (Gradle: [_New Gradle Project_ for a Gradle version > 6.6.1 no longer requires running Eclipse with Java 11](https://github.com/eclipse/buildship/issues/1077), but [still creates two projects, one with the chosen name and a nested `lib` project](https://github.com/eclipse/buildship/issues/1118) (so the following workaround has still to be used to create a Gradle > 6.6.1 project without a nested `lib` project: _New Gradle Project_ with _Specific Gradle version_ 6.6.1 and _Java home_ of a Java 11 JDK and then in `build.gradle` change `id 'java-library'` to `id 'application'` to keep the simple project structure when in _Project > Properties: Gradle_ choosing a higher Gradle version))
* **General/Platform [📽️](https://youtu.be/zDJtVYAJwyY?t=475s)**
    * ([Welcome screen will not hide main toolbar anymore](https://www.eclipse.org/eclipse/news/4.24/platform.php#welcomescreen))
    * [New multi selection commands](https://www.eclipse.org/eclipse/news/4.24/platform.php#multi-select-commands) (no default key bindings):
        * _Add all matches to multi-selection_ (e.g. Ctrl+Alt+Shift+K)
        * _Multi selection down relative to anchor selection_ (e.g. Alt+K)
        * _Multi selection up relative to anchor selection_ (e.g. Alt+Shift+K)
        * _Multi caret down_ (e.g. Alt+.)
        * _Multi caret up_ (e.g. Alt+,)
        * _End multi-selection_ (e.g. Esc)
    * UTF-8 by default:
        * [Explicit encoding set for new workspaces](https://www.eclipse.org/eclipse/news/4.24/platform.php#explicit-encoding-workspaces)
        * [Explicit encoding set for new projects](https://www.eclipse.org/eclipse/news/4.24/platform.php#explicit-encoding-projects)
        * [Warning for projects with no explicit default encoding](https://www.eclipse.org/eclipse/news/4.24/platform.php#no-explicit-encoding-project-warning)
    * [_Find Actions_ (Ctrl+3) to open a file](https://www.eclipse.org/eclipse/news/4.24/platform.php#codeassist-module)
    * ([Debug thread names](https://www.eclipse.org/eclipse/news/4.24/platform.php#debug-monitor-thread-names))
    * [UI](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2022-03-05..2022-06-10&s=committer-date&type=Commits):
        * [Dark theme](https://github.com/search?utf8=%E2%9C%93&q=dark+OR+light+OR+theme+OR+layout+org%3Aeclipse-platform+org%3Aeclipse-jdt+committer-date%3A2022-03-05..2022-06-10&s=committer-date&type=Commits)
            * [Windows: Disable tree and table lines](https://bugs.eclipse.org/bugs/show_bug.cgi?id=567933)
            * [Windows: Use CTabFolder to improve dark theme](https://github.com/eclipse-platform/eclipse.platform.team/commit/3b042694088b273c9c37bdcfbf36b249bf46b5e5) e.g. in the preferences _General > Compare/Patch_
            * [Windows: In search field the x button](https://github.com/eclipse-platform/eclipse.platform.swt/issues/18#issuecomment-1086413468)
    * [Performance](https://github.com/search?utf8=%E2%9C%93&q=performance+OR+speed+OR+faster+org%3Aeclipse-equinox+org%3Aeclipse-platform+committer-date%3A2022-03-05..2022-06-10&s=committer-date&o=desc&type=Commits)
        * [Faster _Console_](https://github.com/eclipse-platform/eclipse.platform.debug/commit/a31baf97eda1ae062ead1db1215742e2be6b51e0) ([example](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575275#c1))
        * ([Faster sorting of markers](https://github.com/eclipse-platform/eclipse.platform.ui/issues/53))
        * ([Equinox: Improve performance for operations that modify framework state](https://github.com/eclipse-equinox/equinox.framework/commit/fa10a40b86d58b54fba2789bf9794c5795053f62))
* **Git [📽️](https://youtu.be/zDJtVYAJwyY?t=730s)**
    * _Git Staging_ view:
        * [_Push Settings_ button](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.2#Git_Staging_View)
        * [Support for `core.commentChar`](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.2#Commit_Messages)
        * [Support of config's `core.commentChar`](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.2#Commit_Messages) (see [Git documentation](https://git-scm.com/docs/git-config#Documentation/git-config.txt-corecommentChar))
* **Web [📽️](https://youtu.be/zDJtVYAJwyY?t=828)**
    * JavaScript/TypeScript:
        * [More syntax and binding errors](https://devblogs.microsoft.com/typescript/announcing-typescript-4-6/#more-syntax-and-binding-errors-in-javascript) ([examples](https://github.com/microsoft/TypeScript/blob/main/tests/baselines/reference/plainJSGrammarErrors.js))
        * ([Always receive grammar and binding errors](https://devblogs.microsoft.com/typescript/announcing-typescript-4-6/#javascript-files-always-receive-grammar-and-binding-errors))
* **(Under development)**
    * ([Preferences: _Install/Update > Trust_](https://www.eclipse.org/eclipse/news/4.23/platform.php#manage-trusted-pgp-keys) (work in progress; [_rollout for 2022-06_](https://gitlab.eclipse.org/eclipse-wg/ide-wg/ide-wg.eclipse.org/-/issues/11)))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-) (until release: video title with _+++Coming on June 15, 2022+++_ prefix)
