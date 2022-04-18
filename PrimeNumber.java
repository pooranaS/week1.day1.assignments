package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int input=13;
		boolean isPrime = false;
		
		for(int i=2; i < (input/2); i++)
		{
			if(input%i==0)
			{
				System.out.println(input +" is not prime number");
				isPrime=true;
				break;
			}
		}
			if(isPrime==false)
			{
				System.out.println(input+" is prime number");
			}
		

	}

}
