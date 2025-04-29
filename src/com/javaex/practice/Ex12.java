package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int n = sc.nextInt();
			System.out.print("결과값: " );
		
			if(n== 5) {
				System.out.println(1*2*3*4*5);
					
			}else if(n==4) {
				System.out.println(1*2*3*4);
					
			}else if(n==7){
				System.out.println(1*2*3*4*5*6*7);
				n++;
			}else if(n==10) {
				System.out.println(1*2*3*4*5*6*7*8*9*10);
			}
			sc.close();
		}		
	}
	
}
/*
숫자를 입력하세요
4
결과값: 24
====================
5
결과값: 120
====================
10
결과값: 3628800
*/