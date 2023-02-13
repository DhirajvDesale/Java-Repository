package Wrapper_Class;

public class Boxing1 {

	public static void main(String[] args) {
		int n=25;
		Integer obj=Integer.valueOf(n);
		
		Integer obj1=30;
		Integer obj2=new Integer(50);
		
		System.out.println(obj.toString());
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());

	}

}
