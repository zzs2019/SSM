package com.zzs.DAO;

import com.zzs.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface IAccountDao {

    /*
    查询所有账户
     */
    @Select("select * from account")
    List<Account> findAll();

    /*
    按id查询
     */
    @Select("select * from account where id = #{id}")
    Account findById(int id);

    /*
    保存账户
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void saveAccount(Account account);

    /*
    修改用户信息
     */
    @Update("update account set name = #{name},money=#{money} where id = #{id}")
    void updateAccount(Account account);

    /*
    删除用户信息
     */
    @Delete("delete from account where id = #{id}")
    void deleteAccount(int id);
}
