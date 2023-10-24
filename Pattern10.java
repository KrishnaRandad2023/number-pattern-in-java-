1.	public class Pattern10  
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int n = 10;    
6.	for (int i = 1; i <= n; i++)   
7.	{  
8.	for (int j = 1; j < i; j++)   
9.	{  
10.	System.out.print(" ");  
11.	}  
12.	for (int k = i; k <= n; k++)   
13.	{   
14.	System.out.print(k+" ");  
15.	}  
16.	System.out.println();  
17.	}  
18.	for (int i = n-1; i >= 1; i--)   
19.	{  
20.	for (int j = 1; j < i; j++)   
21.	{  
22.	System.out.print(" ");  
23.	}  
24.	for (int k = i; k <= n; k++)  
25.	{  
26.	System.out.print(k+" ");  
27.	}  
28.	System.out.println();  
29.	}  
30.	}  
31.	}  
