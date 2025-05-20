package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		/*int no = 5;
		int var = no;*/
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 7;
		
		int[] arrB = arrA;
		for(int i=0 ; i<3 ; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("------------------------");
		
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("---------------------------");
		
		arrA[1] = 100;
		//arrA[1]의 값을 100으로 변경
		
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(arrA[i]);
		}
		//arrA의 값 확인
		
		System.out.println("---------------------------");
		
		for(int i = 0 ; i<3 ; i++)	{
			System.out.println(arrB[i]);
		}
		//arrA의 복제인 arrB의 값 확인
		
		System.out.println("----------------------");
		
		arrB[2] = 999;
		//arrB[2]의 값을 999로 변경
		
		for(int i = 0 ; i<3 ; i++) {
			System.out.println(arrB[i]);
		}
		//arrB의 값 확인
		
		System.out.println("-------------------------");
		
		for(int i = 0 ; i<3 ; i++)	{
			System.out.println(arrA[i]);
		}
		//arrA의 값 확인

	}

}
