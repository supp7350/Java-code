class Demo9{
	public static void main (String [] args){
		int num =214367689;
		int oddcount =0;
		int evencount=0;
		while (num!=0){
			if(num%2==1){
				oddcount++;
			}else{
				evencount++;
			}
			num/=10;
		}
		System.out.println("Odd Count : "+ oddcount);
		System.out.println("Even Count : "+ evencount);
	}
}

