package javaEX;

class Rectangle {
	int width;
	int height;

	public boolean equals(Rectangle a) {
		if (width * height == a.height * a.width)
			return true;
		else {
			return false;
		}
	}

	public Rectangle() {
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

public class RactangleApp {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(6, 4);
		Rectangle b = new Rectangle(2, 12);
		Rectangle c = new Rectangle(3, 3);
		Rectangle d = c;
		String greeting="Hello JAVA!";
		greeting.charAt(0);
		greeting.charAt(10);
		greeting.substring(1,3);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(a.equals(d));
		System.out.println(d.equals(c));
	}
}
