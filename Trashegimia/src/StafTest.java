
public class StafTest {

	public static void main(String[] args) {
		Staf s1 = new Staf("Joana", "Kombinat", "06xxxxxx", "example@mail.com", "Lab 4", 90000.0, new Data(12,01,2011),"Specialiste");
		s1.getVitet();
		s1.rritjePage();
        System.out.println(s1);
	}

}
