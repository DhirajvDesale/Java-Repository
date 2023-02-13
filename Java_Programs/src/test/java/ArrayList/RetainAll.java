package ArrayList;

import java.util.ArrayList;

public class RetainAll {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("Hello");
		obj.add('a');
		System.out.println(obj);
		
		ArrayList obj1=new ArrayList();
		obj1.add(true);
		obj1.add(23);
		obj1.add('a');
		System.out.println(obj1);
		obj1.retainAll(obj);
		System.out.println(obj1);

	}

}
