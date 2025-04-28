package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		//정답 70 나옴
		
		int no = 100;
		//1에서 100까지의 수에서 5의 배수 이면서 7의 배수인 수 출력
		
		while( true ) {			
			if( no%5 == 0 && no%7 ==0) {
				break;
			}
			System.out.println("현재"+no); 
			no--;
		}
		System.out.println("정답"+no);
	}
}
