package Control_Transfer_ststement;

public class Continue_Statement {

	public static void main(String[] args) {
		System.out.println("start");
		int a=0;
		while(a<4) {
			System.out.println("Samosa"+a);
			if (a==2) {
				System.out.println(a);
				a++;
				continue;
			}
			System.out.println("Chatni"+a);
			a++;
		}
		System.out.println("END");

	}

}
