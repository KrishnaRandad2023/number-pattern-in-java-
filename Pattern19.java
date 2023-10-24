1.	public class Pattern19  
2.	{  
3.	public static void main(String args[])  
4.	{  
5.	int rows=9;  
6.	for (int i = 1; i <= rows; i++)   
7.	{  
8.	int num = i;  
9.	for (int j = 1; j <= i; j++)   
10.	{  
11.	System.out.print(num+" ");  
12.	num = num+rows-j;  
13.	}  
14.	System.out.println();  
15.	}  
16.	}  
17.	}  
