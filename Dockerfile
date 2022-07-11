From tomcat:latest

MAINTAINER "praveenkumar"

# Copy to images tomcat path
ADD target/*.war /usr/local/tomcat/webapps/
