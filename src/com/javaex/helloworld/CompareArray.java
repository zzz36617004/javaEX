/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.98 (배열비교)
 */
package com.javaex.helloworld;

public class CompareArray {
	public static void main(String[] args) {
		int[] leftArray=new int[] {10,20,30};
		int[] rightArray=new int[] {10,20,30};
		
		if(leftArray.length!=rightArray.length) {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
		else if(leftArray.length==rightArray.length){
			for(int i=0;i<leftArray.length;i++) {
				if(leftArray[i]!=rightArray[i]){
					System.out.println(i+"번째 값이 다릅니다.");
				}
			}
		}
		else {}
	}
}
