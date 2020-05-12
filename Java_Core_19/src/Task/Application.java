package Task;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) throws Exception {

		File file = new File("serializeEmployee.txt");
		Employee emp = new Employee("Igor", 47660786, 50000);
		System.out.println(emp);
		Methods.serialize(file, emp);
		System.out.println(Methods.deserialize(file));

		NewEmployee empNew = new NewEmployee("Igor", 47660786, 50000);
		Methods.serialize(file, empNew);
		System.out.println(Methods.deserialize(file));

		File fileNew = new File("serializeCollection.txt");
		List<Employee> human = new ArrayList<>();
		human.add(new Employee("Taras", 77777777, 25000));
		human.add(new Employee("Natali", 12345678, 30000));
		human.add(new Employee("Anna", 45698514, 10000));
		Methods.serialize(fileNew, (Serializable) human);

		List<Employee> humanNew = new ArrayList<>();
		humanNew = (List<Employee>) Methods.deserialize(fileNew);

		for (Employee employee : humanNew) {
			System.out.println(employee);
		}

	}

}
