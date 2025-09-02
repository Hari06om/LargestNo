import java.util.*;
public class linearsearch {
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
    public static void search(int n,int arr[],int k){
        for(int i =0 ;i<n;i++){
            if(arr[i] == k){
                System.out.println("Element found at index " + i);
                return;
            }else{
                System.out.println("Element not found");
                return;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        input(n,arr);
        System.out.println("The elements of array are");
        display(n,arr);
        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();
        search(n,arr,key);
        sc.close();
        
    }    
}
