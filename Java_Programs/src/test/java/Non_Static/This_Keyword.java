package Non_Static;

public class This_Keyword {
	int a=25;
	This_Keyword(){
		System.out.println(a);
		int a=20;
		System.out.println(a);
		System.out.println(this.a);// access non static variable using this keyword
	}
	public static void main(String[] args) {
		This_Keyword obj=new This_Keyword();
		

	}

}
