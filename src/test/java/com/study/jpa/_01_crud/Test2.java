package com.study.jpa._01_crud;

import com.study.jpa.util.JPAUtils;

import javax.persistence.EntityManager;
import java.util.Date;

public class Test2 {

    @org.junit.Test
    public void test() {
        System.out.println("123123");

        User user = new User();
        user.setName("123213");
        user.setDate(new Date());

        EntityManager entityManager = JPAUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
