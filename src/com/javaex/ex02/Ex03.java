package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner tf = new Scanner(System.in);
		
		System.out.println("이름을 입력해 주세요.");
		System.out.println("이름:");

		String name = sc.next();
		
		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("맞으시면 '예' 틀리다면 '아니오'를 입력해주세요.");
		
		String yesorno = tf.next();
		if (yesorno == "예") {
			System.out.println("확인되었습니다. 당신의 이름은" +name+ "입니다.");
		} else if(yesorno =="아니오") {
			System.out.println("오류가 발생했습니다. 시스템을 종료합니다.");
		}
		//히스토리 반응 확인중
		
		sc.close();
		tf.close();
	}

}
