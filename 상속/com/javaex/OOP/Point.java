/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.56 (상속)
 */
package com.javaex.OOP;

public class Point {
	int x;
	int y;
	//생성자
	public Point() {}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void draw() {
		System.out.println("점[x="+getX()+","+getY()+"]을 그렸습니다.");
	}
	public void draw(int x,int y) {
		System.out.println("점[x="+getX()+","+getY()+"]을 지웠습니다.");
	}
	public void showInfo() {
		System.out.println("x="+x+" y="+y);
	}
}

