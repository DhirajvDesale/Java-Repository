package Static_Global_Variable;

public class A3 {
	static int m;
	public static void main(String[] args) {
		
		m=10;
		System.out.println(m);
		System.out.println(m);
		
		int m=25;
		System.out.println(m);
		m=50;
		System.out.println(m);
		System.out.println(A3.m);
	}

}
