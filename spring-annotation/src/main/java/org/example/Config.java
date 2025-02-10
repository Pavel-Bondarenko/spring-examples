package org.example;

import org.example.body.SedanBody;
import org.example.car.CustomCar;
import org.example.style.Style;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@ComponentScan
@Configuration
@PropertySource("classpath:application.properties")
public class Config {

    @Autowired
    private Environment environment;

    @Bean("myCar")
    public CustomCar getCustomCar(CustomCar customCar) {
        customCar.setBody(new SedanBody());
        return customCar;
    }

    @Primary
    @Bean(name = "classicStyle")
    public Style getClassicStyle() {
        return new Style("classic");
    }

    @Bean("modernStyle")
    public Style getModernStyle() {
        return new Style("modern");
    }
}
