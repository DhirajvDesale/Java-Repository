package ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("hello");
		obj.add('a');
		obj.add(2);
		obj.add("hai");
		System.out.println(obj);
		obj.remove(Integer.valueOf(2));
		System.out.println(obj);

	}

}
