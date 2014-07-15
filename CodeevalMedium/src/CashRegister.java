import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CashRegister {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			final String[] moneyString = {"ONE HUNDRED","FIFTY","TWENTY","TEN","FIVE","TWO","ONE","HALF DOLLAR","QUARTER","DIME","NICKEL","PENNY"};
			final int[] moneyValue = {10000,5000,2000,1000,500,200,100,50,25,10,5,1};
			
			
			while((line = br.readLine()) != null)
			{
				String[] parts = line.split(";");
				double pp = Double.valueOf(parts[0]);
				double cp = Double.valueOf(parts[1]);
				int purchasePrice = (int)(pp*100);
				int cashPrice = (int)(cp*100);
				int differenceInPrice = cashPrice-purchasePrice;
				int offSet =11;
	
				if(differenceInPrice <0)
				{
					System.out.println("ERROR");
					continue;
				}
				else if(differenceInPrice == 0)
				{
					System.out.println("ZERO");
					continue;
				}
				else
				{
					
					while( offSet>=0 && moneyValue[offSet] <= differenceInPrice)
					{ 
						offSet--;

					}
					offSet++;
				}
				
				differenceInPrice -= moneyValue[offSet];
				System.out.print(moneyString[offSet++]);
				while(differenceInPrice != 0)
				{
					differenceInPrice -= moneyValue[offSet];
					if(differenceInPrice<0)
					{
						differenceInPrice += moneyValue[offSet];
						offSet++;
					//	System.out.println(differenceInPrice);
					}
					else
					System.out.print(","+moneyString[offSet]);
				}
				System.out.println();
				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
