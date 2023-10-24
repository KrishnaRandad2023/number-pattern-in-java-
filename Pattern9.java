1.	import java.util.Scanner;  
2.	public class Pattern9  
3.	{              
4.	public static void main(String[] args)   
5.	{  
6.	int i, j, rows=9;         
7.	for (i = 1; i <= rows; i++)   
8.	{  
9.	for (j = 1; j <= i; j++)  
10.	{  
11.	if(j%2 == 0)  
12.	{  
13.	System.out.print(0);  
14.	}  
15.	else  
16.	{  
17.	System.out.print(1);  
18.	}  
19.	}  
20.	System.out.println();  
21.	}  
22.	}  
23.	}  
