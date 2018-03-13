package javaEX;

public class NullPointException {
	public static void main(String[] args) {
		String str= new String("hello");
		str=null;
		try {
		System.out.println(str.toString());
		}
		catch(NullPointerException e) {
			System.out.println("널 객체에 접근");
		}
	}
}
