# Eclipse IDE Improvements Videos

## [Eclipse 2019-06](https://wiki.eclipse.org/Category:SimRel-2019-06) - [June 19, 2019](https://calendar.google.com/calendar/event?eid=NGNmcXVrajlwa3E4bG5iZWR2OGxhc2U4ZnYgZ2NoczdubTRudnBtODM3NDY5ZGRqOXRqbGtAZw&ctz=Europe/Berlin) ([calendar](https://calendar.google.com/calendar/embed?src=gchs7nm4nvpm837469ddj9tjlk@group.calendar.google.com&ctz=Europe/Berlin))
* [76 projects](https://projects.eclipse.org/releases/2019-06) ([-1 +1 → +/-0](https://projects.eclipse.org/releases/2019-03)) - [Website](https://eclipse.org/eclipseide/2019-06) ([New & Noteworthy](https://eclipse.org/eclipseide/2019-06/noteworthy)) - [Splash screen](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545158)
* [Latest CI builds](https://hudson.eclipse.org/packaging/job/simrel.epp-tycho-build/lastSuccessfulBuild/artifact/org.eclipse.epp.packages/archive/) (Update site: [staging](https://download.eclipse.org/staging/2019-06), [release](http://download.eclipse.org/releases/2019-06))
* Social media: [Twitter](http://twitter.com/EclipseJavaIDE), [YouTube](https://www.youtube.com/user/EclipseFdn) ([Eclipse IDE playlist](https://www.youtube.com/playlist?list=PLy7t4z5SYNaSNjL60ofpwVhfA7mOF3Pgk))

### General and Git
* **Sources**
    * **Platform** 4.11→**4.12**: [Eclipse 4.12 - New and Noteworthy - Platform and Equinox](https://www.eclipse.org/eclipse/news/4.12/platform.php)
    * Marketplace Client (MPC) 1.7.5→**1.7.6**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=MPC&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/mpc/org.eclipse.epp.mpc.git/log/)
    * (Eclipse User Storage Service 1.2→1.2: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=USSSDK&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/usssdk/org.eclipse.usssdk.git/log/))
    * (Mylyn Tasks 3.24.2→3.24.2: [New & Noteworthy](https://www.eclipse.org/mylyn/new/), [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.tasks.git/log/), ...)
    * Mylyn WikiText 3.0.25→**3.0.29**: (Markdown editor, etc.): [Git](https://git.eclipse.org/c/mylyn/org.eclipse.mylyn.docs.git/log/)
    * WTP Source Editing (XML editor, etc.) 3.13→**3.14**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=WTP%20Source%20Editing&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/log/)
    * Oomph 1.12→**1.13**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=Oomph&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/oomph/org.eclipse.oomph.git/log/)
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
    * J**Git**/EGit 5.3→**5.4**: wiki [JGit](https://wiki.eclipse.org/JGit/New_and_Noteworthy/5.4)/[EGit](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.4), review [JGit](https://projects.eclipse.org/projects/technology.jgit/reviews/5.4.0-release-review)/[EGit](https://projects.eclipse.org/projects/technology.egit/reviews/5.4.0-release-review)
* **Features to show**
    * **General**:
        * Performance improvements, e.g. faster startup (tested with the Jave IDE and a small workspace)
        * [Importing projects from the command line](https://www.eclipse.org/eclipse/news/4.12/platform.php#pass-directory-to-launcher)
            1. _Start Eclipse and import project (Eclipse not in full screen)_
            2. _Open a file (e.g. this file) from the command line (not new feature, but to show folder vs. file)_
            3. _Import another project from the command line (to show dialog is opened in the running Eclipse)_
        * [Run launch configurations via Quick Access (Ctrl+3)](https://www.eclipse.org/eclipse/news/4.12/platform.php#launch-config-quickaccess)
            1. _Create or use import External Tool run configuration: `Clock`, `c:\windows\system32\cmd.exe`, `/c echo %time%`_
            2. _Quick Access (Ctrl+3) + type `clock`_
            3. _→ Current time shown in Console view_
        * [Improved view menu icon (→ Dark theme + high-DPI)](https://www.eclipse.org/eclipse/news/4.12/platform.php#view-menu)
        * XML editor _Outline_ view:
            * ([Show the beginning of the comment instead of 'comment'](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/commit/?id=f9b248d880a857dfc17c4f525860ba856110cd7b))
            * ([Show the beginning of contained text](https://git.eclipse.org/c/sourceediting/webtools.sourceediting.git/commit/?id=44a79685c3cc8546700fb4542f36e24e231c0065))
    * **Git**:
        * [History view: Check Out This Version](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.4#Checking_out_Files_from_a_Commit)
        * _Git Repositories_ view:
            * [Filters and Customizations...](https://wiki.eclipse.org/EGit/New_and_Noteworthy/5.4#Filtering_Content_from_the_Git_Repositories_View)
            * [Right-click on a branch node: Show In > Git Reflog](https://bugs.eclipse.org/bugs/show_bug.cgi?id=544981)
            * [Double click fetch nodes to run fetch command](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545273)
        * ([Shorten SHA1 in editor title](https://bugs.eclipse.org/bugs/show_bug.cgi?id=544983))
        * ([Only warn about losing changes if there are changes at all](https://bugs.eclipse.org/bugs/show_bug.cgi?id=546194))

### Java, Maven, Gradle
* **Sources**
    * Java development tools (JDT) 4.11→**4.12**: [Eclipse 4.12 - New and Noteworthy - Java Development Tools](https://www.eclipse.org/eclipse/news/4.12/jdt.php)
        * Java 12: [bugs dependencies](https://bugs.eclipse.org/bugs/showdependencytree.cgi?id=536055), [examples](https://wiki.eclipse.org/Java12/Examples)
    * (EclEmma (Java code coverage)) 3.1.2→3.1.2: ...)
    * (M2Eclipse (Maven) 1.11→**1.12**: [Git](https://git.eclipse.org/c/m2e/m2e-core.git/log/), [review](https://projects.eclipse.org/projects/technology.m2e/reviews/1.12-release-review))
    * Buildship (Gradle) 3.0.1→**3.1.0**: [review](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.0)
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* **Features to show**
    * **Java**:
        * Java 12:
            * [New Java Project: JavaSE-12](https://www.eclipse.org/eclipse/news/4.12/jdt.php#quickfix-change-compliance-12): show it in the drop-down, but start with JavaSE-11
            * [Generate comments check boxes for `module-info.java`/`package-info.java`](https://www.eclipse.org/eclipse/news/4.12/jdt.php#comment-generation-checkbox) - not Java-12-specific, but show it by the way

            * One new languages feature only as preview: [JEP 325 - Switch Expressions (Preview)](https://openjdk.java.net/jeps/325)
                1. [Switch label template](https://www.eclipse.org/eclipse/news/4.12/jdt.php#new-switch_labeled_statment_expression_template):
                2. List cases with `,`: → Quick Fixes:
                    * [_Split case labels_](https://www.eclipse.org/eclipse/news/4.12/jdt.php#split-switch-case-labels)
                    * [_Change project compliance and JRE to 12_](https://www.eclipse.org/eclipse/news/4.12/jdt.php#quickfix-change-compliance-12)
                    * _Open project compiler properties_ to [enable preview features manually](https://www.eclipse.org/eclipse/news/4.12/jdt.php#enable-preview)
                    * [_Enable preview features on project properties_](https://www.eclipse.org/eclipse/news/4.12/jdt.php#quickfix-enable-preview-12)
                    * [_Configure problem severity_ of preview features](https://www.eclipse.org/eclipse/news/4.12/jdt.php#quickfix-configure-severity-12)
                3. `->`: without `break`; right side must be a single statement/block
                4. As assignment or as return value: [switch templates](https://www.eclipse.org/eclipse/news/4.12/jdt.php#new-switch_labeled_statment_expression_template)
                5. [Formatter](https://www.eclipse.org/eclipse/news/4.12/jdt.php#switch-spaces)
            * (New API, e.g. `Files.mismatch(Path, Path)` or `"a\n  b".indent(4)`)
        * Code Minings:
            * [New: Show method parameter names](https://www.eclipse.org/eclipse/news/4.12/jdt.php#parameter-name-codemining)
            * [_Show implementations_ now also for methods](https://www.eclipse.org/eclipse/news/4.12/jdt.php#method-implementation-codemining)
            * [Ctrl+click on _1 implementation/reference_ to jump directly to the single implementation/reference](https://www.eclipse.org/eclipse/news/4.12/jdt.php#ctrl-click-codemining) (instead showing list with one item in a view)
        * JPMS:
            * [_Project > Properties: Java Build Path_: new _Module Dependencies_ tab](https://www.eclipse.org/eclipse/news/4.12/jdt.php#buildpath-module-dependencies)
            * [In `module-info.java` two new Quick Fixes for service providers](https://www.eclipse.org/eclipse/news/4.12/jdt.php#service-provider-constructor-quick-fix):
                * Create constructor (if non-existent)
                * Change visibility of constructor to public (if not visible)
        * [Support for new Javadoc tags: proposed by content assist where it can be used, section title in Javadoc view](https://www.eclipse.org/eclipse/news/4.12/jdt.php#javadoc-support-tags) ([documentation](https://docs.oracle.com/en/java/javase/12/docs/specs/doc-comment-spec.html), search for examples: e.g. `"@apiNote" site:github.com/AdoptOpenJDK/openjdk-jdk12u`, [JDK 12 Javadoc](https://docs.oracle.com/en/java/javase/12/docs/api/))
            * `@apiNote` (since Java 8; in Javadoc shown as _API Note_): `IntStream peek(IntConsumer)`
            * `@implSpec` (since Java 8; in Javadoc shown as _Implementation Requirements_): `AbstractList.add(E)`
            * `@implNote` (since Java 8; in Javadoc shown as _Implementation Note_): `List.sort(Comparator)`
            * `@index` (since Java 9; → Javadoc HTML search field): `java.util`
            * `@hidden` (since Java 9; → not shown in Javadoc HTML)
            * `@provides` (since Java 9; → in `module-info.java` service provider description)
            * `@uses` (since Java 9; → in `module-info.java` description for an used service)
            * `@summary` (since Java 10; → the text part that should be used as short description instead of the first sentence)
        * [_Encapsulate Field_ dialog: check boxes for getter and setter](https://www.eclipse.org/eclipse/news/4.12/jdt.php#getter-setter-quick-assist)
        * [New Quick Fix: _Open required projects_](https://www.eclipse.org/eclipse/news/4.12/jdt.php#quickfix-open-missing-projects)
        * Debug:
            * [New default shortcut for the (existing) command _Run to Line_: Ctrl+Alt+Click in annotation ruler](https://www.eclipse.org/eclipse/news/4.12/jdt.php#run-to-line-in-annotation-ruler) (similar to Ctrl+R for the cursor line)
            * [_Variables_ view: shows Lambda field names](https://www.eclipse.org/eclipse/news/4.12/jdt.php#lambda-variables-variable-view) (effectively final variables/parameters from outside lambda expression used inside lambda body; see [example](https://bugs.eclipse.org/bugs/show_bug.cgi?id=516319#c12))
            * [_Debug Shell_: hint for content assist (Ctrl+Space) support](https://www.eclipse.org/eclipse/news/4.12/jdt.php#content-assist-debug-shell)
            * ([_Java Stack Trace Console_: usage hint will be removed when starting typing/pasting](https://www.eclipse.org/eclipse/news/4.12/jdt.php#jstc-clear-initial-message))
    * **Maven**:
        * Java 12: Support for preview feature flag (bug [545462](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545462) and [545470](https://bugs.eclipse.org/bugs/show_bug.cgi?id=545470)): `<compilerArgs>--enable-preview</compilerArgs>`
        * [_Maven POM_ editor: right-click + _Maven > Update Project..._](https://bugs.eclipse.org/bugs/show_bug.cgi?id=547765)
        * [Embedded Maven 3.5.3→3.6.1](https://git.eclipse.org/c/m2e/m2e-core.git/commit/?id=c9e4eb3dd7ca4585b93e226d6258a3cb9f9f4170)
        * Performance improvements (see e.g. bug [515668](https://bugs.eclipse.org/bugs/show_bug.cgi?id=515668) or [547239](https://bugs.eclipse.org/bugs/show_bug.cgi?id=547239))
    * **Gradle**:
        * [Tasks to run on project synchronization (`synchronizationTasks`) and on project build (`autoBuildTasks`)](https://projects.eclipse.org/projects/tools.buildship/releases/3.1.0)

### C/C++, PHP, Rust, Web
* **Sources**
    * [CDT](https://projects.eclipse.org/projects/tools.cdt) (C/C++) 9.7→**9.8**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=CDT&query_format=advanced&order=changeddate%20DESC), [review](https://projects.eclipse.org/projects/tools.cdt/reviews/9.8.0-release-review), [_New & Noteworthy_](https://wiki.eclipse.org/CDT/User/NewIn98)
    * [PDT](https://projects.eclipse.org/projects/tools.pdt) (PHP) 6.3→**6.4?**: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=PDT&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/pdt/org.eclipse.pdt.git/log/), (no more _New & Noteworthy_ [like in the past](https://wiki.eclipse.org/PDT/NewIn62)?)
    * [Corrosion](https://github.com/eclipse/corrosion) (Rust) 0.3→**0.4**: [Git](https://github.com/eclipse/corrosion/commits/master), ([review](https://projects.eclipse.org/projects/tools.corrosion/reviews/0.4.0-release-review))
    * [Wild Web Developer](https://github.com/eclipse/wildwebdeveloper)
    * [LSP4J](https://projects.eclipse.org/projects/technology.lsp4j) (LSP Java binding) 0.7.0/1?→**0.7.2**: [Git](https://github.com/eclipse/lsp4j/commits/master), ([review](https://projects.eclipse.org/projects/technology.lsp4j))
    * [LSP4E](https://projects.eclipse.org/projects/technology.lsp4e) (LSP Eclipse IDE integration) 0.9?→**0.10**: [Git](https://git.eclipse.org/c/lsp4e/lsp4e.git/log/), ([review](https://projects.eclipse.org/projects/technology.lsp4e/reviews/0.10.0-release-review))
    * [TM4E](https://projects.eclipse.org/projects/technology.tm4e) (TextMate) 3.2?→**3.3**: [Git](https://github.com/eclipse/tm4e/commits/master), ([review](https://projects.eclipse.org/projects/technology.tm4e/reviews/0.3.3-release-review))
    * EPP: [bugs](https://bugs.eclipse.org/bugs/buglist.cgi?product=EPP&query_format=advanced&order=changeddate%20DESC), [Git](https://git.eclipse.org/c/epp/org.eclipse.epp.packages.git/log/)
* **Features to show**
    * **Web**:
        * [JavaScript IDE package based on Wild Web Developer now](https://bugs.eclipse.org/bugs/show_bug.cgi?id=544355) (instead of WTP JSDT as before): LSP & node.js
        * TypeScript, etc.
        * [Workspace symbols and commands accessible via Quick Access (Ctrl+3)](https://bugs.eclipse.org/bugs/show_bug.cgi?id=546169)
    * **C/C++**:
        * ...
    * **Rust**:
        * [Workspace symbols and commands accessible via Quick Access (Ctrl+3)](https://bugs.eclipse.org/bugs/show_bug.cgi?id=546169): see Web above
        * Compare editor: syntax highlighting?

## Publish
* → [As YouTube video](https://www.youtube.com/playlist?list=PLnh_8hTD4yvnhXSttuewEKgKkmlIj_ND-)
