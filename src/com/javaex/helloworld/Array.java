/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.96 (Array Lotto)
 */
package com.javaex.helloworld;

public class Array {
	public static void main(String[] args) {
		int num=0;
		int[] IntArray = new int[6];
		for (int i = 0; i < IntArray.length; i++) {
			num = (int) (Math.random() * 45) + 1;
			IntArray[i] = num;
			System.out.print(IntArray[i] + " ");
		}
	}
}
