package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		double[] doubleArr = new double[3];
		
		doubleArr[0] = 3.4;
		doubleArr[1] = 6.2;
		doubleArr[2] = 9;
		
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(doubleArr[i]);
			
		}
		
		System.out.println("-----------------------------");
		
		char[] charArr = new char[3];
		
		charArr[0] = 'a';
		charArr[1] = 'b';
		charArr[2] = 'c';
		
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(charArr[i]);
		}
		
		System.out.println("------------------------------");
		
		String[] StringArr = new String[3];
		
		StringArr[0] = "안녕하세요";
		StringArr[1] = "반갑습니다";
		StringArr[2] = "환영합니다";
		
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(StringArr[i]);
		}

	}

}
