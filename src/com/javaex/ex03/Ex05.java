package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("근무시간을 입력해주세요.");
		
		int time = sc.nextInt();
		
		if(time<=8) {
			System.out.println("임금은 " +time*10000+ "원 입니다.");
		} else {
			System.out.println("임금은 " +(int)((time-8)*(10000*1.5)+80000)+ "원 입니다.");
		}
		
		sc.close();
	}

}
