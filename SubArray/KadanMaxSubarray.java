import java.util.*;
public class KadanMaxSubarray {
    public static void input(int arr[],int n ){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
    }
    public static void display(int arr[] ,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void kadane(int arr[] ,int n){
        int ms =  Integer.MIN_VALUE;
        int cs =0;
        for(int i =0;i<n;i++){
            cs += arr[i];
            if(cs<0){
                cs =0;
            }
            
        }
    }

    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        input(arr,n);
        display(arr,n);
        System.out.println(kadane(arr,n));

    }
}
