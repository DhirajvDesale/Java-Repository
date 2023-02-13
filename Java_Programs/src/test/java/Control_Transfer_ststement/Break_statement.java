package Control_Transfer_ststement;

public class Break_statement {

	public static void main(String[] args) {
		int a=1;
		System.out.println("Main Begin");
		while (a<5) {
			System.out.println(a);
			if (a==3) {
				System.out.println("Good Evening");
				break;
			}
			System.out.println(a);
			a++;
		}
		System.out.println("Main End");
	}

}
