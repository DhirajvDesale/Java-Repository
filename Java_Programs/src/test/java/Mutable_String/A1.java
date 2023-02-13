package Mutable_String;

public class A1 {

	public static void main(String[] args) {
		StringBuffer s1,s2;
		s1=new StringBuffer("Hello");
		System.out.println(s1);
		s2=s1;
		System.out.println(s2);
		s1.append("_world");
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
