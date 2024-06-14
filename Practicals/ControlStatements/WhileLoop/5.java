class Demo5{
	public static void main(String args [] ){
		int num = 1;
		int row =4;
		int i=1;
		while(i<=row){
			int j=1;
			while( j<=row ){
				System.out.print(num + " ");
				num = num+2;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}		

