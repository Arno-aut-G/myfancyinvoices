package com.dachsbau.myfancypdfinvoices.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.dachsbau.myfancypdfinvoices.ApplicationLauncher;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@ComponentScan(basePackageClasses = ApplicationLauncher.class)
@PropertySource("classpath:/application.properties")
@PropertySource(value = "classpath:/application-${spring.profiles.active}.properties"
        , ignoreResourceNotFound = true)
@EnableWebMvc
public class ApplicationConfiguration {

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
