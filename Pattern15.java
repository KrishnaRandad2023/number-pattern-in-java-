1.	public class Pattern15  
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int i, j, rows=9;  
6.	for (i = 1; i <= rows; i++)   
7.	{  
8.	//Prints first half of the row  
9.	for (j = 1; j <= i; j++)   
10.	{   
11.	System.out.print(j+" ");   
12.	}  
13.	//Prints second half of the row   
14.	for (j = i-1; j >= 1; j--)  
15.	{  
