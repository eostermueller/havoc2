package com.github.eostermueller.snail4j.workload.annotations.basic;

import com.github.eostermueller.snail4j.workload.annotations.Load;
import com.github.eostermueller.snail4j.workload.annotations.UserInterfaceDescription;

/**
 * @stolenFrom: https://github.com/akshaybahadur21/Sort/blob/master/Sort.java
 *
 */
public class Sorting {
	public static final String USE_CASE_NAME = "numericSorting";
	int a[] = {5,3,6436,53,100};
	
	@Load(
			useCase = "numericSorting", 
			value = {@UserInterfaceDescription("Selection Sort")}
			)
	public  void selectionSort()
	{
		for (int i=0;i<a.length-1;i++)
		{
			int imin=i;
			int temp;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[imin])
					imin=j;
			}
					temp=a[i];
					a[i]=a[imin];
					a[imin]=temp;
		}
		print(a,a.length);
	}
	@Load(
			useCase = "numericSorting", 
			value = {@UserInterfaceDescription(locale="en_US", value = "Binary Sort in American English"),
					@UserInterfaceDescription( locale="fr_FR", value = "Binary Sort in French")}			
)
	
	public  void binarySort()
	{
		int temp;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[(j+1)])
				{
					temp=a[j];
					a[j]=a[(j+1)];
					a[(j+1)]=temp;
				}
			//System.out.print(a[j]);
			}
			//System.out.println();
			
		}
		print(a,a.length);
	}
	
	public  void print(int a[],int n)
	{
		System.out.println();
		for(int i=0;i<n;i++)
			System.out.print(a[i]+"\t");
	}
}
