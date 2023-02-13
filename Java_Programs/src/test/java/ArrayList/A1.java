package ArrayList;

import java.util.ArrayList;

public class A1 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		System.out.println(obj);
		System.out.println(obj.isEmpty());
		obj.add("hello");
		obj.add(true);
		obj.add(25);
		obj.add(25.23);
		System.out.println(obj);
		System.out.println(obj.isEmpty());

	}

}
