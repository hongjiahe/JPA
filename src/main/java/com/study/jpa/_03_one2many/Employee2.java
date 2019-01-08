package com.study.jpa._03_one2many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter

@Entity
@Table(name = "t_employee2")
public class Employee2 {

    @GeneratedValue
    @Id
    private Integer id;
    private String name;


}
