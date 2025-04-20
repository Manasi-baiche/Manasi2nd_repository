package sumNavg;

public class SumandAverage {
	public static void main(String[] args)
	{
	System.out.println("Enter your name:Manasi Baiche");
	System.out.println("Enter your roll no:3102");
	int i;
	int sum=0;
	double avg;
	int count=0;
	int a[]={10,20,30,40};
	for(i=0;i<a.length;i++)
	{
	sum=sum+a[i];
	count++;
	}
	avg=sum/count;
	System.out.println("Sum of number is :"+sum);
	System.out.println("Avg of number is :"+avg);
	}
	}

