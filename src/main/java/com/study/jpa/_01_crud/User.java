package com.study.jpa._01_crud;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@ToString

@Entity(name = "User")
@Table(name = "t_user")
public class User  {

    @Id
    @GeneratedValue //默认是自动生成

    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    //@Transient  不进行映射
    private String name;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;



}
