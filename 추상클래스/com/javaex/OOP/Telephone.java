package com.javaex.OOP;

public class Telephone extends Phone{
	public void power(boolean power) {}

	@Override
	void call(String number) {this.number=number;}
	
}
