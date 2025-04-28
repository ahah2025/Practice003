package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int f = 0;
		int n = 0; // 마이너스 (-)
		int sum;
		
		while(true) {
			
			sum= f+(-n);
			
			System.out.println("---------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------------");
			
			System.out.print("선택> ");
			int a = sc.nextInt(); //입력 받음
			
			if(a == 4) {
				break;
			}else if(a == 1) {
				System.out.print("예금액> ");  //출력
				f = sc.nextInt(); //입력 받음
			}else if( a == 2 ) {
				System.out.print("출금액> ");  //출력
				n = sc.nextInt(); //입력 받음
			}else if(a == 3) {
				System.out.print("잔고액> "); //출력
				System.out.println(sum);
			}else {
				System.out.println("다시 입력해주세요");
			}
			a++;
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
