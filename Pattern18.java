1.	public class Pattern18  
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int rows=8;  
6.	for (int i = 1; i <= rows; i++)   
7.	{  
8.	for (int j = 1; j <= rows-i; j++)  
9.	{  
10.	System.out.print(1);  
11.	}  
12.	for (int j = 1; j <= i; j++)  
13.	{  
14.	System.out.print(i);  
15.	}  
16.	System.out.println();  
17.	}  
18.	}  
19.	}  
