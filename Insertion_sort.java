/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package insertion_sort;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class Insertion_sort {

    
    public void sort(int arr[])
    {
        int pivot,i,j;
        for(i=0;i<arr.length;i++)
        {
            pivot = arr[i];
            
            for(j=i-1;j>=0 && pivot<arr[j];j--)
            {
                arr[j+1]=arr[j];
            }
            arr[j+1]=pivot;        
            
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
        
        Insertion_sort s=new Insertion_sort();    
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
        s.sort(arr);
        s.output(arr);
                    
    }
}
