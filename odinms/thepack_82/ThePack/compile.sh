#!/usr/bin/env bash

mkdir tmp
/jdk1.6.0_45/bin/javac -cp 'dist/*' -d tmp `find src -iname '*.java'`
cd tmp
/jdk1.6.0_45/bin/jar cvf odinms.jar *
cd ..
mv tmp/odinms.jar dist
rm -rf tmp
