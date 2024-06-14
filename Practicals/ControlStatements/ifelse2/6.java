 class Voter{
	public static void main(String args[]){
		int num =  21;

		if (num >0 && num>= 18) {
			System.out.println("Valid age for voting" );
		} else if (num> 0 && num < 18) {
			System.out.println("Valid age but not for  voting" );
		} else  {
			System.out.println("Not valid age" );
	
		}
	}

}

