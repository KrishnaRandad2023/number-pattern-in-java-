1.	public class Pattern16  
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int i, j, rows=9;  
6.	//Prints upper half  pattern  
7.	for (i = rows; i >= 1; i--)   
8.	{  
9.	for (j = 1; j <= i; j++)  
10.	{  
11.	System.out.print(j+" ");  
12.	}  
13.	System.out.println();  
14.	}  
15.	//Prints lower half  pattern  
16.	for (i = 2; i <= rows; i++)   
17.	{  
18.	for (j = 1; j <= i; j++)  
19.	{  
20.	System.out.print(j+" ");  
21.	}  
22.	System.out.println();  
23.	}  
24.	}  
25.	}  
