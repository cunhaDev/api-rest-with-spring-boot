FROM openjdk:11

ARG PROFILE
ARG ADDITIONAL_OPTS

ENV PROFILE=${PROFILE}
ENV ADDITIONAL_OPTS=${ADDIOTIONAL_OPTS}

WORKDIR /opt/spring_boot

COPY /target/spring-boot*.jar api_resp_spring_boot.jar

SHELL ["/bin/sh", "-c"]

EXPOSE 5005
EXPOSE 8080

CMD java ${ADDIOTIONAL_OPTS} -jar api_resp_spring_boot.jar --spring.profiles.active=${PROFILE}