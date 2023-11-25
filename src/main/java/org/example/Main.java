package org.example;

import org.example.dao.csv.CsvAccountDao;
import org.example.model.Account;
import org.example.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("appContext.xml");

        AccountService accountService =
                (AccountService) applicationContext.getBean("accountService");

        var result = accountService.findByBalance(new BigDecimal(100));
        for (var a: result) {
            System.out.println(a.getAccountNumber() + " " + a.getBalance());
        }
    }
}