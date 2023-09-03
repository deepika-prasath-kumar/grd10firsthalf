import java.util.*;
public class sumboundary2D
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int c=sc.nextInt();
        int array[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
               array[i][j]=sc.nextInt(); 
            }
        }
    }
}