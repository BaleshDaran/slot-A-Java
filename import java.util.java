import java.util.Arrays;
import java.util.Scanner;
public class maxmin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value of n:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int arr1;
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
       System.out.println("Given list is "+Arrays.toString(arr));
      
        int max=arr[0];
        {
            for(int j=0;j < arr.length;j++)
            {
                if(arr[j]>max)
                {
                    max = arr[j];
                }
            }
            System.out.println("Max ="+max);
        }
        int min=arr[0];
        {
            for(int k=0;k<arr.length;k++)
            {
                if(arr[k]<min)
                {
                    min = arr[k];
                }
            }
              System.out.println("Min ="+min);
        }
        System.out.println("Sum of MAx and Min is "+(max+min));
        System.out.println("Product of Max and Min is "+(max*min));
    }
}