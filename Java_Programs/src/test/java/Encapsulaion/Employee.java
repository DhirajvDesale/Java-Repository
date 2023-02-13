package Encapsulaion;

public class Employee {
	String Ename;
	int Eid;
	private double Esal;
	
	//Getter method for Esal
	public double getsal() {
		return Esal;
	}
	
	//setter method Esal
	public void setSal(double sal) {
		this.Esal=sal;
	}
	Employee(){
	
	}
	Employee(String name,int id,double sal){
		this.Ename=name;
		this.Eid=id;
		this.Esal=sal;
	}
	public void work() {
		System.out.println("emp "+Ename+"is working");
	}
	public void display() {
		System.out.println("ename=="+Ename);
		System.out.println("eid=="+Eid);
		System.out.println("esal=="+Esal);
	}
}
