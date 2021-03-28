package co.kr.jparangdev.spring_test1.model;

public class XmlBeanTest {
    private String name;
    private int value;

    public void init() {
        System.out.println("XmlBean Test Init!");
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
