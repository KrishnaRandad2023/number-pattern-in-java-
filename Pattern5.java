1.	import java.util.*;  
2.	public class Pattern5  
3.	{              
4.	public static void main(String[] args)   
5.	{  
6.	int i, j, rows;  
7.	Scanner sc = new Scanner(System.in);    
8.	System.out.print("Enter the number of rows you want to print: ");      
9.	 rows = sc.nextInt();           
10.	for (i = 1; i <= rows; i++)   
11.	{  
12.	for (j = 1; j <= i; j++)  
13.	{  
14.	System.out.print(i+" ");  
15.	}  
16.	System.out.println();  
17.	}           
18.	}  
19.	}  
