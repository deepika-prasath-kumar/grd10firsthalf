import java.util.*;
public class progsearch{
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       int array[]={1,2,3,4,5,6,7,8,9,10};
       System.out.println("The array is:");
       for(int i=0;i<10;i++){
           System.out.println(array[i]);
       }
       System.out.println("Enter the number to be searched:");
       int n=sc.nextInt();
       int flag=0;
       int index=0;
       for(int i=0;i<10;i++){
           if(array[i]==n){
             flag=1; 
             index=i;
             break;
           }
           
       }
       if(flag==1){
           System.out.println("The number was found: "+n+"the index position is:"+index);
       }
       else{
           System.out.println("The number was not found: "+n);
       }
       
   }
}