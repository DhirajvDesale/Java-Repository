package Decision_Making_Statment;

public class Else_If_Ladder {

	public static void main(String[] args) {
		int a=21;
		if (a%2==0 && a%7==0) {
			System.out.println("Hii");
		}else if (a%3==0 && a%2!=0 ) {
			System.out.println("Bye");
		}else if (a%5==0 || a%8==0) {
			System.out.println("Good Bye");
		}else {
			System.out.println("Block");
		}

	}

}
