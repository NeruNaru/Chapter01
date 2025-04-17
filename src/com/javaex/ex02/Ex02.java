package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드 연결
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt(); //입력대기
		System.out.println("[입력값:" +num+ "]");
		
		sc.close(); //키보드 해제
	}

}
