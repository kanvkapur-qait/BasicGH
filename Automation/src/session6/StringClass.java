package session6;

public class StringClass {

	public String depart = "Computer Science";
	public int number = 0;

	public void getProperty() {
		System.out.println(depart.length());
		System.out.println(depart.substring(0, 2));
		System.out.println(depart);
		System.out.println(depart.concat("Hello"));
		System.out.println(depart);
		System.out.println(depart.startsWith("Computer"));
		System.out.println(depart.equalsIgnoreCase("CompuTer science"));
		System.out.println(depart.toLowerCase());
		System.out.println(depart.toUpperCase());
		String number = String.valueOf(22755797);
		System.out.println(number.length());
		System.out.println(number.contains("7"));
		String a[] = depart.split("s");
		
	}
	
	public String addString(String name, String add) {
		String result = name + add;
		return result;
	}
	
	
}