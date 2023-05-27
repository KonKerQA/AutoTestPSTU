package ru.pstu.config;

import org.aeonbits.owner.ConfigFactory;

public class AppConfigProvider {

    private static AppConfig config;

    private AppConfigProvider() {
        throw new IllegalStateException("AppConfigProvider shouldn't be instantiated");
    }

    public static AppConfig props() {
        if (config == null) {
            config = ConfigFactory.create(AppConfig.class, System.getProperties());
        }
        return config;
    }
}

