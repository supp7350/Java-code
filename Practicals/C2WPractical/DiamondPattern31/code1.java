class code1{
	public static void main(String[] args){
		int row=4;
		int col=0;
	//	while(i<=(2*row)-1){
			for(int i=1;i<=row;i++){
			//int col=0;
			if(i<=row)
				col=row-i;
			else
				col=i-row;
		 while(i<=(2*row)-1){
			for (int sp=1;sp<=col;sp++){
			System.out.print(" ");
		}
	
		int h=0;
		for(int j=1;j<=(h+i);h++){
			System.out.print("@");
		h++;
		}
			}
		}

	}
}
