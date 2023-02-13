package Static_Global_Variable;
public class Static_block2 {
	static int a;
	static int b;
	static {
		int a=10;
		System.out.println(a);
		a=50;
		System.out.println(a);
		Static_block2.a=100;
	}
	static {
		b=25;
		System.out.println(b);
		Static_block2.b=45;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println(b);
		System.out.println(Static_block2.a);

	}

}
