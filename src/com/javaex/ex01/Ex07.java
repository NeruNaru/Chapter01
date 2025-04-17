package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		//자동형변환이 되는 경우 축소 보다는 확대하는 방식으로 변환이 된다.//
		
		double v01 = 5/4;
		System.out.println(v01);
		//자동형변환 5/4 = 1 -형변환-> 1.0
		
		double v02 = (double)5/4;
		System.out.println(v02);
		// 강제/자동형변환 5.0/4 -강제형변환/자동형변환-> 5.0/4.0 = 5/4
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		// 자동/강제형변환 5/4.0 -자동/강제-> 5.0/4.0 = 5/4
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		// 강제형변환 5/4 -강제/강제-> 5.0/4.0 = 5/4
		
		int v05 = (int)1.3 + (int)1.8;
		System.out.println(v05);
		// 강제형변환 1.3 + 1.8 -강제/강제-> 1 + 1 = 2
	}

}
