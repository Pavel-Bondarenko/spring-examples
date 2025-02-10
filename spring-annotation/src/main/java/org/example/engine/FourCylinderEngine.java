package org.example.engine;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Primary
@Component
public class FourCylinderEngine implements Engine {

    @Override
    public int getPower() {
        return 1000;
    }
}
