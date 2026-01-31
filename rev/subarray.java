public  class subarray {
    public static void pairsum(int arr[]){
        int ts =0;
        for(int i =0 ;i<arr.length;i++){
            int s =i;
            for(int j=i;j<arr.length;j++){
                int a =j;
                for(int k=s;k<=a;k++){
                    System.out.print(arr[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sum : "+ts);
    }
public static void main(String args[]){
    int arr[] = {2,4,6,8,10};
    pairsum(arr);

}
}
