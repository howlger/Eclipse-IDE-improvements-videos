# How-to (on Windows 10 using the tools below)

1. Storyboard and narration
    1. Collect things to show (and not to show) in [`README.md`](README.md)
    2. Write down narration (mark in color how to emphasize it), e.g. with _LibreOffice Writter_ (see for example [`general_and_git/narration.odt`](general_and_git/narration.odt))
2. Screen recording
    1. Preparation:
        * Display settings: **1920x1080** with **175%** scaling
        * Via _ClearType Switch_ **turn off _ClearType_** (keep _Enable smooth edges for screen font_)
        * Taskbar settings: **_Automatically hide taskbar in desktop mode_**
    2. Record screencast(s) via _CamStudio_:
        * _Region > **Full Screen**_
        * _Options > Video Options_
            * _CamStudio **Lossless** Codec v1.5_
            * **125** _frames/second_
            * _Auto Adjust_
            * _Lock Capture and Playback Rates_
        * _Options > Do not record audio_
    3. Record intro/outro animations:
        * E.g. create animation with InkScape (with manually added [SVG animation elements](https://en.wikipedia.org/wiki/SVG_animation)) and record the animation shown in a web browser (less flickering in _Chrome_ than in _Firefox_; converting text into path objects also reduces flickering) in full screen (F11) mode
3. Audio recording
    1. Record narration (e.g. with _Roland R-09HR_) read by a human speaker ([no, it's not Cortana](https://www.eclipse.org/lists/cross-project-issues-dev/msg14950.html)) in a single audio file (if a sentence didn't work out for the first time, the speaker repeats it)
4. Video editing
    1. Convert videos from **AVI to MOV** (as _DaVinci Resolve_ cannot read the AVI recordings by _CamStudio_):
        * _Format_
            * _Format: **MOV**_
            * _File Extension: mov_
            * _Video only_
        * _Video_
            * _Mode: Convert_
            * _Codec: MPEG-4_
            * _Rate control mode: **VBR (Variable bitrate)**_
            * _Bitrate: **20000**_
            * _Maximum Bitrate (kbps): **30000**_
            * _Minimum Bitrate (kbps): 0_
            * _GOP length: 0 (Auto.)_
    2. Compose video and audio clips and do the **video cutting** using _DaVinci Resolve 15_
5. Publishing
    1. Upload to **YouTube** (maybe in future also to Vimeo which provides fullscreen when the video is embedded in a website in contrast to YouTube)

## Recommendations (my learnings)

* Background music only at the beginning and at the end
* When clicking something, wait a second after moving the mouse and before clicking (otherwise it's hard to see what was clicked)
* If possible, use high-resolution screen of a small size (e.g. 1920x1080 with 175% scaling; on 1920x1440/non-high-DPI text and cursor are too small)

## Tools (currently not used tools in parentheses)

* Screen recording
    * Windows only: [**CamStudio 2.7.2** with **CamStudio Lossless Codec v1.5**](https://camstudio.org/)
    * (Windows only: [**Ultravnc Screenrecorder (2015)**](https://www.uvnc.com/downloads/screenrecorder/86-screenrecorder.html): fork of CamStudio and newer, but in my case the recorded video flickers)
* Video editing
    * [**DaVinci Resolve 15**](https://www.blackmagicdesign.com/products/davinciresolve/) - free (registration requried), but not open source
    * (Linux only: [**Flowblade** ](https://jliljebl.github.io/flowblade/) - open source; not yet tested)
* Video converting
    * Windows only: [**XMedia Recode**](https://www.xmedia-recode.de/)
* Other tools
    * Windows only: [**ClearType Switch 1.1**](http://karpolan.com/software/cleartype-switch/)
    * [**LibreOffice**](https://www.libreoffice.org) Writter
    * [**InkScape**](https://inkscape.org/)

