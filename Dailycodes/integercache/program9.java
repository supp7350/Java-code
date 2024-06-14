class Demo{
	public static void main(String[] args){
		int x = 10;
		int y = 10;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));

		y = 20;
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		
	}
}



