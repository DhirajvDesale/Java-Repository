package Run_Time_Exception;

public class Try_With_Multiple_catch {

	public static void main(String[] args) {
		int a=4;
		int b=0;
		System.out.println(1);
		try {
			int res=a/b;
		} catch (NullPointerException e) {
			System.out.println(e);
		}catch (Exception obj) {
			System.out.println(obj);
		}
		System.out.println(2);

	}

}
