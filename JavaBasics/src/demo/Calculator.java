package demo;

public class Calculator {
	
	public Calculator(){
		
	}
	
	public int add(int a, int b) {
		return (a+b);
	}

	public void sub(int a, int b) {
		System.out.println(a - b);
	}

	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {

		Calculator basicCal = new Calculator();

			
		System.out.println(basicCal.add(10, 20));
		
		
		
		basicCal.sub(20, 5);
		basicCal.multiply(20, 4);

		basicCal.divide(100, 10);

		

	}

}
