package sorting_int;
import java.io.*;
import java.util.Scanner;
public class SortInt {
public static void main(String[] args)
{
	System.out.println("Name: Manasi Sudhir Baiche");
	System.out.println("Rollno:3102");
	int i,j,n,temp;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter no of elements:");
	n=input.nextInt();
	int array[]=new int[n];
	System.out.println("enter integer numbers:");
	for(i=0;i<n;i++)
		array[i]=input.nextInt();
	for(i=0;i<(n-1);i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(array[j]>array[j+1])
			{
				temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
			}
		}
		System.out.println("Sorted list:");
		for(i=0;i<n;i++)
			System.out.println(""+array[i]);
	}
}}
 

