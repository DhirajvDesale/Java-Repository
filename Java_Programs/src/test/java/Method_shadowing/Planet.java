package Method_shadowing;

public class Planet {

	public static void main(String[] args) {
		Rabit r=new Rabit();
		r.eat();
		Animal a=r;
		a.eat();

	}

}
