import java.util.*;
public class allstars
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix of your array:");
        int n=sc.nextInt();
        int array[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("Upper left:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(i+j<n-1)
                {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Bottom left:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(i>j)
                {
                   System.out.print("*"+" "); 
                }
                else{
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Upper right:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(j>i)
                {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Bottom right:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                
                if(i+j>=n)
                {
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}