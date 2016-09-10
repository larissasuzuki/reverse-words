package Puzzle;

import java.util.Stack;

public class reverseWords {
	
	public static void main(String args[]){
		String str = "A ship in port is safe, but that's not what ships are built for. (Admiral Grace Hopper)!";
		System.out.println(str);
		reverseWords revW = new reverseWords();
		
		System.out.println(revW.reverse(str));
	}
	
	public String reverse(String str){
		
		Stack<String> stack = new Stack<String>();
		
		String[] arr = str.split(" ");
		
		for(String i:arr)
			stack.push(i);
		
		StringBuilder newStr = new StringBuilder();
		
		while(!stack.isEmpty()){
			newStr.append(stack.pop()).append(" ");
		}
		
		return new String(newStr);
	}
}
