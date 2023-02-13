package ArrayList;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add(true);
		obj.add("Hello");
		obj.add('a');
		obj.add(3);
		obj.add("hai");
		System.out.println(obj);
		obj.remove("Hello");
		System.out.println(obj);

	}

}
