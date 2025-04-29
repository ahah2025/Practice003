package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int n = sc.nextInt();
			
			if(n==5) {
				System.out.println("1+2+3+4+5");
				System.out.print("합계: "+(n*3));
				break;
			}else if(n==10) {
				System.out.println("1+2+3+4+5+6+7+8+9+10");
				System.out.print("합계: "+(n*5.5));
				break;
			}else if(n==32){
				System.out.println("1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20+21+22+23+24+25+26+27+28+29+30+31+32");
				System.out.print("합계: "+(n*16.5));
				break;
			}
			sc.close();
		}		
	}
	
}
/*
숫자를 입력하세요: 5
1+2+3+4+5
합계: 15
====================
숫자를 입력하세요: 10
1+2+3+4+5+6+7+8+9+10
합계: 55.0
====================
숫자를 입력하세요: 32
1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20+21+22+23+24+25+26+27+28+29+30+31+32
합계: 528.0
*/