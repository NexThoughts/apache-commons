package com.fintech.commonsDemo;

import com.fintech.commonsDemo.beanUtils.UserBean;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Demo {

    private static void executeBeanUtilsExample() {
        try {
            UserBean userBeanFrom = new UserBean();

            //Set Value using PropertyUtils
            PropertyUtils.setSimpleProperty(userBeanFrom, "name", "FromValue");
            PropertyUtils.setSimpleProperty(userBeanFrom, "address", "Noida");
            PropertyUtils.setSimpleProperty(userBeanFrom, "aadhaar", "867687875757");

            UserBean userBeanTo = new UserBean();

            //Set Value using PropertyUtils
            PropertyUtils.setSimpleProperty(userBeanTo, "name", "ToValue");
            PropertyUtils.setSimpleProperty(userBeanTo, "address", "Delhi");
            PropertyUtils.setSimpleProperty(userBeanTo, "aadhaar", "1111111111");

            System.out.println("\n\n------- Fetch Value from both objects with help of PropertyUtils --------");
            System.out.println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanFrom)+" --------");
            System.out.println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanTo)+" --------");

            System.out.println("\n\n\n\n*********** Copy One Instance Values To Another Instance **********");
            BeanUtils.copyProperties(userBeanTo, userBeanFrom);
            System.out.println("\n\n\n\n------- Fetch Value from both objects AFTER COPY FROM ONE OBJECT TO ANOTHER --------");
            System.out.println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanFrom)+" --------");
            System.out.println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanTo)+" --------");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String args[]) {
        executeBeanUtilsExample();
    }
}
