package com.javaex.ex05;

public class Ex12 {
	public static void main(String[] args) {
		
		System.out.println("입력된 옵션==================");
		for(int i = 0 ; i<args.length ; i++) {
			System.out.println(args[i]);
		}
		System.out.println("==========================");
		
		for(int i = 0 ; i<args.length ; i++) {
			if(args[i].equals("-v")) {
				System.out.println("버전 3.0");
			}
			
			if(args[i].equals("-d")){
				System.out.println("만든날짜: 2025-04-28");
			}
			
			if(args[i].equals("-n")) {
				System.out.println("만든이: 나");
			}
		}
	}

}
