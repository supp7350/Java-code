 class Demo6{
	public static void main(String [] args){
		int row =4;
		for(int i=1;i<=row;i++){
			char ch ='A';
			for(int j =1;j<=row;j++){
				System.out.print(""+j+ch + " " );
				ch++;
			}
			System.out.println();
		}
	}
}

