package Static_Global_Variable;

public class Static_Block {
	static {
		System.out.println("open the chrome browser");
	}
	public static void main(String[] args) {
		System.out.println("login to FB");
	}
	static {
		System.out.println("open the fb Browser");
	}

}
