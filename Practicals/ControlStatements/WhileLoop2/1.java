class Demo1{
	public static void main(String [] args){
		int num = 2569185;
		System.out.print("Digits divisible by 2 are : ");
		while(num!=0){
			if(num%2==0){
				System.out.print( num%10 + " ");
			}
			num/=10; 
		}
			System.out.println();
	}
}

