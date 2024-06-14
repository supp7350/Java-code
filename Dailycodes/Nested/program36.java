class NestedDemo{
        public static void main(String[] args){
                for(int i = 1; i<=3; i++){
                        char ch = 'a';
                        for(int j = 1;j<=3;j++){
                                System.out.print((int)ch + " ");
				ch++;

                        }
                        System.out.println();
                }
        }
}
