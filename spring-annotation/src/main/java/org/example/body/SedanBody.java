package org.example.body;

import org.springframework.stereotype.Component;

@Component
public class SedanBody implements Body {

    @Override
    public String getName() {
        return "Sedan";
    }
}
