package com.javaex.helloworld;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
	int sum=0;
	Scanner sc = new Scanner(System.in);
	
	do {
		System.out.println("숫자를 입력하세요");
		int num=sc.nextInt();
		if(num==0) break;
		sum=sum+num;
		System.out.println("합계:"+sum);
	}
	while(true);
	System.out.println("종료");
	}
	
}
