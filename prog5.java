import java.util.*;
public class prog5{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int array[]=new int[n];
        int prime=0;
        int fact=0;
        System.out.println("Enter the numbers to be entered in the array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=2;j<array[i];j++){
                if(array[i]%j==0){
                    fact++;
                    break;
                }
            }
            if(fact==0){
                System.out.println(array[i]+" Is prime");
                prime++;
            }
            fact=0;
        }
        System.out.println("Number of prime numbers is :"+prime);
    }
}