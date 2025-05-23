package com.app.dependency.resturant;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ResturantTest {

    @Autowired
    private Resturant resturant;

    @Test
    public void resturantTest() {
        log.info("resturant: {}", resturant);
        log.info("resturant: {}", resturant.resturantPrice());
        log.info("resturant: {}", resturant.useResturant());
    }
}
