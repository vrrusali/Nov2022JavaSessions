package OOP_Interface;

public interface USMedical extends WHO,USHG {

	// in Interface:
		// can not have the methods body -- abstract methods
		// only method declaration - no business logic
		// only method prototype

		// can not create the Object of Interface
		// can not have const... of the interface
		
		public void cardioServices();

		public void neuroServices();

		public void physioServices();

		public void emergencyServices();
		
		
		@Override
		public void covidVaccination();

		// main()???

}

