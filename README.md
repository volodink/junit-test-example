# JFreeChart single JAR build example

Run this command to build jar: 

```
mvn clean compile assembly:single
```

Run this to run jar:

__Linux__
```
java -jar ./target/junit-test-example-1.0-SNAPSHOT-jar-with-dependencies.jar
```