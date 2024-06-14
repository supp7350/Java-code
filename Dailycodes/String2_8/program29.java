class StringDemo{
        public static void main(String[] args){
                String str1 = "Badhe";
                String str2 = "Rahul";
                String str3 = str1 + str2;
                String str4 = new String("BadheRahul");

                System.out.println(System.identityHashCode(str1));                                                                                                          System.out.println(System.identityHashCode(str2));                                                                                                          System.out.println(System.identityHashCode(str3));                                                                                                          System.out.println(System.identityHashCode(str4));
        }
} 
