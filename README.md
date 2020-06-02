# Eclipse IDE Improvements Videos

## [Eclipse 2020-06](https://wiki.eclipse.org/Category:SimRel-2020-06) - [March 18, 2020](https://calendar.google.com/calendar/event?eid=MDhpMWdvM24xOW12ODRjbmxndjFwc2RjY20gZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [73 projects](https://projects.eclipse.org/releases/2020-06) ([-1 +0 → -1](projects_diff.txt)) - [Website](https://eclipse.org/eclipseide/2020-06) ([New & Noteworthy](https://eclipse.org/eclipseide/2020-06/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=553853)
* [Latest CI builds](https://hudson.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2020-06), [release](http://download.eclipse.org/releases/2020-06))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk)), [Instagram](https://www.instagram.com/eclipsejavaide)


### Sources

* General
    * **Platform** 4.15→**4.16**: [Eclipse 4.16 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.16/platform.php), [resolved bugs](https://bugs.eclipse.org/bugs/buglist.cgi?bug_status=RESOLVED&resolution=---&resolution=FIXED&product=JDT&query_format=advanced&order=changeddate%20DESC)
    * (Marketplace Client (MPC) 1.8.2→**1.8.3**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/))
    * (Eclipse User Storage 1.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn Tasks 3.24.2→**3.25.1**: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * (Mylyn WikiText 3.0.36: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/))
    * (Oomph 1.15/16→**1.16/17**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* Java, Maven, Gradle
    * Java development tools (JDT) 4.15→**4.16**: [Eclipse 4.16 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.16/jdt.php)
        * Java 14: [bug tree](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=549808), [examples](https://wiki.eclipse.org/Java14/Examples)
    * (EclEmma (Java code coverage)) 3.1.3→**3.1.4**: [changes](https://www.eclemma.org/changes.html), [Git](https://github.com/eclipse/eclemma/commits/master), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Eclemma&query_format=advanced&order=changeddate%20DESC))
    * (M2Eclipse (Maven) 1.15→**1.16**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=m2e&query_format=advanced&order=changeddate%20DESC&target_milestone=1.15.0), [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.15-release-review))
    * Buildship (Gradle) 3.1.3→**3.1.4**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.4) → [announcements](https://discuss.gradle.org/tag/buildship-release)
    * WTP Source Editing (XML editor, in Java EE also HTML and CSS editors) 3.17→**3.18**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/)
* J**Git**/EGit 5.7→**5.8**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.8)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.8), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.8.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.8.0-release-review), [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EGit&product=JGit&query_format=advanced&order=changeddate%20DESC), Git [JGit](https://git.eclipse.org/c/jgit/jgit.git/log/)/[EGit](https://git.eclipse.org/c/egit/egit.git/log/)
* Web, XML
    * [Wild Web Developer](https://projects.eclipse.org/projects/tools.wildwebdeveloper) 0.8.2→**0.9.1**: [GitHub](https://github.com/eclipse/wildwebdeveloper) [commits](https://github.com/eclipse/wildwebdeveloper/compare/0.8.2...0.9.1)
* C/C++, PHP, Rust
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 9.11→**9.11.1**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/9.11.1-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn911)
    * [PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 7.1→**7.2**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=PDT&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/pdt/org.eclipse.pdt.git/log/), [_New & Noteworthy_ ](https://wiki.eclipse.org/PDT/NewIn72)
    * ([Corrosion](https://github.com/eclipse/corrosion) (Rust) 0.4.2: [Git](https://github.com/eclipse/corrosion/commits/master), [review](https://projects.eclipse.org/projects/tools.corrosion/reviews/0.4.2-release-review))
    * ([LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.9: [Git](https://github.com/eclipse/lsp4j/commits/master), [review](https://projects.eclipse.org/projects/technology.lsp4j))
    * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.14→**0.15**: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), ([review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.15.0-release-review))
    * ([TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 0.3.4: [Git](https://github.com/eclipse/tm4e/commits/master), [review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.3.3-release-review))


### Features to show

* **General** (1/2)
    * UI:
        * [Gray background on Windows](https://www.eclipse.org/eclipse/news/4.16/platform.php#light-theme-win10)
        * [Square instead of round tabs](https://www.eclipse.org/eclipse/news/4.16/platform.php#round-tabs-preference): _Window > **Preferences: General > Appearance**_
    * [Display shortcuts: when used and/or when not used](https://www.eclipse.org/eclipse/news/4.16/platform.php#show-keybinding) (useful for presenting and for learning shortcuts): _Window > **Preferences: General > Keys**_
* **Java**:
    * Built-in [Java 14](https://openjdk.java.net/projects/jdk/14/) support:
        * [Set Java compliance level up to 14](https://www.eclipse.org/eclipse/news/4.16/jdt.php#jdk-compliance-14)
        * Switch expressions ([JEP 361](http://openjdk.java.net/jeps/361)) become standard: all four switch templates can be used without enabling preview features
        * [Enable preview features via _Configure_ menu](https://www.eclipse.org/eclipse/news/4.16/jdt.php#enable-preview): right-click project and choose _Configure > Enable preview features_ (Eclipse compiler supports preview features for Java 14 only)
        * Records (Preview, [JEP 359](https://openjdk.java.net/jeps/359); `record` like `var` restricted identifier, not keyword)
            * [Wizard](https://www.eclipse.org/eclipse/news/4.16/jdt.php#new-record-creation-wizard)
            * [Empty file template](https://www.eclipse.org/eclipse/news/4.16/jdt.php#new-record-template)
            * [Formatter](https://www.eclipse.org/eclipse/news/4.16/jdt.php#formatter-records)
        * Text Blocks ([JEP 368](https://openjdk.java.net/jeps/368); Second Preview; → Java 15) with [new escape sequences](https://openjdk.java.net/jeps/368#New-escape-sequences): `\` at the end of a line and `\s` as space not be stripped
        * Pattern Matching for instanceof ([JEP 305](https://openjdk.java.net/jeps/305); Preview; Second preview in Java 15)
        * [Gradle support for running and building with Java 14](https://discuss.gradle.org/t/buildship-3-1-4-is-now-available/35428)
    * Editor:
        * [Quick fix to change return statement to yield statement in Switch Expression](https://www.eclipse.org/eclipse/news/4.16/jdt.php#quickfix-switch-expression-return-to-yield)
        * [Non-blocking Java code completion](https://www.eclipse.org/eclipse/news/4.16/jdt.php#default-non-blocking-completion)
    * Clean up:
        * [Use `var`](https://www.eclipse.org/eclipse/news/4.16/jdt.php#variable-type-inference)
        * [Merge same blocks of `if`, `if else` and `else`](https://www.eclipse.org/eclipse/news/4.16/jdt.php#merge-conditional)
        * [Instead of `|` and `&` use `||` and `&&`](https://www.eclipse.org/eclipse/news/4.16/jdt.php#lazy-logical)
    * Debug
        * Tip: When using Java 14, use helpful NullPointerExceptions ([JEP 358](https://openjdk.java.net/jeps/358)) `-XX:+ShowCodeDetailsInExceptionMessages` as default VM argument in installed JRE/JDK
        * [Synthetic variables inspection](https://www.eclipse.org/eclipse/news/4.16/jdt.php#synthetic-variables-inspection)
* **Git**
    * [_Repositories View_ view: Filter for tags](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.8#Repositories_View): `?`, `*`, `^`, `$` and `#10` to show only the 10 most recent committed tags (filter per repository; will be persisted)
    * [Clone from a local Git bundle file](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.8#Cloning) ([a Git bundle file is an archive in a Git specific format](https://git-scm.com/docs/git-bundle), e.g. created via `git bundle create file.bundle master`)
    * [_Staging_ view, "Commit and Push..." becomes "Push HEAD..." when there is nothing to commit](https://git.eclipse.org/c/egit/egit.git/commit/?id=cc5d94f2bf9753fc61c17042238f359e5a09d3bc)
    * [Diff Viewer](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.8#Diff_Viewer):
        * _Outline_ view has now a toolbar: collapse all and toggle presentation flat vs. folder tree
        * Quick Outline (Ctrl+O)
* **General** (2/2)
    * [_New File_ wizard: create missing folders](https://www.eclipse.org/eclipse/news/4.16/platform.php#create-subfolder)
    * [Ligatures on Windows](https://www.eclipse.org/eclipse/news/4.16/platform.php#eclipse-win-ligatures-support) ([already supported on Linux and macOS](https://www.eclipse.org/eclipse/news/4.16/platform_isv.php#win-ligatures-support); see [bug 562165](https://bugs.eclipse.org/bugs/show_bug.cgi?id=562165)), e.g. font "Fira Code" or "[Victor Mono](https://rubjo.github.io/victor-mono/)"
    * New Splash Screen
    * Faster start-up
    * (Donate page)
    * Dark Theme:
        * [Dark scrollbars on Windows 10](https://www.eclipse.org/eclipse/news/4.16/platform.php#win-dark-theme-scrollbars)
        * [Consistent view toolbar colors](https://www.eclipse.org/eclipse/news/4.16/platform.php#dark-toolbars)
        * [...](https://www.eclipse.org/eclipse/news/4.16/platform_isv.php#win-dark-scrollbars)
    * [Install/Update: Check compatibility with used Java version](https://www.eclipse.org/eclipse/news/4.16/platform.php#verify-jre-installation)
    * ([Handle `eclipse+command://` links](https://www.eclipse.org/eclipse/news/4.16/platform_isv.php#eclipse-command-url-handler))
    * [Linux: GTK 3.20 or higher required](https://www.eclipse.org/eclipse/news/4.16/platform_isv.php#gtk-min-version) ([instead of GTK 3.14+](https://git.eclipse.org/r/#/c/159264/2/bundles/org.eclipse.swt/Eclipse+SWT/gtk/org/eclipse/swt/widgets/Display.java))
* **Web**:
    * [Eclipse IDE for Enterprise Java Developers: JavaScript support via Eclipse Wild Web Developer](https://bugs.eclipse.org/bugs/show_bug.cgi?id=559907) (WTP editors by default for HTML, CSS, XML files)
    * [Eclipse IDE for PHP Developers: Web support via Eclipse Wild Web Developer](https://bugs.eclipse.org/bugs/show_bug.cgi?id=561624)

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
