package com.gom.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {

		System.out.println("MainMethod Start");

		//��ü ���� �ڵ�
		//new Ŭ������();
		ReturnStudy rs = new ReturnStudy();
		
		//����������.�����
		rs.test1();
	
		int count = rs.test2();
		System.out.println("Main : "+count);
		
		String name = rs.test3();
		System.out.println(name);		
		double a = Math.random();
		System.out.println(a);
		
		Scanner sc = rs.test4();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		
		
		
		System.out.println("MainMethod Finish");
	}
}