package com.study.jpa._05_many2many;

import com.study.jpa.util.JPAUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class _05_many2manyTest {

    public static EntityManager em = JPAUtils.getEntityManager();

    @Before
    public void before(){
        em.getTransaction().begin();
    }

    @After
    public  void after(){
        em.getTransaction().commit();
        em.close();
    }

    @Test
    public void test(){

        Role r1 = new Role();
        Role r2 = new Role();

        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        r1.setName("奥术大师1");
        r2.setName("奥术大师2");

        resource1.setUrl("3333333333333");
        resource2.setUrl("4444444444");

        List<Resource> list =  new ArrayList<>();
        list.add(resource1);
        list.add(resource2);

        r1.setResourceList(list);
        r2.setResourceList(list);

        /*em.persist(resource1);
        em.persist(resource2);*/
        em.persist(r1);
        em.persist(r2);

    }

    @Test
    public void testFind(){
        Role role = em.find(Role.class, 1);
        System.out.println(role.getResourceList().get(0).getUrl());
    }

    @Test
    public void testFind2(){
        Resource resource = em.find(Resource.class, 5);
        System.out.println(resource.getRoleList().get(0).getName());
        System.out.println(resource.getRoleList().size());
    }

    @Test
    public void testDelete(){
        Role role = em.find(Role.class, 10);
        em.remove(role);
    }

}
