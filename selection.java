import java.util.*;
public class selection
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the matrix of the array");
        int m=sc.nextInt();
        int array[]=new int[m];
        for(int i=0;i<m;i++)
        {

            array[i]=sc.nextInt();

        }
        int small=0;
        int pos=0;
        int temp=0;
        for(int i=0;i<m;i++)
        {
            small=array[i];
            pos=i;
            for(int j=i+1;j<m;j++)
            {
                if(small>array[j]){
                    small=array[j];
                    pos=j;
                }
            }
            temp=array[i];
            array[i]=array[pos];
            array[pos]=temp;
        }
        for(int i=0;i<m;i++)
        {

            System.out.println(array[i]+" ");

        }
    }
}