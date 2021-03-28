package co.kr.jparangdev.spring_test1;

import co.kr.jparangdev.spring_test1.config.TestConfig;
import co.kr.jparangdev.spring_test1.model.AnnotationBeanTest;
import co.kr.jparangdev.spring_test1.model.XmlBeanTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.Arrays;

@SpringBootTest
class SpringTest1ApplicationTests {

    private static ApplicationContext applicationContext;

    @Test
    void contextLoads() {

    }



    @Test
    void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        String[] names = context.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
    }

    @Autowired
    AnnotationBeanTest anno1;

    @Autowired
    AnnotationBeanTest anno2;


    @Test
    void protoTypeBeanTest() {
        System.out.println("first bean  : "+anno1);
        System.out.println("second bean : "+anno2);
    }

    @Test
    void XmlBeanTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        String[] names = context.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
    }

}
