package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		int num = 1;
		while(true) {
			if(num%6 == 0 && num%14 == 0) {
				break;
			}
			System.out.println("현재: "+num);
			num++;
		}
		System.out.println("정답: "+num);
		
				
		

	}

}
