/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.56 (상속)
 */
package com.javaex.OOP;

public class PointApp {
	public static void main(String[] args) {
	Point p=new Point();
	Point c=new Point();
	Point t = new Point(4,4);
	ColorPoint cp1 = new ColorPoint("red");
	ColorPoint cp2 = new ColorPoint(10,10,"blue");
	p.setX(3);
	p.setY(5);
	p.draw();
	c.setX(10);
	c.setY(23);
	c.draw();
	p.draw(3,5);
	c.draw(10,23);
	t.showInfo();
	cp1.showInfo();
	cp2.showInfo();
	}
}
