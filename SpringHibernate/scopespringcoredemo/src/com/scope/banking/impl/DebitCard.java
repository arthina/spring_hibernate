package com.scope.banking.impl;

import com.scope.banking.Transaction;

public class DebitCard implements Transaction{

	@Override
	public String payment(int amount) {
		// TODO Auto-generated method stub
		String status=null;
		if(amount >1000){
			status="Amount deposited using DebitCard";
		}else {
			status="Amount below 1000 not accepted using DebitCard";
		}
		return status;
	}

}
