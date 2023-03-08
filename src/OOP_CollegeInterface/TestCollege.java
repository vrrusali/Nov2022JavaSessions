package OOP_CollegeInterface;

public class TestCollege {

	public static void main(String[] args) {
		College1 c= new College1();
		
		c.MITCambridge();
		c.KelloggEvanston();
		c.UCLALosAngeles();
		c.OxFord();
		c.CambridgeUniversity();
		c.LondonBS();
		c.PuneUniversity();
		c.MumbaiUniversity();
		c.IIMAhmedabad();
		c.IIMCalcutta();
		c.StanfordUniversity();
		c.ColumbiaUniversity();
		c.MBA();
		
		//NA
		//USUniversity us= new USUniversity();
		
		//top casting:
		//child class object can be referred by parent interface ref variable
	
		USUniversity us=new College1();
		us.MITCambridge();
		us.UCLALosAngeles();
		us.KelloggEvanston();
		us.MBA();
		
		UKUniversity uk= new College1();
		uk.CambridgeUniversity();
		uk.LondonBS();
		uk.OxFord();
		uk.MBA();
				
		IndiaUniversity IND= new College1();
		IND.PuneUniversity();
		IND.MumbaiUniversity();
		IND.MBA();
		
	}

}
