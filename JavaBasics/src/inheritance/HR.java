package inheritance;

public class HR extends Management {
	
	
	
	int bonus = 12000;
	
	public static void main(String[] args) {
		HR John = new HR();
		
		System.out.println("Bonus of John = $ " + John.bonus);
		System.out.println("Salary of John = $ " + John.salary);
		
		John.day();
		
		John.message();
	}

}
