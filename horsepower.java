import java.util.*;
public class horsepower
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount of horsepower being used:");
        int horse=sc.nextInt();
        int license=0;
        if(horse<=50)
        {
            license=0;
        }
        else if(horse<=100){
           license=300;
        }
        else if(horse<=200)
        {
            license=600;
        }
        else if(horse<=300){
            license=900;
        }
        else if(horse>300)
        {
            license=1500;
        }
        System.out.println("The license fee according to the horsepower is"+license);
    }
}