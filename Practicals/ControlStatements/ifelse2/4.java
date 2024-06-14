 class Marks {
	public static void main(String [] args){
		
		float marks  = 85.63f;

		if(marks > 85.0){
			System.out.println("Medical");
		} else if (marks <= 85 && marks >= 75) {
			System.out.println("Engneering");
		} else if (marks <= 75 && marks >=65){
			System.out.println("Pharmacy or bachelor in science");
		} else {
			System.out.println("At home");
		}
	}
}

