package com.zzs.service.impl;

import com.zzs.DAO.IAccountDao;
import com.zzs.domain.Account;
import com.zzs.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service(value="accountService")
public class AccountServiceImp implements IAccountService {
    @Autowired
    private IAccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("服务层执行《查询所有用户》。。。");
        return accountDao.findAll();
    }

    @Override
    public Account findById(int id) {
        System.out.println("服务层执行《按ID查询用户》。。。");
        return accountDao.findById(id);
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("服务层执行《保存用户》。。。");
        accountDao.saveAccount(account);
        throw new RuntimeException();
    }

    @Override
    public void updateAccount(Account account) {
        System.out.println("服务层执行《更新用户》。。。");
        accountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(int id) {
        System.out.println("服务层执行《按ID删除用户》。。。");
        accountDao.deleteAccount(id);
    }

    public void TestTransaction(){

        Account a = new Account();
        a.setName("aa");
        a.setMoney(111);

        Account b = new Account();
        b.setName("bb");
        b.setMoney(22);


        accountDao.saveAccount(a);

        int i = 1/0;

        accountDao.saveAccount(b);

    }


}
