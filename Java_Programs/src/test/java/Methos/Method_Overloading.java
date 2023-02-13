package Methos;

public class Method_Overloading {
	public static void test(double a) {
		System.out.println("from Test Double");
	}
	public static void test(int a) {
		System.out.println("From test int");
	}
	public static void main(String[] args) {
		test('a');

	}

}
