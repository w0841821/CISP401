// Your name here: Erroll Abrahamian

package Main;

public class HW02{
	public static void main(String[] args){
		// My tests (Do NOT modify this part!)
		int[] a = {24,3,12,55,6,21,35,7,33,10};
		int[] b = {72,103,3,56,87,23,9,78,5,110};
		p(divide(10,0));
		p(divide(20,5));
		p(getUnsignedIntString(-100));
		p(getUnsignedIntString(1000));
		p(Integer.toString(getMaxValue(a)));
		p(Integer.toString(getMaxValue(b)));
		p(getArrayElement(a, 3));
		p(getArrayElement(b, 10));
		p(twoSum(a, 31));
		p(twoSum(b, 113));
		// End of tests!
	}
	
	public static String getUnsignedIntString(int value){
		String ret = "";
		
		// if we have a negative number, return a string of zero...
		if (value < 0)
			ret = "0";
		// ...otherwise convert to string
		else
			ret = Integer.toString(value);

		return ret;
	}
	
	public static String getArrayElement(int[] a, int index){
		String ret = "";

		try {
			ret = Integer.toString(a[index]);
		} catch (ArrayIndexOutOfBoundsException oob) {
			ret = "Out of Bounds";
		}

		return ret;
	}
	
	public static int getMaxValue(int[] a){
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > max)
				max = a[i];
		}

		return max;
	}
	
	public static String divide(int v1, int v2){
		String ret = "";
		int divNums;
		
		try {
			divNums = v1 / v2;

			// if we have a valid equation...
			ret = Integer.toString(divNums);
		} catch (ArithmeticException ae) {
			
			// ...or if we don't
			ret = "Undefined";
		}

		return ret;
	}
	
	public static String twoSum(int[] a, int sum){
		String ret = "";

		// start with the first element...
		for (int i = 0; i < a.length; i++)
		{
			// can't add element "i" to itself, so start with the next element every loop
			for (int j = (i + 1); j < a.length; j++)
			{
				if (a[i] + a[j] == sum)
				{
					ret = (a[i] + "," + a[j]);
					
					// if we find the answer, we're done!
					break;
				}
			}
		}

		return ret;
	}
	
	/* Given for easy printing */
	public static void p(String inp){
		System.out.println(inp);
	}
}