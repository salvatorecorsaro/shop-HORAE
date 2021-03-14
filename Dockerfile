FROM openjdk
ADD target/dshop-horae-1.0.jar shop-horae-1.0.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "shop-horae-1.0.jar"]
