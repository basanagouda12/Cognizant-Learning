package leastoffer;

import java.util.*;

public class ListOffer{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
     
     
     // Fill the code here
     int size = sc.nextInt();
     
     String items[]=new String[size];
     int price[]=new int[size];
     int discount[]=new int[size];
     float newPrice[]=new float[size];
     
     for(int i=0;i<size;i++)
     {
         items[i]=sc.next();
         price[i]=sc.nextInt();
         discount[i]=sc.nextInt();
     }
     
      for(int i=0;i<size;i++)
     {
        newPrice[i]= price[i]-(price[i]*(discount[i]/100));
     }
        
        int min=0;
      for(int i=0;i<newPrice.length;i++)
     {
        if(newPrice[i]<newPrice[i+1])
        {
            min=i;
        }
     }
     
     System.out.println(items[min]);
     
     
        
    }
}