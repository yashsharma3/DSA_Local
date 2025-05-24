import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a; //let a be the maximum value
        //Find the largest of three numbers
        if(b> max){
            max = b;
        }
        if(c>max){
            max =c;
        }System.out.println(max);
    }
}
// can use Math.max or assign max = 0 and then go ahead.
