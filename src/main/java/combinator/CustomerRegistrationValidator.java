package combinator;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import  static combinator.CustomerRegistrationValidator.ValidationResult;

public interface CustomerRegistrationValidator extends Function<Customer, ValidationResult> {
	
	static CustomerRegistrationValidator isEmailValid () {
		return customer -> customer.getEmail().contains("@") ? 
				ValidationResult.SUCCES :
					ValidationResult.EMAIL_NOT_VALID;
	}
	
	static CustomerRegistrationValidator isPhoneNrValid () {
		return customer -> customer.getPhoneNumber().startsWith("+") ? 
				ValidationResult.SUCCES :
					ValidationResult.PHONE_NUMBER_NOT_VALID;
	}
	
	static CustomerRegistrationValidator isAgeValid () {
		return customer -> Period.between(customer.getBirthdate(), LocalDate.now()).getYears() >=18 ? 
				ValidationResult.SUCCES :
					ValidationResult.BIRTHDATE_NOT_VALID;
	}
	
	default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
		return customer -> {
			ValidationResult res = this.apply(customer);
			return res.equals(ValidationResult.SUCCES) ? other.apply(customer) :
				res;
		};
		
	}
	
	enum ValidationResult{
		SUCCES,
		PHONE_NUMBER_NOT_VALID,
		EMAIL_NOT_VALID,
		BIRTHDATE_NOT_VALID,
		
	}

}
