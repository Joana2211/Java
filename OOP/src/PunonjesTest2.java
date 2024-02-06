
public class PunonjesTest2 {

	public static void main(String[] args) {
		punonjes p1 = new punonjes("Agim", "Prifti", 50000);
		p1.setDataLindjes(new Data(2, 12, 1994));
		p1.getDataLindjes().afishoDaten();
		System.out.println(p1.getMosha());

	}

}
