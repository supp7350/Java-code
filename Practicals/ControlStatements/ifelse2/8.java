 class Grade {
	public static void main (String [] args){
		float marks = 47.7f;

		if (marks >= 75.0 && marks <=100.0){
			System.out.println("First class with distinction");
		} else if (marks < 75.0 && marks >= 60.0){
	
			System.out.println("First class");
		} else if (marks < 60.0 && marks >= 50.0){
			System.out.println("Second  class");
				
		} else if (marks < 50 && marks >= 35){
			System.out.println("Pass");
		} else if(marks < 35 && marks >=0) {
			System.out.println("Fail");
		} else {
			System.out.println("Please insert persent between 0 to 100");
		
		}

}

}

