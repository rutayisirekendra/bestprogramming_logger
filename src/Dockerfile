
FROM tomcat:9.0


COPY target/kendra_demo.war /usr/local/tomcat/webapps/


EXPOSE 8081


RUN sed -i 's/8080/8081/g' /usr/local/tomcat/conf/server.xml


CMD ["catalina.sh", "run"]
