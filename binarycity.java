import java.util.*;
public class binarycity
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        String city[]=new String[5];
        System.out.println("Enter the names of 5 cities in descending order: ");
        for(int i=0;i<5;i++)
        {
            city[i]=sc.next();
        }
        System.out.println("Enter the city to find: ");
        String n=sc.next();
        int l=0;
        int m=0;
        int h=city.length-1;
        int index=-1;
        while(l<=h)
        {
            m=(l+h)/2;
            if(n.compareTo(city[m])<0){
              l=m+1;
            }
            else if(n.compareTo(city[m])>0){
                h=m-1;
            }
            else{
                index=m;
                break;
            }
        }
        if(index==-1)
        {
            System.out.println("City not found");
        }
        else{
            System.out.println("City found, index is: "+index);
        }
    }
}