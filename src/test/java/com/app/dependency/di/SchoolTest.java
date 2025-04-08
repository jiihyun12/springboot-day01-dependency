package com.app.dependency.di;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class SchoolTest {

    @Autowired
    private School school;

    @Test
    public void schoolTest(){
        log.info("--------------");
        log.info("{}", school.getStudent());
        log.info("--------------");
    }
}
