class PrintNums{
	public static void main(String [] args){
		for(int i=1;i<=100;i++){
			if(i%2==0||i%3==0||i%4==0||i%5==0){
				continue;
			}
			
			System.out.println(i+" ");
		}
	}
}

