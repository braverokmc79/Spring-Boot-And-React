package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * 
 * 
 * 다음은 public디렉토리의 내용을 전달하기위한 컨트롤러를 만듭니다.
 * 어떤 URL로 요청이 와도 index.html을 반환하는 컨트롤러입니다. 
 * SPA에서는 화면 측의 라우팅 (URL과 표시 내용의 끈 절임)는 프론트 엔드에서 실시하므로,
 * 서버 사이드 index.html를 응답하면 OK라는 것입니다.
 * 
 * 
 */
@Controller
public class SinglePageController {
    //@GetMapping("/**/{path:[^.]*}")
    public String any() {
        return "forward:/index.html";
    }
    
    @GetMapping("/api/{path:[^.]*}")
    public String anyApi() {
        return "forward:/index.html";
    }
    
    
}