package Non_Static;

public class Constructor_Overloading {
	Constructor_Overloading(){
		System.out.println("from No argument Constructor");
	}
	Constructor_Overloading(int a){
		System.out.println("from parameterize Constructor");
	}
	public static void main(String[] args) {
		Constructor_Overloading v1=new Constructor_Overloading(10);
		System.out.println(v1);

	}

}
