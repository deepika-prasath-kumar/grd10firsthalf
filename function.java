import java.util.*;
public class function{

    public static void main()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first number:");
      int a=sc.nextInt();
      System.out.println("Enter the second number:");
      int b=sc.nextInt();
      int result=max(a,b);
      if(result==1){
          System.out.println("b is larger than a");
      }
      else if(result==2){
          System.out.println("a is greater than b");
      }
      else if(result==3){
          System.out.println("The number are equal");
      }
    }
    public static int max(int x,int y){
        if(x<y){
            return(1);
            //System.out.println(y+" is larger than"+x);
        }
        else if(y<x) {
          return(2);
         // System.out.println(x+" is larger than"+y);  
        }
        else{
            return(3);
            //System.out.println("The numbers are equal");
        }
    } 
}