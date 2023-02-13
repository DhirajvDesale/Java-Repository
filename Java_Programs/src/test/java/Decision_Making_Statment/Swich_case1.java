package Decision_Making_Statment;

public class Swich_case1 {

	public static void main(String[] args) {
		System.out.println("Hii");
		int n=2;
		switch (n%2) {
		case 0:
			System.out.println("Even");
			break;
		case 1:
			System.out.println("Odd");
			break;

		default:
			break;
		}
		System.out.println("Bye");
	}

}
