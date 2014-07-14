import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class HexToBinary {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				/*int num = Integer.valueOf(line, 16);
				System.out.println(num);*/
				HashMap<String,Integer> hexToDec= new HashMap<String,Integer>();
				for(int i = 0;i<=10;i++)
					hexToDec.put(Integer.toString(i), i);
				
				hexToDec.put("a", 10);
				hexToDec.put("b", 11);
				hexToDec.put("c", 12);
				hexToDec.put("d", 13);
				hexToDec.put("e", 14);
				hexToDec.put("f", 15);
				
				int num = 0; 
				int j=0;
				for(int i = line.length()-1; i>=0; i--)
				{
					num = (int) (num + hexToDec.get(""+line.charAt(i)+"") * Math.pow(16,j++));
				}
				System.out.println(num);
				
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
