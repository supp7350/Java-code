 class Demo7{
	public static void main(String [] args){
		int row =3;
		for(int i=row;i>=1;i--){
			int num = row;
			for(int j =row;j>=1;j--){
				System.out.print((char)(num+96) + " " );
				num--;
			}
			System.out.println();
		}
	}
}

