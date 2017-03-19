# Scala toy project

Scala는 `better than java`라는 얘기를 들어서 한번 scala를 공부해보고 구현해볼 생각으로 시작한다. 

재미있는 것은 컴파일하면, `.class`파일이 생성되서 JVM위에서 동작하기에 Java의 인프라 위에서 FP의 장점을 살려서 개발할 수 있다는 것이다.

목적은 장단점 파악, 언제 쓰면 좋을지 point를 찾는 것, 어떤 상황에서는 주의해서 사용해야 하는지 파악하는 것 등이다.

reference: <http://docs.scala-lang.org/ko/tutorials/scala-for-java-programmers.html>

## Hello world

Scala를 설치하고, 헬로우 월드부터 찍어보자. Scala는 아래처럼 작성한다. IDE에서는 Java class와 Scala class를 별개로 취급한다. (IntelliJ)

### Java와 함께 사용하기

> Scala 임포트 구문의 또 한가지 특징은 패키지나 클래스에 속한 모든 이름들을 불러 올 경우 별표(*) 대신 밑줄(_) 을 사용 한다는 것이다. 별표는 Scala에서 합법적인 식별자(함수명 등에 사용 가능한)로 사용된다.