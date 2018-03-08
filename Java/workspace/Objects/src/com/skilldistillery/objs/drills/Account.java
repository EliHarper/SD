package com.skilldistillery.objs.drills;

public class Account {
  private double balance;
  private String accountId;

  public Account(String aId) {
    accountId = aId;
  }

  public Account(String aId, double initialBalance) {
    balance = initialBalance;
    accountId = aId;
  }

  public void deposit(double amount) {
    balance = balance + amount;
  }

  public void withdraw(double amount) {
    balance = balance - amount;
  }
  
  public String getAccountId() {
	  return accountId;
  }
  
  public void setAccountId(String accountId) {
	  this.accountId = accountId;
  }
  
  public double getBalance() {
	  return balance;
  }
  
  public void setBalance(double balance) {
	  this.balance = balance;
  }
}