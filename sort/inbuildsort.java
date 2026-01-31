import  java.util.*;
public class inbuildsort {
    public static void input(int[] arr, int n) {
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }
    }

    public static void display(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void inbuild(int[] arr, int n) {
        Arrays.sort(arr);
        display(arr, n);
    }
        public static void selection(int[] arr, int n) {//
            //selection sort
            for(int i = 0 ; i < n -1;i++){
                int min = i;
                for(int j = 0 ;j<n;j++){
                    if(arr[j]>arr[min]){
                        min = j;
                    }
                } 
                //swap
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }
            display(arr, n);
        }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the elements of array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            // inbuild(arr, n);
            selection(arr, n);
        }
    }
}

