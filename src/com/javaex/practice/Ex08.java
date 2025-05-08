package com.javaex.practice;

public class Ex08 {

	//구구단 출력
	public static void main (String[]args) {
			
		for (int n1 = 1; n1 <= 9; n1++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + n1 + "=" + dan * n1 );
				System.out.print("\t"); //탭문자
			}
			System.out.println("");
		}
	}	
}
