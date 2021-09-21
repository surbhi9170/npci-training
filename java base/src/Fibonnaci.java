import java.util.*;
public class Fibonnaci {
    public static void main(String[] args)
    {
        int arr[]=new int[10];


        for (int i=0;i<arr.length;i++)
        {
            if(i==0)
                arr[0]=0;
            else if(i==1)
                arr[1]=1;
            else
                arr[i]=arr[i-1]+arr[i-2];
            System.out.print(arr[i]+" ");
        }
        //to reverse array
        System.out.println("");

        System.out.println("Reverse :");
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
