import java.util.*;
public class binarystring
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String names[]=new String[10];
        System.out.println("Enter 10 names:");
        for(int i=0;i<10;i++)
        {
            names[i]=sc.next();
        }
        System.out.println("Enter the name to be found: ");
        String n=sc.next();
        int l=0;
        int m=0;
        int h=names.length-1;
        int index=-1;
        while(l<=h)
        {
            m=(l+h)/2;
            if(names[m].compareTo(n)<0)
            {
                h=m-1;
            }
            else if(names[m].compareTo(n)>0)
            {
                l=m+1;
            }
            else
            {
                index=m;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("The name was not found");
        }
        else{
            System.out.println("The name was found, the index position is "+index);
        }
    }
}