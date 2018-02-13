package demo;

public class Human {
	
	String color ;
	int age;
	String gender;
	
	public Human(){
		color = "Brown";
		age = 30;
		gender = "Male";
	}
	
	public Human(String color, int age, String gender){
		this.color = color;
		this.age = age;
		this.gender = gender;
	}
	
	public void printDetails(){
		System.out.println("Color  = " + color + " Age = " + age + " Gender = " + gender);
	}
	
	public static void main(String[] args) {
		Human Tim = new Human("Brown",15,"Male");
		
		Human Paul = new Human("White",29,"Male");
		
		Human UncleSam = new Human("White",76,"Male");
		
		Human Sita = new Human("Brown",26,"Female");
		
		Human Ram = new Human();
		
		Human Deepinder = new Human();
		
		Tim.printDetails();
		
	}
	

}
