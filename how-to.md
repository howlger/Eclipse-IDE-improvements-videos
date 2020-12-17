# How-to (on Windows 10 using the tools below)

1. Storyboard and narration
    1. Collect things to show (and not to show) in [`README.md`](README.md)
    2. Write down [narration](narration.odt) (mark in color how to emphasize it), e.g. with _LibreOffice Writter_
2. Screen recording
    1. Preparation:
        * Display settings: **1920x1080** with **175%** scaling
        * Via _ClearType Switch_ **turn off _ClearType_** (keep _Enable smooth edges for screen font_)
        * Taskbar settings: **_Automatically hide taskbar in desktop mode_**
    2. Record screencast(s), e.g. via _OBS Studio_
    3. Record intro/outro animations, e.g. via _OBS Studio_ of an animated SVG created with InkScape (with manually added [SVG animation elements](https://en.wikipedia.org/wiki/SVG_animation)) shown in a web browser in full screen (F11) mode (less flickering in _Firefox_ than in _Chrome_; converting text into path objects also reduces flickering)
3. Audio recording
    1. Record narration (e.g. with _Roland R-09HR_) read by a human speaker ([no, it's not Cortana](https://www.eclipse.org/lists/cross-project-issues-dev/msg14950.html)) in a single audio file (if a sentence didn't work out for the first time, the speaker repeats it)
4. Video editing, e.g via _DaVinci Resolve_
5. Publishing
    1. Upload to **YouTube** (maybe in future also to Vimeo which provides fullscreen when the video is embedded in a website in contrast to YouTube)

## Recommendations (my learnings)

* Background music only at the beginning and at the end
* When clicking something, wait a second after moving the mouse and before clicking (otherwise it's hard to see what was clicked)
* If possible, use high-resolution screen of a small size (e.g. 1920x1080 with 175% scaling; on 1920x1440/non-high-DPI text and cursor are too small)

## Tools (currently not used tools in parentheses)

* Screen recording
    * [OBS Studio 26.1](https://obsproject.com/)
        * [Solution for _Black Screen_ Display Capture: in Windows settings _Graphics settings_ set `obs64.exe` to _Power saving_](https://obsproject.com/forum/threads/solution-for-black-screen-display-capture-even-after-performing-the-steps-on-obs-forum.112109/)
* Video editing
    * [**DaVinci Resolve 17 BETA**](https://www.blackmagicdesign.com/products/davinciresolve/) - free (registration requried), but not open source
    * (Linux only: [**Flowblade** ](https://jliljebl.github.io/flowblade/) - open source; not yet tested)
* Video converting
    * Windows only: [**XMedia Recode**](https://www.xmedia-recode.de/)
* Other tools
    * Windows only: [**ClearType Switch 1.1**](http://karpolan.com/software/cleartype-switch/)
    * [**LibreOffice**](https://www.libreoffice.org) Writter
    * [**InkScape**](https://inkscape.org/)

