import java.util.*;
public class LargestNo {
   public static void input(int arr[]){
      Scanner sc = new Scanner(System.in);
      for(int i =0;i<arr.length;i++){
         System.out.print("Enter element " + (i + 1) + ": ");
         arr[i] = sc.nextInt();

      }

   }
   public static void display(int arr[]){
      for(int i = 0; i < arr.length; i++){
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }
   public static void largest(int arr[]){
      int mx = arr[0];
      for(int i =0;i<arr.length;i++){
         if(arr[i]> mx){
            mx=arr[i];

         }
      }
      System.out.print("The largest number is: " + mx);
      System.out.println();
   }
   public static void smallest(int arr[]){
      int sm = arr[0];
      for(int i =0;i<arr.length;i++){
         if(arr[i]< sm){
            sm=arr[i];

         }
      }
      System.out.print("The smallest number is: " + sm);
      System.out.println();
   }
   public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the lenght of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
      input(arr);
      display(arr);
      largest(arr);
      smallest(arr);
      Arrays.sort(arr);
      display(arr);
    sc.close();
   } 
}
