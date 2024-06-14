import java.util.*;
class Demo6{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the size of an array : ");
                int size=sc.nextInt();
                char arr[]=new char[size];
                System.out.println("Enter array elements : ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.next().charAt(0);
                }
                int count1=0;
                int count2=0;
                for(int i=(arr.length-1);i>=0;i--){
                        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
                                count1++;
                        }
                        else{
                                count2++;
                        }
                }
                System.out.println("Count of vowels : "+count1);
                System.out.println("Count of consonants : "+count2);
        }
}

