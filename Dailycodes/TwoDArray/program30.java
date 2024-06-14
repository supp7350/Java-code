//Program for addition of all the elemets in the array

import java.util.Scanner;

class ArrayDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter array size : ");
                int size = sc.nextInt();
                int arr[] = new int[size];

                for(int i = 0;i<arr.length;i++){
                        System.out.println("Enter elements : ");

                        arr[i] = sc.nextInt();
                }
                System.out.println("Array elements are : ");
                for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
			int sum = 0;
                for(int i = 0;i<arr.length;i++){

			sum = sum + arr[i];
				}
                        System.out.println("Sum : " + sum);
        
        }
}
