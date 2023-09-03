import java.util.*;
public class progletter
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        char X[]=new char[4];
        char Y[]=new char[4];
        boolean flag=false; 
        System.out.println("Enter 4 letters");
        for(int i=0;i<4;i++){
          X[i]=sc.next().charAt(0);  
        }
        System.out.println("Enter 4 letters");
        for(int i=0;i<4;i++){
          Y[i]=sc.next().charAt(0);  
        }
        for(int i=0;i<4;i++){
            if(X[i]!=Y[i]){
              flag=true;
              break;
            }
        }
        if(flag){
            System.out.println("The arrays are not identical");
        }
        else{
            System.out.println("The arrays are identical");
        }
    }       
}