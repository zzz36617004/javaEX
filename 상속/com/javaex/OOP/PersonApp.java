/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.54 (상속)
 */
package com.javaex.OOP;

public class PersonApp {
		public static void main(String[] args) {
			Person p =new Person("정우성",45);
			Student s1 = new Student("서울고등학교");
			Student s2 = new Student("이정재", 45, "한국고등학교" );
			p.showInfo();
			s1.showInfo();
			s2.showInfo();
		}
}
