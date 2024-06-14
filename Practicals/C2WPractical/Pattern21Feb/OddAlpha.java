class OddAlpha {
        public static void main(String[] args) {
                int num=1;
                for(int i = 1 ;i <= 4 ;i++) {
                        for(int j= 1 ;j <= 3; j++) {
                                if(num%2==0 ){
					System.out.print(num+" ");
                                }else{
                                        System.out.print((char)(64+num) + " ");
                                }
                                num++;
                        }
                        System.out.println();
                }
        }
}
