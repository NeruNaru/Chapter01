package com.javaex.ex05;

public class Ex11 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {50,40,30};
		if(leftArray.length == rightArray.length) {
			for(int i = 0 ; i<leftArray.length ; i++) {
				if(leftArray[i] != rightArray[i]) {
					System.out.println((i+1) + " 번쨰 값이 다릅니다");
				} else {
					
				}
			}
		} else {
			System.out.println("배열의 크기가 다릅니다");
		}
	}

}
