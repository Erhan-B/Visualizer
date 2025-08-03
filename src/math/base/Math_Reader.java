package math.base;

import java.util.Hashtable;

/**
 * The purpose of this class is to convert mathematical expressions into node graphs
 * This allows the user to input a string representing the equation
 * 
 */
public class Math_Reader {
	private String expression;
	private Hashtable<String, Integer> bodmas;
	
	public Math_Reader() {
		bodmas = new Hashtable<>();
		bodmas.put("+", 1);
		bodmas.put("-", 1);
		bodmas.put("/", 2);
		bodmas.put("*", 2);
	}
	
	public void convertExpression(String expression) {
		
		String[] split = expression.split("(?!^)"); //Split every char of the given sequence
		int openCounter = 0;
		int closeCounter = 0;
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("(") || split[i].equals("[")) {
				openCounter++;
			}
			if(split[i].equals(")") || split[i].equals("]")) {
				closeCounter++;
			}
			System.out.println("Expression value at " + i + " : " + split[i]);
		}
		if(openCounter != closeCounter) {
			System.err.println("Unequal bracket amount present, please fill in missing");
			return;
		}
		
		int indexOpen = 0;
		int indexClosed = 0;
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("(")|| split[i].equals("]")) {
				indexOpen = i;
				System.out.println("Open index: " + indexOpen);
			}
			if(split[i].equals(")") || split[i].equals("]")) {
				indexClosed = i;
				break;
			}
		}
		String inner = "";
		for(int i = indexOpen; i < indexClosed + 1; i ++) {
			inner += split[i];
		}
		System.out.println("inner:" + inner);		
	}
}
