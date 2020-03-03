package functionalinterface;

import java.util.function.BiFunction;

public class MyBiFunction {
	
//	lets try to put the chain of two functions into one function by using a BiFunction
	
	static int incrementByOne(int i) {
		return i +1;
	}
	
	static int incremetnAndmultiply(int i, int j ) {
		return (i+1) * j;
	}
	
//	combine the exact same thing using the BiFunction:
	static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply = (x,y) -> (x+1)*y;
	
//	another example: counting the letters and multiplying the number by x
	static BiFunction<String, Integer, Integer> countingTheLettersAndMultiplying = (s, x) -> s.length() * x;
	
	public static void main(String[] args) {
		int result = incrementByOneAndMultiply.apply(2, 5);
		System.out.println(result);
		
		int res2 = countingTheLettersAndMultiplying.apply("Hallo", 4);
		System.out.println(res2);
	}

}
