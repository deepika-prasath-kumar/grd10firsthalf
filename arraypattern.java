import java.util.*;
public class arraypattern
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix for the array:");
        int m=sc.nextInt();
        int array[][]=new int[m][m];
        System.out.println("Enter the numbers in the array");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(array[i][j]+" ");
                
            }
            System.out.println();
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if((i==0 || i==1) && (j==2 || j==3)){
                    System.out.print(" ");
                }
                else if((i==2 || i==3) && (j==0 || j==1)){
                   System.out.print(" "); 
                }
                else{
                    System.out.print(array[i][j]+" ");
                }
            }
            System.out.println();
        }
        
    }
}