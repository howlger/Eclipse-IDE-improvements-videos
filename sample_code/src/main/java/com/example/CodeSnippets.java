package com.example;

/**
 * Code Snippets (JEP 413):
 * 
 * <!--
 * public static void main(String[] args) {
 *     System.out.println("Hello, world!");
 * }
 * -->
 */
public class CodeSnippets {

	public static String toRomanNumber(int number) {
		return "I".repeat(number).replace("IIIII", "V")
				                 .replace("IIII", "IV")
				                 .replace("VV", "X")
				                 .replace("VIV", "IX")
				                 .replace("XXXXX", "L")
				                 .replace("XXXX", "XL")
				                 .replace("LL", "C")
				                 .replace("LXL", "XC")
				                 .replace("CCCCC", "D")
				                 .replace("CCCC", "CD")
				                 .replace("DD", "M")
				                 .replace("DCD", "CM");
	}

}
