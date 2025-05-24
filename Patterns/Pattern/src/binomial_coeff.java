import java.util.Scanner;

public class binomial_coeff {
    public  static int fact(int n){
        int num = 1;
        for(int i =1;i <=n;i++){
            num = num *i;
        }
        return num;
    }
    public static int bino(int n, int r){
        int fact_n= fact(n);
        int fact_r=fact(r);
        int fact_nmr=fact(n-r);
        int anss = fact_n/(fact_r* fact_nmr);
        return anss;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(bino(n,r));
    }
}

