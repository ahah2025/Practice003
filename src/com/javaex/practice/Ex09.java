package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 10 ; x++) {
			for(int y = 1; y <x+10; y++) {
				System.out.print(y+"\t"); //탭문자
			}
			System.out.println("");
		}
	}
}
