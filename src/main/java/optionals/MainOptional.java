package optionals;

import java.util.Optional;

public class MainOptional {

	public static void main(String[] args) {
		Object o = Optional.ofNullable(null)
			.orElseGet(() -> "This is default");
		
		
		Object o2 = Optional.ofNullable("Hello")
				.orElseGet(() -> "This is default");
		
		Object cons = Optional.ofNullable(3)
				.orElseThrow(() -> new IllegalStateException("Wrong!"));
		
		
		System.out.println(o);
		System.out.println(o2);
		System.out.println(cons);
			
		Optional.ofNullable(3)
		.ifPresent( value -> System.out.println(value*5));
	}

}
