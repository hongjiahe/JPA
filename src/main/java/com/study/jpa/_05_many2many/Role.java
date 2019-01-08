package com.study.jpa._05_many2many;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "t_sys_role")
public class Role {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}) //级联操作
    private List<Resource> resourceList;

    /*casecade = CasecadeType.PERSIST
            保存主对象的时候,同时将关联的对象持久化到数据库中
    casecade = CasecadeType.REFRESH
            查询主对象的同时,重新查询关联的对象
    casecade = CasecadeType.REMOVE
            删除主对象的同时,删除关联的对象
    casecade = CasecadeType.DETACH
            在主对象变为游离对象的同时,将关联的对象也转换成游离对象
    casecade = CasecadeType.MERGE
            在更新主对象的同时,更新关联的对象
    casecade = CasecadeType.ALL
            包含以上所有的级联关系
    在开发中,我们应该根据需求选择合适的级联方式来管理主对象和关联对象*/


}

