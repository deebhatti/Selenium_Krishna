package demo2;

public class Calculator {
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public void add(double a, double b){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		basicCal.add(5, 10);
		basicCal.add(10.23,5.63);
	}

}
