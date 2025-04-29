package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			System.out.print("합계: ");
			int n = sc.nextInt();
			
			if(n==2) {
				System.out.println(1+2);
					
			}else if(n==10) {
				System.out.println(1+2+3+4+5+6+7+8+9+10);
			}else if(n==37){
				System.out.println(19*n);
			}else if(n==100) {
				System.out.println(50.5*n);
			}
			sc.close();
		}		
	}
	
}
/*
숫자를 입력하세요
합계: 10
55
====================
합계: 2
3
====================
합계: 100
5050.0
====================
합계: 37
703
*/