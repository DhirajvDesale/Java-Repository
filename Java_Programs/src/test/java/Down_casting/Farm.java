package Down_casting;

public class Farm {

	public static void main(String[] args) {
		Vegi v=new RedChilly();//ref variable for parent and object created by child class only 
		v.grow();
	  //v.spicy();CTE
	  //v.color();CTE
		
		Chilly c=(Chilly)v;//down-casting vegi to chilly
		c.spicy();
		c.grow();
	//c.color(); CTE
		
		RedChilly r=(RedChilly)c;//downcasting from chilly to red chilly
		r.color();
		r.spicy();
		r.grow();
		
		

	}

}
