package Static_Global_Variable;

public class Static_Method {
	static public void test() {
		System.out.println("from test()");
	}
	public static void main(String[] args) {
		test();	//directly
		Static_Method.test();	//BY using the class name as reference

	}

}
