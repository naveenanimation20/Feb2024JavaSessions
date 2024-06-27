package OOPInterface;

public class FortisHospital extends Hospital implements USMedical, UKMedical, IndianMedical {

	static final int MIN_FEE = 50;

	// US
	@Override
	public void physioServices() {
		System.out.println("FH -- physioServices");
	}

	@Override
	public void physioServices(int a) {
		System.out.println("FH -- physioServices " + a);

	}

	@Override
	public void oncologyServices() {
		System.out.println("FH -- oncologyServices");

	}

	@Override
	public void dentalServices() {
		System.out.println("FH -- dentalServices");

	}

	@Override
	public void ENTServices() {
		System.out.println("FH -- ENTServices");

	}

	
	// UK
	@Override
	public void gynecServices() {
		System.out.println("FH -- gynecServices");

	}

	@Override
	public void gastroServices() {
		System.out.println("FH -- gastroServices");

	}

	// India
	@Override
	public void pediaServices() {
		System.out.println("FH -- pediaServices");

	}

	@Override
	public void neuroServices() {
		System.out.println("FH -- neuroServices");

	}

	// common
	@Override
	public void emergencyServices() {
		System.out.println("FH -- emergencyServices");

	}

	// Individual Methods:
	public void medicalTraining() {
		System.out.println("FH -- medical training");
	}

	public void pathologoyServices() {
		System.out.println("FH -- pathologoyServices");
	}

	// method hiding
	public static void billing() {
		System.out.println("FH -- billing");
	}

	// WHO
	@Override
	public void covidVaccination() {
		System.out.println("FH -- covidVaccination");
	}

	@Override
	public void helpDesk() {
		System.out.println("FH -- helpDesk");
	}

	// Hospital
	@Override
	public void medicalRND() {
		System.out.println("FH Medical RND");
	}

	@Override
	public void bloodTesting() {

	}

	@Override
	public int testing(int a) {
		// TODO Auto-generated method stub
		return a+100;
	}


}
