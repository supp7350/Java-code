 class Demo10{
	public static void main(String [] args){
		int row =4;
		int num =1;
		for(int i=1;i<=row;i++){ 
			for(int j =1;j<=row;j++){
				System.out.print(num + " " );
				num++;
			}
			num =num -row;
			num++;
			System.out.println();
		}
	}
}

