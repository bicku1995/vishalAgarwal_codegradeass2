package service;

import java.util.Scanner;

public class search {
	public static void Binary(double[] arr,int f,int l,int key)
	{
		sorting c= new sorting();
		c.mergesort(arr,0,arr.length-1);
		int mid=(f+l)/2;
		while(f<=l)
		{
			if(arr[mid]<key)
			{
				f=mid+1;
			}
			else if (arr[mid]==key)
			{
				System.out.println("The searched stock "+key+" is present");
				break;
							}
			else
			{
				l=mid-1;
			}
			mid=(f+l)/2;
						
		
		}
		if(f>l)
		{
		System.out.println(" The searched stock price not present");				
		}
				
	}
public static void main(String args[])
{
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int size=in.nextInt();
	double[] arr=new double[size];
	System.out.println("Enter the elements in the array in sorted manner");
	for(int i=0;i<size;i++)
	{
	 arr[i]=in.nextInt();
				
	}
	System.out.println("Enter the element to be searched");
	int key=in.nextInt();
	int l=arr.length-1;
		Binary(arr,0, l,key);
		
	
	
}
}
