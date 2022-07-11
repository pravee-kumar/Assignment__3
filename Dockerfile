From tomcat:8-jre

MAINTAINER "praveenkumar"

# Copy to images tomcat path
ADD target/*.war /usr/local/tomcat/webapps/
