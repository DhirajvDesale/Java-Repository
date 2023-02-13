package Methos;

public class Method_overloading1 {
	public static void test(int a,int b) {	//widening process is twice
		System.out.println("From test Double");
	}
	public static void test(int a,char b) {
		System.out.println("from test int");
	}
	public static void main(String[] args) {
		test('a','a');

	}

}
