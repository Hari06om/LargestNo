import java.util.*;
public class pairofsubarray{
     public static void input(int arr[],int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void display(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void pairofarray(int arr[],int n){
        for(int i =0;i<n;i++){
            int crr =arr[i];
            for(int j=i+1;j<n;j++){
                System.out.print("("+crr+","+arr[j]+")");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");

        input(arr,n);
        display(arr,n);
         System.out.println("The sorted array is");
        Arrays.sort(arr);
        display(arr,n);
        System.out.println("The pairs of array are");
        pairofarray(arr,n);
        sc.close();
    }
}       