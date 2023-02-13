package Non_Static;

public class Parameterize_Constructor {
	
	Parameterize_Constructor(int a,int b){
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Parameterize_Constructor p1=new Parameterize_Constructor(10,20);
		System.out.println(p1);

	}

}
