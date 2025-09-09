set IDE=java-2025-09
set REPO=sample

set ECLIPSE_DIR=%USERPROFILE%\eclipse\%IDE%
set ECLIPSE_P2_CONFIG_ZIP=%ECLIPSE_DIR%\%IDE%.7z
set UNZIP_7ZIP=%PROGRAMFILES%\7-Zip\7z.exe
set ECLIPSE_WORKSPACE=%USERPROFILE%\eclipse-workspace
set ECLIPSE_WORKSPACE_ZIP=%ECLIPSE_WORKSPACE%.7z
set REPO_DIR=%USERPROFILE%\git\%REPO%
set REPO_ZIP=%USERPROFILE%\git\%REPO%.7z

:: start something or copy something to the clipboard
::start C:\Users\Howlger\eclipse-installer\eclipse-inst.exe
::echo|set/p=^^^<project.build.sourceEncoding^^^>UTF-8^^^</project.build.sourceEncoding^^^>|clip
::echo|set/p=""C:\Program Files\Java\jdk-20-ea\bin\javac^" -d . src\main\java\BytecodeSample.java"|clip
::echo|set/p="C:\Program Files\Eclipse Adoptium\jdk-22.0.1.8-hotspot"|clip
::(echo if ^^^(this == null^^^) return null;&echo String str= "";&echo for ^^^(int i = 0; i ^^^< this.length; i++^^^) {&echo ^^^    str+= "["+ i + "]: " + this[i] + "\n";&echo }&echo return str;) | clip
echo|set/p="file:///C:/Users/Howlger/eclipse-workspace/Solution.html"|clip

dir "%ECLIPSE_DIR%\p2"

:: checks
IF NOT exist "%ECLIPSE_DIR%" (echo Eclipse installation missing: %ECLIPSE_DIR% && pause && exit 1)
IF NOT exist "%ECLIPSE_P2_CONFIG_ZIP%" (echo Backup of Eclipse p2/configuration missing: %ECLIPSE_P2_CONFIG_ZIP% && pause && exit 1)
IF NOT exist "%ECLIPSE_WORKSPACE%\.metadata" (echo Workspace missing: %ECLIPSE_WORKSPACE% && pause && exit 1)
::IF NOT exist "%ECLIPSE_WORKSPACE_ZIP%" (echo Backup of workspace missing: %ECLIPSE_WORKSPACE_ZIP% && pause && exit 1)
::IF NOT exist "%REPO_DIR%\.git" (echo Git repository missing: %REPO_DIR% && pause && exit 1)

:: restore Git repository
::rmdir /s /q "%REPO_DIR%"
::"%UNZIP_7ZIP%" x "%REPO_ZIP%" "-o%REPO_DIR%\.."

:: reset Eclipse (restore "p2" and "configuration" subdirectories from ZIP)
rmdir /s /q "%ECLIPSE_DIR%\p2"
rmdir /s /q "%ECLIPSE_DIR%\configuration"
"%UNZIP_7ZIP%" x "%ECLIPSE_P2_CONFIG_ZIP%" "-o%ECLIPSE_DIR%"
if NOT ["%errorlevel%"]==["0"] (echo Restoring of Eclipse installation failed && pause && exit 1)

:: restore workspace
rmdir /s /q "%ECLIPSE_WORKSPACE%"
"%UNZIP_7ZIP%" x "%ECLIPSE_WORKSPACE_ZIP%" "-o%ECLIPSE_WORKSPACE%\.."

:: launch current Eclipse
cd %ECLIPSE_DIR%
start eclipse.exe
