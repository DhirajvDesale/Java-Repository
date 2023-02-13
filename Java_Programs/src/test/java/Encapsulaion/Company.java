package Encapsulaion;

public class Company {

	public static void main(String[] args) {
		Employee e1=new Employee("shubham",1,15000);
		//System.out.println(e1.Esal);  compile time error
		System.out.println(e1.getsal());
		
		//e1.Esal=16000; compile time error
		e1.setSal(16000);
		System.out.println(e1.getsal());
		
	}

}
