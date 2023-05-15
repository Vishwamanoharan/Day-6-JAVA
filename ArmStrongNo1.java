class ArmStrongNo1 
{
	


	public static void main(String[] args) 
	{
		int n=123,temp,temp1,count=0,sum=0,power=1;
	 temp=n;
	 temp1=n;

	while (temp>0)
	{
		count++;
		temp/=10;
	}

	for (int i=1;i<=count ;i++ )
	{
		power*=(temp1%10);
		//System.out.println(power);
		while (count==i&&temp1>0)
		{
			sum+=power;
			i=0;
			power=0;
			temp1/=10;

		}
	}

		System.out.println(sum);
	}
}
