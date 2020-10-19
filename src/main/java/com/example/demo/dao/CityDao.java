package com.example.demo.dao;

import com.example.demo.domain.City;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 11:07 2020/10/16
 */
@Component
public class CityDao {

    static Map<Integer,City> map = Collections.synchronizedMap(new HashMap<Integer,City>());


    public List<City>  findAll(){

        return new ArrayList<>(map.values());
    }

    public void save(City city) throws Exception{
        if(map.get(city.getId()) != null){
           throw new Exception("保存失败");
        }else {
            map.put(city.getId(), city);
        }
    }
}
