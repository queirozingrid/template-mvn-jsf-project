import dao.PersonDAO;
import model.Person;

public class Main {
	public static void main(String[] args) {
		Person person = new Person();
		person.setName("John");
		PersonDAO.save(person);
	}
}
