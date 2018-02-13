package polymorphism;

public class BasicVariant extends CarWebsite implements CommercialUse {
	
	
	
	public void powerWindows(){
		System.out.println("Power Windows are not present");
	}
	
	public void sunroof(){
		System.out.println("Sunroof is not present");
	}

	@Override
	public void extraRegistrationFees() {
		System.out.println("Extra registration Fees = $2000");
		
	}
	
	//CarWebsite basicBMW = new BasicVariant();
	
	
	//CommercialUse basicBMWVariant = new BasicVariant();

}
