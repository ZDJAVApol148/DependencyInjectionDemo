package org.example.model;

import java.math.BigDecimal;
import java.util.Date;

public class Account {
    private String accountNumber;
    private BigDecimal balance;
    private Date lastPaidOn;

    public Account(String accountNumber, BigDecimal balance, Date lastPaidOn) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.lastPaidOn = lastPaidOn;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Date getLastPaidOn() {
        return lastPaidOn;
    }
}
