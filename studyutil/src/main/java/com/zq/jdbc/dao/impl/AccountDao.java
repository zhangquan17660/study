package com.zq.jdbc.dao.impl;

import com.zq.jdbc.dao.Idao;
import com.zq.jdbc.pojo.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository("accountDao1")
public class AccountDao implements Idao {
    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectAccount(int id) {
        List<Account> accountList = jdbcTemplate.query("select * from account where id =?",new BeanPropertyRowMapper<Account>(Account.class),id);

        return accountList.isEmpty()?null:accountList.get(0);
    }

    @Override
    public void saveAccount(Account account) {
        jdbcTemplate.update("insert into account (id,name,money)values (?,?,?)",account.getId(),account.getName(),account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update account set money = ? where id=?",account.getMoney(),account.getId());
    }


}
