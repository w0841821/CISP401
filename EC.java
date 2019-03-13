// Your name here: Erroll Abrahamian

package Main;

public class EC{
	public static void main(String[] args){
		p(parseInt("7"));
		p(parseInt("77"));
		p(parseInt("777"));
	}
	
	public static int parseInt(String s) {
		int parsedInt = 0;
		
		// tracking the "ones place" to start
		int count = 1;
		
		// need the length of the string
		int sLength = s.length();
		
		// starting at the ones place of the string, moving to the tens place etc
		for (int i = (sLength - 1); i >= 0; i--)
		{
			parsedInt += (((s.charAt(i)) - 48) * count);
			
			// ones place -> tens place -> hundreds place
			count *= 10;
		}
		
		return parsedInt;
	}
	
	public static void p(int inp){
		System.out.println(inp);
	}
}