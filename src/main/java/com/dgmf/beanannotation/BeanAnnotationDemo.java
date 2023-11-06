package com.dgmf.beanannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanAnnotationDemo {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppConfig.class)) {

            Address address = context.getBean(Address.class);
            address.print();

            Student student = (Student) context.getBean("studentBean");
            student.print();

            Teacher teacher = (Teacher) context.getBean("teacherBeanDemo");
            teacher.print();

            String[] beansNames = context.getBeanDefinitionNames();
            for (String bean: beansNames) {
                System.out.println(bean);
            }
        }
    }
}
