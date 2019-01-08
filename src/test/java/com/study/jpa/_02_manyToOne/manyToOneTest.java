package com.study.jpa._02_manyToOne;

import com.study.jpa.util.JPAUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import java.util.Date;

public class manyToOneTest {

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

        Employee employee = new Employee();
        employee.setName("hohe4");
        employee.setDate(new Date());

        Employee employee2 = new Employee();
        employee2.setName("hohe4");
        employee2.setDate(new Date());

        Department department =   new Department();
        department.setCode("code_012");

        employee.setDepartment(department);
        employee2.setDepartment(department);

        em.persist(department);

        em.persist(employee);
        em.persist(employee2);


    }

    @Test
    public void testDelete(){

        Employee employee = em.find(Employee.class, 2);
        System.out.println(employee.getName());
        System.out.println(employee.getDepartment().getCode()+"==code");
    }




}
