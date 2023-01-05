# :rocket:GDSC-Springboot session

- speaker:조정빈

- 참여자:김민준, 박수경, 박지현, 이부원, 이예찬, 황승수

- 세션 날짜: 매주 월요일 10시


- 장소:GDSC_Discode>springboot-2022-2 음성채널
# 🌿spring_CRUD (1)

spring CRUD 기능구현 세션 1주차 (개발환경 설정, 프로젝트&DB구축,게시글 처리)

### 프로젝트 생성

---

[Spring Initializr](https://start.spring.io/)

![Untitled](%F0%9F%8C%BFspring_CRUD%20(1)%20a1dc3c133317429c85552ea1ca3e8fc4/Untitled.png)

### 실행오류

---

[[Spring] o.s.b.d.LoggingFailureAnalysisReporter 에러 해결](https://blog.amaorche.com/145)

[Error starting ApplicationContext. To display the conditions report re-run your application with 'de](https://m.blog.naver.com/fbfbf1/222632330287)

### application.properties

---

```java
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=0000
spring.datasource.url=jdbc:mysql://localhost:3306/crud 
```

### annotation이란?

---

annotation:주석

코드 사이에 주석처럼 쓰면서 특별한 의미, 기능을 수행하도록 하는 기술로 프로그램에게 추가적인 정보를 제공해주는 메타데이터

### annotation의 용도

---

1. 컴파일러에게 코드 작성 문법 에러를 체크하도록 정보 제공
2. 소프트웨어 개발툴이 빌드나 배치 시 코드를 자동으로 생성할 수 있도록 정보를 제공한다.
3. **런타임 시 특정 기능을 실행하도록 정보를 제공한다.**

## :heavy_check_mark: 세션 소개

- spring boot를 사용한 CRUD 기능 구현


- 간단한 게시판 만들기

- HeidiSQL, MariaDB, JPA,Postman,Springboot 사용

## :heavy_check_mark: WEEK1

- 개발환경 설정

- 프로젝트 & DB 구축

- 게시글 처리

:link:https://foil-crawdad-ff3.notion.site/spring_CRUD-1-a1dc3c133317429c85552ea1ca3e8fc4


## :heavy_check_mark: WEEK2

- 게시글 목록

- 게시글 상세보기

:link:https://foil-crawdad-ff3.notion.site/spring_CRUD-2-95e8628100344da9a9f2e11436714236

## :heavy_check_mark: WEEK3

- 게시글 삭제

- 게시글 수정

:link:https://foil-crawdad-ff3.notion.site/spring_CRUD-3-0696af8f306e45319d1087e5306e93d7

## :heavy_check_mark: WEEK4

- 페이징 처리

- 게시글 검색

:link:https://foil-crawdad-ff3.notion.site/spring_CRUD-4-cd140288c9c64f369641c0fd7803ec96


## :bulb: 배운 점 & 아쉬운 점

- 세션을 진행하면서 spring MVC패턴에 대해 더 공부하는 계기가 되었다

- 프론트앤드적인 부분은 타임리프로 기본적인 부분만 처리했는데 부트스트랩을 사용해서 보기 좋게 구현했으면 세션 참여하는 학생들이 더 좋아했을텐데 하는 아쉬움이 있다. 

