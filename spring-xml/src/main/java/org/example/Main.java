package org.example;

import org.example.car.Car;
import org.example.car.CustomCar;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        LOGGER.info("\n");

        Car pickup = context.getBean("pickup", Car.class);
        LOGGER.info(pickup.getInfo());

        Car sedan = context.getBean("sedan", Car.class);
        LOGGER.info(sedan.getInfo());

        Car autoPickup = context.getBean("autoPickup", Car.class);
        LOGGER.info(autoPickup.getInfo());

        LOGGER.info(pickup.toString());
        LOGGER.info(sedan.toString());
        LOGGER.info(autoPickup.toString());

        CustomCar customCar = context.getBean("custom", CustomCar.class);
        LOGGER.info("customCar - {}", customCar);
    }
}