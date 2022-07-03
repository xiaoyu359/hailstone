FROM java:8

# RUN #mvn install && mvn -U clean package -Ptest

ENV APP_HOME /SavourDao/app/hailstone
ENV APP_NAME hailstone-admin.jar

RUN mkdir -p $APP_HOME

ADD ./$APP_NAME ${APP_HOME}/$APP_NAME

WORKDIR $APP_HOME

EXPOSE 9090

CMD ["java", "-jar", "-Xms512M", "-Xmx1G", "hailstone-admin.jar"]