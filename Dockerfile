FROM azul/zulu-openjdk-alpine:17-jre

EXPOSE 8080 8080

ENV JAVA_OPTS=""

VOLUME [ "/root" ]

COPY target/SchrodingerBoards-0.0.1-SNAPSHOT.jar SchrodingerBoards.jar

ENTRYPOINT ["java", "-jar", "/SchrodingerBoards.jar"]
