# Spring Cloud

### eureka (18086)
- Service Discovery

### config (18088)
- config 설정값들을 저장
- config 저장소 : https://github.com/Hwa-ning/Spring-Cloud-Config

### gateway (18090)
- service gateway
- Spring Cloud Gateway : 리버스 프록시, Service Discovery인 eureka를 통해 자동 경로 맵핑 설정

### service-one (18091)
- Spring-boot-starter-web, 일반 rest api 구현
- config를 통해 property값 message.profile return endPoint : /config/message/profile

### 의존성 관리
상위 프로젝트의 build.gradle을 통해 관리, IntelliJ 프로젝트내의 모듈을 통해 하위 프로젝트들 관리