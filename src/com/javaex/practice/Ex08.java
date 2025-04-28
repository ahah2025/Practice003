package com.javaex.practice;

public class Ex08 {

	//구구단 출력
		public static void main (String[]args) {
			
			int dan = 9;
			
			for (int n1 = 1; n1 <= dan ; n1++) {
				for(int n2 = 2; n2 <= dan; n2++) {
					System.out.print(n2 + "*" + n1 + "=" +(n1 * n2) );
					System.out.print("\t"); //탭문자
				}
				System.out.println();
			}
	 	}	
}
