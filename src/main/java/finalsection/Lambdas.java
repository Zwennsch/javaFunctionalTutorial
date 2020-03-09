package finalsection;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lambdas {
	
	
	public static void main(String[] args) {
		
//		If you have only one line:
		Function<String,String> printName = e -> e.toUpperCase();
//		you can use method reference as well, because you only have one statement 
//		A method reference is the shorthand syntax for a lambda expression that executes just ONE method!!
//		General syntax: Object :: methodName
		Function<String,String> printName2 = String::toUpperCase;
		/*
		 * If you want to perform multiple lines of code you have to use curly braces
		 * 
		 */
		
		
//		if you have two arguments you have to use ()
		BiFunction<String, Integer, String> myBif = (name, age) -> name.toUpperCase().concat(age.toString());
		
		String s = printName.apply("sven");
		
		System.out.println(s);
		System.out.println(printName2.apply("hans"));
	}
}
