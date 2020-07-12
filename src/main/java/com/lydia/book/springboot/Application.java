package com.lydia.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 이 설정으로 인해 스프링부트의 자동설정, 스프링 빈 읽기와 생성을 모두 자동으로 설정된다. @SpringBootApplication이 있는 위치부터 설정을 읽어가기때문에 이 클래스는 항상 프로젝트의
// 최상단에 위치해야한다.
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
