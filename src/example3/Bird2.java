package example3;

class Bird2 extends Bird {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.flying_height = 728;
		b.color = "red";
		b.display();
		Bird b1 = new Bird();
		b1.display();
		b.display();
	}
}
