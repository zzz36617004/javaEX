/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.45 (생성자)
 */
package com.javaex.OOP;

public class Goods {
	
	private String name;
	private int price;
	//생성자
	public Goods() {}
	
	public Goods(String name,int price) {
		this();
		this.name=name;
		this.price=price;
	}
	
	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setprice(int price) {
		this.price = price;
	}

	public int getprice() {
		return price;
	}
	public void Showinfo(){
		System.out.println("이름:"+getname()+" 가격:"+getprice());
		}
}
