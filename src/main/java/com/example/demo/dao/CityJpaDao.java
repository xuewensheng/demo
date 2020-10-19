package com.example.demo.dao;


import com.example.demo.domain.CityJpa;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 14:34 2020/10/16
 */
public interface CityJpaDao extends JpaRepository<CityJpa,Integer> {
}
