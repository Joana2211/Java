import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		Trekendesh[] lista;
		lista = new Trekendesh[10]; // array ne kete rast nuk shton as nuk heq dot trekendesha
		List<Trekendesh> lista1 = new ArrayList<Trekendesh>();
		lista1.add(new Trekendesh());
		lista1.add(new Trekendesh("blu", true, 2.0, 3.0, 4.0));
		lista1.add(0, new Trekendesh("kuqe", false, 3.0, 4.0, .0));
	 System.out.println("Nr i objekteve ne liste eshte: " + lista1.size());
		for(Trekendesh t:lista1) {
			System.out.println(t.toString());
			// modifikimi brenda for eshte pak problematik
		}
		lista1.clear();
		System.out.println("Nr i objekteve ne liste eshte: " + lista1.size());
		
	}

}
