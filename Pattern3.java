1.	public class Pattern3  
2.	{              
3.	public static void main(String[] args)   
4.	{  
5.	int n = 8;    //n is the number of rows you want to print  
6.	for (int i = 0; i < n; i++)   
7.	{  
8.	int number = 1;  
9.	System.out.printf("%" + (n - i) * 2 + "s", "");  
10.	for (int j = 0; j <= i; j++)   
11.	{  
12.	System.out.printf("%4d", number);  
13.	number = number * (i - j) / (j + 1);  
14.	}  
15.	System.out.println();  
16.	}  
17.	}  
18.	}  
