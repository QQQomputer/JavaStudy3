package com.gom.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {
	//���������� [�׿�������] ����Ÿ�� �޼����([�Ű����� ����]){}
	public void test1() {
		System.out.println("void�� ������ ���� �� ���");
	}

	public int test2() {
		Random random = new Random();
		int num = random.nextInt();
		System.out.println("Test2 : "+num);
		return num;
	}
	
	public String test3() {
		//Ű����� ���� �̸��� �Է¹ް� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���");
		String name = sc.next();
		return name;		
	}
	
	public Scanner test4() {	
		Scanner sc = new Scanner(System.in);
		return sc;
		
	}
	
}
