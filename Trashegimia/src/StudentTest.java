
public class StudentTest {

	public static void main(String[] args) {
	  Student s1 = new Student("Joana", "Kombinat", "06xxxxxx", "example@mail.com", Status.MASTER);
	  if(s1.getStatus() == Status.MASTER) {
		  System.out.println("Studenti eshte ne MASTER");
	  }
       System.out.println(s1.toString());
	}

}
