public class pair {


        public static void subarr(int arr[], int n){
            for(int i =0;i<n;i++){
                for(int j = i;j<n;j++){
                    for(int k=i;k<=j;k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }

        public static void main(String args[]){
            int arr[] = {2,4,5,6,7};

            int n = arr.length;
            System.out.print(arr);
            subarr(arr, n);

        }    
}
