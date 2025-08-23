import java.util.*;
public class MaxSubArray {

    public static void input(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
    }
    public static void display(int arr[],int n){
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void printsubarray(int arr[],int n){
        int current =0;
        int ms= Integer.MIN_VALUE;
        int max = arr[0];
        for(int i =0;i<n;i++){

            for(int j =0;j<n;j++){
                current =0;
                for(int k =i;k<=j;k++){
                    current += arr[k];
                }
                System.out.println("the current sum of the sub array : " + current);
                if(current>ms){
                    ms = current;
                }
               
            }
        }
        System.out.println("Maximum subarray sum is "+ms);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the elements of array");
        input(arr,n);
        System.out.println();
        display(arr,n);
        System.out.println();
        printsubarray(arr,n);
        System.out.println();

    }
}
