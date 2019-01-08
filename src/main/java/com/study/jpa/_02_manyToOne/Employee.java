package com.study.jpa._02_manyToOne;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Setter
@Getter

@Entity
@Table(name = "t_employee")
public class Employee {

    @GeneratedValue
    @Id
    private Integer id;
    private String name;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY) /*开启懒加载,当调用department信息的时候才去 查询 t_department表, 注意:并不是join连接查询, 而是发送另外一条sql去查  默认是积极加载FetchType.EAGER */
    @JoinColumn(name = "dep_id") /*指定外键字段命名. 如果不指定,默认是department_id*/
    private Department department;

}
