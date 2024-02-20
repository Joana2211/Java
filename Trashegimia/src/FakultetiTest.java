
public class FakultetiTest {

	public static void main(String[] args) {
		Fakulteti f1 = new Fakulteti("Joana", "Kombinat", "06xxxxxx", "example@mail.com", "Lab 4", 90000.0, new Data(12,01,2011),
				4, GRADA.PROFESOR);
        System.out.println(f1);
        f1.rritjePage();
        System.out.println(f1);
        

	}

}
