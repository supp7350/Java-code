 class Demo8{
	public static void main(String [] args){
		int num = 256985;
		int num1=1;
		System.out.print("Product of odd digits : ");
		while(num!=0){
			if (num%2==1){
			  	num1 = num1*(num%10);
			}
			num/=10; 
		}
		System.out.print(num1);
		System.out.println();
	}
}

