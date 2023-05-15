import java.util.Scanner;
class MiniProject 
{
	static Scanner s=new Scanner(System.in);
	static boolean b=false;
	static boolean be=true;
	public static void main(String[] args) throws Exception
	{
		do
		{
			System.out.println("\t\t WELCOME TO MINIPROJECT\n");
		System.out.println("1.Sign_Up\n2.Log_in\n3.Log_out\n");
		int Enter=s.nextInt();
		


		switch (Enter)
		{
		case 1:{
			System.out.println("Enter the SID\n");
			int SID=s.nextInt();

			System.out.println("Enter Contact Number");
			long contact_no=s.nextLong();
			System.out.println("Enter Science mark");
			int S_mark=s.nextInt();
			System.out.println("Enter Maths mark");
			int M_mark=s.nextInt();
			System.out.println("Enter Social mark");
			int So_mark=s.nextInt();
			System.out.println("Enter English mark");
			int E_mark=s.nextInt();

			b=true;
			 

			
			break;}
		case 2:{
			if (b)
			{
				System.out.println("Account exists\n");
				System.out.println("Enter the SID");
				int SID=s.nextInt();
				System.out.println("Enter the Contact number");
				long contact_no=s.nextLong();

				double res=Math.random()*9999+9999;
				int otp = (int) res;
				System.out.println("Your otp is: "+otp);
				int U_otp=s.nextInt();
				if(otp==U_otp){
					System.out.println("1.Largets amont two numbers\n2.Strong Numbers\n3.ArmStrong No.\n4.Palidrome\n5.Exit\n");
					System.out.println("Select the Input");
					int input=s.nextInt();

					switch (input)
					{
					case 1:{
						System.out.println("\t\t welcome to find Largest of Two");
						System.out.println("Enter the a value");
						int a=s.nextInt();
						System.out.println("Enter the b value");
						int b=s.nextInt();

						if(a>b){
							System.out.println("A is largest no: "+a); 
						}
						else{
							System.out.println("B is largest no: "+b);}
						break;}
					case 2:{
						System.out.println("\t\tWelcome to find  Strong Number or not ");
							System.out.println("Enter the number");
							int num=s.nextInt();

							int temp=num,last=0,sum=0,fact=1;

							while (num>0)
							{
								last=num%10;

								for (int i=1;i<=last ;i++ )
								{
									fact*=i;
								}
									sum+=fact;
									num/=10;
									fact=1;
								
							}
							String re=(temp==sum)?"Strong no.":"Not Strong no.";
							System.out.println(re);

						break;}
					case 3:{
						System.out.println("\t\t Welcome to  find Armstrong number or not ");
						System.out.println("Enter the num");
						int num=s.nextInt();
						int temp=num,last=0,sum=0,count=0,product=1;

						while (num>0)
						{
							num/=10;
							count++;
						}
						//System.out.println("Number of count : "+count);

						temp=num;

						while (num>0)
						{
							last=num%10;
							for (int i=1;i<=count ;i++ )
							{
								product*=last;

							}
							sum+=product;
							product=1;
							num/=10;
						}

						String re=(temp==sum)?"Armstrong no.":"Not a Armstrong no.";
						System.out.println(re);
						break;}
					case 4:{
						System.out.println("\t\t Welcome to palidrome\n\n");
						System.out.println("Enter the num");
						int num=s.nextInt();
						int rev=0;
						int temp=num;

						while (num>0)
						{
							rev=rev*10+(num%10);
							num/=10;
						}

						String re=(rev==temp)?"Palidrome":"Not palidrome";
						System.out.println(re);

						break;}
					case 5:{
						System.out.println("\t\tExit............");
						break;}
					default:{
						System.out.println("\t\tENTER  FROM ABOVE INPUT");
						break;}
					
					}
				}
				else
				{
					System.out.println("Login Failed");
				}
			}
			else
			{
				System.out.println(" NO Account exists plz sign up");
			}

			break;}
		case 3:{
			System.out.println("\t\t*******Thank you**********");
			break;}
			default:{
				System.out.println("\t\tGo with the procedure boss");
				break;}
		
		}
		}
		while (be);
		
	}
}
