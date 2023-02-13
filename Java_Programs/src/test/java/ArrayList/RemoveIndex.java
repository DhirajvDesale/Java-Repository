package ArrayList;

import java.util.ArrayList;

public class RemoveIndex {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("Hello");
		obj.add('a');
		obj.add(2);
		obj.add("hai");
		System.out.println(obj);
		obj.remove(1);
		System.out.println(obj);
	}

}
