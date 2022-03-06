<sup>Past releases:
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

# +++ Work in progress (for March 16, 2022) +++<br> Eclipse IDE 2022-03 Improvements Video

* [March 16, 2022](https://calendar.google.com/calendar/event?eid=MG5na2VxbGIzdTYxcW80MGFjbzZ2bW9nbnAgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [68 projects](https://projects.eclipse.org/releases/2022-03) ([-1 +0 → 68](projects_diff.txt)) - [wiki](https://wiki.eclipse.org/Category:SimRel-2022-03) - [website](https://eclipse.org/eclipseide/2022-03) ([New & Noteworthy](https://eclipse.org/eclipseide/2022-03/noteworthy)) - [splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=569333)
* Builds: [latest unreleased](https://download.eclipse.org/technology/epp/staging/) → [released](https://download.eclipse.org/technology/epp/downloads/release/2022-03/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2022-03), [release](http://download.eclipse.org/releases/2022-03))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.22→**4.23**: [Eclipse 4.23 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.23/jdt.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_23.xml#themes_and_priorities), Git [core](https://git.eclipse.org/c/jdt/eclipse.jdt.core.git/log/) [UI](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/log/)
        * [Java 18](https://jdk.java.net/18/): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=575752&hide_resolved=0), [examples](https://wiki.eclipse.org/Java18/Examples)
    * (EclEmma (Java code coverage) 3.1.5: [changes](https://www.eclemma.org/changes.html) ([JaCoCo](https://www.jacoco.org/jacoco/trunk/doc/changes.html)), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * M2Eclipse (Maven) 1.19.0→**1.20.0**: [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#1200), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.20.0-release-review), [commits](https://github.com/eclipse-m2e/m2e-core/compare/1.19.0...1.20.0), [issues](https://github.com/eclipse-m2e/m2e-core/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
        * LemMinx-Maven 0.4.1→**0.5.1**: [release notes](https://github.com/eclipse/lemminx-maven/blob/master/RELEASE_NOTES.md#051), [commits](https://github.com/eclipse/lemminx-maven/compare/0.4.1...0.5.1), [issues](https://github.com/eclipse/lemminx-maven/issues?q=is%3Aissue+sort%3Aupdated-desc+is%3Aclosed)
    * (Buildship (Gradle) 3.1.5: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.5), [commits](https://github.com/eclipse/buildship/commits/master), [announcements](https://discuss.gradle.org/tag/buildship-release))
* General
    * **Platform** 4.22→**4.23**: [Eclipse 4.23 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.23/platform.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_23.xml#themes_and_priorities), [Git](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/log/), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=Equinox&product=Platform&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.2→**1.9.3**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.41→**3.0.42**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.23→**1.24**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 6.0→**6.1**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/6.1)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/6.1.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/6.1.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.13.1→**0.13.3**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [release notes](https://github.com/eclipse/wildwebdeveloper/blob/master/RELEASE_NOTES.md#0133), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.13.1...0.13.3)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.4.4→**4.5.5** [releases](https://github.com/microsoft/TypeScript/releases), announcements [4.5](https://devblogs.microsoft.com/typescript/announcing-typescript-4-5)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.18.1→**0.18.4**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#0184-february-01-2022)
    * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.24→**3.25**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.25&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.25/NewAndNoteworthy/), Git [JSF](https://git.eclipse.org/c/jsf/webtools.jsf.git/log/)/[JEE](https://git.eclipse.org/c/jeetools/webtools.javaee.git/log/)/[EJB](https://git.eclipse.org/c/jeetools/webtools.ejb.git/log/)/[Dali](https://git.eclipse.org/c/dali/webtools.dali.git/log/)/[Server Tools](https://git.eclipse.org/c/servertools/webtools.servertools.git/log/)/[Source Editing](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/)
* C/C++, PHP, Rust
    * ([CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.5→**10.6**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.6.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn106))
        * ([Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.1.2: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.0.0...v6.1.2-202102181132), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.1.2-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/))
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.12: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.20→**0.20.2**: [GitHub](https://github.com/eclipse/lsp4e), [changelog](https://github.com/eclipse/lsp4e/blob/master/CHANGELOG.md#0200), [commits](https://github.com/eclipse/lsp4e/compare/0.20.0...0.20.2), [review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.20.2-release-review)
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.2→**0.4.3**: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.3-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#043), [commits](https://github.com/eclipse/tm4e/compare/0.4.2...0.4.3)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.2.2→**1.2.3**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.2.3-release-review), [release notes](https://github.com/eclipse/corrosion/blob/master/RELEASE_NOTES.md))


### Features to show

* **Java**
    * [Java 18 support via Marketplace](https://marketplace.eclipse.org/content/https://marketplace.eclipse.org/content/java-18-support-eclipse-2022-03-423)
    * Java editor:
        * [Save to static favorites](https://www.eclipse.org/eclipse/news/4.23/jdt.php#save-to-static-favorites) in preferences _Java > Editor > Content Assist > Favorites_
        * ([Content assist in Javadoc in `@see`, `@link` and `@linkplain` proposes modules](https://www.eclipse.org/eclipse/news/4.23/jdt.php#codeassist-module))
        * [Content assist: _Extract lambda body to method_](https://www.eclipse.org/eclipse/news/4.23/jdt.php#extract-lambda-body-to-method)
    * Debug:
        * [Lambda debugging improvements and fixes](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=578069&hide_resolved=0)
            * [Lambda Entry Breakpoint](https://www.eclipse.org/eclipse/news/4.23/jdt.php#lambda-entry-declaration)
            * ([_Step Over_ filters lambda synthetic line now](https://git.eclipse.org/c/jdt/eclipse.jdt.debug.git/commit/?id=010526220bd9e1ec8bf644fa40f947dc6b24b3bd))
        * [Open field declaration](https://www.eclipse.org/eclipse/news/4.23/jdt.php#open-field-declaration)
        * [Highlight labeled objects in the _Expressions_ view too](https://www.eclipse.org/eclipse/news/4.23/jdt.php#labels-in-expressions-view)
        * [Warning before changing a final field](https://www.eclipse.org/eclipse/news/4.23/jdt.php#finalFields) enabled by default (preferences: _Java > Debug : Warn before changing final fields_)
        * [Process ID displayed in _Console_ view header, in _Debug_ view and in properties page of the process](https://www.eclipse.org/eclipse/news/4.23/platform.php#process-pid)
    * [_Call Hierarchy_: Show implementations of callee](https://www.eclipse.org/eclipse/news/4.23/jdt.php#show-implementations-of-callee) in preferences: _Java_ (disabled by default)
    * Java Formatter:
        * [Method invocation wrapping indentation](https://www.eclipse.org/eclipse/news/4.23/jdt.php#formatter-wrap-invocation) (enabled by default; can change formatting):
            * _Line Wrapping > Wrapping settings > Function Calls_ (1)
                * _Qualified invocations > Indent from the base expression's first line_
        * [New options for switch/case constructs](https://www.eclipse.org/eclipse/news/4.23/jdt.php#formatter-switch-case):
            * _New Lines > Keep braced code on one line_ (2)
                * _Switch case with arrow_
                * _Switch expression/statement with arrows_
            * _Line Wrapping > Wrapping Settings > Statement_ (3)
                * _'switch' case with arrow_
                * _Expressions in 'switch' case with arrow_
                * _Expressions in 'switch' case with colon_
    * ([Performance](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&product=PDE&query_format=advanced&short_desc=performance&short_desc_type=allwordssubstr&target_milestone=4.23&target_milestone=4.23%20M1&target_milestone=4.23%20M2&target_milestone=4.23%20M3&target_milestone=4.23%20RC1&target_milestone=4.23%20RC2) (see also [changes by J&ouml;rg Kubitz](https://git.eclipse.org/r/q/owner:jkubitz-eclipse%2540gmx.de+status:merged)))
        * [Speed up startup/shutdown by reducing `state.dat` file sizes](https://bugs.eclipse.org/bugs/show_bug.cgi?id=576646) (caching of Java model)
        * [`CoreASTProvider.getAST()` - Reconciler freezes are sometimes just waits](https://bugs.eclipse.org/bugs/show_bug.cgi?id=575864)
        * ...
    * [Maven](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#1200):
        * [_Console_ view: improved linking](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#improved-links-to-junit-test-reports-and-project-pomxml-in-the-console-of-a-maven-build)
            * Test case (`Running <test>`): opens _JUnit_ view with test results
            * Project (project's headline or `Failed ... on <project>`): opens `pom.xml` of that project
        * [Automatically launch and attach remote debugger](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#automatically-launch-and-attach-remote-application-debugger-when-maven-plug-in-starts-a-forked-jvm-that-waits-for-a-debugger) set breakpoint and `maven.surefire.debug=true` (Tycho: `debugPort=<port-number>`; in the past `Listening for transport dt_socket at address: <port-number>` was logged and a _Remote Java Application_ debug configuration had to be configured and run manually)
        * Content assist:
            * [Without indexer](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#improved-lemminx-based-editor-with-newer-lemminx-maven) requires less disk space (no `.m2/repository/index/`) by using https://search.maven.org/ instead ([commit](https://github.com/eclipse/lemminx-maven/commit/3047870c5a8eb7c84f574e3156535cb60098d036)
            * [Short description of a configuration parameter at the top](https://github.com/eclipse-m2e/m2e-core/issues/477) (instead of at the bottom)
        * XML editor fixes and improvements:
            * Connected editing of start and end tag highlighted with gray instead of pink background
            * _Esc_ to not edit start and end tags together
            * Ctrl+click on start tag to jump to end tag and vice versa
            * ...
        * (Performance improvements: [parent project resolution](https://github.com/eclipse-m2e/m2e-core/commit/ec12bd6222c377f93e21af0dc1988fba2134123d), [`workspaceReader`](https://github.com/eclipse/lemminx-maven/commit/18fb1e5c791435d44d9ce176145622d43556ec1d) and [more](https://github.com/eclipse/lemminx-maven/commit/256aad5056a9963b284a961971cb39ab543ae118))
        * (Embedded Maven updated from 3.8.1 to 3.8.4)
* **General**
    * [Large file associations](https://www.eclipse.org/eclipse/news/4.23/platform.php#large-file-associations): in preferences _General > Editors > Large File Associations_ can be specified which editor is used to open large files of a specific type
    * [Preferences: _Install/Update > Trust_](https://www.eclipse.org/eclipse/news/4.23/platform.php#manage-trusted-pgp-keys)
    * (UI):
        * ([_Progress_ view: new jobs added on bottom](https://www.eclipse.org/eclipse/news/4.23/platform.php#ProgressStableSort) so long running jobs stay on top which makes it easier to hit the cancel button)
        * ([Dark theme on Windows: natively styled buttons](https://www.eclipse.org/eclipse/news/4.23/platform.php#win32-dark-buttons-css))
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported by JDT, Wild Web Developer, etc.))
    * ([Performance](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&product=PDE&query_format=advanced&short_desc=performance&short_desc_type=allwordssubstr&target_milestone=4.23&target_milestone=4.23%20M1&target_milestone=4.23%20M2&target_milestone=4.23%20M3&target_milestone=4.23%20RC1&target_milestone=4.23%20RC2) (see also [changes by J&ouml;rg Kubitz](https://git.eclipse.org/r/q/owner:jkubitz-eclipse%2540gmx.de+status:merged)))
* **Git**
    * [_Fetch Gitea Pull Request..._](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1#Fetching_Pull_Requests) (for [gitea.com](https://gitea.com) and as in the preferences _Version Control (Team) > Git > Servers_)
    * _Git Staging_ view:
        * [_Commit Message_: clean up (as specified by `commit.cleanup`), highlighting of comment lines, preview](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1#Commit_Messages) (comment lines, trailing whitespace, leading and trailing empty lines will be removed by default)
        * [_Hide Untracked Files_ button](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1#Hiding_Untracked_Files) when enabled, number of unstaged changes shown as `(<visible>/<total>)`; switching to a different repository will disable the button
    * [_Push to Upstream_](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1#Push_to_Upstream): considers Git config's `branch.<name>.pushRemote`, `remote.pushDefault` and `push.default` now (like `git push` does on the command line)
    * [Push dialog: allow skipping preview](https://bugs.eclipse.org/bugs/show_bug.cgi?id=577079)
    * [Git branch configuration dialog: now with _Push remote_](https://git.eclipse.org/c/egit/egit.git/commit/?id=d5001280ff9d97634b0f777902c05ebfabd81580) also shown [in the _Properties_ view for a selected branch](https://git.eclipse.org/c/egit/egit.git/commit/?id=871e432f6cf67358ad53df051bb396e6e503551d) (in config as `branch.<name>.pushRemote`)
    * [On Windows, SSH agent support for Win32-OpenSSH (in addition to Pageant)](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1#SSH_Agent_Support) in preferences _Version Control (Team) > Git_ which can be overridden by the `IdentityAgent` config setting
    * [_Git Repositories_ view: _Open in Commit Viewer_ also for branches and tags](https://wiki.eclipse.org/EGit/New_and_Noteworthy/6.1#Git_Repositories_View)
* **(Web)**
    * JavaScript/TypeScript:
        * ([Const Assertions and Default Type Arguments in JSDoc](https://devblogs.microsoft.com/typescript/announcing-typescript-4-5/#jsdoc-const-and-type-arg-defaults))
        * ([New Snippet Completions](https://devblogs.microsoft.com/typescript/announcing-typescript-4-5/#snippet-completions) only for TypeScript)
* **Misc**
    * [Basic feature set in all 11 IDE packages](https://bugs.eclipse.org/bugs/show_bug.cgi?id=577714)
        * Embedded Java 17.0.2 (e.g. now also in _Eclipse IDE for Eclipse Committers_)
        * Terminal (e.g. now also in _Eclipse IDE for Eclipse Committers_)
        * (Git support via JGit/EGit)

* **(Under development)**
    * ([Debug: show values inline](https://www.eclipse.org/eclipse/news/4.23/platform.php#inline-debug-values) (not yet supported in Java, JavaScript, etc.))
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
