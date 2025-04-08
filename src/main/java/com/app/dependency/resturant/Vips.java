package com.app.dependency.resturant;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Vips implements Resturant {

    @Override
    public int resturantPrice() {
        return 10000;
    }

    @Override
    public String useResturant() {
        return "가능";
    }
}
