
public class SumOfPrimes {
	public static void main(String args[])
	{
		int primeSum = 0;
		int primeCount = 0;
		boolean isPrime = true;
		for(int i = 2; ; i++)
		{
			isPrime = true;
			for(int j = 2;j<=Math.sqrt(i);j++)
			{
				if(i%j == 0)
					isPrime = false;
			}
			if(isPrime)
			{
				primeSum+=i;
				primeCount++;
				if(primeCount == 1000)
					break;
			}
		}
		System.out.println(primeSum);
	}
}
