package org.example;

import org.example.dao.csv.CsvAccountDao;
import org.example.service.AccountService;

public class Main {
    public static void main(String[] args) {

        AccountService accountService = new AccountService(new CsvAccountDao());

    }
}