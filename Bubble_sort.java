/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bubble_sort;
import java.util.*;
/**
 *
 * @author abc
 */
public class Bubble_sort {

    public void swap(int ar[], int a,int b)
    {
        int c;
        c=ar[a];
        ar[a]=ar[b];
        ar[b]=c;
    }
    public void sort(int arr[])
    {
        int i,j;
        for(i=0;i<arr.length-1;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }     
    }
    
    public void output(int arr[])
    {
        int i;
        System.out.println("SORTED ARRAY");
        for(i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here

        Bubble_sort b=new Bubble_sort();
        
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int n=sc.nextInt();
        int i,j,k;
        int []arr=new int[n];             
        System.out.println("ENTER ELEMENTS");
        for(i=0;i<n;i++)
        {
            j=sc.nextInt();
            arr[i]=j;
        }
        b.sort(arr);
        b.output(arr);
     
    }
}
