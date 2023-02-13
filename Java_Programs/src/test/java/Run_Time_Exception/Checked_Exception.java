package Run_Time_Exception;

public class Checked_Exception {
	public static void age(int n) {
		if (n<18) {
			throw new ArithmeticException("age invalid");
		}else {
			System.out.println("vote and go home");
		}
	}
	public static void main(String[] args) {
		System.out.println("Hello");
		age(10);
		System.out.println("Bye");

	}

}
