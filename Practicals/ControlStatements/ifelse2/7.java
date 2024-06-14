 class Profitloss{
	public static void main (String [] args){
		int SP = 1000;
		int CP = 1000;

		if (SP > CP ){
			System.out.println(" Profit of  " + (SP-CP) );

		}  else if (SP < CP ) {
			System.out.println(" In loss " + (CP-SP)  );
			
		} else {
			System.out.println(" No loss No profit"  );
			
	
		}
	}


} 

