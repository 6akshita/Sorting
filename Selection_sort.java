/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package selection_sort;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class Selection_sort {

    public void swap(int ar[], int a,int b)
    {
        int c;
        c=ar[a];
        ar[a]=ar[b];
        ar[b]=c;
    }
    
    public void sort(int arr[])
    {
        int min,i,j;
        for(i=0;i<arr.length;i++)
        {
            min=i;
            for(j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                    min=j;
            }
            swap(arr,i,min);
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
     
        Selection_sort s=new Selection_sort();
            
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER SIZE OF ARRAY");
        int n=sc.nextInt();
        int i,j,k;
        int arr[]=new int[n];               
        System.out.println("ENTER ELEMENTS");
        for(i=0;i<arr.length;i++)
        {
            j=sc.nextInt();
            arr[i]=j;
        }
        s.sort(arr);
        s.output(arr);
                    
    }
}
