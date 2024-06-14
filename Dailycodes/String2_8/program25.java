class StringDemo{
        public static void main(String[] args){
                String str1 = new String("Shashi");
                String str2 = new String("Core2Web");
                String str3 = new String("Shashi");

                System.out.println(System.identityHashCode(str1));                                                                                                          System.out.println(System.identityHashCode(str2));                                                                                                          System.out.println(System.identityHashCode(str3));
        }
}     
