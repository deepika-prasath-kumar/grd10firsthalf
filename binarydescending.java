import java.util.*;
public class binarydescending
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int marks[]=new int[30];
        System.out.println("Enter marks of 10 students in descending order");
        for(int i=0;i<10;i++)
        {
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter the marks you want to find ");
        int n=sc.nextInt();
        int l=0;
        int m=0;
        int h=marks.length-1;
        int index=-1;
        while(l<=h)
        {
            m=(l+h)/2;
            if(marks[m]<n)
            {
               h=m-1; 
            }
            else if(marks[m]>n)
            {
                l=m+1;
            }
            else{
                index=m;
                break;
            }
        }
        if(index==-1)
            {
                System.out.println("The marks were not found");
            }
            else{
                System.out.println("Marks found, the index is "+index);
            }
    }
}