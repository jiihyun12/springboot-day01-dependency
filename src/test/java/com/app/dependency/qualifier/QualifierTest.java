package com.app.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTest {

    @Autowired
    @Qualifier(value = "labtop") // 같은 타입의 Bean이 여러 개일 때, 그 중 어떤 걸 주입할지 명시적으로 지정하는 어노테이션
                                // Qualifier는 이 주입 대상에 대해 설명하는 것이다.
                                // 이 필드에 어떤 Bean을 주입할지 정하는 거니까 주입 대상 옆에 사용해야 한다.
    private Computer computer;

    @Test
    public void computerTest() {
        log.info("-----------------");
        log.info("computer: {}", computer.getScreenSize());
        log.info("-----------------");
    }
}
