import java.util.*;
class Twodarray{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter size of rows and columns : ");
                int row = sc.nextInt();
                int col = sc.nextInt();
                int arr[][] = new int[row][col];        //Insert data : Array

                System.out.println("Enter Array Elements : ");

                for(int i = 0; i<arr.length; i++){
                        for(int j = 0; j<arr[i].length; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }

                System.out.println("Array Elements are : ");

                for(int i = 0; i<arr.length; i++){
                        for(int j = 0; j<arr[i].length; j++){
                               System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                }
                        System.out.println(arr[1][1]);
                        System.out.println(arr[1]);
                        System.out.println(arr);

        }
}
