/*
작성자:배진현
작성일:2018.03.07
설   명:ppt.80(For문)
 */
package com.javaex.helloworld;
import java.util.Scanner;
public class Continue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(true){
			System.out.println("숫자를 입력해 주세요.");
	
			int num = sc.nextInt();
			if(num%3==0&&num!=0) {
				System.out.println("3의배수입니다.");
			}
			else if(num==0) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println("3의 배수가 아닙니다");
			}
		
	}
		sc.close();
}
}