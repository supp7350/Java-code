 class Demo7{
	public static void main(String [] args){
		int num = 256985;
		int num1=0;
		System.out.print("Output : ");
		while(num!=0){
			if (num%2==0){
			  	num1 = num1+(num%10);
			}
			num/=10; 
		}
		System.out.print(num1);
		System.out.println();
	}
}

