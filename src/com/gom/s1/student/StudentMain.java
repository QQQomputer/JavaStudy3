package com.gom.s1.student;


public class StudentMain {

	public static void main(String[] args) {
		//  makeStudent 호출
		// 이름, 번호, 국어, 영어,  수학 출력
		//학생의 수를 입력받음

		StudentUtil studentUtil = new StudentUtil();
		Student [] stu = studentUtil.makeStudent();
		
		for(int i=0;i<stu.length;i++) {
			System.out.println("이름 : "+stu[i].name);
			System.out.println("번호 : "+stu[i].num);
			System.out.println("국어 : "+stu[i].kor);
			System.out.println("영어 : "+stu[i].eng);
			System.out.println("수학 : "+stu[i].math);						
		}
		


	}

}
