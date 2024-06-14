class Demo10{
	public static void main(String [] args){
		float [] arr[] = new float [][]{{1,2,3,4},{5.5f,6.8f},{0.0f,0.1f,0.35f,09f}};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

