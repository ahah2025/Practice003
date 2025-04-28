package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			int n = sc.nextInt();
		
			if(n == 10) {
				System.out.println(n*2+n);
					
			}
			if(n <= 3) {
				System.out.println(n*2-n);
			}
		}
		
		
	}
}
/*
10    숫자 10을 입력하면 30 이라는 결 과 값이 보여짐
30
*/
