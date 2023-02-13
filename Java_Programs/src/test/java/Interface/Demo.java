package Interface;

public class Demo {

	public static void main(String[] args) {
		C c=new C();	//object created for child c
		c.test();
		c.key();
		
		A a=c;	//upcasting from c to a
		a.test();
		
		C c1=(C)a;	//downcasting fro A to c
		c1.test();
		c1.key();
		
		B b=c;	//upcasting from C to B
		b.key();
		
		C c2=(C)b;	//downcsting from B to c
		c2.test();
		c2.key();
		
		B b1=(B)a;	//explicite from A to B
		b1.key();
		
		A a1=(A)b;	//explicite from B to A
		a1.test();
		
		

	}

}
