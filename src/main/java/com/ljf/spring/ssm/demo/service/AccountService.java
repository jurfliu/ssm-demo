package com.ljf.spring.ssm.demo.service;

import com.ljf.spring.ssm.demo.bean.Account;

import java.io.IOException;
import java.util.List;

public interface AccountService {
    // 查询所有账户
    public List<Account> findAll() ;

    // 保存帐户信息
    public void saveAccount(Account account);
}
