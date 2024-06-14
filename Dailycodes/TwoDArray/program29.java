import java.util.Scanner;

class ArrayDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size : ");
                int size = sc.nextInt();
                int arr[] = new int[size];
                System.out.println("Size of the array : " + arr.length);

                for(int i = 0;i<arr.length;i++){
                	System.out.println("Enter elements : ");

                        arr[i] = sc.nextInt();
                }
                System.out.println("Array elements are : ");
                for(int i = 0;i<arr.length;i++){
                        System.out.println(arr[i]);
        }
        }
}
