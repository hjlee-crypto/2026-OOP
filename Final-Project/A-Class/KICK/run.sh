#!/bin/sh
# Compile and run RideShareRental (macOS / Linux): sh run.sh
cd "$(dirname "$0")" || exit 1

javac -encoding UTF-8 -sourcepath src -d out src/rental/Main.java || {
    echo "[ERROR] Compile failed. Check that JDK is installed: javac -version"
    exit 1
}

java -Dfile.encoding=UTF-8 -cp out rental.Main
