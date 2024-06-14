class NumFor{
	public static void main (String [] args){
		int num=23456789;
		for ( ;num!=0;num/=10){
			int temp=num%10;
			if(temp%2==0){
				System.out.println(temp*temp+" ");
			}
		}
	}
}

