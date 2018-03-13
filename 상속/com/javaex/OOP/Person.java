/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.54 (상속)
 */
package com.javaex.OOP;

public class Person {
	String name;
	int age;
	public Person() {}
	public void showInfo(){
		System.out.println("이름:"+name+" 나이:"+age);
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
