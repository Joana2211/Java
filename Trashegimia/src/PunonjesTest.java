
public class PunonjesTest {

	public static void main(String[] args) {
		Punonjes joana = new Punonjes();
		joana.setEmri("Joana");
        joana.setAdrese("Kombinat");
        joana.setNrTel("06xxxxxx");
        joana.setEmail("example@mail.com");
        joana.setZyra("Lab 4");
        joana.setPaga(90000.0);
        joana.setDataPunesimit(new Data(12,01,2012));
        joana.getVitet();
       joana.rritjePage();
        System.out.println(joana);
        
        
	}

}
