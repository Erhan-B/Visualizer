package math.base;

/**
 * The purpose of this class is to convert mathematical expressions into node graphs
 * This allows the user to input a string representing the equation
 * 
 */
public class Math_Reader {
	private String expression;
	
	public static void convertExpression(String expression) {
		
		String[] split = expression.split("(?!^)"); //Split every char of the given sequence
		int bracketCounter = 0;
		for(int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			if(split[i].equals("(") || split[i].equals(")") || split[i].equals("[")|| split[i].equals("]")) {
				bracketCounter++;
				System.out.println("Bracket hit: " + split[i]);
			}
			System.out.println(bracketCounter);
		}
		if((bracketCounter % 2) != 0) {
			System.err.println("Unequal bracket amount present, please fill in missing");
			return;
		}
		System.out.println("Test");
	}
}
