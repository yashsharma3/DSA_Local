import java.util.Scanner;

public class floyds {
    public static void floyd(int row,int col){
        int count=1;
        for(int i =1;i<=row;i++){
            for(int j =1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int col = sc.nextInt();
        floyd(row,col);
    }
}
