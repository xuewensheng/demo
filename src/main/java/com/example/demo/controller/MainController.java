package com.example.demo.controller;

import com.example.demo.domain.City;
import com.example.demo.domain.CityJpa;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 9:47 2020/10/16
 */
@Controller
@RequestMapping("/user")
public class MainController {

    @Autowired
    private CityService cityService;

    @RequestMapping("/list")
    public String list(Model model) {

        List<City> list = cityService.findAll();
        model.addAttribute("list",list);
        /**
         * return的模板文件的名称，对应src/main/resources/templates/list.html
         */
        return "list";
    }

    @RequestMapping("/listJpa")
    public String listJpa(Model model) {

        List<CityJpa> list = cityService.findJapAll();
        model.addAttribute("list",list);
        /**
         * return的模板文件的名称，对应src/main/resources/templates/list.html
         */
        return "list";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("id") Integer id,@RequestParam("name") String name) {

       String sucess = cityService.add(id,name);
        return "add";
    }

    @RequestMapping("/addPage")
    public String addPage() {

        return "add";
    }

}
