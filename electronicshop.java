import java.util.*;
public class electronicshop
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.next();
        System.out.println("Enter the amount of your purchase");
        int amt=sc.nextInt();
        System.out.println("Enter L to purcahse laptop and D for desktop");
        char type=sc.next().charAt(0);
        double bill=0;
        if(type=='L'){
            if(amt<=25000){
               bill=amt; 
            }
            else if(amt>=25001&&amt<=50000)
            {
                bill=amt-5.00/100*amt;
            }
            else if(amt>=50001&&amt<=100000)
            {
                bill=amt-7.5/100*amt;
            }
            else {
              bill=amt-10.0/100*amt;  
            }
        }
        else if(type=='D'){
            if(amt<=25000){
               bill=amt-5.0/100*amt; 
            }
            else if(amt>=25001&&amt<=50000)
            {
                bill=amt+7.5/100*amt;
            }
            else if(amt>=50001&&amt<=100000)
            {
                bill=amt-10.0/100*amt;
            }
            else {
              bill=amt-15.0/100*amt;  
            }
        }
        else{
            System.out.println("Please enter valid product letter");
        }
        System.out.println("Your name is:"+name+" Your product type is"+ type+" Your final bill is"+bill);
    }
}