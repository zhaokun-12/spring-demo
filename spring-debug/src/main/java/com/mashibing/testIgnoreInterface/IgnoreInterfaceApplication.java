package com.mashibing.testIgnoreInterface;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/8/4
 * @Version 1.0
 **/

public class IgnoreInterfaceApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("IgnoreInterfaceApplication.xml");
        IgnoreInterfaceComponent bean = classPathXmlApplicationContext.getBean(IgnoreInterfaceComponent.class);

        System.out.println(bean.name);
        String[] beanDefinitionNames = classPathXmlApplicationContext.getBeanFactory().getBeanDefinitionNames();
        System.out.println("==========");
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }


}
