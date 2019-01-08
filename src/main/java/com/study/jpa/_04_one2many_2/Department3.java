package com.study.jpa._04_one2many_2;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 双向多对一
 */


@Setter
@Getter
@Entity
@Table(name = "t_department3")
public class Department3 {

    @Id
    @GeneratedValue
    private Integer id;
    private String code;

    @OneToMany(mappedBy = "department")
    List<Employee3> employee3List = new ArrayList<>();

}
