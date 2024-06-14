class code10{
	public static void main(String[] args){
		long num =9307922405l;
		int y=0;

		while (num>0){
		long rem=num %10;
			 num=num/10;
			y+=rem;
		}
		System.out.println(y);
	}
}
