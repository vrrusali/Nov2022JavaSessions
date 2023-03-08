package OOP_CollegeInterface;

public class College1 extends CentralUniversity implements USUniversity, UKUniversity, IndiaUniversity{
//US
	@Override
	public void MITCambridge() {
	  System.out.println("College1- MITCambridge");
	}

	@Override
	public void KelloggEvanston() {
		System.out.println("College1- KelloggEvanston");
	}

	@Override
	public void UCLALosAngeles() {
		System.out.println("College1- UCLALosAngeles");
		
	}
//WorlWideUniversity
	@Override
	public void Harvard() {
		System.out.println("College1- Harvard");
		
	}
	
	//India
	@Override
	public void PuneUniversity() {
		System.out.println("College1- PuneUniversity");
	}

	@Override
	public void MumbaiUniversity() {
		System.out.println("College1- MumbaiUniversity");
	}

	//UK
	@Override
	public void LondonBS() {
		System.out.println("College1- LondonBS");
	}

	@Override
	public void CambridgeUniversity() {
		System.out.println("College1- CambridgeUniversity");		
	}

	@Override
	public void OxFord() {
		System.out.println("College1- OxFord");
		
	}
	
		
	// Common
	public void MBA() {
		System.out.println("College1-MBA");
	}
	
	
	// Individual
	public void IIMAhmedabad() {
		System.out.println("College1- Individual- IIM Ahmedabad-topcollege");
		
	}
	
	public void IIMCalcutta() {
		System.out.println("College1- Individual- Calcutta-topcollege");
	}
	
	
	
			

}
