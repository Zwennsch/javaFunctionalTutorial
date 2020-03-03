package functionalinterface;

import java.util.function.Function;

public class _Function {
	
	public static void main(String[] args) {
		int i = increment(0);
		System.out.println(i);
		
		System.out.println(myFunction.apply(3));
//		after incrementing we want to apply the other
		int x =  multiplyBy10.apply(myFunction.apply(3));
		System.out.println("mit doppelt apply" +x);
		
		
		
//		combine the two functions. This is better::
		
		int y = myFunction.andThen(multiplyBy10).apply(6);
		System.out.println(y);
//		or:
		int same = addByOneAndThenMultiplyByTen.apply(8);
		System.out.println(same);
		
		
	}
//	using Lambdas
	static Function<Integer, Integer> myFunction = e -> e+1;
	
	static Function<Integer, Integer> multiplyBy10 = e -> e*10;
	
	static Function<Integer, Integer> addByOneAndThenMultiplyByTen = myFunction.andThen(multiplyBy10);
	
//	normal way (old way); takes an input (number) and returns an output
	static int increment(int number) {
		return number +1;
	}
}
