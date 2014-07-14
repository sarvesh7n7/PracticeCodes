
public class SubsetSum {
	//problem similar to 0/1 knapsack. Dynamic programming. 
		 
	static void subsetSum(int numberList[], int targetValue)
	{
		int n = numberList.length;
		//matrix[i][j] to store if sum of j is possible using fist i elements of array. 
		boolean[][] isSumPossible = new boolean[n][targetValue+1];
		
		//matrix[i][j] to store if the sum of j was evaluated using the i number or not. 
		boolean[][] fromDiagonal = new boolean[n][targetValue+1];
		
		//Initialization Conditions:  
		
		//sum zero is possible by    the array.
		for (int i = 0; i < n; i++)
			isSumPossible[i][0] = true;

		//sum target value possible with first element of input array. 
		for (int i = 1; i <= targetValue; i++)
			
			if(i == numberList[0])
			{
				isSumPossible[0][i] = true;
				fromDiagonal[0][i] = true;
			}
			else isSumPossible[0][i] = false;
		
		//main calculation logic
		boolean combinationPossible = false;
		int i =1,j=1;
		for (i = 1; i < n; i++)
		{
			for ( j = 1; j <= targetValue; j++)
			{
				if (j < numberList[i])
				{
					isSumPossible[i][j] = isSumPossible[i-1][j];
				}
				else			
				{
					isSumPossible[i][j] = isSumPossible[i-1][j - numberList[i]] || isSumPossible[i-1][j];
					if(isSumPossible[i-1][j-numberList[i]])	
						fromDiagonal[i][j] = true;
				}
				
				if(j == targetValue)
					if(isSumPossible[i][j] == true)
					{
						combinationPossible = true;
						break;
					}
			}
			if(combinationPossible == true)
				break;
		}
		
		if(combinationPossible == false)
			System.out.println("No combinaion Matches. ");
		else
		{
			System.out.println("the combination is possible");
			
			// logic to print the combination.
		
			int k = i;
			int l = j;
			
			while(k>=0 && l>=0)
			{
				if(fromDiagonal[k][l])
				{
					System.out.print(" "+numberList[k]);
					l = l-numberList[k];
					k--;				
				}
				else
				{
					k--;
				}
				
			}
		}
		
	}
	
	public static void main(String agrs[])
	{
		 int set[] = {1, 2, 3, 5, 7, 10 };
		 int sum = 15;
		 subsetSum(set,sum);
	}
}
