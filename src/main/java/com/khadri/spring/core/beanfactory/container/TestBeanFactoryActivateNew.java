package com.khadri.spring.core.beanfactory.container;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class TestBeanFactoryActivateNew {
    public static void main(String[] args) {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("beans.xml");


        Student std1 = (Student) beanFactory.getBean("student");
        Student std2 = beanFactory.getBean(Student.class);
        Student std3 = beanFactory.getBean("student",Student.class);


        System.out.println("student id "+std1.getStdId());
        System.out.println("student name "+std1.getStdName());




    }
}
