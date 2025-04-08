package com.app.dependency.di;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class School {
    // @Autowired
    private final Student student;
}
