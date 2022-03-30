FROM azul/zulu-openjdk-alpine:17-jre

EXPOSE 8080 8080

ENV JAVA_OPTS=""

VOLUME [ "/root" ]

COPY target/SchrodingerBoards-0.0.1-SNAPSHOT.jar SchrodingerBoards.jar
#
# ENV JAVA_VER 17
# ENV JAVA_HOME /usr/lib/jvm/java-17-oracle
#
# RUN echo 'deb http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main' >> /etc/apt/sources.list && \
#     echo 'deb-src http://ppa.launchpad.net/webupd8team/java/ubuntu trusty main' >> /etc/apt/sources.list && \
#     apt-key adv --keyserver keyserver.ubuntu.com --recv-keys C2518248EEA14886 && \
#     apt-get update && \
#     echo oracle-java${JAVA_VER}-installer shared/accepted-oracle-license-v1-1 select true | sudo /usr/bin/debconf-set-selections && \
#     apt-get install -y --force-yes --no-install-recommends oracle-java${JAVA_VER}-installer oracle-java${JAVA_VER}-set-default && \
#     apt-get clean && \
#     rm -rf /var/cache/oracle-jdk${JAVA_VER}-installer

ENTRYPOINT ["java", "-jar", "/SchrodingerBoards.jar"]