import java.util.*;
public class diaganolleftbottom
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of matrix");
        int n=sc.nextInt();
        int array[][]=new int[n][n];
        System.out.println("Enter the contents of the matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j){
                    System.out.print("*");
                }
                else{
                    System.out.print(array[i][j]);  
                }
            }
            System.out.println();
        }
    }
}