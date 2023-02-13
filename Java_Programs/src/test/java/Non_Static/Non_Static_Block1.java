package Non_Static;

public class Non_Static_Block1 {
	static	//before execution of main method begin (1st)
	{
		System.out.println("Static block");
	}
	Non_Static_Block1(){
		System.out.println("from constructor");
	}
	{
		System.out.println("Non-static Block");
	}
	public static void main(String[] args) {
		Non_Static_Block1 obj=new Non_Static_Block1();

	}

}
