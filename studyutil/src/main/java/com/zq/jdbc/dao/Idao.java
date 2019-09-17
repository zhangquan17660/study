package com.zq.jdbc.dao;

import com.zq.jdbc.pojo.Account;

public interface Idao {
    Account selectAccount(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);


}
