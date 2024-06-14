class JVMInternal{
        public static void main(String[] args){
                int x = 100;
                int y = 110;
                int z = 100;
                int a = 128;
                int b = 128;
                System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(x));                                                                                                             System.out.println(System.identityHashCode(y));                                                                                                             System.out.println(System.identityHashCode(z));
        }
}   
