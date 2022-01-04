package com.gom.s1.method;

public class MethodMain {

	public static void main(String[] args) {

		System.out.println("MainMethod Start");

		//객체 생성 코드
		//new 클래스명();
		ReturnStudy rs = new ReturnStudy();
		
		//참조변수명.멤버들
		rs.test1();
	
		int count = rs.test2();
		System.out.println("Main : "+count);
		
		String name = rs.test3();
		System.out.println(name);
		
		double a = Math.random();
		System.out.println(a);
		
		System.out.println("MainMethod Finish");
	}
}