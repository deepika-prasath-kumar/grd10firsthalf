import java.util.*;
public class dtwo
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[][]={{2,5,-6},{7,-8,9},{2,1,-4},{8,12,30}};
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}