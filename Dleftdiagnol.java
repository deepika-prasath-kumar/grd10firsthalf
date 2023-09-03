import java.util.*;
public class Dleftdiagnol
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix of your array:");
        int m=sc.nextInt();
        int array[][]=new int[m][m];
        int sum=0;
        System.out.println("Enter the elements of your array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j){
                    sum=sum+array[i][j];
                }
            }
        }
        System.out.println("The sum of the left diagnol is:"+sum);
    }
}