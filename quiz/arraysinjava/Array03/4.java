class Demo4{
	
	static int []arr = new int[5];

	public static void main(String [] args){
		arr[0]=1;
		arr[1]=arr[0]+arr[1];		
		arr[2]=arr[1]+arr[1];		
		arr[3]=arr[2]+arr[2];	

		System.out.println(arr[0]);	
		System.out.println(arr[1]);	
		System.out.println(arr[2]);	
		System.out.println(arr[3]);	
	}
}

