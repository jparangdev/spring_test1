package co.kr.jparangdev.spring_test1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringTest1Application.class, args);
    }


//    @Bean
//    public CommandLineRunner outBeanName(ApplicationContext ctx) {
//        return args -> {
//            System.out.println("============= Bean Start =============");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.stream(beanNames).forEach(
//                    System.out::println
//            );
//            System.out.println("============= Bean End   =============");
//        };
//    }
//
//    @Bean
//    public CommandLineRunner outXmlBeanName() {
//        return args -> {
//            System.out.println("============= XmlBean Start =============");
//            ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.stream(beanNames).forEach(
//                    System.out::println
//            );
//            System.out.println("============= XmlBean End   =============");
//        };
//    }

}
