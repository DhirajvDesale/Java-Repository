package Static_Global_Variable;

public class A2 {
	static int a;
	public static void main(String[] args) {
		
		System.out.println(a);
		a=50;
		System.out.println(a);
		A2.a=100;
		System.out.println(a);

	}

}
