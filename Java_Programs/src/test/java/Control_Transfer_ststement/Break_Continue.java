package Control_Transfer_ststement;

public class Break_Continue {

	public static void main(String[] args) {
		int a=0;
		while (a<4) {
			if (a==2) {
				System.out.println(a);
				a++;
				continue;
			}
			a++;
			break;
			
		}

	}

}
