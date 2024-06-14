 class Demo4{
	public static void main(String [] args){
		int row =3;
		int num =65;
		for(int i=1;i<=row;i++){
			for(int j =1;j<=row;j++){
				System.out.print((char)num + " " );
				num= num+2;
			}
			System.out.println();
		}
	}
}

