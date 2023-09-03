import java.util.*;
public class prog6{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\f");
        System.out.println("Enter the number of numbers to be entered in the array: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the numbers in the array: ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            
            if((array[i]%7==0)||(array[i]%10==7)){
                System.out.println(array[i]+" The number is a buzz number");
            }
            else{
                System.out.println(array[i]+" The number is not a buzz number");
            }
        }
    }
}