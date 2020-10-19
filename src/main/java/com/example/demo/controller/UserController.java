package com.example.demo.controller;

import com.example.demo.domain.Account;
import com.example.demo.service.AccountService;
import com.example.demo.vo.RespStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 15:35 2020/10/16
 */
@Controller
@RequestMapping("/account")
public class UserController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public String register(Model model, Account account) {

        RespStat stat = accountService.save(account);

        model.addAttribute("stat",stat);
        return "register";
    }

    @GetMapping("/list")
    @ResponseBody
    public Object list() {

        List<Account> list = accountService.findById();

        return list;
    }

    @GetMapping("/register")
    public String reg(Model model) {

        return "register";
    }

}
