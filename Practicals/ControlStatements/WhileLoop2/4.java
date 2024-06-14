class Demo4{
	public static void main(String [] args){
		int num = 256985;
		int num1 =0;
		System.out.print("Output : ");
		while(num!=0){
			num1 = num%10;
			if (num1%2==1){
				System.out.print(num1*num1 + " ");
			}
			num/=10; 
		}
			System.out.println();
	}
}

