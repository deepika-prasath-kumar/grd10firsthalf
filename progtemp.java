import java.util.*;
public class progtemp{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of cities: ");
        int n=sc.nextInt();
        String city[]=new String[n];
        int hightemp[]=new int[n];
        int lowtemp[]=new int[n];
        int cityhigh=0;
        int citylow=0;
        int high=0;
        int low=10000;
        for(int i=0;i<n;i++){
            System.out.println("Enter the city");
            city[i]=sc.next();
            System.out.println("Enter the highest temprature recorded in that city:");
            hightemp[i]=sc.nextInt();
            System.out.println("Enter the lowest temprature recorded in that city:");
            lowtemp[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
          if(high<hightemp[i]){
             high=hightemp[i]; 
             cityhigh=i;
          }
          if(low>lowtemp[i]){
              low=lowtemp[i];
              citylow=i;
            }
        }
        System.out.println("The city with the highest temprature is:"+city[cityhigh]+"and the temp of that is"+high);
        System.out.println("The city with the lowest temprature is:"+city[citylow]+"and the temp of that is"+low);
    }
}