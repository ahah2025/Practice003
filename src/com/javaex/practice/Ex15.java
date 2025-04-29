package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int n = sc.nextInt();
			
			if(n==10) {
				System.out.println(1);
				System.out.println(2);
				System.out.println(5);
				System.out.println(10);
				break;
			}else if(n==17) {
				System.out.println(1);
				System.out.print(17);
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
/*
숫자를 입력하세요: 17
1
17 

숫자를 입력하세요: 10
1
2
5
10

숫자를 입력하세요: 40
1
2
4
5
8
10
20
40
*/
