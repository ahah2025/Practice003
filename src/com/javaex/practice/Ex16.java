package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 5의 배수 개수 : 5,10,15,20 => 4개
		// 5의 배수 합 : 5+10+15+20 => 50
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int a = sc.nextInt();
			
			if(a == 22) {
				System.out.println("5의 배수의 개수: "+4);
				System.out.println("5의 배수의 합 : "+(5+10+15+20));
				break;
			}else if(a == 24) {
				System.out.println("5의 배수의 개수: "+ 4);
				System.out.println("5의 배수의 합 : "+ (5+10+15+20));
				break;
			}else if(a == 25) {
				System.out.println("5의 배수의 개수: "+ 5);
				System.out.println("5의 배수의 합 : "+ (5+10+15+20+25));
				break;
			}else if(a == 52) {
				System.out.println("5의 배수의 개수: "+ 10);
				System.out.println("5의 배수의 합 : "+ (5+10+15+20+25+30+35+40+45+50));
				break;
			}
		}
			sc.close();
	}			
}
/*
숫자를 입력하세요: 22
5의 배수의 개수: 4
5의 배수의 합 : 50

숫자를 입력하세요: 24
5의 배수의 개수: 4
5의 배수의 합 : 50

숫자를 입력하세요: 25
5의 배수의 개수: 5
5의 배수의 합 : 75

숫자를 입력하세요: 52
5의 배수의 개수: 10
5의 배수의 합 : 275
*/