package com.ljf.spring.ssm.demo.service.impl;

import com.ljf.spring.ssm.demo.bean.Account;
import com.ljf.spring.ssm.demo.mapper.AccountMapper;
import com.ljf.spring.ssm.demo.service.AccountService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: AccountServiceImpl
 * @Description: TODO
 * @Author: liujianfu
 * @Date: 2021/02/19 23:25:38 
 * @Version: V1.0
 **/
@Service  //相当于    <!--注册accountserviceImpl这个bean<bean id="accountService" class="com.ljf.spring.ssm.demo.service.impl.AccountServiceImpl"></bean>
public class AccountServiceImpl implements AccountService {
@Autowired
private AccountMapper accountMapper;
    @Override
    public List<Account> findAll()  {
        List<Account> accountList=new ArrayList<>();
        /**

        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
           AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            accountList = mapper.findAll();
            sqlSession.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return accountList;
         **/
        accountList =accountMapper.findAll();
        return accountList;
    }

    @Override
    public void saveAccount(Account account) {
        List<Account> accountList=new ArrayList<>();
        /**
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("mybaitsConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
            mapper.saveAccount(account);
            sqlSession.commit();
            sqlSession.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
         **/
        accountMapper.saveAccount(account);
    }
}
