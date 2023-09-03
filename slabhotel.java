import java.util.*;
public class slabhotel
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char ans='y';
        do{
            System.out.println("Enter the number of days you are staying:");
            int days=sc.nextInt();
            int rate=0;
            int firday=350;
            System.out.println("Enter the room number alloted");
            int room=sc.nextInt();
            System.out.println("Enter the check-in time");
            int chkin=sc.nextInt();
            System.out.println("Enter the checkout time");
            int chkout=sc.nextInt();
            if(days<=3)
            {
                rate=days*firday;
            }
            else if(days<=6)
            {
                rate=3*firday+(days-3)*300;
            }
            else if(days<=9)
            {
                rate=3*firday+3*300+(days-6)*275;
            }
            else{
                rate=3*firday+3*300+3*275+(days-9)*225; 
            }
            System.out.println("          XYZ INTERNATIONAL HOTEL                  ");
            System.out.println("ROOM NUMBER :"+room);
            System.out.println("NUMBER OF DAYS STAYED : "+days);
            System.out.println("CHECK-IN TIME : "+chkin);
            System.out.println("CHECK-OUT TIME : "+chkout);
            System.out.println("AMOUNT TO BE PAYED : "+rate);
            System.out.println("Do you want to run the program again?...y or n");
            ans=sc.next().charAt(0);
        }

        while(ans!='n');       
    }
}