package ArrayList;

import java.util.ArrayList;

public class A2 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("hello");
		obj.add(true);
		obj.add("hello");
		System.out.println(obj);
		
		ArrayList obj1=new ArrayList();
		obj1.add(true);
		obj1.add('a');
		System.out.println(obj1);
		obj1.add(obj);
		System.out.println(obj1);
		System.out.println(obj1.size());

	}

}
