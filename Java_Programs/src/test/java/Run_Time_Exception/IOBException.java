package Run_Time_Exception;

import java.util.ArrayList;

public class IOBException {

	public static void main(String[] args) {
		ArrayList obj=new ArrayList();
		obj.add("Hello");
		obj.add(25);
		obj.add(true);
		System.out.println(obj);
		
		for (int i = 0; i <=obj.size(); i++) {
			System.out.println(obj.get(i));
		}

	}

}
