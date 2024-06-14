class code9{
	public static void main(String[] args){
		int num=214367689;
		int counte=0;
		int counto=0;
		while(num>0){
			int rem=num %10;
			num=num/10;
			if (rem%2 ==0)
				counte++;

			else
				counto++;
		}
		System.out.println("EVEN NUMBER = "+ counte);
		 
                System.out.println("EVEN NUMBER = "+ counte);	
	}
}
