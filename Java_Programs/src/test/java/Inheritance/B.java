package Inheritance;

public class B extends A{
	static int b=20;
	public static void key() {
		System.out.println("key()-B");
	}
	static {
		System.out.println("static initializer block b");
	}
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		key();
		test();

	}

}
