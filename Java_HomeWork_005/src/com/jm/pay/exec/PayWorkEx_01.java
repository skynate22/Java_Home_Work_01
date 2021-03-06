package com.jm.pay.exec;

import java.util.Scanner;

public class PayWorkEx_01 {
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String pay = new String();
		int paper = 0;
		int checkup = 0;
		 
		System.out.println("금액을 입력해주세요(QUIT:종료) 한번에 500만원까지만 가능 >>");
		pay = scan.nextLine();
		int intpay = 0;
		try {
			intpay = Integer.valueOf(pay);
			
			if(intpay < 0 || intpay > 50000000) {
				System.out.println("값이 너무적거나 많습니다 정확히 입력해주세요");
				
				return;
			}
		
		} catch ( NumberFormatException e) {
			// TODO: handle exception
			System.out.println("숫자만 입력가능");
		}
		
		// 제시된 금액을 5만원으로 나누고 정수부분만 취하면
		// 필요한 5만원권의 매수가 계산된다.
		paper = (intpay / 50000);
		
		// 원금(pay)에서 5만원권 금액을 빼주면
		// 5만원권 매수만큼 제외한 금액을 계산할 수 있다.
		intpay -= (paper * 50000);
		System.out.printf("5만원권 >>> %d 매\n",paper);
		checkup += paper * 50000;
		
		
		paper = (int)(intpay / 10000);
		intpay -= (paper * 10000);
		System.out.printf("1만원권 %d 매 \n", paper);
		checkup += paper * 10000;
		
		paper = (int)(intpay / 5000);
		intpay -= (paper * 5000);
		System.out.printf("5천원권 %d 매 \n", paper);
		checkup += paper * 5000;
		
		paper = (int)(intpay / 1000);
		intpay -= (paper * 1000);
		System.out.printf("1천원권 %d 매 \n", paper);
		checkup += paper * 1000;
		
		paper = (int)(intpay / 500);
		intpay -= (paper * 500);
		System.out.printf("500원권 %d 매 \n", paper);
		checkup += paper * 500;
		
		paper = (int)(intpay / 100);
		intpay -= (paper * 100);
		System.out.printf("100원권 %d 매 \n", paper);
		checkup += paper * 100;
		
		paper = (int)(intpay / 50);
		intpay -= (paper * 50);
		System.out.printf("50원권 %d 매 \n", paper);
		checkup += paper * 50;
		
		paper = (int)(intpay / 10);
		intpay -= (paper * 10);
		System.out.printf("10원권 %d 매 \n", paper);
		checkup += paper * 10;
		
		System.out.println("=================================");
		System.out.printf("검산 결과 : %d\n", checkup);
		System.out.println("=================================");
	}
}
