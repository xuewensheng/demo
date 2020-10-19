package com.example.demo.service;

import com.example.demo.dao.CityDao;
import com.example.demo.dao.CityJpaDao;
import com.example.demo.domain.City;
import com.example.demo.domain.CityJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 11:05 2020/10/16
 */
@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityDao cityDao;

    @Autowired
    private CityJpaDao cityJpa;


    @Override
    public List<City> findAll() {
        return cityDao.findAll();
    }

    @Override
    public List<CityJpa> findJapAll() {
        return cityJpa.findAll();
    }

    @Override
    public String add(Integer id , String name) {
        City city = new City();
        city.setId(id);
        city.setName(name);
        try {
            cityDao.save(city);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "保存成功";
    }

}
