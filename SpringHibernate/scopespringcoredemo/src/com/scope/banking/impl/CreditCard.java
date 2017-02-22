package com.scope.banking.impl;

import com.scope.banking.Transaction;

public class CreditCard implements Transaction{

	@Override
	public String payment(int amount) {
		// TODO Auto-generated method stub
		String status=null;
		if(amount >3000){
			status="Amount deposited using CreditCard";
		}else {
			status="Amount below 3000 not accepted using CreditCard";
		}
		return status;
	}

}
