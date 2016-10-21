package session5;

public class Pyramid {

	public void starPyramid(int n) {
		int i, k;
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
				for (int j = 0; j < 2 * i - 1; j++) {
					System.out.print("*");
				}
				System.out.println("");	
			}
			
		}

	}
