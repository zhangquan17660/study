package com.zq.anno.dao;

import com.zq.anno.pojo.Account;

public interface Idao {
    Account selectAccount(int id);
    void saveAccount(Account account);
    void updateAccount(Account account);


}
