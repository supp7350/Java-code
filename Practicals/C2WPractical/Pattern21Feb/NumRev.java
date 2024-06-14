class NumRev {
        public static void main(String[] args) {
                int row=3;
		int num = row*row;
                for(int i = 1 ;i <= 3 ;i++) {
                        for(int j= 1 ;j <= 3; j++) {
                                System.out.print(num-- + " ");
                        }
                        System.out.println();
                }
        }
}
