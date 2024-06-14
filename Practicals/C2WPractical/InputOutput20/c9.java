import java.util.Scanner;
class c9{
        public static void main(String[] args){
                System.out.println("ENTER NUMBER");
                Scanner sc=new Scanner(System.in);
                int h1=sc.nextInt();
               int h2=sc.nextInt();

                if(h2>h1){
			for(int i=h1;i<=h2; i++){
				if(i%2==0){
					System.out.println(i+" ");
				}
				else
					continue;
			}
		}
		else{
			for(int i=h1; i>=h2 ; i--){
                              if(i%2==0){
                                  System.out.println(i+" ");
                                 }
                              else
                                 continue;
        }
}
		}
}
