package OOP_Interface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical{
	// US
		@Override
		public void cardioServices() {
			System.out.println("FH - cardioServices");
		}

		@Override
		public void neuroServices() {
			System.out.println("FH - cadioSerneuroServicesvices");

		}

		@Override
		public void physioServices() {
			System.out.println("FH - physioServices");

		}

		// UK
		@Override
		public void entServices() {
			System.out.println("FH - entServices");

		}

		@Override
		public void dentalServices() {
			System.out.println("FH - dentalServices");

		}

		// India
		@Override
		public void oncologyServices() {
			System.out.println("FH - oncologyServices");

		}

		@Override
		public void gynicServices() {
			System.out.println("FH - gynicServices");

		}

		@Override
		public void orthoServices() {
			System.out.println("FH - orthoServices");

		}

		// common:
		@Override
		public void emergencyServices() {
			System.out.println("FH - emergencyServices");
		}

		// individual:
		public void medicalTraining() {
			System.out.println("FH -Individual- medical training");
		}

		public void medicalInsurance() {
			System.out.println("FH -Individual- medical Insurance");
		}

//		//WHO:
				
		@Override
		public void covidVaccination() {
			System.out.println("FH -- covidVaccination");
		}

		//USHG
		@Override
		public void childCareServices() {
			System.out.println("FH -- childCareServices");
			
		}


}
