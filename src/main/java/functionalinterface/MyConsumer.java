package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

// a consumer takes one argument and returns void; a Bi
public class MyConsumer {
	
	public static void main(String[] args) {
		Customer c = new Customer("Sven", "999-999.83274");
		greet(c);
		
//		using the Consumer: Functional Interface ; 
		
		greet2.accept(c);
		greetV2.accept(c, true);
		greetV2.accept(c, false);
		
		
	}
	static BiConsumer<Customer, Boolean> greetV2 = (customer, phoneNumber) -> greetV2(customer, phoneNumber);
	static Consumer<Customer> greet2 = c -> greet(c);
	
	static void greetV2(Customer c, boolean number) {
		System.out.println(c.getCustomerName());
		System.out.println((number?  c.getCustomerPhoneNumber() : "**********"));
	}
	
	static void greet(Customer c) {
		System.out.println("Hallo " + c.getCustomerName()+ ", Number:"+ c.getCustomerPhoneNumber());
		System.out.println();
	}
	
	static class Customer{
		public String getCustomerName() {
			return customerName;
		}

		public String getCustomerPhoneNumber() {
			return customerPhoneNumber;
		}

		private final String customerName;
		private final String customerPhoneNumber;
		
		public Customer(String name, String number){
			customerName = name;
			customerPhoneNumber = number;
		}
	}

}
