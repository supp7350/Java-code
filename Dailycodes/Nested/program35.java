class NestedDemo{
        public static void main(String[] args){
                for(int i = 1; i<=3; i++){
                        int ch = 65;
                        for(int j = 1;j<=3;j++){
                                System.out.print((char)ch + " ");
				ch++;
                        }
                        System.out.println();
                }
        }
}
