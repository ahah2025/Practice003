package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 5의 배수 개수 : 5,10,15,20 => 4개
		// 5의 배수 합 : 5+10+15+20 => 50
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int n = sc.nextInt();
			
			if(n>=5) {
				System.out.println("5의 배수의 개수: ");
				System.out.println("5의 배수의 합 : ");
				break;
			}else if(n==17) {
				System.out.println(1);
				break;
			}else if(n==40){
				System.out.println(1);
				System.out.println(2);
				System.out.println(4);
				System.out.println(5);
				System.out.println(8);
				System.out.println(10);
				System.out.println(20);
				System.out.println(40);
				break;
			}
			sc.close();
		}		
		
		
	}

}
