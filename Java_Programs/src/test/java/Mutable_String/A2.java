package Mutable_String;

public class A2 {

	public static void main(String[] args) {
		StringBuilder s1,s2;
		s1=new StringBuilder("hello");
		System.out.println(s1);
		s2=s1;
		System.out.println(s2);
		s1.append("_world");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
