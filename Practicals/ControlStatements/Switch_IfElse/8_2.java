class Demo8i{
	public static void main(String [] args){
		int num1=3;
		int num2=-4;
		int num3;

		if(num1>0&&num2>0){
			num3=num1*num2;

			switch(num3%2){
				case 0 :
					System.out.println("Even");
					break;
				case 1 :
					System.out.println("Odd");
					break;
			}
		}else {
			System.out.println("Sorry negative numbers not allowed ");
		}
	}
}

