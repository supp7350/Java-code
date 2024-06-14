class Demo10{
	public static void main (String [] args){
		long num =9307922405L;
		long sum =0;
		while (num!=0){
			sum = sum +(num%10);
			num/=10;
		}
		System.out.println("sum of digits in 99307922405 is " + sum  );
	}
}

