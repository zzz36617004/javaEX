/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.56 (상속)
 */
package com.javaex.OOP;

public class ColorPoint extends Point{
	
	String color;
	public ColorPoint() {}
	public ColorPoint(String color) {this.color=color;}
	
	public ColorPoint(int x,int y,String color) {
		this.x=x;
		this.y=y;
		this.color=color;
		}
	public void showInfo() {
		System.out.println("x="+x+" y="+y+" Color="+color);
	}
}
