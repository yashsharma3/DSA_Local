import java.util.Scanner;

public class inverted_num{
    public static void num_invert(int rows,int cols){
        for(int i =1;i<=rows;i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();
        num_invert(rows,cols);
    }
}
