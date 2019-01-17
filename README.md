Trivial project to illustrate in the very basic way to migrate from Java 8 to Java 11.

Try to:
1. git checkout java8
2. set Java 8
3. ./gradlew run

Then repeat the above steps for Java 9 and Java 11.

Or you may wish to run on Linux or Mac (after tuning the Java versions used by SDK MAN):
```
git checkout java8 && sdk use java 8.0.222.hs-adpt && ./gradlew clean run
git checkout java9 && sdk use java 9.0.7-zulu && ./gradlew clean run
git checkout java11 && sdk use java 11.0.4.hs-adpt && ./gradlew clean run
```
