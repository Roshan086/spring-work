package spring_autowiring_qualifier;

public class Heart {
	private int noOfHeart;
	private String name;


	public int getNoOfHeart() {
		return noOfHeart;
	}


	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void display() {
		System.out.print("you are alive your ");
		System.out.println("Heart is pumping");
	}
}
