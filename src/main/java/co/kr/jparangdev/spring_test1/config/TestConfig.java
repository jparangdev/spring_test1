package co.kr.jparangdev.spring_test1.config;

import co.kr.jparangdev.spring_test1.model.AnnotationBeanTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean(initMethod = "init" ,destroyMethod="distroy")
    public AnnotationBeanTest annotationBeanTest() {
        return new AnnotationBeanTest();
    }
}
