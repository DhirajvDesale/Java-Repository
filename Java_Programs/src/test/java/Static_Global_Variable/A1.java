package Static_Global_Variable;

public class A1 {
	static int a=10;
	public static void main(String[] args) {
		System.out.println(a);	//directly
		System.out.println(A1.a);	//indirectly(class name as ref)

	}

}
