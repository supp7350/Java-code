class StringBufferDemo{
        public static void main(String[] args){
                StringBuffer sb = new StringBuffer("Shashi");
                System.out.println(sb);
                System.out.println(System.identityHashCode(sb));
                System.out.println(sb.capacity());
        }
} 
