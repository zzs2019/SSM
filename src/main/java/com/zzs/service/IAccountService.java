package com.zzs.service;

import com.zzs.domain.Account;

import java.util.List;

public interface IAccountService {
    /*
  查询所有账户
   */
    List<Account> findAll();

    /*
    按id查询
     */
    Account findById(int id);

    /*
    保存账户
     */
    void saveAccount(Account account);

    /*
    修改用户信息
     */
    void updateAccount(Account account);

    /*
    删除用户信息
     */
    void deleteAccount(int id);

    /*
    测试事物回滚
     */
    void TestTransaction() ;

}
