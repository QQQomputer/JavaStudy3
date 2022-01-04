package com.gom.s1.student;

import java.util.Scanner;

public class StudentUtil {

	public Student[] makeStudent() {

		// 1. 배열 - 같은 데이터타입(x)
		// 2. class
		//################################################
		// 틀린 이유!!!! == 방에는 무조건 학생을 만들어 줘야한다!!//
		// 방에 학생이 없는 상태에서 정보를 넣으려고함!!
		//################################################
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("학생수는 몇명입니까?");
		int count = sc.nextInt();
		Student [] stu = new Student[count];
		
		for(int i =0; i<stu.length;i++) {
			Student student = new Student();
			System.out.println("이름을 입력해주세요");
			String name = sc.next();
			System.out.println("번호를 입력해주세요");
			int num = sc.nextInt();
			System.out.println("국어점수를 입력해주세요");
			int kor = sc.nextInt();
			System.out.println("영어점수를 입력해주세요");
			int eng = sc.nextInt();
			System.out.println("수학점수를 입력해주세요");
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
