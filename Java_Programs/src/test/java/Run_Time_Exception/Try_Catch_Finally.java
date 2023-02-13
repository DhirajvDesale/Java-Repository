package Run_Time_Exception;

public class Try_Catch_Finally {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		System.out.println("Open the browser");
		try {
			int res=a/b;
		} catch (Exception obj) {
			System.out.println(obj);
		}finally {
			System.out.println("close the browser");
		}
		System.out.println("end");
	}

}
