import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class SortedPerson {

	public static void main(String[] args) {
		
		Comparator<Person> ageComp = (p1, p2) -> p1.getAge() - p2.getAge();
		
		Comparator<Person> nameComp = (p1, p2) -> p1.getName().compareTo(p2.getName());
		
		TreeSet<Person> people = new TreeSet<Person>();
		people.add(new Person("Polo", 21));
		people.add(new Person("Jack", 25));
		people.add(new Person("Lili", 23));
		
		for (Person p : people) 
			System.out.println(p);
		
		Iterator<Person> itr = people.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
