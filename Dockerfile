FROM tomcat:10-jdk17

COPY target/ToDo.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080