public class array_linear{
    public static int linear(int number[],int key){
        for(int i =0;i< number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number []={2,4,6,8,10,12,14,16};
        int key = 16;
        int ans = linear(number,key);
        if(ans == -1){
            System.out.print("Does not Exist.");
        }else{
            System.out.println("Index for the number is:" + ans);
        }
    }
}