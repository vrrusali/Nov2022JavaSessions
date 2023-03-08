package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
			FortisHospital fh = new FortisHospital();
			
			fh.cardioServices();
			fh.neuroServices();
			fh.physioServices();
			fh.entServices();
			fh.dentalServices();
			fh.oncologyServices();
			
			fh.emergencyServices();
			
			fh.medicalInsurance();
			fh.medicalTraining();
			fh.medicalRD();
			fh.medicalNews();
			fh.covidVaccination();
			
			
			//NA
			//USMedical us = new USMedical();
			
			//top casting:
			//child class object can be referred by parent interface ref variable
			
			USMedical us = new FortisHospital();
			us.cardioServices();
			us.neuroServices();
			us.physioServices();
			us.emergencyServices();
			
			UKMedical uk = new FortisHospital();
			uk.dentalServices();
			uk.entServices();
			uk.emergencyServices();

			IndianMedical in = new FortisHospital();
			in.orthoServices();
			in.oncologyServices();
			in.gynicServices();
			in.emergencyServices();
			
			
			//down casting? at the compile time?
			//FortisHospital fh1 = new USMedical();
			
	}

}
