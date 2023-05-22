The example project for Proxy Pattern

<div align="center">
    <img src="./assets/images/hello_world.png"/>
</div>

## Prerequisites
Make sure following software is installed on your PC
- [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17) or later

## Project structure
```
.
├── proxy-pattern
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

```shell
$ ./mvnw clean package
$ java -jar ./proxy-pattern/target/proxy-pattern-0.0.1-SNAPSHOT.jar
13:07:19.508 [main] INFO io.github.huypva.proxypattern.Proxy -- Proxy doAction.
13:07:19.509 [main] INFO io.github.huypva.proxypattern.RealSubject -- RealSubject doAction.
```

## Contribute
The code is open sourced. I encourage fellow developers to contribute and help improve it!

- Fork it
- Create your feature branch (git checkout -b new-feature)
- Ensure all tests are passing
- Commit your changes (git commit -am 'Add some feature')
- Push to the branch (git push origin my-new-feature)
- Create new Pull Request

## Reference
- https://en.wikipedia.org/wiki/Proxy_pattern
- https://refactoring.guru/design-patterns/proxy