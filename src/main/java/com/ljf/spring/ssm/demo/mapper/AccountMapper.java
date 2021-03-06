package com.ljf.spring.ssm.demo.mapper;

import com.ljf.spring.ssm.demo.bean.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountMapper {
    // 查询所有账户
    public List<Account> findAll();

    // 保存帐户信息
    public void saveAccount(Account account);
}
