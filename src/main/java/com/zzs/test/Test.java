package com.zzs.test;

import com.zzs.DAO.IAccountDao;
import com.zzs.domain.Account;
import com.zzs.service.IAccountService;
import com.zzs.service.impl.AccountServiceImp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class Test {

    @org.junit.Test
    public void ServiceTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContex.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.findAll();
    }

    @org.junit.Test
    public void Test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContex.xml");
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        as.TestTransaction();

    }
}
