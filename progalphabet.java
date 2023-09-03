import java.util.*;
public class progalphabet
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char array[]=new char[10];
        System.out.println("Enter 10 alphabets:");
        for(int i=0;i<10;i++){
            array[i]=sc.next().charAt(0);
        }
        System.out.println("Enter the alphabet to be found:");
        char n=sc.next().charAt(0);
        int flag=0;
        for(int i=0;i<10;i++)
        {
           if(array[i]==n){
               flag=1;
               System.out.println("Search successful: "+array[i]+"The index number is: "+i);
           }
        }
        if(flag==0){
            System.out.println("Search unsuccesful");
        }
    }
}