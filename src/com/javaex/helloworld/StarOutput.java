/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.84(별모양 출력문)
 */
package com.javaex.helloworld;

public class StarOutput {
	public static void main(String[] args) {
	for(int i=2;i<8;i++) {
		for(int x=1;x<i;x++) {
		System.out.print("*");
		}
		System.out.println(" ");
	}
	}
}
