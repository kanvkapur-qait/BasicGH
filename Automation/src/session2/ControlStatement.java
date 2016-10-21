package session2;

public class ControlStatement {

	int c = 55;

	public void checkValueOfNumber() {

		int a = 6;

		if (a < 10) {
			System.out.println("A is less that 10");
		} else if (a > 10) {
			System.out.println("A is greater than 10");
		}
	}

	/**
	 * 
	 * @param number
	 */
	
	public void swtichStatement(int number) {
		switch (number) {
		case 0:
			System.out.println("Number is 0");
			break;

		case 1:
			System.out.println("Number is 1");
			break;

		default:
			System.out.println("Number is neither 0 nor 1");
		}
	}
	
	public void swtichStatement(String name) {
		switch (name) {
		case "Kanv":
			System.out.println("SEX: MALE");
			break;

		case "Aditi":
			System.out.println("SEX: FEMALE");
			break;
			
		case "Swati":
			System.out.println("SEX: FEMALE");
			break;
			
		case "Tanuj":
			System.out.println("SEX: MALE");
			break;
			
		default:
			System.out.println("Sex Unknown");
		}
	}
	
	
	
	
	
}