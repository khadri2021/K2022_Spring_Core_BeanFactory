package com.khadri.spring.core.beanfactory.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactoryActivateNew {
    public static void main(String[] args) {

        //BeanFactory Container Activation by using ClassPathXmlApplicationContext Implementation
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) beanFactory.getBean("student");

        System.out.println("Student ID "+student.getStdId());
        System.out.println("Student Name "+student.getStdName());
    }
}