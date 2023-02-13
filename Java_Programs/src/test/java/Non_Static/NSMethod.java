package Non_Static;

public class NSMethod {
	public void test() {
		System.out.println("Non static method test()");
	}
	public static void main(String[] args) {
		NSMethod obj=new NSMethod();
		obj.test();

	}

}
