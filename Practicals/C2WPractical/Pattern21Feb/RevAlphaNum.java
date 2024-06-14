class RevAlphaNum {
        public static void main(String[] args) {
		char ch = 'A';
                for(int i = 9 ;i <= 1 ;i--,ch++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}else{
				System.out.print(ch+ " ");
			}
		}
		System.out.println();
        }
}
