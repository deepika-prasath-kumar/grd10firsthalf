import java.util.*;
public class binarysearch
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be found:");
        int s=sc.nextInt();
        int l=0;
        int u=array.length-1;
        int m=0;
        int flag=0;
        while(l<=u)
        {
            m=(l+u)/2;
            if(s>array[m])
            {
                l=m+1;  
            }
            else if(s<array[m])
            {
                u=m-1; 
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Record exists in position:"+(m+1));
        }
        else{
            System.out.println("Record does not exist");
        }
    }
}   