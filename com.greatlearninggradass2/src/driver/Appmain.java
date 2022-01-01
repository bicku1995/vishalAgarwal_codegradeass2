package driver;

import java.util.Scanner;

import service.desort;
import service.search;
import service.sorting;

public class Appmain {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter the no. of company");
		int N=ob.nextInt();
		double arr[]=new double[N];
		String r="";
		int In = 0,De=0;
		int op=0,k=0;
		for(int i=0;i<N;i++) {
		System.out.println("Enter current stock price of company"+(i+1));
		arr[i]=ob.nextDouble();
		System.out.println("Whether company's stock price rose today compare to yesterday");
	    r=ob.next();
	    if(r.equalsIgnoreCase("true"))
	    	In++;
	    if(r.equalsIgnoreCase("false"))
	    	De++;
	    	
					}
		sorting so =new sorting();
		desort dos =new desort();
		search bos=new search();
		while(N!=-1)
		{
	    System.out.println("");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Enter the operation to be performed");
		System.out.println("1.Display company stock price in ascending order");
		System.out.println("2.Display company stock price in descending order");
		System.out.println("3.Dispaly the total no.of companies for which stock prices rose today");
		System.out.println("4.Dispaly the total no. of companies for which stock prices declined today");
		System.out.println("5.Search a specific stock price");
		System.out.println("6.press 0 to exit");
		System.out.println("----------------------------------------------------------------------");
		op=ob.nextInt();
		switch(op)
		{
		case 1:
		{
		    
			System.out.println("Stock price in ascending order:" );
			so.mergesort(arr,0,arr.length-1);
			for(int i=0;i<N;i++)
	        System.out.print(arr[i]+" ");	
			
		}
		break;
	
		case 2:
		{
		    
			System.out.println("Stock price in descending order:" );
			dos.mergesort(arr,0,arr.length-1);
			for(int i=0;i<N;i++)
	        System.out.print(arr[i]+" ");	
			
		}
		break;
		case 3:
		{
		    
			System.out.println("No. of stocks whose price rose today ");
			System.out.println(In);
			
			
		}
		break;
		case 4:
		{
		    
			System.out.println("No. of stocks whose price decline today ");
			System.out.println(De);
			
			
		}
		break;
		case 5:
		{
			
		    
			System.out.println("Enter the key value");
			k=ob.nextInt();
			bos.Binary(arr,0,arr.length-1,k);
										
		}
		break;
		case 6:
		{
			
		N=-1;    
																
		}
		break;
		
		
		
		

	        }
         }
	}
	
}



	

