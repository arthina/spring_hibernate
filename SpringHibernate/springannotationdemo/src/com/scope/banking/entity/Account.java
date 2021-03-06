package com.scope.banking.entity;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("scbAccount")
@Lazy
public class Account {

	private String accountNo;
	private String accountType;
	private long balance;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountType="
				+ accountType + ", balance=" + balance + "]";
	}
	
}
