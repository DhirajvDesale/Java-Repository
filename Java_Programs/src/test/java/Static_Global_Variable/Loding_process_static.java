package Static_Global_Variable;

public class Loding_process_static {
	static int a=20;
	static public void test() {
		a=25;
		System.out.println(a);
		System.out.println(Loding_process_static.a);
	}
	static {
		Loding_process_static.test();
	}
	public static void main(String[] args) {
		System.out.println(Loding_process_static.a);

	}

}
