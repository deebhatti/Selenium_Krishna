package demo;

public class Test {
	
	public void day(){
		System.out.println("Today is Thursday");
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();
		Test obj = new Test();
		
		basicCal.add(20, 30);
		obj.day();
	}

}
