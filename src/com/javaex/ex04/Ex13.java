package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int sum = 0;
		int num;
		
		do {
			num = sc.nextInt();
			
			sum = sum + num;
			System.out.println("합계: " + sum);
			if(num == 0) {
				break;
			}
		}
		while( num != 0 );
		
		
		sc.close();
		}
	}


