import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome (int n ){
        int out = n;
        int rev =0;

        while(n>0){
            int digit = n% 10;
            rev = rev*10+ digit;
            n= n /10;
        }
        return out == rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
