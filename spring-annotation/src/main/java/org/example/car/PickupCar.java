package org.example.car;

import org.example.body.Body;
import org.example.engine.Engine;
import org.example.style.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

@Component
public class PickupCar implements Car {
    private final Body body;
    private final Engine engine;
    private final Style style;

    @Autowired
    public PickupCar(@Qualifier("pickupBody") Body body,
                     @Qualifier("fourCylinderEngine") Engine engine,
                     @Qualifier("classicStyle") Style style) {
        this.body = body;
        this.engine = engine;
        this.style = style;
    }

    @Override
    public String getInfo() {
        return new StringJoiner(", ", PickupCar.class.getSimpleName() + "[", "]")
                .add("body=" + body.getName())
                .add("enginePower=" + engine.getPower())
                .add("style=" + style.getName())
                .toString();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PickupCar.class.getSimpleName() + "[", "]")
                .add("body=" + body)
                .add("engine=" + engine)
                .add("style=" + style)
                .toString();
    }
}
