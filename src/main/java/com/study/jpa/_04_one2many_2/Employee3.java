package com.study.jpa._04_one2many_2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Setter
@Getter
@Entity
@Table(name = "t_employee3")
public class Employee3 {

    @GeneratedValue
    @Id
    private Integer id;
    private String name;

    @ManyToOne
    private Department3 department;


}