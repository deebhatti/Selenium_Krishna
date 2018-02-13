package polymorphism;

public class Test {
	
	public static void main(String[] args) {
		CarWebsite basicBMW = new BasicVariant();
		CarWebsite midleVariantBMW = new MiddleVariant();
		CarWebsite topEndBMW = new TopEndVariant();
		
		basicBMW.airbags();
		basicBMW.powerWindows();
		basicBMW.sunroof();
		
//		midleVariantBMW.airbags();
//		midleVariantBMW.powerWindows();
//		midleVariantBMW.sunroof();
		
		CommercialUse basicBMWVariant = new BasicVariant();
		
		basicBMWVariant.extraRegistrationFees();
		
	
		
		
		
	}
	

}
