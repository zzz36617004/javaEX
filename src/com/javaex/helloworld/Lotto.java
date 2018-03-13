/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.88(난수 로또 예시)
 */
package com.javaex.helloworld;

public class Lotto {
	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
		int num = (int)(Math.random()*45)+1;
		System.out.print(num+" ");
		}
	}

}
