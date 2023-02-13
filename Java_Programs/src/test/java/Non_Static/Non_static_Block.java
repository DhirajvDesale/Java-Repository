package Non_Static;

public class Non_static_Block {
	
	{
	System.out.println("N s Block 1");
	}
	{
		System.out.println("N s block 2");
	}
	public static void main(String[] args) {
		Non_static_Block obj=new Non_static_Block();

	}

}
