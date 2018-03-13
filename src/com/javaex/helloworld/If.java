/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.64(if문)
 */
package com.javaex.helloworld;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자:");
		int num = sc.nextInt();
		sc.close();
		if (num % 2 == 0 && num > 0) {
			System.out.println("짝수입니다.");
		} else if (num % 2 == 1 && num > 0) {
			System.out.println("홀수입니다.");
		} else if (num < 0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0");
		}
	}
}
