package ArrayList;

import java.util.HashSet;

public class Hshset {

	public static void main(String[] args) {
		HashSet obj=new HashSet();
		obj.add(false);
		obj.add(true);
		obj.add("Bye");
		obj.add(false);
		obj.add("Hello");
		obj.add(15);
		obj.add('a');
		
		for (Object object : obj) {
			System.out.println(object);
		}
		

	}

}
