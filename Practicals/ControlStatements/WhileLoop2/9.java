 class Demo9{
	public static void main(String [] args){
		int num = 2469185;
		int num1=0;
		int num2=0;
		System.out.print("Output: ");
		while(num!=0){
			if (num%2==1){
			  	num1 = num%10;
				num1 = num1*num1;
				num2=num1+num2;
			}
			num/=10; 

		}
		System.out.print(num2);
		System.out.println();
	}
}

