package com.serveba.problems.recursive;

import java.util.ArrayList;
import java.util.List;


/**
 * Print all the interleaving Strings for s1 and s2
 * 
 * e.g s1="abc", s2="de"
 * 
 * results:"abcde", "abdce", "adebc", "adbce", "deabc", "dabce"...
 * 
 * @param s1
 * @param s2
 */
public class InterleavingStrings {
	
	
	private ArrayList<String> solutions = new ArrayList<String>();
	
	public void solve(String s1, String s2) {
		print(s1, s2, "");
	}
	
	private void print(String s1, String s2, String result) {
		if(s1.length() == 0 && s2.length() == 0 && result.length() > 0) {
			solutions.add(result);
//			System.out.println(result);
		}
		
		if(s1.length() > 0) {
			print(s1.substring(1), s2, result + s1.substring(0, 1));
		}
		if(s2.length() > 0) {
			print(s1, s2.substring(1), result + s2.substring(0, 1));
		}
	}
	
	public List<String> getSolutions() {
		return solutions;
	}
	
	

}
