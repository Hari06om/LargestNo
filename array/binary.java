import java.util.*;
public class binary {
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
    public static int binarysearch(int arr[], int n, int k){
        int s=0; int e = n-1;
        while(s<=e){
            int m = (s+e)/2;
            if(arr[m]==k){
                return m;

            }
            if(arr[m]<k){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        input(n, arr);
        System.out.println("The elements of array are");
        display(n, arr);
        System.out.println("The sorted array is");
        Arrays.sort(arr);
        display(n, arr);
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        int result = binarysearch(arr, n, key);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        

    }
}
