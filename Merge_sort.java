/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package merge_sort;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class Merge_sort {

    public void mergesort(int arr[],int l,int r)
    {
        int m;
        if(l<r)
        {
            m=l+(r-l)/2;
            mergesort(arr,l,m);
            mergesort(arr,m+1,r);
            merge1(arr,l,m,r);
        }   
    }
    public void merge1(int arr[],int l,int m,int r)
    {
        int i ,j,k;
        int n1=m-l+1;
        int n2=r-m;
        int []l1=new int[n1];
        int []l2=new int[n2];
    
        for(i=0;i<n1;i++)
        {
            l1[i]=arr[l+i];
        }
        
        for(j=0;j<n2;j++)
        {
            l2[j]=arr[m+1+j];
        }
        i=0;j=0;k=l;
        
        while(i<n1 && j<n2)
        {
            if(l1[i]<l2[j])
            {
                arr[k]=l1[i];
                i++;
            }
            else
            {
                arr[k]=l2[j];
                j++;
            }
            k++;   
        }
        
        while(i<n1)
        {
            arr[k++]=l1[i++];
        }
        
        while(j<n2)
        {
            arr[k++]=l2[j++];
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
        
        Merge_sort m=new Merge_sort();    
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
        m.mergesort(arr,0,n-1);
        m.output(arr);
    
    }
}
