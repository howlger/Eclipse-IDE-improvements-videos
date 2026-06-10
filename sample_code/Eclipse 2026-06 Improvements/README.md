# Eclipse 2026-06 Improvements

 * **Java**
     * Java 26 support
     * Java editor
        * New quick assists:
           * _Convert String to Text Block_  (for strings containing `\n`)
           * _Replace qualified name_
        * New  _Convert ... to '@NonNull'_  and  _Change '...()' to '@NonNull'_  quick fixes
        * Improved  _Convert Class to Record_  refactoring and quick assist
        * Enhanced folding:
           * Better performance, especially for large files with many foldable elements
           * Folding regions now include the entire body with closing braces
           * Minor glitches fixed
     * Debug
        * Statement-level stepping
        * Stepping in Class File editor
 * **General/Platform**
     * Debug
        * Refined copy actions in  _Variables_  and  _Expressions_  views
     * Global search navigation shortcuts: Alt/Cmd+`,` and Alt/Cmd+`.`
     * Improved defaults in the Compare editor
        * Left and right swapped
        * Structural compare shown in _Outline_  view by default
        * Better visualization change connections
        * Java compare with semantic highlighting (for local source files)
        * Git compare: Commits with timestamp in addition to commit ID
     * Show zero-width spaces and characters (`ZWSP`)
     *  _Console view:_  New preference to limit line length
     * Import projects: New option  _Skip folders starting with '.' (e.g., .git)_
     * UI:
        * New dirty indicator for view and editor tabs (disabled by default, can be enabled in the preferences)
        * In preferences >  _General_  >  _Appearance:_
            * Option to set default theme which will be used for new workspaces
            * _Classic_  theme removed
            * _Use round tabs_  removed
 * **Git**
     * Auto fetch
     * Non-blocking push result notification
        * Show pull request creation link in push notification
     * _History_  view:
        * _Show all branches_ and _All Changes in Repository_ enabled by default
        * Files can now be dropped and dragged from the Revision Detail area into the editor area to open it (or to any drop target that accepts files)
     * Repositories view:  _Close/Open All Projects_
