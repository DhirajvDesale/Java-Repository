package Mutable_String;

public class A3 {

	public static void main(String[] args) {
		String s1,s2;
		s1=new String("hello");
		System.out.println(s1);
		s2=s1;
		String s3=s1.concat("_world");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
