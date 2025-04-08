package com.app.dependency.resturant;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class Outback implements Resturant {

    @Override
    public int resturantPrice() {
        return 10000;
    }

    @Override
    public String useResturant() {
        return "불가능";
    }
}
