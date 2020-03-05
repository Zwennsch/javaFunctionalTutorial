package streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MyStream {

	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person("John", Gender.MALE),
				new Person("Tanja",Gender.FEMALE),
				new Person("Sven", Gender.MALE),
				new Person("Maria", Gender.FEMALE),
				new Person("Sonja", Gender.FEMALE)
				);
//		map is used for transformation
//		Set<Gender> genderSet = people.stream()
//			.map(p -> p.gender)
//			.collect(Collectors.toSet());
		
//		or:
//		people.stream()
//			.map(person -> person.gender)
//			.collect(Collectors.toSet()).forEach(System.out::println);
//		
//		List<Gender> genderList = people.stream()
//				.map(p -> p.gender)
//				.collect(Collectors.toList());
//		
//		System.out.println(genderSet);
//		System.out.println(genderList);
		
//		to get the length of each name
//		people.stream()
//			.map(p -> p.name)
//			.mapToInt(s -> s.length())
//			.forEach(System.out::println);
		
		System.out.println(people.stream()
			.allMatch(p -> p.name.length() > 4));
		
		boolean containsOnlyFemales = people.stream()
				.allMatch(p -> p.gender.equals(Gender.FEMALE));
		System.out.println(containsOnlyFemales);
		
		people.stream()	
			.filter(p -> p.gender.equals(Gender.MALE))
			.forEach(p -> System.out.println(p.name));
			
	}
	
	static class Person {
		private final String name;
		private final Gender gender;
		
		public Person(String name, Gender gender) {
			this.name = name;
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		
		
		
	}
	
	enum Gender {
		MALE,FEMALE
		
	}

}
