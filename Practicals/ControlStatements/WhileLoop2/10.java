 class Demo10{
	public static void main(String [] args){
		int num = 9367924;
		int num1=0;
		int num2=1;
		while (num!=0){
			if (num %2==1){
				num1=num1 +(num%10);
			}else {
				num2 = num2 *(num%10);
			}
			num /=10;
		}
		System.out.println("Sum of odd digits : " + num1);
		System.out.println("Product of even digits : "+ num2);
	}
}

