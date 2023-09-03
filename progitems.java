import java.util.*;
public class progitems
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int code[]=new int[4];
        double price[]=new double[4];
        int quantity[]=new int[4];
        double cost=0;
        double totalprice=0;
        double totalquantity=0;
        double totalcost=0;
        for(int i=0;i<4;i++){
            System.out.println("Enter the product code:");
            code[i]=sc.nextInt();
            System.out.println("Enter the product price:");
            price[i]=sc.nextDouble();
            System.out.println("Enter the quantity of the item:");
            quantity[i]=sc.nextInt();
        }
        System.out.println("Product code"+" "+ "Price"+" "+"Quantity"+ " Total cost");
        for(int i=0;i<4;i++){
          cost=quantity[i]*price[i];
          totalprice=totalprice+price[i];
          totalquantity=totalquantity+quantity[i];
          totalcost=totalcost+cost;
          System.out.println(code[i]+"   "+price[i]+"    "+quantity[i]+"    "+cost);
        }
        System.out.println("The total price is:"+totalprice);
        System.out.println("The total quantity is:"+totalquantity);
        System.out.println("The total cost is:"+totalcost);
    }
}