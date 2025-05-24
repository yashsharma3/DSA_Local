import java.util.Scanner;

public class find_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number string:");
        int n = sc.nextInt();
        System.out.println("Enter the number you want to count:");
        int num = sc.nextInt();
        int count=0;
        if(n>0){
            int rem = n/10;
            if(rem == num){
                count= count+1;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
