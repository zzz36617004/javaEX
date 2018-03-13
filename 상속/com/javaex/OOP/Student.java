/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.54 (상속)
 */
package com.javaex.OOP;

public class Student extends Person {
	String schoolName;

	public Student(String schoolName) {
		this.schoolName=schoolName;
	}
	
	public Student(String name,int age,String schoolName) {
		this.schoolName=schoolName;
		this.name=name;
		this.age=age;
	}
	public void showInfo(){
		System.out.println("이름:"+name+" 나이:"+age+" 학교:"+schoolName);
	}
}
