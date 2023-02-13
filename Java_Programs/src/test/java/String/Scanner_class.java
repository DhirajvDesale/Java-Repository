package String;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a string==");
		String s1=obj.nextLine();
		String[] s2=s1.split(" ") ;
		for (int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}

	}

}
