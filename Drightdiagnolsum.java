import java.util.*;
public class Drightdiagnolsum
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix of your array:");
        int m=sc.nextInt();
        int sum=0;
        int array[][]=new int[m][m];
        System.out.println("Enter the elements of your array:");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++){
                array[i][j]=sc.nextInt();

            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++){
                System.out.print(array[i][j]+" ");
                if(i+j==m-1){
                    sum=sum+array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("The sum of the right diagnol is:"+sum);
    }
}
 