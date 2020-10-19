package com.example.demo.dao;

import com.example.demo.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author : xuewensheng
 * @version :
 * @date : Created in 16:10 2020/10/16
 */
public interface AccountRepository extends JpaRepository<Account,Integer> {

    List<Account> findAccountByIdBetween(Integer id,Integer id2);
}
