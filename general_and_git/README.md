Prepare:

 0. cmd - Porperties: Layout Window Size 76x24 instead of 94x24
 1. `cd C:\Users\User\git\Sample`
 2. `del .classpath .project bin`
 3. `cls`
 4. `set PATH=%PATH%;C:\Users\User\eclipse\java-2019-06`


 `Jane <jane@example.com>`

Storyboard:

 2. `eclipse .`

Interpretation of control characters: Spinner sample as Windows batch script

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


