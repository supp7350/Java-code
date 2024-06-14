
class Trip{

	public static void main(String[] args){

		int budget=22000;
		if(budget>=0 && budget<=5000){
			System.out.println("Trip should go to Lonavala");
		}
		else if(budget>5000 && budget<=10000){
			System.out.println("Trip should go to Goa");
		}
		else if (budget>10000 && budget<=15000){
			System.out.println("Trip should go to Ujjain");
		}
		else if(budget>15000 && budget<=20000){
			System.out.println("Trip should go to Manali");
		}
		else if(budget>20000 && budget<=25000){
			System.out.println("Trip should go to Kedarnath");
		}
		else{
			System.out.println("Please enter amount less than 25000");
		}
	}

}

