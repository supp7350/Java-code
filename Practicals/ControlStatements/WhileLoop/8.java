class Demo8{
	public static void main (String [] args){
		int num =216985;
		while (num!=0){
			if(num%2==1){
				System.out.print(num%10+ " ");
			}
			num/=10;
		}
		System.out.println();
	}
}

