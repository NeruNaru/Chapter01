package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕");
		System.out.println("하세요");
		
		System.out.print("안녕");
		System.out.print("하세요");
		
		System.out.println("");
		System.out.println("------------------");
		
		int i = 2345;
		double d = 3.14;
		char c = '한';
		
		String s = "한";
		String str = "굿모닝";
		String name = "정윤영";
		
		System.out.println(i);
		System.out.println(str);
		System.out.println(5+3);
		System.out.println("굿모닝"+"정윤영");
		System.out.println(str + name);
		System.out.println(str + name + str);
		
		System.out.println(i + i); //정수 + 정수
		System.out.println(i + d); //정수 + 실수 --> 실수(자동형변환)+실수
		System.out.println(str + i); //문자열 + 정수 --> 정수를 문자로 취급함
		
		String result = name + d; //문자열 + 정수 --> 문자열, 문자열 + 실수 --> 문자열
		//즉, 정수든 실수든 문자열과 더하면 모두 문자열로 변환된다.
		System.out.println(result);
		
		//굿모닝랑정윤영
		System.out.println(str + " 랑 " + name);
		
		System.out.println("제이름은 " + name + " 입니다");
		
		System.out.println("--------------------------");
		System.out.println(c);
		System.out.println(c + c);
		//char 형태는 + 숫자 더하기가 됨. char는 문자를 코드의 값(숫자)로 관리하기 때문에
		//문자 끼리의 덧셈이 아닌 숫자끼리의 덧셈으로 인식하였기 때문에 숫자가 출력됨
		
		System.out.println('"' + "제 이름은 " + name + " 입니다." + '"');
		//"제 이름은 정윤영 입니다."
		System.out.println("제 이름은 \"" + name + "\" 입니다.");
		//제 이름은 \정윤영\ 입니다.
		System.out.println("제 이름은 '" + name + "' 입니다.");
		//제 이름은 '정윤영' 입니다.
		
		System.out.println("제 이름은 \\" + name + "\\ 입니다.");
		
		System.out.println("제이름은\t" +name+ "입니다.");
		System.out.println("제 이름은 \n" +name+ "입니다.");
	}

}
