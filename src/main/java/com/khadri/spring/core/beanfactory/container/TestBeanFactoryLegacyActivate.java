package com.khadri.spring.core.beanfactory.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactoryLegacyActivate {
    public static void main(String[] args) {
        //BeanFactory Container Activation by using XmlBeanFactory Implementation
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Student student = (Student) beanFactory.getBean("student");

        System.out.println("Student ID "+student.getStdId());
        System.out.println("Student Name "+student.getStdName());
    }
}