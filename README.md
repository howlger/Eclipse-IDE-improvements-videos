# Eclipse IDE Improvements Videos

## [Eclipse 2020-03](https://wiki.eclipse.org/Category:SimRel-2020-03) - [March 18, 2020](https://calendar.google.com/calendar/event?eid=MDhtZmpjYmNnZzVrbmxuaWJrYXBkcGkxc2YgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [74 projects](https://projects.eclipse.org/releases/2020-03) ([-3 +1 → -2](projects_diff.txt)) - [Website](https://eclipse.org/eclipseide/2020-03) ([New & Noteworthy](https://eclipse.org/eclipseide/2020-03/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545158)
* [Latest CI builds](https://hudson.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2020-03), [release](http://download.eclipse.org/releases/2020-03))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)

### Java, Maven, Gradle
* **Sources**
    * Java development tools (JDT) 4.14→**4.15**: [Eclipse 4.15 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.15/jdt.php)
        * Java 14 ([March 17, 2020](https://openjdk.java.net/projects/jdk/14/), [download](https://jdk.java.net/14/)): [via Marketplace](https://marketplace.eclipse.org/content/java-14-support-eclipse-2020-03-415), [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=549808), [examples](https://wiki.eclipse.org/Java14/Examples)
    * (EclEmma (Java code coverage)) 3.1.2→**3.1.3**: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.14→**1.15**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=m2e&query_format=advanced&order=changeddate%20DESC&target_milestone=1.15.0), [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.15-release-review))
    * (Buildship (Gradle) 3.1.3: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.3) → [announcements](https://discuss.gradle.org/tag/buildship-release))
    * (WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.16→**3.17**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* **Features to show**
    * **Java**:
        * Java 14 support via [Marketplace](https://marketplace.eclipse.org/content/java-14-support-eclipse-2020-03-415)
        * _Eclipse IDE for **Enterprise Java** Developers_ (the most downloaded IDE package) and _Eclipse IDE for Eclipse Committers_: [with **Wild Web Developer**](https://bugs.eclipse.org/bugs/show_bug.cgi?id=551408)
        * Editor:
            * Content Assist:
                * [Subtype aware](https://www.eclipse.org/eclipse/news/4.15/jdt.php#subtype-code-completion), e.g. `List<String> l = new a|`, `Iterator<String> l2 = Collections.|` or `foo(new a|)`
                * [Match subwords](https://www.eclipse.org/eclipse/news/4.15/jdt.php#subword-code-completion): disabled by default (_Window > Preferences: Java > Editor > Content Assist: Show subword matches_), e.g. `"hello".upcase|` (but not `"hello".upa|` since there is nothing that contains the substring `upa` nor camel-case-concated words starting with any of these parts)
                * ([For imports statements no unnecessary semicolon if one already exists](https://www.eclipse.org/eclipse/news/4.15/jdt.php#import-completion))
                * (TODO: Can it be enabled or not yet because of Mylyn [Non-blocking](https://www.eclipse.org/eclipse/news/4.15/jdt.php#non-blocking-completion))
            * [Improved annotated-based null analysis](https://www.eclipse.org/eclipse/news/4.15/jdt.php#null-legacy-interface) ([blog](https://objectteams.wordpress.com/2020/02/06/interfacing-null-safe-code-with-legacy-code/))
            * [Improved resource leak analysis](https://www.eclipse.org/eclipse/news/4.15/jdt.php#resource-leak-analysis),
                * e.g. `new PrintWriter("out.txt").append("text").close();` no false _resource never closed_ positive anymore (the compiler now understands that in this fluent API `append("text")` returns `this` that is closed)
                * e.g. `getZipFile().getName();` has not been reported as a potential resource leak in previous versions
            * [Surround With: Try-with-resources Block](https://www.eclipse.org/eclipse/news/4.15/jdt.php#surround-with-try-with-resources)
            * Quick fix:
                * [Wrap with `Optional`](https://www.eclipse.org/eclipse/news/4.15/jdt.php#quickfix-wrap-optional)
                * [Missing or duplicate `@provides` or `@uses`](https://www.eclipse.org/eclipse/news/4.15/jdt.php#improve-lambda)
        * Clean up:
            * [Code Style: Simplify lambda expression](https://www.eclipse.org/eclipse/news/4.15/jdt.php#improve-lambda) removes if possible removes `(...)`, `{...}` and replaces lambda with method reference (`::`)
            * [Code Style: Use uppercase for long literal suffix](https://www.eclipse.org/eclipse/news/4.15/jdt.php#uppercase-literal-suffix)
            * [Unnecessary Code: Operate on Maps directly](https://www.eclipse.org/eclipse/news/4.15/jdt.php#map-method)
        * [Lambda expressions can be used in _Expressions_ view and in breakpoint conditions](https://www.eclipse.org/eclipse/news/4.15/jdt.php#functional-expressions-in-debug), `list.stream().anyMatch(s -> s.isBlank())` or `list.stream().anyMatch(String::isBlank)`
        * (JUnit 5.5.1→5.6)
    * **Maven**:
        * [Parallel downloads](https://bugs.eclipse.org/bugs/show_bug.cgi?id=560544)
        * [Quick fix: _Open declaration of managed version_](https://bugs.eclipse.org/bugs/show_bug.cgi?id=560065) when colliding managed version's location
        * [Preference _Maven > Archetypes_: _Include snapshot archetypes_ checkbox](https://bugs.eclipse.org/bugs/show_bug.cgi?id=493991)
        * Dark theme:
            * [POM editor: _Dependency Hierarchy_ tab](https://bugs.eclipse.org/bugs/show_bug.cgi?id=548601)
            * [_Maven Repositories_ view](https://bugs.eclipse.org/bugs/show_bug.cgi?id=538359)


### General and Git
* **Sources**
    * **Platform** 4.14→**4.15**: [Eclipse 4.15 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.15/platform.php), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.8.1→**1.8.2**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 1.2→1.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn Tasks 3.24.2→3.24.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Mylyn WikiText 3.0.35→3.0.36: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Oomph 1.13/14→**1.14/15**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * (EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/))
    * J**Git**/EGit 5.6→**5.7**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.7)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.7), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.7.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.7.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* **Features to show**
    * **Git**:
        * [Repository Groups: Right-click menu with _Switch Repositories To_ and _Pull_](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.7#Repository_Groups)
        * [Dynamic label for Push to/Fetch from Upstream](https://git.eclipse.org/c/egit/egit.git/commit/?id=6f46e09be6e1ec6425b21c4650f6504a2a386eee)
        * [_Git Repositories_ view: Comparing Branches and Tags](https://git.eclipse.org/c/egit/egit.git/commit/?id=9680c04610188d9210e0df5056803cec452ac4f3)
        * [_History_ view: _Show Unified Diff_](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.7#Unified_Diffs)
        * [_Select a Commit_ dialog with search field](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.7#Searching_for_Commits_in_the_Commit_Selection_Dialog) (to show dialog right-click a project/folder/file and choose _Compare With > Commit..._)
    * **General**:
        * [Project Explorer: Hierarchical project layout by default](https://www.eclipse.org/eclipse/news/4.15/platform.php#project-explorer-default-to-hierarchical) (_Package Explorer_ with fixed flat project layout)
        * _Console_ view:
            * [End time](https://www.eclipse.org/eclipse/news/4.15/platform.php#termination-time)
            * [Form feed (`\f` or `\14` or `\u000c`) and vertical tab (`\13` or `\u000b`)](https://www.eclipse.org/eclipse/news/4.15/platform.php#formfeed-character) in addition to backspace (`\b`) and carriage return (`\r`)
        * UI improvements:
            * [Preference: inline vs. via dialog rename](https://www.eclipse.org/eclipse/news/4.15/platform.php#resource-rename-mode-preference) (not in _Package Explorer_, but in _Project Explorer_)
            * [Dark theme: Welcome screen](https://www.eclipse.org/eclipse/news/4.15/platform.php#dark_welcome)
        * Minor improvements and bug fixes:
            * [Drag'n'drop also in WTP editors](https://bugs.eclipse.org/bugs/show_bug.cgi?id=195655), e.g. XML editor (including Maven POM editor _pom.xml_ tab)
            * Shorter messages
                * [Recreate markers message](https://bugs.eclipse.org/bugs/show_bug.cgi?id=559871)
                * [Delete log message](https://git.eclipse.org/c/platform/eclipse.platform.ui.git/commit/?id=a363facee6293d261ac1e97aa4664403bba6c07b)
        * [Performance](https://www.eclipse.org/eclipse/news/4.15/platform.php#ui-performance): [tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=553533&hide_resolved=0)
            * [Start-up time](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=553535&hide_resolved=0)?
            * [Tree expand/collapse](https://www.eclipse.org/eclipse/news/4.15/platform.php#redraw-treeviewer) Redraw is turned off by default during the collapse and expand operation of tree

### C/C++, PHP, Rust, Web
* TODO

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
