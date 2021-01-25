package com.maven.spring.Main;


import com.maven.spring.service.UserDaoService;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(locations = "classpath:bean2.xml")
public class JTest5 {

    @Autowired
    private UserDaoService userDaoService;

    @Test
    public void testAccountMoney() {
        userDaoService.accountMoney();
    }
}
