FROM 192.168.8.136:9443/springbootproject/anapsix/alpine-java:latest
MAINTAINER www.qingteng.cn/minejzy
#CMD ["java", "-version"]
#RUN echo `pwd`
#WORKDIR /tmp
RUN rm -rf /tmp/*.jar
ADD ./mavenwithdocker-demo-0.0.1-snapshot.jar /tmp/
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "/tmp/mavenwithdocker-demo-0.0.1-snapshot.jar"]
