import java.util.*;

public class largest {
    public static void input(int n, int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
    }
    public static void display(int n ,int arr[]){
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void large(int n ,int arr[]){
        int mx = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        System.out.println("The largest number in the array is: " + mx);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        input(n, arr);
        System.out.println("The elements of array are");
        display(n, arr);

        large(n, arr);
        sc.close();
    }    
}
