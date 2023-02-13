package Methos;

public class A3 {
	public static int b(int n) {
		System.out.println("B is using value :"+n);
		return 200;
	}
	public static void main(String[] args) {
		System.out.println("Hii"); 
		int res=b(100);
		System.out.println(res); 
		System.out.println(b(50)); 
		System.out.println("Bye"); 

	}

}
