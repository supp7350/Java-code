class SkipVowels{
	public static void main(String [] args){
		for(char ch=65;ch<91;++ch){
			if(ch=='A'||ch=='O'||ch=='E'||ch=='I'||ch=='U'){
				continue;
			}
			System.out.println(ch);
		}
	}
}

