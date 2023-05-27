package ru.pstu.config;

import org.aeonbits.owner.Config;


@Config.Sources({"classpath:pstu.properties"})
public interface AppConfig extends Config {

    @Key("pstu.url")
    String pstuUrl();
}
