
set IDE=jee-2021-03

set ECLIPSE_DIR=%USERPROFILE%\eclipse\%IDE%
set ECLIPSE_P2_CONFIG_ZIP=%ECLIPSE_DIR%\%IDE%.7z
set UNZIP_7ZIP=%PROGRAMFILES%\7-Zip\7z.exe
set ECLIPSE_WORKSPACE=%USERPROFILE%\eclipse-workspace
set ECLIPSE_WORKSPACE_ZIP=%ECLIPSE_WORKSPACE%.7z

dir "%ECLIPSE_DIR%\p2"

:: checks
IF NOT exist "%ECLIPSE_DIR%" (echo Eclipse installation missing: %ECLIPSE_DIR% && pause && exit 1)
IF NOT exist "%ECLIPSE_P2_CONFIG_ZIP%" (echo Backup of Eclipse p2/configuration missing: %ECLIPSE_P2_CONFIG_ZIP% && pause && exit 1)
IF NOT exist "%ECLIPSE_WORKSPACE%\.metadata" (echo Workspace missing: %ECLIPSE_WORKSPACE% && pause && exit 1)
IF NOT exist "%ECLIPSE_WORKSPACE_ZIP%" (echo Backup of workspace missing: %ECLIPSE_WORKSPACE_ZIP% && pause && exit 1)

:: reset Eclipse (restore "p2" and "configuration" subdirectories from ZIP)
rmdir /s /q "%ECLIPSE_DIR%\p2"
rmdir /s /q "%ECLIPSE_DIR%\configuration"
"%UNZIP_7ZIP%" x "%ECLIPSE_P2_CONFIG_ZIP%" "-o%ECLIPSE_DIR%"
if NOT ["%errorlevel%"]==["0"] (echo Restoring of Eclipse installation failed && pause && exit 1)

:: restor workspace
rmdir /s /q "%ECLIPSE_WORKSPACE%"
"%UNZIP_7ZIP%" x "%ECLIPSE_WORKSPACE_ZIP%" "-o%ECLIPSE_WORKSPACE%\.."