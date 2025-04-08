package com.app.dependency.di;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor
public class Food {
   private final Knife knife;
}
