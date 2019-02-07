FROM openshift/wildfly-120-centos7
COPY . .
RUN ./gradlew clean build
CMD ["java", "-jar", "build/libs/demo-0.0.1-SNAPSHOT.jar"]
