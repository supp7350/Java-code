 class Demo3{
	public static void main(String [] args ){
		
		int num1=4;
		int num2=7;
		System.out.print("Number divisible by 4 and 7 are - ");
		
		int i=50;
		while(i<=100){
			if(i%4==0 && i%7==0){
				System.out.print(i + ",");
			}
		i++;
		}
		System.out.println();
	}
}

