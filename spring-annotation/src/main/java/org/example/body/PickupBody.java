package org.example.body;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class PickupBody implements Body {

    @Override
    public String getName() {
        return "Pickup";
    }
}
