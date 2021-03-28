package co.kr.jparangdev.spring_test1.model;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationBeanTest implements InitializingBean, DisposableBean {
    private String name;
    private int value;

    @PostConstruct
    public void postContract() {
        System.out.println("Post Contract !!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean !!");
    }

    public void init() {
        System.out.println("init !!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean !!");
    }

    public void distroy() {
        System.out.println("distroy !!");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("PreDestroy !!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
