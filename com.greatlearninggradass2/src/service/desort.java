package service;

import java.util.Scanner;

public class desort {
	void merge(double arr[],int left,int mid,int right)
	{
		int len1=mid-left+1;
		int len2=right-mid;
		double leftArr[]=new double[len1];
		double rightArr[]=new double[len2];
		
		for(int i=0;i<len1;i++)
		leftArr[i]=arr[left+i];
		for(int j=0;j< len2;j++)
			rightArr[j]=arr[mid+1+j];
		int i,j,k;
		i=0;
		j=0;
		k= left;
		while(i< len1 && j< len2)
		{
			if (leftArr[i]>=rightArr[j])
			{
			arr[k]=leftArr[i];
			i++;
			}
			else
			{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
			}
		while(i<len1)
		{
			arr[k]=leftArr[i];
			i++;
			k++;
		}
		while(j< len2)
		{
			arr[k]=rightArr[j];
			j++;
			k++;
					}
	}
	public void mergesort(double[] arr,int left,int right)
	{
			if (left < right)
			{
				int mid=(left+right)/2;
				mergesort(arr,left,mid);
				mergesort(arr,mid+1,right);
				merge(arr,left,mid,right);
			}
	}
	static void display(double[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;++i)
		System.out.print(arr[i]+" ");
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = in.nextInt();
		double[] arr=new double[size];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=in.nextInt();
			
		}
		desort ob= new desort();
		System.out.println("Original array");
		display(arr);
		ob.mergesort(arr,0,arr.length-1);
		System.out.println("Sorted array");
		display(arr);
	}

}



