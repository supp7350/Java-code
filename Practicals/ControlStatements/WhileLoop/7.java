 class Demo7{
	public static void main(String args []){
		int count =0;
		int num=93079224;
		while(num!=0){
			num/=10;
			count++;
		}
		System.out.println("Count of digits = "+count);
	}
}

