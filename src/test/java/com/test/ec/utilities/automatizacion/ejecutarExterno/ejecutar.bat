@echo off
cd ..\..\..\..\..\..\..\..\..
mvn clean verify -Dmaven.test.failure.ignore=true
