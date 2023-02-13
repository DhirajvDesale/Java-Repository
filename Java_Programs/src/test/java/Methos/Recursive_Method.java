package Methos;

public class Recursive_Method {
	public static void num(int a) {
		if (a==11) {
			return;
		}
		System.out.println(a);
		a++;
		num(a);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		num(0);
		System.out.println("end");

	}

}
