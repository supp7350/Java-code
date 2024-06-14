class code8{
        public static void main(String[] args){
                int num=216985;
		int cnt=0;
		//while(num>0){
		int rem=num %10;
		num=num/10;
		//while(num>0){
		if(rem % 2 !=0){
			System.out.println(rem);
			cnt++;
//		}
		System.out.println(cnt);
	}
}
}
