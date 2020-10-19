package com.example.demo.domain;



import lombok.Data;

import javax.persistence.*;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 14:37 2020/10/16
 */
@Entity
@Table(name = "city")
@Data
public class CityJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

}
