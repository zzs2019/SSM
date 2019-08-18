package com.zzs.controller;

import com.zzs.domain.Account;
import com.zzs.service.IAccountService;
import com.zzs.service.impl.AccountServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private IAccountService accountService;

    @RequestMapping("findAll")
    public ModelAndView testFindAll(){
        System.out.println("控制层执行了");
        List<Account> accounts = accountService.findAll();
        for (Account account:accounts){
            System.out.println(account);
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("findAll");
        mv.addObject("list",accounts);
        return mv;
    }
    @RequestMapping("findById")
    public String testFindById(Model model,int id){
        System.out.println("控制层执行了按ID查询");
        Account ac = null;
        ac = accountService.findById(id);
        model.addAttribute("Account",ac);
        return "findById";
    }
    @RequestMapping("saveAccount")
    public String saveAccountTest(Account account){
        accountService.saveAccount(account);
        return "success";
    }
    @RequestMapping("updateAccount")
    public String updateAccount(Account account){
        accountService.updateAccount(account);
        return  "success";
    }
    @RequestMapping("deleteAccount")
    public String deleteAccount(int id){
        accountService.deleteAccount(id);
        return "success";
    }

    @RequestMapping("/test")
    public String Test(){
        accountService.TestTransaction();
        return "success";
    }

}
