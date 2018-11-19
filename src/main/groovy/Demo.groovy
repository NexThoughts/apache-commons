package com.fintech.commons

import com.fintech.commons.proper.beanUtils.UserBean
import com.fintech.commons.proper.codec.EncodeDecode
import com.fintech.commons.proper.collections.BagDemo
import com.fintech.commons.proper.collections.BidiMapDemo
import org.apache.commons.beanutils.BeanUtils
import org.apache.commons.beanutils.PropertyUtils
import org.apache.commons.lang3.builder.ToStringBuilder

class Demo {

    private static void executeBeanUtilsExample() {
        try {
            UserBean userBeanFrom = new UserBean()

            //Set Value using PropertyUtils
            PropertyUtils.setSimpleProperty(userBeanFrom, "name", "FromValue")
            PropertyUtils.setSimpleProperty(userBeanFrom, "address", "Noida")
            PropertyUtils.setSimpleProperty(userBeanFrom, "aadhaar", "867687875757")

            UserBean userBeanTo = new UserBean()

            //Set Value using PropertyUtils
            PropertyUtils.setSimpleProperty(userBeanTo, "name", "ToValue")
            PropertyUtils.setSimpleProperty(userBeanTo, "address", "Delhi")
            PropertyUtils.setSimpleProperty(userBeanTo, "aadhaar", "1111111111")

            println("\n\n------- Fetch Value from both objects with help of PropertyUtils --------")
            println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanFrom) + " --------")
            println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanTo) + " --------")

            println("\n\n\n\n*********** Copy One Instance Values To Another Instance **********")
            BeanUtils.copyProperties(userBeanTo, userBeanFrom)
            println("\n\n\n\n------- Fetch Value from both objects AFTER COPY FROM ONE OBJECT TO ANOTHER --------")
            println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanFrom) + " --------")
            println("------- UserBeanFrom Object values : ==" + ToStringBuilder.reflectionToString(userBeanTo) + " --------")

        } catch (Exception ex) {
            ex.printStackTrace()
        }

    }

    private static void executeCollections() {
        println("\n\n\n\n&&&&&&&&&&&&&&&& BAG INTERFACE EXAMPLES &&&&&&&&&&&&")
        BagDemo.hashBagDemo()
        BagDemo.treeSetBagDemo()

        println("\n\n\n&&&&&&&&&&&&&&&& Bi-Directional Map EXAMPLES &&&&&&&&&&&&")
        BidiMapDemo.execute()
    }

    public static void main(String[] args) {

        executeBeanUtilsExample()

        executeCollections()

        println("\n\n\n&&&&&&&&&&&&&&&& Encode And Decodeby Codec EAMPLE &&&&&&&&&&&&")
        EncodeDecode.execute()
    }
}
