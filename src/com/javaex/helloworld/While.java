/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.75(While문)
 */
package com.javaex.helloworld;
import java.util.Scanner;
public class While {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단을 입력해주세요");
		System.out.print("단:");
		int dan = sc.nextInt();
		int i=1;
		while(i<=9) {
		System.out.println(dan+"*"+i+"="+dan*i);
		i++;
		}
		}
}
