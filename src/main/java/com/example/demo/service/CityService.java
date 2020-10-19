package com.example.demo.service;

import com.example.demo.domain.City;
import com.example.demo.domain.CityJpa;

import java.util.List;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 11:04 2020/10/16
 */
public interface CityService {

    List<City> findAll();

    String add(Integer id,String name);

    List<CityJpa> findJapAll();
}
