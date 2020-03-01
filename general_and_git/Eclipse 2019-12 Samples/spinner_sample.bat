@echo off & setlocal enabledelayedexpansion
for /f %%a in ('copy "%~f0" nul /z') do set "CR=%%a"
for /f %%a in ('prompt $H ^& cmd /k ^<nul') do set "BS=%%a"
set SPINNER=-\^|/

echo|set /p="Spinner via backspace: "
for /l %%i in (1, 1, 3) do (
	for /l %%j in (0, 1, 3) do (
	    echo|set /p="!SPINNER:~%%j,1!!BS!"
		ping -n 1 example.com > nul 2>&1
	)
)
echo(done.
    
echo Spinner via carriage return:
for /l %%i in (1, 1, 3) do (
	for /l %%j in (0, 1, 3) do (
	    <nul set /p ".=processing... !SPINNER:~%%j,1!!CR!"
		ping -n 1 example.com > nul 2>&1
	)
)
echo(done.        