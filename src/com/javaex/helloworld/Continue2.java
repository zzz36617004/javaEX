/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.82(For문)
 */
package com.javaex.helloworld;

import java.util.Scanner;

public class Continue2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				continue;
			} else {
				System.out.println(i);
			}
			sc.close();
		}
	}
}