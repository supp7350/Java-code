class NestedDemo{
	public static void main(String[] args){
		for(int i = 1; i<=4; i++){
			char ch1 = 'A';
			char ch2 = 'a';
			for(int j = 1; j<=4; j++){
				if(i%2==0){
					System.out.print(ch2++ + " ");
				}else{
					System.out.print(ch1++ + " ");
				}
			}
			System.out.println();
		}
	}
}

