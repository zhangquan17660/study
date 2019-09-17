package com.zq.jdbc.service;

import com.zq.jdbc.pojo.Account;

public interface IAccountService {
    Account selectAccount(int id);
    void updateAccount(Account account);
    void saveAccount(Account account);
    void transfer(int sourceName,int targetName, float money);
}
