import java.util.*;
public class revarray
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]={7,4,2,3,1,6,5};
        for(int i=0;i<7/2;i++)
        {
            array[i]=array[i]+array[6-i];
            array[6-i]=array[i]-array[6-i];
            array[i]=array[i]-array[6-i];
        }
        for(int j=0;j<7;j++)
        {
            System.out.print(array[j]+" ");
        }
    }
}