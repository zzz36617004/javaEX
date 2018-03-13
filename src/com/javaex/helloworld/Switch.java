/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.68 (Switch문)
 */
package com.javaex.helloworld;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력해 주세요.");
		int month = sc.nextInt();
		switch (month) {
		case 1:
			System.out.println("31일 입니다.");
			break;
		case 2:
			System.out.println("28일 입니다.");
			break;
		case 3:
			System.out.println("31일 입니다.");
			break;
		case 4:
			System.out.println("30일 입니다.");
			break;
		case 5:
			System.out.println("31일 입니다.");
			break;
		case 6:
			System.out.println("30일 입니다.");
			break;
		case 7:
			System.out.println("31일 입니다.");
			break;
		case 8:
			System.out.println("31일 입니다.");
			break;
		case 9:
			System.out.println("30일 입니다.");
			break;
		case 10:
			System.out.println("31일 입니다.");
			break;
		case 11:
			System.out.println("30일 입니다.");
			break;
		case 12:
			System.out.println("31일 입니다.");
			break;
		default:
			System.out.println("1~12사이의 수를 입력하세요.");
			break;
		}
		
	}

}
