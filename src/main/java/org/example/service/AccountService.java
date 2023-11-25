package org.example.service;

import org.example.Mapper;
import org.example.dao.AccountDao;
import org.example.model.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    private AccountDao accountDao;
    private Mapper mapper;

    public AccountService(AccountDao accountDao, Mapper mapper) {
        this.accountDao = accountDao;
        this.mapper = mapper;
    }

    public AccountService() {
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setMapper(Mapper mapper) {
        this.mapper = mapper;
    }

    public List<Account> findByBalance(BigDecimal value) throws Exception {
        List<Account> data = accountDao.findAll();

        List<Account> result = new ArrayList<>();

        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getBalance().compareTo(value) >= 0) {
                result.add(data.get(i));
            }
        }

        return result;
    }
}
