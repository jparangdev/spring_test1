package co.kr.jparangdev.spring_test1.config;

import co.kr.jparangdev.spring_test1.model.AnnotationBeanTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class TestConfig {
    @Bean
    @Scope("protoType")
    public AnnotationBeanTest annotationBeanTest() {
        return new AnnotationBeanTest();
    }
}
