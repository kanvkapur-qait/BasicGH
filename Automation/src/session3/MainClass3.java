package session3;

public class MainClass3 {
	public static void main(String... a) {
//		ForLoopExample obj1 = new ForLoopExample();
//		int arr[] = { 1, 2, 3, 4 };
//		obj1.findNumber(arr, 3);
//		obj1.searchNumber();
//		WhileLoopExample obj2 = new WhileLoopExample();
//		obj2.search(arr, 3);
		
		Child2 ob = new Child2();
		System.out.println(ob.add(5, 4));
		System.out.println(ob.sub(10, 7));
		System.out.println(ob.name);
		System.out.println(ob.multi(4, 7));
	}

	public int[] getObjectOfClassExample1() {
		int i = 1;
		int j = 2;
		int k = 3;
		int arr[] = { i, j, k };

		return arr;
	}
}