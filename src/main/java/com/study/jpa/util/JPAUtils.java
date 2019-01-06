package com.study.jpa.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtils {

    private static EntityManagerFactory entityManagerFactory ;

    private JPAUtils(){}

    static{
        //加载persistence.xml文件中的persistence-util中的配置信息创建EntityManagerFactory对象
        entityManagerFactory =
                Persistence.createEntityManagerFactory("myPersistence");
    }

    public static EntityManager getEntityManager(){
        return entityManagerFactory.createEntityManager();
    }



}
