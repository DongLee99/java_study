# RacingCar 기능정리

---
## Domain

### Car
* 아는 것
    * 차의 이름
    * 차의 위치    
    * 랜덤 범위
* 하는 것 
    * 차 이동
    * 이름 검증 (공백, 길이)

### Cars
* 아는 것
    * 복수의 차
* 하는 것 
    * 차 전체 이동
    * 가장 멀리간 차의 위치 찾기
    * 우승자 찾기
    * 차 이름 중복 검증

### Number
* 아는 것
    * 숫자 값
* 하는 것 
    * 변수형 검

---

## Service

### RacingCarGame
* 아는 것
* 하는 것 
    * 게임 시작

### RacingCarGameController
* 아는 것
* 하는 것
    * 차 생성
    * count 생성 
    * 경주 실행 

---

## Utils

### Input
* 아는 것
* 하는 것 
    * 숫자 입력
    * 문자 입력 

### RandomUtils
* 아는 것
    * 랜덤 라이브러리
* 하는 것 
    * 범위 내의 랜덤값 생


### View
* 아는 것
* 하는 것 
    * 거리 출력
    * 차 이름 출력
    * 우승자 출력 



보장된 숫자 입력

보장된 문자 입력 

보장된 숫자가 아닐 시 에러가 발생한다.

자동차 이름 중복 제거

자동차 이름의 길이가 5이하 보장

범위내의 랜덤값 생성 보장

String 입력을 각 항목별 분리