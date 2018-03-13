package javaEX;

class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}
	public boolean equals(Object obj) {
		Point p = ((Point) obj);
		if (this.hashCode() == p.hashCode()) {
			return true;
		} else if (this.x == p.x && this.y == p.y) {
			return true;
		} else {
			return false;
		}
	}
}

public class ObjectProperty {
	public static void main(String[] args) {
		Point p = new Point(2, 3);
		System.out.println(p.getClass().getName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
	}

	

}
