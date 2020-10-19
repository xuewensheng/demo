package com.example.demo.service;

import com.example.demo.domain.Account;
import com.example.demo.vo.RespStat;

import java.util.List;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 16:14 2020/10/16
 */
public interface AccountService {

    RespStat save(Account account);

    List<Account> findAll();

    List<Account> findById();
}
