package polymorphism;

public class MiddleVariant extends CarWebsite implements CommercialUse{

	

	@Override
	public void powerWindows() {
		System.out.println("Power Windows are also present");
		
	}

	@Override
	public void sunroof() {
		System.out.println("Sunroof is not present");
		
	}

	@Override
	public void extraRegistrationFees() {
		System.out.println("Extra registration Fees = $2200");
		
	}

}
