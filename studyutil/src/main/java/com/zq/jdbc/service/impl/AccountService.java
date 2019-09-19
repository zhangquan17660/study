package com.zq.jdbc.service.impl;

import com.zq.jdbc.dao.Idao;
import com.zq.jdbc.pojo.Account;
import com.zq.jdbc.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(propagation = Propagation.SUPPORTS ,readOnly = true)
public class AccountService implements IAccountService {
    @Autowired
    private Idao idao;
    @Override
    public Account selectAccount(int id) {
        return idao.selectAccount(id);
    }

    @Override
    public void updateAccount(Account account) {
        idao.updateAccount(account);
    }

    @Override
    public void saveAccount(Account account) {
        idao.saveAccount(account);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED ,readOnly = false)
    public void transfer(int sourceName, int targetName, float money) {
        System.out.println("start transfer.....");
        //根据id找出转账户出
        Account accountSource = idao.selectAccount(sourceName);
        //根据id找出转入账户
        Account accountTarget = idao.selectAccount(targetName);
        //转出账户-100
        accountSource.setMoney(accountSource.getMoney() - 100f);
        //转入账户+100
        int i  = 1/0;
        accountTarget.setMoney(accountTarget.getMoney()+100f);
        //更新账户
        idao.updateAccount(accountSource);
        idao.updateAccount(accountTarget);

    }
}