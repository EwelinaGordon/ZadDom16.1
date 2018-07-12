package pl.javastart;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;


@ComponentScan
@Configuration
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Main.class);
        SmartHome smartHome = applicationContext.getBean(SmartHome.class);
        smartHome.uruchomSterowniki();
    }
    @Bean
    public Random random() {
        return new Random();
        }
    }
