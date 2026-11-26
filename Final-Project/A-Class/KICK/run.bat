@echo off
rem Compile and run RideShareRental (double-click or run from cmd)
chcp 65001 > nul
cd /d "%~dp0"

javac -encoding UTF-8 -sourcepath src -d out src\rental\Main.java
if errorlevel 1 (
    echo.
    echo [ERROR] Compile failed. Check that JDK is installed: javac -version
    pause
    exit /b 1
)

java -Dfile.encoding=UTF-8 -Dstdout.encoding=UTF-8 -Dstderr.encoding=UTF-8 -cp out rental.Main
pause
