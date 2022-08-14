package com.example.customblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 스프링이 com.example.customblog 패키지 이하를 스캔해서 모든 파일을 메모리에 new 하는 것은 아닙니다.
// 특정 어노테이션이 붙어있는 클래스 파일들을 new 해서 (IoC) 컨테이너에서 관리해줍니다.
@RestController
public class BlogController {

    // http://localhost:8080/test/hello
    @GetMapping("/test/hello")
    public String hello(){
        return "<h1>hello Spring Boot</h1>";
    }
}
