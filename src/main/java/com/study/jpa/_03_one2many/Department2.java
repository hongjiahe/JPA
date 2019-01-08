package com.study.jpa._03_one2many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter

@Entity
@Table(name = "t_department2")
public class Department2 {

    @GeneratedValue
    @Id
    private Integer id;
    private String code;

    /*one2many  使用集合存储employee信息*/
    @OneToMany
    List<Employee2> employeeList = new ArrayList<>();

}
