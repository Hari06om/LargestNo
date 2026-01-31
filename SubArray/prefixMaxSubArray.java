import java.util.*;
public class prefixMaxSubArray {

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
        int prefix[] = new int[n];
        prefix[0] = arr[0];

        for(int i =1 ; i<n ;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                current = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
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
