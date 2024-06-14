class Demo2{
	public static void main(String [] args){
		int num = 2569185;
		int num1 =0;
		System.out.print("Digits not divisible by 3 are : ");
		while(num!=0){
			num1 = num%10;
			if (num1%3 !=0){
				System.out.print(num1 + " ");
			}
			num/=10; 
		}
			System.out.println();
	}
}

