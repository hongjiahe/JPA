package com.study.jpa._03_one2many;

import com.study.jpa.util.JPAUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class One2manyTest {

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
    public  void testAdd(){
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2();

        e1.setName("hohe1");
        e2.setName("hohe2");

        Department2 d2 = new Department2();
        d2.setCode("code111");

        List<Employee2> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        d2.setEmployeeList(list);
        em.persist(d2);
        em.persist(e1);
        em.persist(e2);

    }

    @Test
    public void testFind(){

//        Employee2 employee2 = em.find(Employee2.class, 1);
//        System.out.println(employee2.getName());

        Department2 department2 = em.find(Department2.class, 1);
        System.out.println(department2.getEmployeeList().get(0).getName());

    }



}
