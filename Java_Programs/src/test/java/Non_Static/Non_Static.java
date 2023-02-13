package Non_Static;

public class Non_Static {
	int a=10;
	int b=20;
	public void Test() {
		System.out.println("From Non static() ");
	}
	{
		System.out.println("From non static block");
	}
	Non_Static(){
		System.out.println("From constructor");
	}
	public static void main(String[] args) {
		Non_Static obj=new Non_Static();
		obj.Test();
		System.out.println(obj);

	}

}
