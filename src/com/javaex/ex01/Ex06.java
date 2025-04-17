package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//다른 자료형(정수 + 실수)
		double var01 = 2 + 3.5;
		System.out.println(var01);
		
		double var02 = 3.0 + 6;
		System.out.println(var02);
		
		float var03 = 40 + 3.3F;
		System.out.println(var03);
		
		long var04 = 1234L;
		float var05 = 1.45F;
		System.out.println(var04 + var05);
		
		//강제형변환
		float var06 = 111.6456F;
		int var07 = (int)var06;  //111.6456F --->111로 변환됨
		System.out.println(var07);
		
		//강제형변환 --> 확대 byte(1) -->int(4)//
		byte var08 = 120;
		int result02 = var08;
		System.out.println(result02);
		
		//강제형변환 --> 축소 int(4)-->byte(1): 정상//
		int var09 = 10;
		System.out.println(var09);
		byte result03 = (byte)var09;
		System.out.println(result03);
		
		//강제형변환 --> 축소 int(4) --> byte(1): 비정상//
		int var10 = 203029778;
		System.out.println(var10);
		byte result04 = (byte)var10;
		System.out.println(result04);
		
		//강제형변환 --> 실수=>정수//
		double var11 = 5.57;
		System.out.println(var11);
		
		int result05 = (int)var11;
		System.out.println(result05);  //소수점 없어짐 이용가능
		
		//강제형변환 --> 정수=>실수//
		int var12 = 7;
		System.out.println(var12);
		
		double result06 = (double)var12;
		System.out.println(result06);
		
	}

}
