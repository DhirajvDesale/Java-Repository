package Methos;

public class A4 {
	public static void test() {	//Recursive method
		System.out.println("From Test()");
		test();	//calling the method by its name and same argument
	}
	public static void main(String[] args) {
		test();

	}

}
