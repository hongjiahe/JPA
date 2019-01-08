package com.study.jpa._04_one2many;

import com.study.jpa._04_one2many_2.Department3;
import com.study.jpa._04_one2many_2.Employee3;
import com.study.jpa.util.JPAUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;

public class One2many2Test {

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
    public void testAdd(){

        Employee3 e1 = new Employee3();
        Employee3 e2 = new Employee3();

        Department3 d1 = new Department3();

        e1.setName("猴耳环");
        e1.setDepartment(d1);

        e2.setName("猴耳环2");
        e2.setDepartment(d1);

        d1.setCode("123123123");

        em.persist(d1);
        em.persist(e1);
        em.persist(e2);

    }


    @Test
    public void find(){

        Employee3 employee3 = em.find(Employee3.class, 1);
        System.out.println(employee3.getDepartment().getCode());

        Department3 department3 = em.find(Department3.class, 1);
        System.out.println(department3.getEmployee3List().get(1).getName());

        System.out.println(department3.getCode());

    }


}
