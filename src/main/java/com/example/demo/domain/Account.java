package com.example.demo.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 16:06 2020/10/16
 */
@Entity
@Table(name="account")
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String loginName;

    private String passWord;

    private String nickName;

    private Integer age;

    private String location;
}
