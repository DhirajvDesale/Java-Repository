package ArrayList;

import java.util.ArrayList;

public class A4 {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("hello");
		obj.add(25);
		obj.add(true);
		System.out.println(obj);
		System.out.println(obj.get(2));	//get()
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}

	}

}
