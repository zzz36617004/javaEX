/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.83(ForVsWhile문)
 */
package com.javaex.helloworld;

public class ForVsWhile {
	public static void main(String[] args) {
		int i=1;
		while(true) {
			if(i%6==0&&i%14==0) {
				System.out.println(i);
				break;
			}
			else {
				i++;
				continue;
				
			}
		
		}
	}
}
