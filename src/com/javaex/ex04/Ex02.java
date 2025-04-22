package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		
		System.out.println("단수를 입력해주세요");
		System.out.print("단: ");
		int math = sc.nextInt();
		
		while(num < 10) {
			System.out.println(math + " x " + num + " = " + (math*num));
			
			num++;
		}
		
		
		sc.close();
	}

}
