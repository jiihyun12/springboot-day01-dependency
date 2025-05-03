package com.app.dependency.di;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
// @RequiredArgsConstructor
public class DiTest {

    @Autowired  // 주입
    private Coding coding;

    @Autowired
    private Food food;

    @Test
    public void foodTest(){
        log.info("-------------------------");
        log.warn("{}", food.getKnife());
        log.error("{}", food.getKnife());
        log.info("{}", food.getKnife());
        log.info("-------------------------");
    }

    @Test
    public void codingTest(){
        // Coding coding = new Coding(); // 객체화(스프링이 관리하는 객체가 아니기떄문에 null값이 나옴)
        log.info("--------------");
        log.info("{}", coding.getComputer()); // 오른쪽에 있는 값을 왼쪽에 넣어준다.(+ 템플릿 리터럴 느낌)
        log.info("--------------");
    }

}
