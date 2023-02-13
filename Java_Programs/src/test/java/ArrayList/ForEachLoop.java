package ArrayList;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(12);
		obj.add("Hello");
		obj.add(true);
		
		for (Object var : obj) {
			System.out.println(var);
		}

	}

}
