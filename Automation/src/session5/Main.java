package session5;

public class Main {

	public static void main(String... a) {
		System.out.println("This is a Traingle:");
		System.out.println("");
		StarTriangle obj = new StarTriangle();
		obj.Triangle(4);
		System.out.println("");

		System.out.println("This is a Pyramid:");
		System.out.println("");
		Pyramid obj1 = new Pyramid();
		obj1.starPyramid(4);

		// System.out.println(StaticFunction.example());

	}

}