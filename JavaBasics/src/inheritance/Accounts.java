package inheritance;

public class Accounts extends Management {
	
	
	
	int bonus = 8000;
	
	public void message(){
		System.out.println("From next month onwards, everyone will get 1 WFHs");
	}
	
	public static void main(String[] args) {
		Accounts Paul = new Accounts();
		Paul.message();
	}

}
