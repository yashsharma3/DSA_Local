import java.util.Scanner;

public class prime {
    public static boolean check(int n ){
        boolean check = true;
        for( int i = 2; i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean hehe  = check(n);
        System.out.println(hehe);
    }
}
