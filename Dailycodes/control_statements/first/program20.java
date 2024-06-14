class SwitchDemo{
	public static void main(String[] args){
		String friends = "Supradnya";
		System.out.println("BEFORE SWITCH");
		switch(friends){
			case"Anuja":
				System.out.println("Barclays");
				break;

			case"Supradnya":
				System.out.println("BMC Software");
				break;

			case"pratiksha":
				System.out.println("Infosys");
				break;

			case"Sonali":
				System.out.println("IBM");
				break;

			default:
				System.out.println("Default state");

		}
		System.out.println("AFTER SWITCH");

	}
}
