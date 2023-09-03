import java.util.*;
public class progcurrency
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int currency[]=new int[9];
        int number[]=new int[9];
        int flag=0;
        for(int i=0;i<9;i++){
            System.out.println("Enter the currency:");
            currency[i]=sc.nextInt();
            System.out.println("Enter the serial number:");
            number[i]=sc.nextInt();
        }
        System.out.println("Enter the currency you want to find:");
        int n=sc.nextInt();
        for(int i=0;i<9;i++){
            if(currency[i]==n){
                System.out.println("Search successful: "+currency[i]+" it's serial number is: "+number[i]);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Search unsuccessful Name not enlisted");
        }
    }
}