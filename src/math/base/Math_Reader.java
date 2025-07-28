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
		int openCounter = 0;
		int closeCounter = 0;
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("(") || split[i].equals("[")) {
				openCounter++;
				System.out.println("Bracket hit: " + split[i]);
			}
			if(split[i].equals(")") || split[i].equals("]")) {
				closeCounter++;
			}
		}
		if(openCounter != closeCounter) {
			System.err.println("Unequal bracket amount present, please fill in missing");
			return;
		}
		System.out.println("Test");
	}
}
