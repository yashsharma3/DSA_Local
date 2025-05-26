public class reverse {
    public static void rev(int num[]){
        int first =0;
        int last = num.length-1;
        while (first <last){
            int temp = num[first];
            num[first]=num[last];
            num[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        rev(num);
        for(int i =0;i<= num.length-1;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}
