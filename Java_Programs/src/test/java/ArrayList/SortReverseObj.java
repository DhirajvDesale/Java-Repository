package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortReverseObj {

	public static void main(String[] args) {
		HashSet<Integer>obj=new HashSet<Integer>();
		obj.add(1);
		obj.add(3);
		obj.add(2);
		
		ArrayList obj1=new ArrayList(obj);
		Collections.sort(obj1);
		for (Object var : obj1) {
			System.out.println(var);
		}
		
		Collections.reverse(obj1);
		for (Object object1 : obj1) {
			System.out.println(object1);
		}

	}

}
