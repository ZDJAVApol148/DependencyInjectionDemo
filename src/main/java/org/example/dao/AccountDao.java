package org.example.dao;

import org.example.model.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAll() throws Exception;
}
