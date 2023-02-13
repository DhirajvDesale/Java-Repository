package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListWithIterator {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add(1);
		obj.add("hello");
		obj.add('a');
		
		Iterator var=obj.iterator();
		while(var.hasNext()) {
			System.out.println(var.next());
		}
	}

}
