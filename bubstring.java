import java.io.*;
public class bubstring
{
    public static void main()throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String array[]=new String[10];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<10;i++)
        {
            array[i]=br.readLine();
        }
        String temp;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<(10-1)-i;j++)
            {
               if(array[j+1].compareToIgnoreCase(array[j])<(0))
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