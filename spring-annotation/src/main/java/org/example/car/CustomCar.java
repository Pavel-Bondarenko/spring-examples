package org.example.car;

import org.example.body.Body;
import org.example.engine.Engine;
import org.example.style.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.StringJoiner;

@Scope("prototype")
@Component
@PropertySource("classpath:app.properties")
public class CustomCar {
    private Engine engine;
    private Body body;
    private Style style;

    @Value("${name}")
    private String name;

    @Value("${weight}")
    private int weight;

    @Autowired
    public CustomCar(Body body,
                     Engine engine,
                     Style style) {
        this.body = body;
        this.engine = engine;
        this.style = style;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CustomCar.class.getSimpleName() + "[", "]")
                .add("link=" + super.toString())
                .add("engine=" + engine)
                .add("body=" + body)
                .add("style=" + style)
                .add("name='" + name + "'")
                .add("weight=" + weight)
                .toString();
    }
}
