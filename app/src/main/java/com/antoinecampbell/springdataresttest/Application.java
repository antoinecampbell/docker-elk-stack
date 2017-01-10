package com.antoinecampbell.springdataresttest;

import ch.qos.logback.access.servlet.TeeFilter;
import ch.qos.logback.access.tomcat.LogbackValve;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

/**
 * @author Antoine
 */
@SpringBootApplication
@Configuration
public class Application {

//    @Bean(name = "TeeFilter")
//    public Filter teeFilter() {
//        return new TeeFilter();
//    }

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();

        LogbackValve logbackValve = new LogbackValve();

        // point to logback-access.xml
        logbackValve.setFilename("logback-access.xml");

        tomcat.addContextValves(logbackValve);

        return tomcat;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
