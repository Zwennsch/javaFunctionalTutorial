package combinator;

import java.time.LocalDate;
import static combinator.CustomerRegistrationValidator.*;
// Combinator Pattern
public class MainCustomer {

	public static void main(String[] args) {
		Customer c1 = new Customer("Alice", "alice@gmail.dom", "+4942170895055", LocalDate.of(1996,8, 20));
		Customer c2 = new Customer("Sven", "sven@gmail.dom", "+4942170895056", LocalDate.of(2005,8, 20));
		
//		CustomerValidatorService service = new CustomerValidatorService();
//		System.out.println(service.isValid(c1));
//		System.out.println(service.isValid(c2));
		
//		if valid we can store customer in db
		
//		Using combinator pattern ; this is used for validation!!!
		System.out.println(isEmailValid().and(isAgeValid()).apply(c2));
		System.out.println(isEmailValid().and(isAgeValid()).apply(c1));
	}

}
