package session3;

public class ForLoopExample {
	public void findNumber(int a[], int number1) {
		int i = 0;
		for (; i < a.length;) {
			if (a[i] == number1) {
				System.out.println("Number is present at position " + i);
			}
			i++;
		}
	}

	public void searchNumber() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}