package session5;

public class StarTriangle {

	public void Triangle(int n) {
		int i, k;
		for (i = 1; i <= n; i++) {

			for (k = 0; k <= i - 1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}