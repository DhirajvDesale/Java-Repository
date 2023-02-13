package String;

public class A5 {

	public static void main(String[] args) {
		String s1="apple";
		String s2="apple";
		String s3=new String("apple");
		String s4=new String("apple");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s2==s4);

	}

}
