package com.gom.s1.student;

import java.util.Scanner;

public class StudentUtil {

	public Student[] makeStudent() {

		// 1. �迭 - ���� ������Ÿ��(x)
		// 2. class
		//################################################
		// Ʋ�� ����!!!! == �濡�� ������ �л��� ����� ����Ѵ�!!//
		// �濡 �л��� ���� ���¿��� ������ ����������!!
		//################################################
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("�л����� ����Դϱ�?");
		int count = sc.nextInt();
		Student [] stu = new Student[count];
		
		for(int i =0; i<stu.length;i++) {
			Student student = new Student();
			System.out.println("�̸��� �Է����ּ���");
			String name = sc.next();
			System.out.println("��ȣ�� �Է����ּ���");
			int num = sc.nextInt();
			System.out.println("���������� �Է����ּ���");
			int kor = sc.nextInt();
			System.out.println("���������� �Է����ּ���");
			int eng = sc.nextInt();
			System.out.println("���������� �Է����ּ���");
			int math = sc.nextInt();
			stu[i]=student;
			stu[i].name = name;
			stu[i].num = num;
			stu[i].kor = kor;
			stu[i].eng = eng;
			stu[i].math = math;				
		}
		return stu;
		
		
		
	}

}
