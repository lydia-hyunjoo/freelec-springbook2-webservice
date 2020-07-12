package com.lydia.book.springboot;

import com.lydia.book.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

// 테스트를 잔행할때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킨다.
//여기서 SpringRunner라는 스프링 실행자를 사용.즉, 스프링부트 테스트와 JUnit 사이에 연결자 역할을 한다.
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = HelloController.class)  //여러 스프링 어노테이션중, Web에 집중할수있는 어노테이션.
public class HelloControllerTest {

    // 스프링이 관리하는 빈을 주입받습니다.
    @Autowired
    private MockMvc mvc;

    @Test
    public void hello가_리턴한다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello"))
                .andExpect(status().isOk())     // mvc.perform의 결과를 검증.
                .andExpect(content().string(hello));
    }
}
