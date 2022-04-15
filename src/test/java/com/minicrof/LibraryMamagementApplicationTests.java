package com.minicrof;

import com.minicrof.service.impl.LoginServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LibraryMamagementApplicationTests {

    @Autowired
    LoginServiceImpl loginService;

    @Test
    void contextLoads() {
        System.out.println(loginService.ifFindUser("123","123"));
    }

}
