package example1;

class Bird {
	int flying_height;
	String color;
}

class A {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.flying_height = 728;
		b.color = "red";
		System.out.println(b.flying_height);
		System.out.println(b.color);
	}
}