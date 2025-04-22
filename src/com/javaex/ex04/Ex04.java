package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		
		for(int num = 1 ; num<=9 ; num++) {
			System.out.println(dan + " x " + num + " = " + (dan*num));
		}
		
		sc.close();
	}

}
