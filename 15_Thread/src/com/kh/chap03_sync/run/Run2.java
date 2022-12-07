package com.kh.chap03_sync.run;

import com.kh.chap03_sync.sync.Account;
import com.kh.chap03_sync.sync.Atm1;

public class Run2 {

	public static void main(String[] args) {
		//계좌, ATM
		Account acc = new Account();
		Thread atm1 = new Thread(new Atm1(acc));
		Thread atm2 = new Thread(new Atm1(acc));
		
		atm1.start();
		atm2.start();
		
		System.out.println("메인스레드 종료");
	}

}
