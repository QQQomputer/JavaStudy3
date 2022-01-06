package com.gom.s1.student;


public class StudentMain {

	public static void main(String[] args) {
		//  makeStudent 호출
		// 이름, 번호, 국어, 영어,  수학 출력
		//학생의 수를 입력받음

		StudentUtil studentUtil = new StudentUtil();
		Student [] stu = studentUtil.makeStudent();
		
		for(int i=0;i<stu.length;i++) {
			System.out.println("�̸� : "+stu[i].name);
			System.out.println("��ȣ : "+stu[i].num);
			System.out.println("���� : "+stu[i].kor);
			System.out.println("���� : "+stu[i].eng);
			System.out.println("���� : "+stu[i].math);						
		}
		


	}

}
