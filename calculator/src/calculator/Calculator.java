package calculator;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args)
{
	System.out.println(" Name:Manasi Baiche");
	System.out.println(" Rollno:3102");
	Scanner in= new Scanner(System.in);
	int choice;
	int no1, no2 , result;
	do
	{
		System.out.println(" 1.Add");
		System.out.println(" 2.Subtract");
		System.out.println(" 3.Multiply");
		System.out.println(" 4.Divide");
		System.out.println(" 5.Factorial");
		System.out.println(" 6.Exit");
		System.out.println(" Enter your choice");
		choice=in.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter First Number");
			no1=in.nextInt();
			System.out.println(" Enter Second Number");
			no2=in.nextInt();
			result=no1+no2;
			System.out.println(" Addition:"+result);
			break;
		case 2:
			System.out.println("Enter First Number");
			no1=in.nextInt();
			System.out.println(" Enter Second Number");
			no2=in.nextInt();
			result=no1-no2;
			System.out.println(" Subtraction:"+result);
			break;
		case 3:
			System.out.println("Enter First Number");
			no1=in.nextInt();
			System.out.println(" Enter Second Number");
			no2=in.nextInt();
			result=no1*no2;
			System.out.println(" Multiplication:"+result);
			break;
		case 4:
			System.out.println("Enter First Number");
			no1=in.nextInt();
			System.out.println(" Enter Second Number");
			no2=in.nextInt();
			result=no1/no2;
			System.out.println("Division:"+result);
			break;
		case 5:
			System.out.println("Enter First Number");
			no1=in.nextInt();
			result=1;
			for(int i=1;i<=no1;i++)
			{
				result=result*i;
			}
			System.out.println(" Factorial of"+no1+"is"+result);
			break;
		case 6:
			System.out.println("Terminating");
			break;
			default:
			System.out.println("wrong choice");
			break;
		}
	}while(choice!=6);
	}
	}



