import java.util.*;
public class ref {
    public static void update(int marks[]){
        for(int i=0;i< marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks [] = {91,92,93};
        update(marks);
        for(int i=0;i< marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
