package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("-----------------------");
		
		//산술연산자//
		int sum = a + b;
		System.out.println(sum);
		
		System.out.println(a-b);
		System.out.println(a+b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		System.out.println(7/2); //3 정수/정수=정수
		System.out.println(7.0/2); // 7.0/2 -> 7.0/2.0=3.5
		System.out.println(7.0/2.0); //7.0/2.0=3.5
		
		System.out.println("-----------------------");
		
		int var = -3;
		int pVar = -var; //-(-3) = +3
		System.out.println(pVar);
		
		int mVar = +var; //+(-3) = -3
		System.out.println(mVar);
		
		System.out.println("-----------------------");
		
		//증강연산자//
		System.out.println(a); //7
		System.out.println(++a); //7-->8 변수 값 변경됨
		System.out.println(a);
		
		System.out.println(b); //2
		System.out.println(--b); // 2-->1 변수 값 변경됨
		System.out.println(b);
		
		System.out.println(a); //8
		System.out.println(a++);
		/* 8 -(출력됨)-> 8-->9 --> 9
		 * 변수 값은 변경이 되었으나 ++기호가 변수 뒤에 있어 출력이 먼저 되고
		 *그 이후에 변수가 변경됨*/
		System.out.println(a); // 9
		
		System.out.println(b); //1
		System.out.println(b--); //1 출력 후 -- 적용
		System.out.println(b); //0
		
		//가장 먼저 해야할 일 나열 후 나중에 해야할 일을 이후에 나열
		
		int c = 5;
		System.out.println(c); //5
		System.out.println(++c * 2);
		/* ++연산자가 *연산자보다 우선순위가 높기 때문에 
		 * 변수 c가 먼저 6이 되고 *2를 시행
		 * 결론: (5+1)*2=12*/
		
		
		int d = 5;
		System.out.println(d);
		System.out.println(d++ * 2);
		System.out.println(d);
		/* 변수보다 ++연산자가 뒤에 있으니 변수d(5)를 우선 출력 후 변수에 ++연산자를 적용
		 * 이미 출력된 변수 d(5)dp *2를 적용
		 * 결론: 5*2  -->d=6
		 */
	}

}
