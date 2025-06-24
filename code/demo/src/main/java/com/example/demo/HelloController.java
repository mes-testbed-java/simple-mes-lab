/**
 * 📄 HelloController.java - 뷰 기반 MES 대시보드 컨트롤러
 *
 * 1. @Controller
 *    → 이 클래스는 HTML 뷰를 반환하는 Spring MVC 컨트롤러로 등록됨
 *
 * 2. @GetMapping("/")
 *    → 루트 경로('/')에 대한 GET 요청을 처리
 *    → 사용자가 브라우저에서 http://localhost:8080/ 접근 시 실행됨
 *
 * 3. mesDashboard(Model model)
 *    → Model 객체에 "title" 속성을 추가하여 Thymeleaf 템플릿에 전달
 *    → 반환값 "dashboard"는 /templates/dashboard.html 뷰 파일을 의미
 *
 * 📌 이 컨트롤러는 정적 문자열이 아닌 HTML 템플릿 기반의 UI를 출력하고,
 *     다양한 동적 데이터(예: 실시간 시계, 공정 목록 등)와 연동하는 출발점 역할을 함
 */

package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String mesDashboard(Model model) {
        model.addAttribute("title", "MES 대시보드");
        return "dashboard";
    }
}
