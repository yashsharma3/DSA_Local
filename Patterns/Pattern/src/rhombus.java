import java.util.Scanner;

public class rhombus {
    public static void Rhombus(int l){
        for(int i=1;i<=l;i++){
            for(int j=1;j<=(l-i);j++){
                System.out.print(" "+" ");
            }
            for(int j =1;j<=l;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int l = sc.nextInt();
        Rhombus(l);
    }
}
