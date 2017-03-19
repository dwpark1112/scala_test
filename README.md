# Scala toy project

Scala는 `better than java`라는 얘기를 들어서 한번 scala를 공부해보고 구현해볼 생각으로 시작한다. 

재미있는 것은 컴파일하면, `.class`파일이 생성되서 JVM위에서 동작하기에 Java의 인프라 위에서 FP의 장점을 살려서 개발할 수 있다는 것이다.

목적은 장단점 파악, 언제 쓰면 좋을지 point를 찾는 것, 어떤 상황에서는 주의해서 사용해야 하는지 파악하는 것 등이다.

reference: 
- <http://docs.scala-lang.org/tutorials/tour/tour-of-scala.html>

## Hello world

Scala를 설치하고, 헬로우 월드부터 찍어보자. Scala는 아래처럼 작성한다. IDE에서는 Java class와 Scala class를 별개로 취급한다. (IntelliJ)

### Java와 함께 사용하기

> Scala 임포트 구문의 또 한가지 특징은 패키지나 클래스에 속한 모든 이름들을 불러 올 경우 별표(*) 대신 밑줄(_) 을 사용 한다는 것이다. 별표는 Scala에서 합법적인 식별자(함수명 등에 사용 가능한)로 사용된다.

> Scala 안에서 Java의 클래스들을 상속받고 Java의 인터페이스들을 바로 구현하는 것도 가능하다.

장점이라곤 하는데, 익숙해지지 않으면 복잡하게 느껴질 수도 있을 것 같다.

### 숫자도 하나의 객체로 취급

아래는 `1.` (double), `+` operation, `2` (int) 3개로 식별된다. 

```scala
1.+(2)
```

만일 첫번째 token이 int로 취급되도록 하려면, 아래처럼 표현한다.

```scala
(1).+(2)
```

**숫자, 함수 모두 객체로 취급하고, 이름없는 함수도 parameter로 보낼 수 있다.**

> 초보 Scala 프로그래머들을 위한 한가지 방법은, 주변을 보고 쉽게 타입을 유추 해 낼 수 있는 경우 일단 타입 선언을 생략하고 컴파일러가 받아 들이는지 확인하는 것이다. 이렇게 몇번을 반복하고 나면 프로그래머는 언제 타입을 생략해도 되고 언제 명시적으로 써주어야 하는지 감을 잡게 된다.

이게 뭔 소리야?;; 감으로 프로그래밍하라는 건가?

## Basic

Hello world는 맛보기로 그냥 해보고, 문서를 보고 공부를 제대로 해보자.
Scala 관련 도구를 설치할 필요는 없고, <https://scalafiddle.io/> 이곳에서 직접 코딩하고 결과를 볼 수 있다.

### value, variable

val은 value라서 reassignment가 안되고, var은 variable이라서 reassignment 가 동작한다.

Explicity state the type~

```scala
var xy = 1 + 1 // implicity
var xy: Int = 1 + 1 // explicity
xy = 3
println(xy)
```

### Blocks

기존에 가진 상식? 때문에 이거보니깐 신기했다.

```scala
// print 3
println({
  val x = 1+1
  x + 1
})
```

### Functions

`() => expression` 이거는 parameter를 받지 않고, expression을 실행한다.
`(x, y) => expression` 이거는 parameter로 x, y를 받고 expression을 실행한다.

```scala
// ex
val add = (x: Int, y: Int) => x + y
println(add(3, 4)) // print 7

val getTheAnswer = () => 40
println(getTheAnswer()) // print 40
```

### Methods

<http://docs.scala-lang.org/tutorials/tour/basics.html>
나머지는 내일 저녁부터 다시 봐야겠다.


