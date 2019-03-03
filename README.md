## Lambda식의 사용법

람다식은 Interface를 바로 정의하여 사용하는 방식으로 최근 증가하고 있는 방식이라고 한다. 코드를 통해 살펴보자

```java
public interface LambdaTest1 {
	public void method(String s1,String s2,String s3);	
}
```
>위의 코드는 기존의 Interface와 동일하다 이제 MainClass에서 이를 어떻게 구현하는지 알아보자.
```java
LambdaTest1 lt1 = (String s1,String s2,String s3) -> {System.out.println(s1 + "\n" + s2 + "\n" +s3);};
		lt1.method("Java", "Python", "C++");
```
>결과는 메소드가 정상적으로 작동한다.
```
Java
Python
C++
```

***

또한 알아두어야 할 람다식의 특징이 있다.
1. 반환값이 존재할 때
2. 매개변수의 타입이 일치할 때
3. 매개변수가 존재하지 않을 때

```java
public interface LambdaTest2 {
	public int method(int x,int y);
}
```
이 Interface는 int형을 반환하며 두 개의매개변수가 int 형으로 동일하다. 이것을 MainClass에서 어떻게 구현하는지 보자.

```java
//x,y Data type equal
LambdaTest2 lt2 = (x,y) -> {
	int res = x+y;
	return res;
};
	System.out.println("lt2 res : "+ lt2.method(10, 20)); //30출력
```

MainClass의 코드를 보면 알 수 있듯이 Interface의 Datatype에 맞추어 return값을 임의로 만들어 주었으며
또한 괄호()안의 변수들이 모두 int형을 가지기에 int를 생략하여 단순히 (x,y)만을 기술하여도 문제가 없다.

**(만약 매개변수가 존재하지 않는다면 (x,y)대신에 괄호만을() 쓰도록한다)**

### 추가적으로
기존에 선언 lt2의 코드를 정정하여 전혀다른 메소드로도 이용가능하다.
```java
lt2 = (x,y) -> {
	int res = x*y;
	return res;
};
	System.out.println("lt2 res : "+ lt2.method(10, 20));//200
```
- 이렇게 람다식을 이용하면 코드가 어느정도 유연해 질 수 있으며 개발자의 작업량도 어느정도 줄일 수 있다고 한다.
