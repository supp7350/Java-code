class NorRev {
        public static void main(String[] args) {
                for(int i =1 ;i <= 6 ;i++) {
                        int num = 3;
                        for(int j=1 ;j<=3; j++) {
                                if(i%2==0)
                                {
                                        System.out.print(num+" ");
                                        num--;
                                }else{
                                        System.out.print(j+" ");
                                }
                        }
                        System.out.println();
                }
        }
}
