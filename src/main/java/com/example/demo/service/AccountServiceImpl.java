package com.example.demo.service;

import com.example.demo.dao.AccountRepository;
import com.example.demo.domain.Account;
import com.example.demo.vo.RespStat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 16:15 2020/10/16
 */

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    AccountRepository accountRepository;

    @Override
    public RespStat save(Account account){
        /**
         * 返回实体类的id
         */
        Account a =  accountRepository.save(account);

        return RespStat.build(200);
    }

    @Override
    public List<Account> findAll() {

        return accountRepository.findAll();
    }

    @Override
    public List<Account> findById(){
        return accountRepository.findAccountByIdBetween(0,0);
    }

}
