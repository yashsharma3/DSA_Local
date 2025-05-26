import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int marks []=new int[n];
        for(int i =0;i<=n;i++){
            marks[i]=sc.nextInt();
            System.out.println(marks[i]);
        }
        sc.close();
    }
}
