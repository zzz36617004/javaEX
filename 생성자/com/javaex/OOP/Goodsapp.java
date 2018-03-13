/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.45 (생성자)
 */
package com.javaex.OOP;

public class Goodsapp {
	public static void main(String[] args) {
		Goods camera=new Goods();
		Goods laptop=new Goods();
		Goods cup=new Goods();
		Goods desktop=new Goods("고사양컴퓨터",3670000);
		camera.setname("nikon");
		camera.setprice(400000);
		
		laptop.setname("LG그램");
		laptop.setprice(900000);
		cup.setname("머그컵");
		cup.setprice(2000);
		
		
		laptop.Showinfo();
		camera.Showinfo();
		cup.Showinfo();
		desktop.Showinfo();
		
	}
	
}
