package ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("Hello");
		obj.add('a');
		obj.add(1);
		System.out.println(obj);
		
		Object[] var=obj.toArray();
		for (Object object : var) {
			System.out.println(object);
		}

	}

}
