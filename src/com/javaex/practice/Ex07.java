package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		//모르겠음 정답 입력이 다르게 나옴
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=1; j<=i; j++){
				System.out.print(i);
			}
			System.out.println("");
		}
		
		
		sc.close();
		
	}
}
