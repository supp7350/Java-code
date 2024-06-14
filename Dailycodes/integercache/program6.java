class Demo{
	public static void main(String[] args){
		int x = 9;
		char ch1 = '9';
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch1));
	}
}
