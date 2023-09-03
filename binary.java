import java.util.*;
public class binary
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];
        for(int i=0;i<10;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the word you want to search for:");
        int s=sc.nextInt();
        int count=-1;
        int h=9;
        int l=0;
        int m=0;
        while(l<=h)
        {
            m=(l+h)/2;
            if(s<array[m]){
                l=m+1;
            }
            else if(s>array[m]){
                h=m-1;
            }
            else{
                count=m;
                break;
            }
        }
        if(count==-1)
        {
            System.out.println("The number was not found");
        }
        else{
            System.out.println("The number was found, the position is"+count);
        }
        
    }
}