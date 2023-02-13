package Run_Time_Exception;

public class Vote {
	public static void age(int n)throws AgeInvalid{
		if (n<18) {
			throw new AgeInvalid("Age invalid go to home");
		}
		else {
			System.out.println("Vote and go home");
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		try {
			age(10);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Bye");

	}

}
