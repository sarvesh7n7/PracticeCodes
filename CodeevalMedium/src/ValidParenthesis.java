import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;


public class ValidParenthesis {
	public static void main(String args[]){
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("input.txt"));
			String line = null;
			while((line = br.readLine()) != null)
			{
				Stack<Character> myStack = new Stack<Character>();
				boolean isValid = true;

				for(int i=0; i<line.length(); i++)
				{
					char brace = line.charAt(i);
					char popedBrace = 0;
					
					switch(brace){
					case '(':	myStack.push('(');
								break;
					case '{':	myStack.push('{');
								break;
					case '[':	myStack.push('[');
								break;
					case ')':	
						{
							if(myStack.empty())
							{
								isValid = false;
								break;
							}
							popedBrace = myStack.pop();
							if(popedBrace != '(')
								isValid = false;
							break;	
						}
						
					case '}':
						{
							if(myStack.empty())
							{
								isValid = false;
								break;
							}
							popedBrace = myStack.pop();
							if(popedBrace != '{')
								isValid = false;
							break;		
						}
					case ']':
						{
							if(myStack.empty())
							{
								isValid = false;
								break;
							}
							popedBrace = myStack.pop();
							if(popedBrace != '[')
								isValid = false;
							break;
						}				
					}
					if(!isValid)
						break;
				}
				if(!isValid || !myStack.empty())
					System.out.println("False");
				else
					
					System.out.println("True");
			
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
