import java.util.*;


public class countsort {
     public static void input(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void cntst(int arr[] , int n ){
        
        //for find the largest element
        int l = Integer.MIN_VALUE;
        for(int i = 0 ; i < n ; i++){
            l = Math.max(l,arr[i]);
        }
        //create count array of size largest+1  
         int count[] =  new int[l+1];
         for(int i = 0 ; i < n ; i++){
            count[arr[i]]++;
         }
         //sorting
            int j = 0;
            for(int i = 0 ; i < count.length ; i++){
                while(count[i] > 0){
                    arr[j] = i;
                    j++;
                    count[i]--;
                }
            }
            display(arr, n);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        input(arr, n);
        cntst(arr, n);  

    }
}
