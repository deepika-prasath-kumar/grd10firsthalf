import java.util.*;
public class dsum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix of the array");
        int m=sc.nextInt();
        int array[][]=new int[m][m];
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<m;j++)
           {
               array[i][j]=sc.nextInt();
           }
        }
        int sumRD=0;
               int sumLD=0;
        for(int i=0;i<m;i++)
        {
           for(int j=0;j<m;j++)
           {
               
               if(i==j)
               {
                   sumLD=sumLD+array[i][j];
               }
               if(i+j<m-1){
                   sumRD=sumRD+array[i][j];
               }
           }
        }
        System.out.println("The sum of right diagnol is"+sumRD);
        System.out.println("The sum of left diagnol is"+sumLD);
    }
}