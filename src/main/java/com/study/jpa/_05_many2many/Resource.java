package com.study.jpa._05_many2many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Setter
@Getter

@Entity
@Table(name = "t_sys_resource")
public class Resource {

    @Id
    @GeneratedValue
    private Integer id;
    private String url;

    @ManyToMany(mappedBy = "resourceList")
    private List<Role> roleList = new ArrayList<>();

}