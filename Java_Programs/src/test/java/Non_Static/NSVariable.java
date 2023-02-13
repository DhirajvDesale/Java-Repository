package Non_Static;

public class NSVariable {
	int a=25;
	public static void main(String[] args) {
		NSVariable v1=new NSVariable();
		System.out.println(v1.a);
		v1.a=50;
		System.out.println(v1.a);

	}

}
