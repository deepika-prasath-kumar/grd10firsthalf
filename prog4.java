import java.util.*;
public class prog4
{
    public static void main(String[]argS){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of numbers to be acccepted:");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the numbers in the array");
        int counteven=0;
        int countodd=0;
        int count4=0;
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if(array[i]%2==0){
                counteven++;
                if(array[i]%4==0){
                    count4++;
                }
            }
            else{
                countodd++;
            }

        }
        System.out.println("The number of even numbers is: "+counteven);
        System.out.println("The number of odd numbers is: "+countodd);
        System.out.println("The number of numbrers that are multiples of 4 is: "+count4);
    }
}