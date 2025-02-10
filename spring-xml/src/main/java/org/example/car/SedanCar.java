package org.example.car;

import org.example.body.Body;
import org.example.engine.Engine;
import org.example.style.Style;

import java.util.StringJoiner;

public class SedanCar implements Car {
    private Body body;
    private Engine engine;
    private Style style;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public String getInfo() {
        return new StringJoiner(", ", SedanCar.class.getSimpleName() + "[", "]")
                .add("body=" + body.getName())
                .add("enginePower=" + engine.getPower())
                .add("style=" + style.getName())
                .toString();
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", SedanCar.class.getSimpleName() + "[", "]")
                .add("body=" + body)
                .add("engine=" + engine)
                .add("style=" + style)
                .toString();
    }
}
