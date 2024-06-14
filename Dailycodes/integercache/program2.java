class JVMInternal{
        public static void main(String[] args){
                int x = 10;
                int y = 10;
                int z = 10;
                int a = 20;
                int b = 20;
                System.out.println(System.identityHashCode(x));                                                                                                             System.out.println(System.identityHashCode(y));                                                                                                             System.out.println(System.identityHashCode(z));
                System.out.println(System.identityHashCode(a));                                                                                                             System.out.println(System.identityHashCode(y));                                                                                                             System.out.println(System.identityHashCode(z));
                System.out.println(System.identityHashCode(b));                                                                                                             System.out.println(System.identityHashCode(y));                                                                                                             System.out.println(System.identityHashCode(z));
        }
}   
