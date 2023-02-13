package ArrayList;

import java.util.ArrayList;

public class A5 {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(13);
		obj.add(25);
		obj.add(50);
		for (int i = 0; i < obj.size(); i++) {
			System.out.println(obj.get(i));
		}
	}

}
