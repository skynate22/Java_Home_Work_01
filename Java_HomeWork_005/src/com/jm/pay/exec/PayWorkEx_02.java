package com.jm.pay.exec;

import java.util.Scanner;

public class PayWorkEx_02{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("금액을 입력해주세요 >>>>>: ");
		String pay = scan.nextLine();
		
		Integer intpay = Integer.valueOf(pay);
		int paper = 50000; // 대한민국 화폐단위 최고액면가
		
		
		int sw = 1;
		while(intpay > 0){
			int mCount = intpay /paper;
			System.out.printf("%d 원권 \t%d 매\n", paper,mCount);
			intpay -= mCount * paper;
			if(sw > 0) {
				paper /= 5;
			}else {
				paper /= 2;
			}
			sw *= -1;
		}
	}

}
