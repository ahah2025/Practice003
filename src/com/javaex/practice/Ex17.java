package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		String num = sc.nextLine();
		for(int y = 1; y<=9; y++ ) {  //y 세로
			for(int x=9; y<=x; x-- ) {  //x 가로
				System.out.print("*"); 
			}
			System.out.println("");
			sc.close();
		}
	}
}
