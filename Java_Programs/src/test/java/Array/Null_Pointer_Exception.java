package Array;

public class Null_Pointer_Exception {

	public static void main(String[] args) {
		int[] a=new int[2];
		System.out.println(a);
		System.out.println(a.length);
		
		int[] b;
		b=null;
		System.out.println(b);
		System.out.println(b.length);

	}

}
