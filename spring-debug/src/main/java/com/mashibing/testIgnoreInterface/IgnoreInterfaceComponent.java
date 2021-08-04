package com.mashibing.testIgnoreInterface;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author zhaokun
 * @Date 2021/8/4
 * @Version 1.0
 **/
@Component
public class IgnoreInterfaceComponent implements BeanNameAware {

    public String name;
    @Override
    public void setBeanName(String name) {
        System.out.println("-----------name:---" + name);
        this.name = name;
    }
}
