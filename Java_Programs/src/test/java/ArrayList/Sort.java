package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(1);
		obj.add(4);
		obj.add(2);
		obj.add(7);
		obj.add(3);
		
		Collections.sort(obj);
		for (Integer var : obj) {
			System.out.println(var);
		}
		
		Collections.reverse(obj);
		for (Integer var1 : obj) {
			System.out.println(var1);
		}

	}

}
