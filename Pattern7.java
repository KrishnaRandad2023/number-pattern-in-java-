1.	import java.util.Scanner;  
2.	public class Pattern7  
3.	{  
4.	public static void main(String[] args)   
5.	{  
6.	int i, j, n;  
7.	Scanner sc = new Scanner(System.in);  
8.	System.out.print("Enter the number of rows you want to print: ");  
9.	n = sc.nextInt();  
10.	for (i = 1; i <= n; i++)   
11.	{   
12.	for (j = i; j >= 1; j--)  
13.	{  
14.	System.out.print(j+" ");  
15.	}  
16.	System.out.println();  
17.	}           
18.	}  
19.	}  
