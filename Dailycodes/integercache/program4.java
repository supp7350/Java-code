class JVMInternal{
	public static void main(String[] args){	
		char ch1 = 'A';
		char ch2 = 'b';
		char ch3 = 'B';

		int x = 65;
		int y = 97;
		int z = 66;

		System.out.print(System.identityHashCode(ch1));
		System.out.print(System.identityHashCode(x));
		System.out.print(System.identityHashCode(ch2));
		System.out.print(System.identityHashCode(y));
		System.out.print(System.identityHashCode(ch3));
		System.out.print(System.identityHashCode(z));
	}
}

