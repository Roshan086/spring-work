package spring_autowiring_qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("heartObject")
	private Heart heart;
	
	public void calling() {
		if(heart==null) {
			System.out.println("Sorry you are dead");
		}else {
			heart.display();
			System.out.println("He is "+heart.getName() +" and the no heart for "+heart.getName()+" is "+heart.getNoOfHeart());
		}
	}
}
