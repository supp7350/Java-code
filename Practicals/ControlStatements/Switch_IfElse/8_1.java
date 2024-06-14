class Demo8{
	public static void main(String [] args){
		int num1=3;
		int num2=-4;
		int num3;
		if(num1>0&&num2>0){
			num3=num1*num2;
			if(num3%2==0){	
				System.out.println("Number is even");
			}else{
				System.out.println("Number is odd");
			}
		}else {
			System.out.println("Sorry negative nnumber is not allowed");
		}	
	}
}

