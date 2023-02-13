package Non_Static;

public class This1 {
	int a;
	int b;
	This1(int n,int m){
		this.a=n;
		this.b=m;
	}
	public static void main(String[] args) {
		This1 obj=new This1(10,20);
		System.out.println(obj.a);
		System.out.println(obj.b);

	}

}
