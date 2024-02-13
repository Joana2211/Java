
public class DrejtkendeshTest {

	public static void main(String[] args) {
		Drejtkendesh d1 = new Drejtkendesh("kuqe", true, 2.0, 3.0);
		System.out.println(d1);
		System.out.println("Perimetri i drejtkendeshit eshte: "+ d1.getPerimeter());
		System.out.println("Siperfaqja i drejtkendeshit eshte: "+ d1.getSiperfaqe());
	}

}
