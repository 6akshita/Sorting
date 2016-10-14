/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quick_sort;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author abc
 */
public class Quick_sort {
    
    public void swap(int ar[], int a,int b)
    {
        int c;
        c=ar[a];
        ar[a]=ar[b];
        ar[b]=c;
    }
    
    public int partion(int arr[],int l,int r)
    {
        Random rand = new Random();
        int pivot= l+rand.nextInt(r-l+1);
        swap(arr, pivot, r);

        int j;
        int i=r;
        for(j=r-1;j>=0;j--)
        {
            if(arr[j]>=arr[r])
            {
                i--;
                swap(arr,i,j);
            }
        }
        swap(arr,i,r);
        return (i);
    }
    
    public void quicksort(int arr[],int l,int r)
    {
        int p;
        if(l<r)
        {
            p=partion(arr,l,r);
            quicksort(arr,l,p-1);
            quicksort(arr,p+1,r);
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
        
        Quick_sort q=new Quick_sort();    
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int n=sc.nextInt();
        int i,j,k;
        int []arr=new int[n];               
        System.out.println("ENTER ELEMENTS");
        for(i=0;i<arr.length;i++)
        {
            j=sc.nextInt();
            arr[i]=j;
        }
        q.quicksort(arr,0,n-1);
        q.output(arr);
        
    }
}
