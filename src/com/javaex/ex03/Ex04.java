package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아르바이트 임금 계산방법");
		System.out.println("8시간까지는 10,000원으로 계산되고 8시간 이후부터는 12,000원으로 계산됩니다.");
		System.out.println("근무시간을 입력해주세요.");
		
		int time = sc.nextInt();
		
		//if문 안쪽에서 생성된 변수는 if문이 끝나면 사라진다
		//따라서 if문 밖에서도 사용할 수 있는 변수는 if문 밖에서 선언한다
		
		if(time<=0) {
			System.out.println("오류발생: 제대로된 값을 입력해주세요");
		} else {
			if(time>8) {
				System.out.println("임금은 " +((time-8)*12000+80000)+ "원 입니다.");
			} else {
				if(time<=8) {
					System.out.println("임금은 " +(time*10000)+ "원 입니다.");
				}
			}
		}
		
		
		
		sc.close();
	}

}
