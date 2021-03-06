# 2주차 과제 : JAVA 코드 둘러보기 
--- 
## 1. 자바 코드 실습
  
  
  
  
* 과제 
  - java 11 jdk 다운 받고 실행 해보기
  - 인텔리제이 단축키 정리
  - Live Templete 정리
 
###  java 11 jdk 다운 받고 실행 해보기
---

 ###### 계속 다운로드 사이트에서 오류가 나서 다운로드를 못하고 있습니다...😂
 
 

###  인텔리제이 단축키 정리
---

_Mac 기준에서 작성됨_
** 검색 **
* CMD + F ( 현재 파일에서 찾고자 하는 Text 검색하기 )
* CMD + R ( 현재 파일에서 찾고자하는 Text를 원하는 Text로 교체하기 )
* CMD + SHIFT + F ( 전체 파일에서 원하는 Text 검색하기 )
* CMD + SHIFT + R ( 전체 파일에서 찾고자하는 Text를 원하는 Text로 교체 하기 )
* CMD + SHIFT + A ( 액션 검색하기 )
* CMD + E ( 최근에 열었던 파일 목록 보기 )

** 자동 완성 **
* Ctrl + SPACE ( 기본 자동 완성)
* Ctrl + SHIFT + SPACE ( 스마트 자동 완성 )
* CMD + N ( 제네레이트 자동 완성 getter, setter 등 목록 보기 )
* Ctrl + I ( Override 메서드 자동 완성 )

** 리펙 토링 **
* CMD + OPT + V ( 변수 추출하기 )
* CMD + OPT + P ( 파라미터 추출 하기 )
* CMD + OPT + M ( 메서드 추출 하기 )
* CTRL + OPT + O ( import 정리 하기 _사용하지 않는 import 제거 _)
* CMD + OPT + l ( 코드 자동 정렬 하기 )
* SHIFT + F6 ( 이름 일관 변경하기 )
** 메서드 실행 **
* CTRL + SHIFT + R ( 현재 포커스 된 메서드 실행 )
* CTRL + R ( 위와 같음 )

** 라인 수정하기 **
* CTRL + D ( 라인 복사하기 _현재 포커스가 있는 줄을 복사_)
* CTRL + BACKSPACE ( 라인 삭제하기 _현재 포커스가 있는 줄을 지움_)
* CTRL + SHIFT + J ( 문자열 라인 합치기 _줄바꿈 삭제_)

** 기타 **
* CMD + U ( 부모 클래스 메소드로 이동 )
* OPT + CMD + T ( 선택된 코드 둘러싸기 )
* CMD + . ( 메소드 축소 )
* CMD + B ( 클래스 및 메소드로 바로 이동 )
* CMD + D ( 현재 라인 복제하기 )
* CMD + O ( 클래스 검색 )



###  Live Template 정리
---
> live template 란? 

코드 템플릿을 미리 지정해 편하게 코드를 작성 할 수 있게 도와주는 기능이다.

** java Live Templates 확인 하는 방법 **

*  Mac 기준 우측 상단의 intelliJ IDEA를 클릭 후 Preference.. 을 클릭한다.

![](https://images.velog.io/images/donglee99/post/d61bad5d-c480-4c7e-a09d-d12a77f6c21c/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%208.12.53.png)

* 우측 검색창에 Templates 를 검색후 Live Templates 를 찾는다.

![](https://images.velog.io/images/donglee99/post/b24026c7-01cc-4470-9e4d-445a053bf5d5/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%208.13.52.png)

* 항목 중 JAVA 를 찾아 JAVA 에서 사용할수 있는 Live Templates 를 찾는다.

![](https://images.velog.io/images/donglee99/post/7734a93a-d066-4053-a91b-e333d2aa3146/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%208.14.46.png)

** Live Templates 등록 하기 **
* 가장 먼저 해야 할 것은 IntelliJ IDEA 를 클릭 후 Preference..를 클릭하고 live templates를 찾는다![](https://images.velog.io/images/donglee99/post/05496ebd-9c80-4562-b911-eedaf707db4b/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-09%20%EC%98%A4%ED%9B%84%203.53.09.png)

* 옆의 + 버튼을 클릭해 Template Group을 누른다.

  Live Template = 템플릿 추가
    
    Template Group = 원하는 템플릿 그룹이 없을 시 추가
    ![](https://images.velog.io/images/donglee99/post/9c154ecc-bbb6-4f5d-88be-43d3aaf630bd/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-09%20%EC%98%A4%ED%9B%84%203.53.22.png)

* Template Group 추가 하기
![](https://images.velog.io/images/donglee99/post/f1cf940f-aad4-436b-9ff4-4bd410aa0e25/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-09%20%EC%98%A4%ED%9B%84%203.54.14.png)

* Live Template 추가
![](https://images.velog.io/images/donglee99/post/18043d74-da00-43e2-a188-43afe4aa0cd2/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-09%20%EC%98%A4%ED%9B%84%203.56.16.png)
	
    1. Abbreviation : 사용할 축약어 입력
	2. Template text : 자동 완성할 템플릿 입력
    3. Edit Variables : 만약 템플릿에 변수를 사용할꺼면 이 버튼을 이용해 변수 값 지정
    4. Expends_with : 자동완성에 사용할 키를 지정
    5. No_applicable_contexts_yet_Define : 템플릿을 사용할 문서 유형 지정
** Live Templates 정리 **

> psvm + Tab

``` java
public static void main(String[] args) {
    
} 
``` 


> sout + Tab

``` java

System.out.println();
```

> soutm + Tab

``` java

System.out.println(메소드 이름);
```

> soutp + Tab

``` java

System.out.println(메소드 파라미터 네임 or values);
```

> fori (오우 이걸 이제 알다니 ㄷㄷ 세상 편리해요)

``` java

for (int i = 0; i < ; i++) {
            
        }
```

> foreach

``` java

   for (:
             ) {
            
        }
```

> ilter

``` java

   for (String arg : args) {
            
        }
```
---
## 2. 자바 기초
자바를 사용하는 개발자라면 누구나 자바 바이트 코드가 JRE 위에서 동작 한다는 사실을 알아야 한다. JRE의 가장 중요한 요소 - > JVM (자바 바이트 코드를 해석 후 실행) , JRE 는 자바 API 와 JVM 으로 구성 되어 있으며 JVM 은 자바 애플리케이션을 클래스 로더로 읽어 들여서 자바 API 와 함께 실행 하는 것이다.

### JVM 이란 무엇인가?
---
* JVM 을 설명하기 앞서 간단한 용어 정리와 자바 특징
  - 자바 바이트 코드
    - WORA(Write Once Run AnyWhere)을 구현 하기 위한 사용자 언어인 자바와 기계어의 중간 언어인 자바 바이트 코드 **즉 자바 바이트 코드는 기계와 인간 사이의 중간 언어**
    
  - JAVA
    - 자바의 가장 큰 특징은 아무 하드웨어, OS(운영체제)에 상관 없이 컴파일된 코드가 독립적이다
    
    

* JVM이란?
  - 자바 코드의 실행 과정

![](https://images.velog.io/images/donglee99/post/93700d34-ba92-4032-a67a-2a4edcc66345/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%208.54.46.png)
	- 바이트 코드는 기계언어가 아닌 사용자 언어와 기계어의 중간 단계의 언어이다. 따라서 컴퓨터는 바이트 코드를 읽을 수 없다. 위 그림에서 보이듯이 Java Compiler는 .java 파일을 .class 로 컴파일을 하여 변환 시켜 이를 OS 가 해석 할 수 있게 JVM 으로 넘기게 됩니다. 
간단하게 나타내면

	1. java source 파일 작성
    2. java Compiler 가 1 번에서 작성한 .Java 파일을
       바이트 언어로 구성된 .class 로 변환
    3. Os가 처리할 수 있도록 JVM 이 .class 파일을 해석
    
> 이로 인해 Byte 코드가 JVM 위에서 OS에 상관없이 실행이 될수 있게 된다 이는 JAVA의 가장 큰 장점이라 할 수 있다. (OS에 종속적이지 않고 어떤 환경에서든 JVM 위에서 실행이 가능하다.

### JVM의 구성 요소
---
자바 코드가 JVM에 전달되는 과정

1. .class 를 JVM의 클래스 로더에 전달
2. 클래스 로더는 동적 로딩을 통해 필요한 클래스들을 런타임 영역에 로드한다.
3. 실행 엔젠이 자바 바이트 코드를 실행한다.


* JVM 구조

![](https://images.velog.io/images/donglee99/post/40593912-e580-466b-b93f-3b5d7d750d94/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%209.20.32.png)

	1. Class Loader
    2. Runtime Date Area
    3. Execution Engine


* Class Loader 
 자바는 동적 로드 즉 컴파일타임이 아니ㄴ 런타임에 클래스를 처음 참조할때 해당 클래스를 로드 하는 특징이 있는데 이를 담당하는 부분이 클래스 로더 이다.
 
 클래스 로더의 특징으로는 4가지가 있다.
 	
    1. 계층 구조
    2. 위임 모델
    3. 가시성
    4. 언로드 불가 
  
 ![](https://images.velog.io/images/donglee99/post/d01a183e-f6da-43ef-8622-49ebd5017039/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%209.34.30.png)
 
1. 로드 : 클래스를 가져와 자신의 JVM 메모리에 로드한다.
2. 검증 : 읽어 들인 .class가 자바 언어 명세 및 JVM 명세에 명시된 대로 잘 구성 되어있는지 검사  (시간이 오래 걸린다)
3. 준비 : 클래스가 필요로 하는 메모리를 할당 하고, 클래스에서 정의된 필드, 메서드, 인터페이스 들을 나타내는 데이터 구조 준비
4. 분석 : 클래스의 상수 풀 내 모든 심볼릭 레퍼런스를 다이렉트 레퍼런스로 변경

* Runtime Data Area

![](https://images.velog.io/images/donglee99/post/93e13ba8-e266-4801-bb0d-f144a65da44f/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%209.37.49.png)

런타임 영역은 JVM 이라는 프로그램이 운영체제 위에서 실행 되면서 할당 받는 메모리 영역으로 6개의 영역으로 나눌 수 있다.

1. PC 레지스터 
	* Pc 레지스터는 각 스레드마다 하나씩 존재 하며 스레드가 시작될때 생성 된다. (현재 수행중인 JVM 명령의 주소 갖음)
2. JVM 스택
	* JVM 스택은 각 스레드마다 하나씩 존재 하며 스래드가 시작될때 생성 되고 스택 프레임이라는 구조체를 저장하는 스택으로 JVM 은 오직 Push pop 동작만 수행한다.
3. 네이티브 메서드 스택
	* 자바 외의 언어로 작성된 네이티브 코드를 위한 스택이다.
4. 힙
	* 인스턴스 또는 객체를 저장하는 공간으로 가비지 컬렉션의 대상이다.
5. 메서드 영역
	* 모든 스레드가 공유하는 영역으로 JVM이 시작될때마다 생성되며 JVM이 읽어 들인 각각의 클래스와 인터페이스에 대한 런타임 상수 풀, 필드와 메서드에 대한 정보, Static 변수, 메서드의 바이트 코드 보관
6. 런타임 상수 풀
	* JVM 동작에서 가장 핵심적인 역할 수행하는 곳으로 각 클래스의 인터페이스 상수와 메서드와 필드에 대한 모든 레퍼런스까지 담고 있는 테이블로 어떤 메서드나 필드를 참조할때 런타임 상수풀을 통해 메서드나 필드의 실제 메모리상 주소 찾아서 참조한다.


_실행 엔진은 밑에서 설명._

### JIT 컴파일러란 무엇이며 어떻게 동작하는가?
---


- 실행 엔진
    	- 클래스 로더를 통해 런타임 데이터 영역에 배치 되어있는 바이트 코드를 명령어 단위로 읽어서 실행을 한다 = **바이트 코드를 기계어로 번역하고 실행 ** 
이때 사용하는 방법이 2가지가 있는데 이중 하나는 인터프리터고 나머지 하나는 이번 2주차 과제에 알아볼 JIT 인터 프리터 이다.

- 인터 프리터
바이트 코드 명령어를 하나씩 읽고 해석하고 실행 한다. 이는 하나씩 해석하고 실행하는 과정 때문에 바이트 코드 하나하나의 해석을 빠르나 실행이 느리다는 단점이 있다.


* JIT(Just - In - Time)
인터프리터의 단점을 보완하기 위해 도입 되었다. 기존의 인터 프리터 방식으로 실행을 하다가 적절한 시점에 바이트 코드 전체를 컴파일 하여 네이티브 코드로 변경하고 이후 네이티브 코드로 직접 실행 하는 방식이다. 이후 네이티브된 코드는 캐시로 보관하기 때문에 빠르게 수행 가능

![](https://images.velog.io/images/donglee99/post/aa506365-047f-41a7-9294-cef305230410/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202021-01-05%20%EC%98%A4%ED%9B%84%209.17.30.png)





### JDK와 JRE의 차이
---


* JDK
**JDK는 자바 개발 키트** 이며 자바의 모든 기능을 갖춘 SDK JDK 는 JRE를 포함 하고 있다.( JDK = JRE + @ )

	
* JRE
**JRE는 자바 런타임 환경**이며 JAVA 클래스 라이브러리, JAVA 명령등 java 프로그램을 실행하는데 필요한 모든 패키지이다. _but 새로운 프로그램을 작성하는데는 사용할수 없다._
	


즉 JDK 는 읽기와 쓰기를 모두 할수 있는 자바 개발 키트 이고, JRE 는 자바를 읽을 수 만 있다고 생각할 수 있다.

