/*
 추상클래스는 인스턴스를 생성할수없다(obj=new DObject();) 래퍼런스 선언 가능\
 변수 상수 활용가능
 */
package com.javaex.OOP;

abstract class Calculator {
	public abstract int add(int a, int b);
	public abstract int subtract(int a,int b);
	public abstract double average(int[] a);
}