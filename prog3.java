import java.util.*;
public class prog3
{
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);  
       System.out.println("Enter the number of students");
       int n=sc.nextInt();
       int phy[]=new int[n];
       int chem[]=new int[n];
       int math[]=new int[n];
       int count80=0;
       int count34=0;
      for(int i=0;i<n;i++){
          System.out.println("Enter physics marks");
          phy[i]=sc.nextInt();
          System.out.println("Enter chem marks");
          chem[i]=sc.nextInt();
          System.out.println("Enter math marks");
          math[i]=sc.nextInt();
          if((phy[i]+math[i]+chem[i])/3>80){
              count80++;
          }
          if((phy[i]+math[i]+chem[i])/3<34){
              count34++;
          }
          
      }
      System.out.println("Number of students with aggregrate more than 80 :"+count80);
      System.out.println("Number of students with aggregrate less than 34 :"+count34);
    }
}