package Up_Casting;

public class Planet {

	public static void main(String[] args) {
		PersionCat p=new PersionCat();
		p.lazy();
		p.eat();
		p.walk();
		
		Cat c=p;	//upcasting
		c.eat();
		c.walk();
	//  c.lazy(); //compile time error
		
		Animal a=p;
		a.walk();
		//a.eat(); CTE
		//a.lazy(); CTE
		

	}

}
