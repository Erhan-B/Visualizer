package math.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import node.ListNodes;

/**
 * The purpose of this class is to convert mathematical expressions into node graphs
 * This allows the user to input a string representing the equation
 * 
 */
public class Math_Reader {
	private String expression;
	private Hashtable<String, Integer> bodmas;
	private Map<String, String> subExpr;
	private Stack<String> stack;
	private int subID;
	
	public Math_Reader() {
		bodmas = new Hashtable<>();
		subExpr = new HashMap<>();
		stack = new Stack<>();
		bodmas.put("+", 1);
		bodmas.put("-", 1);
		bodmas.put("/", 2);
		bodmas.put("*", 2);
	}
	
	public void convertExpression(String expression) {
		
//		String[] split = expression.split("(?<!h)(?=.)"); //Split every char of the given sequence
		Pattern pattern = Pattern.compile("h\\d|.");
		Matcher matcher = pattern.matcher(expression);
		
		String newExpr = "";
		int startIndex = 0;
		int endIndex = 0;
		
		List<String> result = new ArrayList<>();
		while(matcher.find()) {
			result.add(matcher.group());
		}
		System.out.println("result: " + result);
//		for(int i =0; i <split.length; i++) {
//			if(split[i].equals("(")) {
//				startIndex = i;
//			} else if(split[i].equals(")")) {
//				endIndex = i;
//				break;
//			}
//		}
		
//		for(int i = startIndex; i < endIndex + 1; i++) {
//			stack.addFirst(split[i]);
//		}
//		if(stack.isEmpty()) {
//			System.err.println("Stack is empty");
//			return;
//		}
		String subexp = "";
//		while(!stack.isEmpty()) {
//			subexp += stack.pop();
//		}
//		
		
		System.out.println(subexp);
		
		String key = "h" + subID;
		subExpr.put(key, subexp);
		
//		for(int i = 0; i < split.length; i++) {
//			if(i < startIndex || i > endIndex) {
//				newExpr += split[i];
//			}
//			if(i == startIndex) {
//				newExpr += "h" + subID++;
//			}
//		}
		System.out.println(newExpr);
//		int openCounter = 0;
//		int closeCounter = 0;
//		for(int i = 0; i < split.length; i++) {
//			if(split[i].equals("(") || split[i].equals("[")) {
//				openCounter++;
//			}
//			if(split[i].equals(")") || split[i].equals("]")) {
//				closeCounter++;
//			}
//			System.out.println("Expression value at " + i + " : " + split[i]);
//		}
//		if(openCounter != closeCounter) {
//			System.err.println("Unequal bracket amount present, please fill in missing");
//			return;
//		}
//		
//		int indexOpen = 0;
//		int indexClosed = 0;
//		for(int i = 0; i < split.length; i++) {
//			if(split[i].equals("(")|| split[i].equals("]")) {
//				indexOpen = i;
//				System.out.println("Open index: " + indexOpen);
//			}
//			if(split[i].equals(")") || split[i].equals("]")) {
//				indexClosed = i;
//				break;
//			}
//		}
//		String inner = "";
//		for(int i = indexOpen; i < indexClosed + 1; i ++) {
//			inner += split[i];
//			split[i] = null;
//		}
//		System.out.println("inner:" + inner);	
//		for(int i = 0; i < split.length; i++) {
//			if(!(split[i] == null))
//			System.out.println(split[i]);
//		}
	}
	
	private ListNodes constructTree(String expression) {
		ListNodes list = new ListNodes();
		
		return list;
	}
}
