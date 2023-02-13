package Method_Overriding;

public class Forest {

	public static void main(String[] args) {
		Rabit r= new Rabit();//object create for child class
		r.eat();
		
		Animal a=r;//upcasting rabit to animal
		a.eat();

	}

}
