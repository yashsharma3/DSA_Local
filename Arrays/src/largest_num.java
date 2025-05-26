public class largest_num {
    public static int largest(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i] > largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        int ans = largest(arr);
        System.out.println("The Largest Value is "+ ans);
    }
}
