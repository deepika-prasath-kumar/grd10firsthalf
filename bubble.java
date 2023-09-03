import java.io.*;
public class bubble
{
    public static void main()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int array[]=new int[10];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<10;i++)
        {
            array[i]=Integer.parseInt(br.readLine());
        }
        int temp=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<(10-1)-i;j++)
            {
               if(array[j+1]<array[j])
               {
                 temp=array[j];
                 array[j]=array[j+1];
                 array[j+1]=temp;
               }
            }
        }
        for(int i=0;i<10;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}