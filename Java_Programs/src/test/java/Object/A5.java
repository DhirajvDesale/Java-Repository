package Object;

public class A5 {
	int n;
	A5(){
		
	}
	A5(int a){
		this.n=a;
	
	}
	public int hashcode() {
		int res=0;
		res=res+n;
		return res;
	}

}
