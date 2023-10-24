1.	public class Pattern8  
2.	{  
3.	public static void main(String[] args)   
4.	{  
5.	int rows=9;   //number of rows to print  
6.	for (int i = 1; i <= rows; i++)   
7.	{  
8.	int num;  
9.	if(i%2 == 0)  
10.	{  
11.	num = 0;  
12.	for (int j = 1; j <= rows; j++)  
13.	{  
14.	System.out.print(num);  
15.	num = (num == 0)? 1 : 0;  
16.	}  
17.	}  
18.	else  
19.	{  
20.	num = 1;  
21.	for (int j = 1; j <= rows; j++)  
22.	{  
23.	System.out.print(num);  
24.	num = (num == 0)? 1 : 0;  
25.	}  
26.	}  
27.	System.out.println();  
28.	}  
29.	}  
30.	}   
