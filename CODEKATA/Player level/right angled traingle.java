package sample;

import java.util.Scanner;

public class Sidesofatriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a+b>=c && b+c>=a && a+c>=b)
		{
			/*if(a!=b && b!=c && a!=c)
			{
				System.out.print("yes..it forms a scalene triangle");
			}
			else
			{
				System.out.print("no..it doesnot form a scalene triangle");
			} */
			if((a*a)+(b*b)==(c*2))
			{
				System.out.print("yes..it forms a right angled triangle");
			}
			else
			{
				System.out.print("no..it forms a right angled triangle");
			}
		}
		else
		{
			System.out.print("no..it doesnot form a triangle");
		}
		sc.close();
	}
}
