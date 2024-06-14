class Demo3{
	public static void main(String [] args){
		int num = 436780521;
		int num1 =0;
		System.out.print("Digits divisible by 3 or 2 are : ");
		while(num!=0){
			num1 = num%10;
			if (num1%3==0||num1%2==0){
				if(num1>0){
					System.out.print(num1 + " ");
				}
			}
			num/=10; 
		}
			System.out.println();
	}
}

