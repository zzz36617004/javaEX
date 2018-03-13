/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.79(For문)
 */
package com.javaex.helloworld;
import java.util.Scanner;
public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단:");
	int dan=sc.nextInt();
	int i=1;
	for(i=1;i<10;i++) {
		System.out.println(dan+"*"+i+"="+dan*i);
	}
	}
}
