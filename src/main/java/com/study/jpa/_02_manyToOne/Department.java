package com.study.jpa._02_manyToOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter

@Entity(name = "Department")
@Table(name = "t_department")
public class Department {

    @GeneratedValue
    @Id
    private Integer id;
    private String code;

}
