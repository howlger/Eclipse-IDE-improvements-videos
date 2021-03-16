<sup>Past releases:
[2020-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-12)
[2020-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-09)
[2020-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-06)
[2020-03](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2020-03)
[2019-12](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-12)
[2019-09](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-09)
[2019-06](https://github.com/howlger/Eclipse-IDE-improvements-videos/tree/2019-06)
</sup>

# [Eclipse IDE 2021-03](https://wiki.eclipse.org/Category:SimRel-2021-03) Improvements Video
* [March 17, 2021](https://www.google.com/calendar/event?eid=NnNtbjdzMXJiZXRjN2lnYnNyZHV1azgwOTAgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin)) - [70 projects](https://projects.eclipse.org/releases/2021-03) ([-1 +0 → -1](projects_diff.txt)) - [Website](https://eclipse.org/eclipseide/2021-03) ([New & Noteworthy](https://eclipse.org/eclipseide/2021-03/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=553853)
* [Latest CI builds](https://download.eclipse.org/technology/epp/staging/) ([Jenkins](https://ci.eclipse.org/packaging/job/simrel.epp-tycho-build), [log](https://git.eclipse.org/c/simrel/org.eclipse.simrel.build.git/log/), update sites: [staging](https://download.eclipse.org/staging/2021-03), [release](http://download.eclipse.org/releases/2021-03))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* Java, Maven, Gradle
    * Java development tools (JDT) 4.18→**4.19**: [Eclipse 4.19 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.19/jdt.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_19.xml#themes_and_priorities), Git [core](https://git.eclipse.org/c/jdt/eclipse.jdt.core.git/log/) [UI](https://git.eclipse.org/c/jdt/eclipse.jdt.ui.git/log/)
        * [Java 16](https://jdk.java.net/16/) as preview via [Marketplace](https://marketplace.eclipse.org/content/java-16-support-eclipse-2021-03-419): [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=565620&hide_resolved=0), [examples](https://wiki.eclipse.org/Java16/Examples)
    * (EclEmma (Java code coverage) 3.1.4: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.17.1→**1.17.2**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=m2e&query_format=advanced&order=changeddate%20DESC&target_milestone=1.17.2), [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [release notes](https://github.com/eclipse-m2e/m2e-core/blob/master/RELEASE_NOTES.md#1172), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.16.2-release-review))
    * (Buildship (Gradle) 3.1.4: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.4) → [announcements](https://discuss.gradle.org/tag/buildship-release))
    * (WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.20→**3.21**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
* General
    * **Platform** 4.19→**4.19**: [Eclipse 4.19 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.19/platform.php) ([log](https://git.eclipse.org/c/www.eclipse.org/eclipse/news.git/log/)), [plan](https://www.eclipse.org/projects/project-plan.php?planurl=http://www.eclipse.org/eclipse/development/plans/eclipse_project_plan_4_18.xml#themes_and_priorities), [Git](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/log/), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.9.0→**1.9.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 2.0: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn WikiText 3.0.38: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Mylyn Tasks 3.25.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Oomph 1.17/18: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* J**Git**/EGit 5.10→**5.11**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.11)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.11.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.11.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.11.4→**0.11.5**: [GitHub](https://github.com/eclipse/wildwebdeveloper), [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.11.4...0.11.5)
        * JavaScript/TypeScript language server ([`typescript@...`](https://github.com/eclipse/wildwebdeveloper/blob/master/org.eclipse.wildwebdeveloper/pom.xml); `plugins/org.eclipse.wildwebdeveloper_<version>/node_modules/typescript/package.json`): 4.0.5→**4.1.3** [releases](https://github.com/microsoft/TypeScript/releases), [announcement](https://devblogs.microsoft.com/typescript/announcing-typescript-4-1/)
    * [LemMinX](https://projects.eclipse.org/projects/technology.lemminx) 0.14.1→**0.15**: [GitHub](https://github.com/eclipse/lemminx), [changelog](https://github.com/eclipse/lemminx/blob/master/CHANGELOG.md#change-log)
    * [Web Tools Platform](https://projects.eclipse.org/projects/webtools) 3.20→**3.21**: [bugs](https://bugs.eclipse.org/bugs/report.cgi?x_axis_field=bug_status&y_axis_field=product&query_format=report-table&classification=WebTools&target_milestone=3.21&format=table&action=wrap), [_New & Noteworthy_](https://www.eclipse.org/webtools/releases/3.21/NewAndNoteworthy/)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 10.1→**10.2**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/10.2.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn102)
        * [Embedded CDT](https://projects.eclipse.org/projects/iot.embed-cdt) (C/C++ for Arm/RISC-V) 6.0→**6.1.2**: [GitHub](https://github.com/eclipse-embed-cdt/eclipse-plugins), [commits](https://github.com/eclipse-embed-cdt/eclipse-plugins/compare/v6.0.0...v6.1.2-202102181132), [review](https://projects.eclipse.org/projects/iot.embed-cdt/reviews/6.1.2-release-review), [blog](https://gnu-mcu-eclipse.github.io/blog/)
    * ([PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.2: [issues](https://github.com/eclipse/pdt/issues?q=is%3Aissue+sort%3Aupdated-asc), [Git](https://github.com/eclipse/pdt/commits/master), [_New & Noteworthy_](https://wiki.eclipse.org/PDT/NewIn72))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.10: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * ([LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.17→**0.18**: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), ([review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.15.0-release-review)))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.4.1: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.4.1-release-review), [_New & Noteworthy_](https://github.com/eclipse/tm4e/blob/master/RELEASE_NOTES.md#041)
    * ([Corrosion](https://github.com/eclipse/corrosion) (only via Eclipse IDE for Rust Developers) 1.1.0→**1.1.1**: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/1.1.1-release-review))


### Features to show

* **Java**
    * [Java 16 support via Marketplace](https://marketplace.eclipse.org/content/java-16-support-eclipse-2021-03-419)
    * Clean-up (+16; [AutoRefactor](https://github.com/JnRouvignac/AutoRefactor) merged into [Eclipse](https://bugs.eclipse.org/bugs/buglist.cgi?classification=Eclipse%20Project&product=JDT&query_format=advanced&short_desc=AutoRefactor&short_desc_type=allwordssubstr) by [Fabrice Tiercelin](https://projects.eclipse.org/projects/eclipse.jdt/elections/election-fabrice-tiercelin-committer-eclipse-java-development-tools-jdt))
        * [_Java Feature_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#java-feature) (+3; new tab)
            * [Java 15 with preview features: _Pattern matching for instanceof_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#pattern-matching)
            * [Java 8: _Use Comparator.comparing()_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#comparator-comparing)
            * [Java 7: _Use Multi-catch_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#multi-catch)
        * [_Source Fixing_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#source-fixing) (+2; new tab)
            * [_Avoid Object.equals() or String.equalsIgnoreCase() on null objects_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#invert-equals)
            * [_Compare to zero_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#comparison-zero)
        * _Code Style_ (+2)
            * [_Reduce indentation when possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#reduce-indentation)
            * [_Extract increment/decrement from statement_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#extract-increment)
        * _Duplicate code_ (+1)
            * [_Pull down common code from if/else statement_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#control-flow-merge)
        * _Unnecessary Code_ (+3)
            * [_Redundant String.substring() parameter_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#substring)
            * [_Unreachable block_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#unreachable-block)
            * [_Convert loop into if when possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#unlooped-while)
        * _Optimization_ (+5)
            * [_Convert fields into local variables if the use is only local_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#convert-fields)
            * [_Make inner classes static where possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#static-inner-class)
            * [_Use String.replace() instead of String.replaceAll() when possible_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#string-replace)
            * [_Primitive comparison_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#primitive-comparison)
            * [_Primitive parsing_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#primitive-parsing)
    * Java editor:
        * [Quick assists: _Assign to new local variable in try-with-resources (Ctrl+2, T)_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#try-with-resources-quick-assist)
        * [Add catch clause to try-with-resources assists](https://www.eclipse.org/eclipse/news/4.19/jdt.php#add-catch-to-try-with-resources-assists)
        * [Quick fixe: _Create permitted type declaration_](https://www.eclipse.org/eclipse/news/4.19/jdt.php#create-permitted-type-declaration)
    * [Coloring of restricted identifiers](https://www.eclipse.org/eclipse/news/4.19/jdt.php#restricted-identifier-preference)
    * Performance:
        * [Parallel index search](https://www.eclipse.org/eclipse/news/4.19/jdt.php#parallel-index-search)
        * [Non-blocking Java code completion also in the _Eclipse IDE for Enterprise Java Developers_](https://www.eclipse.org/eclipse/news/4.16/jdt.php#default-non-blocking-completion) ← in _Eclipse IDE for Enterprise Java Developers_ ([was blocked by JPA JPQL proposals](https://bugs.eclipse.org/bugs/show_bug.cgi?id=563158#c5))
        * ([Use of new atomic marker API](https://bugs.eclipse.org/bugs/show_bug.cgi?id=571017))
        * ([Code Minings: less often computed](https://bugs.eclipse.org/bugs/show_bug.cgi?id=570727))
    * [Externally annotate sources](https://www.eclipse.org/eclipse/news/4.19/jdt.php#annotate-for-source-folders)
    * Debug
        * [Toggle tracepoints in editor ruler](https://www.eclipse.org/eclipse/news/4.19/jdt.php#toggle-tracepoints)
        * [Toggle breakpoint on a list of methods including abstract method](https://www.eclipse.org/eclipse/news/4.19/jdt.php#toggle-breakpoints-works-listofmethods-including-abstract)
        * [_Breakpoints_ view: _Disable All_](https://www.eclipse.org/eclipse/news/4.19/platform.php#disable-all-breakpoints) (general, not only in Java)
    * ([JUnit 5.7.1](https://www.eclipse.org/eclipse/news/4.19/jdt.php#junit-5.7.1): see [release notes](https://junit.org/junit5/docs/5.7.1/release-notes/#release-notes-5.7.1/))
* **General**
    * [_Console_ view: _Find Next_ (Ctrl+K) and _Find Previous_ (Ctrl+Shift+K)](https://www.eclipse.org/eclipse/news/4.19/platform.php#console-find-next-find-previous)
    * [UI](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=569282&hide_resolved=0)
        * [Horizontal scrolling via Shift plus mouse wheel and via touchpad gestures](https://www.eclipse.org/eclipse/news/4.19/platform.php#editors-horizontal-scroll)
        * [_Open Resource_ dialog shows projects](https://bugs.eclipse.org/bugs/show_bug.cgi?id=479218)
        * ([_Compare_ editor wastes less space](https://bugs.eclipse.org/bugs/show_bug.cgi?id=551573))
        * ([Windows: Microsoft Edge as external browser](https://www.eclipse.org/eclipse/news/4.19/platform.php#browsers-windows-update))
    * [Performance improvements](https://bugs.eclipse.org/bugs/show_bug.cgi?id=569285)
        * ([New atomic marker API](https://bugs.eclipse.org/bugs/show_bug.cgi?id=570914) and [make use of it in the platform](https://bugs.eclipse.org/bugs/show_bug.cgi?id=570952))
        * ([Windows: Avoid JNI for trivial arithmetic macros](https://www.eclipse.org/eclipse/news/4.19/platform.php#linux-equinox-security-jna))
    * [Launch configuration: _Terminate child-processes if terminating the launched process_ checkbox](https://www.eclipse.org/eclipse/news/4.19/platform.php#termination-of-descendants-is-configurable) in the _Common_ tab; enabled by default for same behavior as in previous Eclipse
* **Git**
    * [Signing](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11#Signatures)
        * [External GPG signer support](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11#Using_GPG_to_Sign_Commits_and_Tags): requires to interact with the user via GUI dialogs, like GnuPG does ([commit](https://git.eclipse.org/c/egit/egit.git/commit/?id=2b66e9b8baa2104c320c301daea9147227ef39fe): as workaround when patent-encumbered AES/OCB cipher is needed not provided by Bouncy Castle)
        * [Verifying Commit Signatures](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11#Verifying_Commit_Signatures) Disabled by default; in preferences _Git > History_ for _Show in Revision Comment_ option _Verify Signatures_
        * [Signing of tags](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11#Creating_Signed_Tags)
    * [_Properties_ view for _Commit Viewer_ and in _Git Repositories_ view selected tags](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11#Properties_View): When the selected tag target is a commit, buttons to open the commit in the _Commit Viewer_ and to show the commit in the _History_ are displayed ([537695](https://bugs.eclipse.org/bugs/show_bug.cgi?id=537695))
    * ([SSH: JSch was dropped in favor of using Apache MINA sshd only](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11#Properties_View): so in preference no option anymore to choose which one to use (environment variable `GIT_SSH` to use external SSH tool can be used as before))
    * Performance
        * [Fetching: more efficient protocol V2 is used when server supports it](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.11#Git_Protocol))
        * (Startup (via OSGi services)):
            * [Let the framework run the configuration check](https://git.eclipse.org/c/egit/egit.git/commit/?id=4d8ae5e93d40dbf3908d9abcbf5db5180ec855a8)
            * [Register template variable resolvers in StartEventListener](https://git.eclipse.org/c/egit/egit.git/commit/?id=6483bcae41c2af9999a9e7d341f207b30dc92938) ([564708](https://bugs.eclipse.org/bugs/show_bug.cgi?id=564708))
            * [EGit UI DebugOptionsListener as a OSGi declarative service](https://git.eclipse.org/c/egit/egit.git/commit/?id=6c9309466b6f220fd777c0605f2a49caabf66310)
            * [Simplify the EGit UI Activator by using OSGi declarative services](https://git.eclipse.org/c/egit/egit.git/commit/?id=dfd0958aa593fda3c7a930f600aaf3c46e4f350c)
        * ([ResourceStateFactory: avoid string concatenation](https://bugs.eclipse.org/bugs/show_bug.cgi?id=570962))
* **Web**
    * Embedded language server updated:
        * TypeScript 4.1 support
        * [Navigation support for `@see` targets](https://devblogs.microsoft.com/typescript/announcing-typescript-4-1/#editor-support-for-the-jsdoc-see-tag), e.g. `@see other.foo`
    * ([XML CodeLens preference page](https://github.com/eclipse/wildwebdeveloper/issues/636) ← [not working yet](https://github.com/eclipse/wildwebdeveloper/issues/644))
    * ([Implemented "openDoc" to open the given URL in an external browser](https://github.com/eclipse/wildwebdeveloper/commit/9f742827d63237a0deb9311971cecbe33e4db558) for ESLint Quick Fix (Ctrl+1) _Show documentation for ..._)
    * ([Read WTP extension point for catalog mapping](https://github.com/eclipse/wildwebdeveloper/commit/10d7dfed566dec2c8923df9cb855118b803ff952))
    * ([WTP XML editor: opening an XML file from command line at a specific line number](https://bugs.eclipse.org/bugs/show_bug.cgi?id=567708), e.g. `--launcher.openFile sample.xml:42`)
    * [_Eclipse IDE for JavaScript and Web Developers_ by _Eclipse Wild Web Developer_ instead of _EPP_](https://bugs.eclipse.org/bugs/show_bug.cgi?id=571132)
        * Missing in Eclipse Installer and from [download page](https://www.eclipse.org/downloads/packages/release/2021-03/rc1) (see [reasons](https://twitter.com/mickaelistria/status/1369284771063488515))
* **(Under development)**
    * ([Apple silicon](https://bugs.eclipse.org/bugs/show_bug.cgi?id=565690))
    * ([Upgrade and improve Chromium support in SWT](https://bugs.eclipse.org/bugs/show_bug.cgi?id=566608): no commits in last 3 month (see also [how to enable it](https://bugs.eclipse.org/bugs/show_bug.cgi?id=549585#c117)))

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
