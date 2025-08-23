import java.util.*;
public class subarray {
    public static void inpt(int arr[],int n){
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();

        }
    }
    public static void display(int arr[],int n ){
        for(int i =0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
    public static void subarray(int arr[],int n){
        int td = 0;
        for(int i=0;i<n;i++){
            for(int j = i;j<n;j++){
                for(int k = i;k<j;k++){
                    System.out.print(arr[k] + " ");
                }
                td++;
                System.out.println();
            }
            System.out.println("----------------------------");
        }
        System.out.println("Total subarrays: " + td);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        inpt(arr, n);
        System.out.println("The array is:");
        display(arr, n);
        System.out.println("The subarrays of the array are:");
        subarray(arr, n);
        sc.close();
    }
}
