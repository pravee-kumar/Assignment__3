From tomcat:8
MAINTAINER "praveenkumar"
# Copy to images tomcat path
ADD target/*.war /usr/local/tomcat/webapps/
CMD ["catalina.sh", "run"]
