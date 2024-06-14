import java.util.*;
class Demo4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter Size : ");
                int size = sc.nextInt();
                int arr [] =new int[size];
                boolean is_duplicate = false;
                int dup_idx=-1;
                for(int i=0;i<arr.length;i++){
                        System.out.print("\nEnter element : ");
                        arr[i]=sc.nextInt();
                }

                for(int i =0;i<arr.length;i++){
                        for(int j=i+1;j<arr.length;i++){
                                if(arr[i]==arr[j]){
                                        is_duplicate = true;
                                        dup_idx = i;
                                        break;
                                }

                        }
                        if(is_duplicate)
                                break;
                }

                if(is_duplicate)
                        System.out.print("\nThe index of duplciate key is :" +dup_idx);
                else
                        System.out.print("\nNo duplicate key present.");
        }
}

