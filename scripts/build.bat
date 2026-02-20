@echo off
mvn -q -DskipTests=false clean package
if %ERRORLEVEL% NEQ 0 (
  echo Build failed!!
  exit /b 1
)
echo BUILD SUCCESS
echo WAR created at target\ToDo.war