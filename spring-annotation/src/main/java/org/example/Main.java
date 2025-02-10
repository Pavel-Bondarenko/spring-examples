package org.example;

import org.example.car.Car;
import org.example.car.CustomCar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        LOGGER.info("\n");
        Car pickup = context.getBean("pickupCar", Car.class);
        LOGGER.info("pickup - {}", pickup.getInfo());

        Car sedan = context.getBean("sedanCar", Car.class);
        LOGGER.info("sedan - {}", sedan.getInfo());


        CustomCar custom = context.getBean("customCar", CustomCar.class);
        LOGGER.info("custom -{}", custom);

        CustomCar myCustom = context.getBean("myCar", CustomCar.class);
        LOGGER.info("myCustom - {}", myCustom);
    }
}