package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		
		int[] lottos = new int[6];
		
		lottos[0]=(int)(Math.random()*45)+1;
		lottos[1]=(int)(Math.random()*45)+1;
		lottos[2]=(int)(Math.random()*45)+1;
		lottos[3]=(int)(Math.random()*45)+1;
		lottos[4]=(int)(Math.random()*45)+1;
		
//		System.out.println(lottos[0]);
//		System.out.println(lottos[1]);
//		System.out.println(lottos[2]);
//		System.out.println(lottos[3]);
//		System.out.println(lottos[4]);
		
		for(int i = 0 ; i<6 ; i++) {
			System.out.println(lottos[i]);
		}

	}

}
