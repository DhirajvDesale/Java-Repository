package Object;

public class Emp {
	int Eid;
	Emp(){
		
	}
	Emp(int id){
		this.Eid=id;
	}
	public String tostring() {	//o override parent class method
		return "Tys"+Eid;
	}

}
