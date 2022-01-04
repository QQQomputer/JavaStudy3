package com.gom.s1.student;

import java.util.Scanner;

public class StudentUtil {

	public Student[] makeStudent() {

		// 1. 배열 - 같은 데이터타입(x)
		// 2. class
		Scanner sc = new Scanner(System.in);

		System.out.println("학생수는 몇명입니까?");
		int count = sc.nextInt();
		Student [] stu = new Student[count];
		
		for(int i =0; i<stu.length;i++) {
			
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
			stu[i].name = name;
			stu[i].num = num;
			stu[i].kor = kor;
			stu[i].eng = eng;
			stu[i].math = math;				
		}
		return stu;
		
		
		
	}

}
