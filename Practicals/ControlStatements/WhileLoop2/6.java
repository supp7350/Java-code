 class Demo6{
	public static void main(String [] args){
		int num = 234;
		int num1=1;
		System.out.print("Output : ");
		while(num!=0){
			num1 = num1*(num%10);
			num/=10; 
		}
		System.out.print(num1);
		System.out.println();
	}
}

