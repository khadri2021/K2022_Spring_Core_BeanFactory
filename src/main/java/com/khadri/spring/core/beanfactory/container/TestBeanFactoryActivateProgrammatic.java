package com.khadri.spring.core.beanfactory.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConstructorArgumentValues;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.SimpleBeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestBeanFactoryActivateProgrammatic {
    public static void main(String[] args) {

        // The replace of XMLBeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        //Bean Definition
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();

        //Constructor Injection
        ConstructorArgumentValues argumentValues = new ConstructorArgumentValues();
        argumentValues.addIndexedArgumentValue(0,20);
        argumentValues.addIndexedArgumentValue(1,"JHON");

        //setting constructor values to bean definition
        beanDefinition.setConstructorArgumentValues(argumentValues);

        //defining class name
        beanDefinition.setBeanClass(Student.class);

        //providing beandefinition with bean name
        beanFactory.registerBeanDefinition("student",beanDefinition);


        Student student = (Student) beanFactory.getBean("student");

        System.out.println("Student ID "+student.getStdId());
        System.out.println("Student Name "+student.getStdName());
    }
}