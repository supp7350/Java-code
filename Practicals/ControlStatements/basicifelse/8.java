class DivisiblityCheck{
	public static void main(String [] args){
	
		int num =10;
	
		if (num%2==0 && num%5==0 && num%10==0){
			System.out.println(num + "Is Number Divisible by 2,5,10");
		} else if (num%2==0){
			System.out.println(num + "Is Number Divisible by only 2");
		} else if (num%5 == 0){
			System.out.println(num + "Is Number Divisible by only 5");
		} else {
			System.out.println(num + "Is Number not Divisible by 2,5,10");
		}
	}

}

