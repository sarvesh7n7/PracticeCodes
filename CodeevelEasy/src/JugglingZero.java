import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class JugglingZero {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			
			while((line = br.readLine()) != null)
			{
				String[] zeroList = line.split("\\s");
				StringBuilder binaryCode = new StringBuilder("");
				for(int i =0; i<zeroList.length;)
				{
					if(zeroList[i].equals("00"))
					{
						char[] chars = new char[zeroList[i+1].length()];
						Arrays.fill(chars, '1');
						binaryCode.append(chars);	
						i+=2;
					}
					else
					{
						binaryCode.append(zeroList[i+1])	;	
						i+=2;
					}
				}
				String binaryString = binaryCode.toString();
				//System.out.println(binaryString.length());
				int indexOfone = binaryString.indexOf('1');
				if(indexOfone != -1)
					binaryString = binaryString.substring(indexOfone);
				else
					binaryString = "0";
				
			//	System.out.println(binaryString.length());
				int j=0;
				 for(int i=0;i<binaryString.length();i++){
				        if(binaryString.charAt(i)== '1'){
				         j=(int) (j+ Math.pow(2,binaryString.length()-1-i));
				     }
				 }

				//System.out.println(Integer.parseInt(binaryString, 2));
				 System.out.println(j);
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
