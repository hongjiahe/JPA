package com.study.jpa._01_crud;

import com.study.jpa.util.JPAUtils;

import javax.persistence.EntityManager;
import java.util.Date;

public class Test2 {

    @org.junit.Test
    public void test() {
        User user = new User();
        user.setName("hohe2");
        user.setDate(new Date());

        EntityManager entityManager = JPAUtils.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(user);
        /*User user = entityManager.getReference(User.class, 2);
        //entityManager.remove(user);
        user.setName("update_h123");
        user.setDate(new Date());
        entityManager.merge(user);*/
        //User user = entityManager.find(User.class, 2);

        entityManager.getTransaction().commit();
        entityManager.close();

    }







}
