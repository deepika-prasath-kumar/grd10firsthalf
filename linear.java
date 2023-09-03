import java.util.*;
public class linear
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String array[]=new String[10];
        for(int i=0;i<10;i++)
        {
            array[i]=sc.next();
        }
        System.out.println("Enter the word you want to search for:");
        String search=sc.next();
        int count=0;
        for(int i=0;i<10;i++)
        {
            if(search.equalsIgnoreCase(array[i])){
              count =1;
              break;
            }
        }
        if(count==1)
        {
            System.out.println("The number was found");
        }
        else{
            System.out.println("The number was not found");
        }
        
    }
}