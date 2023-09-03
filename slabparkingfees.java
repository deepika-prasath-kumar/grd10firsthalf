import java.util.*;
public class slabparkingfees
{
    public static void main(String[]args)
    { 
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of hours parked");
      int hours=sc.nextInt();
      int fees=0;
      if(hours<=4){
          fees=5;
      }
      else if(hours<=9)
      {
          fees=5+(hours-4)*3;
      }
      else{
          fees=5+5*3+(hours-9)*2;
      }
      System.out.println("The fees is"+fees);
    }
}