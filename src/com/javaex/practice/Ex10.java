package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 문제 풀이와 다른 결과값이 보여짐
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요");
			System.out.print("숫자: ");
			int n = sc.nextInt();
		
			if(n >= 1 && n > 67 ) {
				break;
			}else if(n==67) {
				int max = sc.nextInt();
				System.out.println("최대값은 "+ max +" 입니다.");
				break;
			}
		}	
		sc.close();
	}
}
