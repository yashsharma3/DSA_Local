import java.util.Scanner;

public class triangle_0_1 {
    public static void triangle(int row,int col){
        for(int i =1;i<=row;i++){
            for(int j = 1;j<=i;j++){
                if((i+j )% 2==0){
                System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
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
        triangle(row,col);
    }
}
