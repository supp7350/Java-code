class DivisibleCheck{
	public static void main (String args[]){
	 int num = 21;
 		
	if (num%3==0 && num%7==0 ){
		System.out.println("Number is Divisible by 3&7");
}
		else if (num%3 == 0){
			System.out.println("Number is Divisible by 3");
}
		else if (num%7==0){
			System.out.println("Number is Divisible by 7");
			

}
		else {
			System.out.println("Neither  Divisible by3 nor by 7");
			
}
}

}

