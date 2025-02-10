package org.example.engine;

import org.springframework.stereotype.Component;

@Component
public class TwinCylinderEngine implements Engine {

    @Override
    public int getPower() {
        return 500;
    }
}
