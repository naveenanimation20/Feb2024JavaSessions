package OOPInterface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.physioServices();
		fh.physioServices(10);
		fh.dentalServices();
		fh.oncologyServices();
		fh.gastroServices();
		fh.neuroServices();
		fh.gynecServices();

		fh.emergencyServices();

		fh.medicalTraining();
		fh.pathologoyServices();
		
		System.out.println(USMedical.MIN_FEE);
		System.out.println(FortisHospital.MIN_FEE);
		
		USMedical.billing();
		FortisHospital.billing();
		
		fh.helpDesk();
		fh.covidVaccination();
		
		fh.medicalNews();
		fh.medicalRND();
		fh.medicalFunding();
		
		

		// top casting:
		// child class object can be referred by parent interface ref variable:
		
		USMedical us = 	new FortisHospital();
		us.oncologyServices();
		us.physioServices();
		us.dentalServices();
		us.emergencyServices();
		
		
		UKMedical uk = (UKMedical)us;
		uk.gynecServices();
				
		
		WHO wh = (WHO)us;
		wh.covidVaccination();
		
		
		//down casting:
		//FortisHospital f = new USMedical();
		
		
		

	}

}
