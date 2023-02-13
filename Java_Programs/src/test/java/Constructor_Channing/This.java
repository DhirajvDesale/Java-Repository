package Constructor_Channing;

public class This {
	This(){
		this('a');
		System.out.println("This()");
	}
	This(int a){
		this();
		System.out.println("This(int)");
	}
	This(char a){
		System.out.println("This(char)");
	}
	public static void main(String[] args) {
		This obj=new This(10);

	}

}
