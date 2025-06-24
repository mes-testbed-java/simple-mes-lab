/**
 * 📄 DemoApplication.java - Spring Boot 애플리케이션 진입점
 *
 * 1. @SpringBootApplication
 *    → Spring Boot의 핵심 기능(자동 설정, 컴포넌트 스캔, 설정 기반 앱 실행)을 활성화함
 *
 * 2. main() 메서드
 *    → 애플리케이션 실행 시작 지점 (Java에서 프로그램의 엔트리포인트)
 *    → SpringApplication.run()을 호출하여 내장 Tomcat 서버 및 컨텍스트 초기화
 *
 * 3. System.out.println()
 *    → 기동 전/후 콘솔에 메시지를 출력하여 실행 흐름을 가시화
 *
 * 📌 이 클래스가 없으면 애플리케이션이 시작되지 않으며,
 *     Spring Boot 앱의 중심 역할을 수행함
 */


package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("🔧 Spring Boot 애플리케이션 기동 시작...");
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("✅ Spring Boot 애플리케이션 기동 완료!");
	}

}
