class Demo4{
	public static void main(String args []){
		int num =1;
		while(num <=6){
			if(num%2==1){
				System.out.print((char)(num+64) + " ");
			}else {
				System.out.print(num + " ");
			}
	 		num++;
		}
		System.out.println();
	}
}

