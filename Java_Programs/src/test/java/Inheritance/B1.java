package Inheritance;

public class B1 extends A1{
	int b=20;
	public void key() {
		System.out.println("key()-b");
	}
	{
		System.out.println("Initializer block b");
	}
	public static void main(String[] args) {
		B1 obj=new B1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.key();
		obj.test();

	}

}
