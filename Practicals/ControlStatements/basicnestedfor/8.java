 class Demo8{
	public static void main(String [] args){
		int row =3;
		int num1 =1;
		for(int i=row;i>=1;i--){
			int num = row;
			for(int j =row;j>=1;j--){
				System.out.print("" +(char)(num+64) + num1 +" " );
				num1++;
			}
			System.out.println();
		}
	}
}

