1.	public class Pattern11  
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int rows=8;   
6.	//Prints upper half pattern  
7.	for (int i = 1; i <= rows; i++)   
8.	{  
9.	for (int j = 1; j <= i; j++)   
10.	{   
11.	System.out.print(j+" ");   
12.	}   
13.	System.out.println();   
14.	}   
15.	//prints lower half pattern  
16.	for (int i = rows-1; i >= 1; i--)  
17.	{  
18.	for (int j = 1; j <= i; j++)  
19.	{  
20.	System.out.print(j+" ");  
21.	}  
22.	System.out.println();  
23.	}  
24.	}  
25.	}  
