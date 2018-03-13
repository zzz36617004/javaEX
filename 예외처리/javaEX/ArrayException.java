package javaEX;

public class ArrayException {
	public static void main(String[] args) {
		int[] intArray=new int[] {3,6,9};
		try {
		System.out.println(intArray[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과 접근");
			
		}
	}
}
