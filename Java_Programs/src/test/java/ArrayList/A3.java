package ArrayList;

import java.util.ArrayList;

public class A3 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("Hello");
		obj.add(25);
		obj.add(true);
		obj.add(45);
		System.out.println(obj);
		obj.add(1, false);	//add object using index value
		System.out.println(obj);
		System.out.println(obj.contains(25));	//contain()
		System.out.println(obj.indexOf(true));	//indexOf()
		
		ArrayList obj1=new ArrayList();
		obj1.add("Hii");
		obj1.add("Bye");
		System.out.println(obj1);
		obj1.addAll(obj);	//addAll()
		System.out.println(obj1);
		
	}

}
