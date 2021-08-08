FROM tomcat:8.0.20-jre8
#Dummy text to test
COPY target/aws-project*.jar /usr/local/tomcat/webapps/aws-project.jar